package montador;

import java.util.ArrayList;

/**
 *
 * @author Micael Popping
 */
public class CodigoHacks {
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private ArrayList<String> codigoHacks;
    private TabelaSimbolos tabelaSimbolos;
 
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    CodigoHacks(){
        
        setCodigoHacks(new ArrayList<>());
        setTabelaSimbolos(null);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private void setCodigoHacks(ArrayList<String> codigoHacks){
        
        this.codigoHacks = codigoHacks;
    }
    
    public void setTabelaSimbolos(TabelaSimbolos tabelaSimbolos){
        
        this.tabelaSimbolos = tabelaSimbolos;
    } 
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
