package montador;

/**
 * Classe que guarda as informações de um simbolo
 * @author Micael Popping
 */
public class Simbolo {
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private int endereco;
    private boolean label;
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    /**
     * CONSTRUTOR.
     * @author Micael Popping.
     */
    public Simbolo(){
        
        setEndereco(-1);
        setLabel(false);
    }
    
    /**
     * CONSTRUTOR.
     * @author Micael Popping.
     */
    public Simbolo(int endereco){
        
        setEndereco(endereco);
        setLabel(true);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    /**
     * Alterar o valor de endereco.
     * @param endereco, novo valor para endereco.
     * @author Micael Popping.
     */
    private void setEndereco(int endereco){
        
        this.endereco = endereco;
    }
    
    /**
     * Alterar o valor de label.
     * @param label, novo valor para label.
     * @author Micael Popping.
     */
    private void setLabel(boolean label){
        
        this.label = label;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=    

   @Override
    public String toString(){
        
        return " Endereco: " + endereco + " Label? " + label;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=  
}
