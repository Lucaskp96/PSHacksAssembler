package montador;

import java.util.ArrayList;

/**
 * Estrutura que guarda o codigo hacks.
 * @author Micael Popping
 */
public class CodigoHacks {
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private ArrayList<String> codigoHacks;
    private TabelaSimbolos tabelaSimbolos;
 
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * MONTADOR.
     * @author Micael Popping.
     */
    CodigoHacks(){
        
        setCodigoHacks(new ArrayList<>());
        setTabelaSimbolos(null);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Aletra o valor de codigoHacks.
     * @param codigoHacks, novo valor para codigoHacks.
     * @auhtor Micael Popping.
     */
    private void setCodigoHacks(ArrayList<String> codigoHacks){
        
        this.codigoHacks = codigoHacks;
    }
    
    /**
     * Aletra o valor de tabelaSimbolos.
     * @param tabelaSimbolos, novo valor para tabelaSimbolos.
     * @auhtor Micael Popping.
     */
    public void setTabelaSimbolos(TabelaSimbolos tabelaSimbolos){
        
        this.tabelaSimbolos = tabelaSimbolos;
    } 
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
