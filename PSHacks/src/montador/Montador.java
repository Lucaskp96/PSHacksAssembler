package montador;

import gerenciador_arquivo.EscritorArquivo;
import gerenciador_arquivo.LeitorArquivo;
import instrucoes.Instrucoes;

/**
 * Classe responsavel por metodos que montam o codigo assembly em linguagem de maquina.
 * @author Micael Popping
 */
public class Montador {
   
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Tem como entrada um arquivo .asm e gera o equivalente em .hacks.
     * @param nomeArquivo, nome do arquivo que deve ser convertido em hacks.
     * @return um valor logico, true se foi possivel fazer a conversão e false caso contrario.
     * @author Micael Popping.
     */
    public static boolean gerarAquivoHacks(String nomeArquivo){
        
        CodigoHacks codigoHacks;
        
        if(!verificarExtensaoArquivo(nomeArquivo, "txt"))
            return false;
        
        if((codigoHacks = montarCodigoHacks(nomeArquivo)) == null)
            return false;
        
        escreverArquivoHacks(codigoHacks, nomeArquivo);
        
        return true;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    /**
     * Verifica se a extensão de um  arquivo é uma extensão especificada.
     * @param nomeArquivo, nome do arquivo que deve ser verificado.
     * @param extensao, extensão que deve ser verificada.
     * @return valor logico, sendo true se a extensão do arquivo bater com a especificada e false caso contrario.
     * @author Micael Popping.
     */
    private static boolean verificarExtensaoArquivo(String nomeArquivo, String extensao){
        
        int indice;
        String auxiliar;
        
        if ((indice = nomeArquivo.indexOf('.')) == -1)
            return false;
        
        auxiliar = nomeArquivo.substring(indice + 1, nomeArquivo.length());
        
        if(auxiliar.equals(extensao))
            return true;
        else
            return false;
    }
    
    /**
     * Monta o codigo, em duas etapas.
     * @param nomeArquivo, nome do arquivo .asm que vai ser montado.
     * @return uma estrutura codigoHacks caso tudo ocorra bem ou null caso não seja possivel fazer a montagem.
     * @author Micael Popping.
     */
    private static CodigoHacks montarCodigoHacks(String nomeArquivo){
        
        CodigoAsm codigoAsm = new CodigoAsm();
        CodigoHacks codigoHacks = new CodigoHacks();
        TabelaSimbolos tabelaSimbolos;
        
        if((tabelaSimbolos = etapa1(codigoAsm, nomeArquivo)) == null)
            return null;
        
        codigoHacks.setTabelaSimbolos(tabelaSimbolos);
        
        etapa2(codigoAsm, codigoHacks, nomeArquivo);
        
        return codigoHacks;
    }
    
    /**
     * A etapa 1 percorre o codigo verificando a sintaxe e montando a tabela de simbolos.
     * @param codigoAsm, codigo assembly que está sendo montado.
     * @param nomeArquivo, nome do arquivo que está contido o codigo .asm puro.
     * @return a tabela de simbolos do codigo ou null caso o codigo possua algum erro de sintaxe.
     * @author Micael Popping.
     */
    private static TabelaSimbolos etapa1(CodigoAsm codigoAsm, String nomeArquivo){
        
        String analise, linha;
        TabelaSimbolos tabelaSimbolos = new TabelaSimbolos();
        int enderecoAtual = 0;
        LeitorArquivo leitor = new LeitorArquivo(nomeArquivo);
        Instrucoes instrucoes = new Instrucoes();
        
        while(true){
            
            if((linha = leitor.proximaLinha()) == null)
                break;
            
            if((analise = instrucoes.analisarInstrucao(linha)) == null)
                return null;
            
            switch (analise.charAt(0)) {
                
                case 'A':
                    tabelaSimbolos.inserir(analise.substring(1, analise.length()));
                    codigoAsm.inserirLinha(linha);
                    enderecoAtual++;
                    break;
                    
                case 'L':
                    tabelaSimbolos.inserir(analise.substring(1, analise.length()), enderecoAtual);
                    break;
                    
                case 'C':
                    codigoAsm.inserirLinha(linha);
                    enderecoAtual++;
                    break;
                    
                default:
                    return null;
            }
        }
        
        tabelaSimbolos.gerarEnderecos();
        
        return tabelaSimbolos;
    }
    
    /**
     * A etapa 2 percorre o codigo substituindo os simbolos e gerando as instrucoes binarias.
     * @param codigoAsm, codigo assembly que está sendo montado.
     * @param codigoHacks, o codigo hacks que está sendo gerado.
     * @param nomeArquivo, nome do arquivo.
     * @author Micael Popping.
     */
    private static void etapa2(CodigoAsm codigoAsm, CodigoHacks codigoHacks, String nomeArquivo){
            
        String linhaInstrucao, linhaBin;
        Instrucoes instrucoes = new Instrucoes();
        
        //Inserindo cabeçalho
        codigoHacks.inserirTabelaSimbolos();
        
        //Inserindo instrucoes
        codigoHacks.inserirLinha(String.valueOf(codigoAsm.quantidadeLinhas()));
        
        for(int i =0, limite = codigoAsm.quantidadeLinhas(); i < limite; i++){
            
            linhaInstrucao = codigoAsm.pegarLinha(i);
            
            if(linhaInstrucao.charAt(0) == '@'){
                
                linhaBin = instrucoes.gerarLinhaBin(linhaInstrucao, codigoHacks.pegarSimbolo(linhaInstrucao.substring(1, linhaInstrucao.length())));
                codigoHacks.inserirLinha(linhaBin);
            }else{
                
                linhaBin = instrucoes.gerarLinhaBin(linhaInstrucao);
                codigoHacks.inserirLinha(linhaBin);
            }
        }    
    }
    
    /**
     *
     */
    private static void escreverArquivoHacks(CodigoHacks codigoHacks, String nomeArquivo){
        
        EscritorArquivo escritor = new EscritorArquivo(nomeArquivo);
        
        for(int i = 0, limite = codigoHacks.getTamanhoCodigoHacks(); i < limite; i++){
            
            escritor.escreverLinha(codigoHacks.pegarLinha(i));
        }
        
        escritor.close();
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
