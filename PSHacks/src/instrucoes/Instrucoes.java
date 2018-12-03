package instrucoes;

/**
 * Classe que contem as instrucoes do hacks.
 * @author Micael Popping.
 */
public class Instrucoes {
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private InstrucoesC instrucoesC;
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     * @author Micael Popping.
     */
    public Instrucoes(){
        
        setInstrucoesC(new InstrucoesC());
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Analisa se a instrução é valida e qual o tipo.
     * @param instrucao, instrução que deve ser analisada.
     * @return uma stream contendo informações sobre a analise.
     * @author Micael Popping.
     */
    public String analisarInstrucao(String instrucao){
        
        String analise;
        
        if(instrucao.charAt(0) == '@'){
            
            analise = "A";
            analise+= instrucao.substring(1, instrucao.length());
            
            return analise;
        }
        
        //FAZER
        
        return "XX";
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Altera o valore de instrucoesC.
     * @param instrucoesC, novo valor para instrucoesC.
     * @author Micael Popping.
     */
    private void setInstrucoesC(InstrucoesC instrucoesC){
        
        this.instrucoesC = instrucoesC;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
