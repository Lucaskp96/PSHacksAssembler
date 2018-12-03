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
     */
    public Instrucoes(){
        
        setInstrucoesC(new InstrucoesC());
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
