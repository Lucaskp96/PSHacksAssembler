package montador;

import java.util.ArrayList;

/**
 * Estrutura que contem o codigo asm, facilitando o manuseamento.
 * @author Micael Popping
 */
public class CodigoAsm {
 
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private ArrayList<String> instrucoes;
    private TabelaSimbolos tabelaSimbolos;
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     */
    public CodigoAsm(){
        
         setInstrucoes(new ArrayList<>());
         setTabelaSimbolos(new TabelaSimbolos());
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Altera o valor de instrucoes.
     * @param instrucoes, novo valor para instrucoes.
     * @author Micael Popping.
     */
    private void setInstrucoes(ArrayList<String> instrucoes){
        
        this.instrucoes = instrucoes;
    }
    
    /**
     * Altera o valor de TabelaSimbolos.
     * @param tabelaSimbolos, novo valor para tabelaSimbolos.
     * @author Micael Popping.
     */
    private void setTabelaSimbolos(TabelaSimbolos tabelaSimbolos){
        
        this.tabelaSimbolos = tabelaSimbolos;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
}
