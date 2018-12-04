package montador;

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
        
        CodigoHacks codigoHacks = null;
        
        if(!verificarExtensaoArquivo(nomeArquivo, "asm"))
            return false;
        
        codigoHacks = montarCodigoHacks(nomeArquivo);
        
        //escreverArquivoHacks(codigoHacks, nomeArquivo);
        
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
     * Tira o codigo asm do arquivo, passando para uma estrutura. 
     * O processo já verifica a sintaxe.
     * @param nomeArquivo, nome do arquivo que sera convertido em uma estrutura de codigo asm.
     * @return uma estrutura equivalente ao arquivo contendo o codigo asm.
     * @author Micael Popping.
     *
    private static CodigoAsm retirarDoArquivo(String nomeArquivo){
        
        LeitorArquivo leitor = new LeitorArquivo(nomeArquivo);
        String linha;
        CodigoAsm codigoAsm = new CodigoAsm();
        
        while(true){
            
            if((linha = leitor.proximaLinha()) == null)
                break;
            
            //FAZER
            //Analisar linha
            //InserirSimbolo
            //InserirInstrucao
        }
        
        leitor = leitor.close();
        
        return codigoAsm;
    }
    */
    
    /**
     * Monta o codigo, em duas etapas.
     * @param nomeArquivo, nome do arquivo .asm que vai ser montado.
     * @author Micael Popping.
     */
    private static CodigoHacks montarCodigoHacks(String nomeArquivo){
        
        CodigoAsm codigoAsm = null;
        //ProcessadorMacros processadorMacros = new ProcessadorMacros();
        CodigoHacks codigoHacks = new CodigoHacks();
        
        //codigoAsm = processarMacros(nomeArquivo);
        //codigoHacks.setTabelaSimbolos(etapa1(codigoAsm, processadorMacros));
        
        etapa2(codigoAsm, codigoHacks);
        
        return codigoHacks;
    }
    
    /**
     * A etapa 1 percorre o codigo verificando a sintaxe e montando a tabela de simbolos.
     * @param codigoAsm, codigo assembly que está sendo montado.
     * @param processadorMacros, processador de macros do codigo asm.
     * @return a tabela de simbolos do codigo.
     * @author Micael Popping.
     */
    private static TabelaSimbolos etapa1(CodigoAsm codigoAsm){
        
        String analise;
        TabelaSimbolos tabelaSimbolos = new TabelaSimbolos();
        Instrucoes instrucoes = new Instrucoes();
        
        for(int i = 0, limite = codigoAsm.getQuantidadeLinhas(); i < limite; i++){
            
            if((analise = instrucoes.analisarInstrucao(codigoAsm.pegarLinha(i))) == null)
                return null;
                       
            if(analise.charAt(0) == 'A');
                //tabelaSimbolos.inserir(analise.substring(1, analise.length());

            //FAZER
        }
        
        return tabelaSimbolos;
    }
    
    /**
     * A etapa 2 percorre o codigo substituindo os simbolos e gerando as instrucoes binarias.
     * @param codigoAsm, codigo assembly que está sendo montado.
     * @param codigoHacks, o codigo hacks que está sendo gerado.
     * @author Micael Popping.
     */
    private static void etapa2(CodigoAsm codigoAsm, CodigoHacks codigoHacks){
        /*
        FAZER
        */  
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
