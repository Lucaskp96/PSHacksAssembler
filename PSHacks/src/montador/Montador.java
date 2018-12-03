package montador;

import gerenciador_arquivo.LeitorArquivo;

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
        
        CodigoAsm codigoAsm = null;
        //ProcessadorMarcros processadorMacros = new ProcessadorMacros(nomeArquivo);
        
        if(!verificarExtensaoArquivo(nomeArquivo, "asm"))
            return false;
        
        //codigoAsm = processarMacros(nomeArquivo);
        
        Montador.etapa1(codigoAsm);
        
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
     * A etapa 1 percorre o codigo verificando a sintaxe e montando a tabela de simbolos.
     */
    private static TabelaSimbolos etapa1(CodigoAsm codigoAsm){
        
        String linha;
        
        for(int i = 0, limite = codigoAsm.getQuantidadeLinhas(); i < limite; i++){
            
            linha = codigoAsm.pegarLinha(i);
            
            //FAZER
        }
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
