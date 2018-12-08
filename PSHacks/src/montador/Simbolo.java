package montador;

/**
 * Classe que guarda as informações de um simbolo
 * @author Micael Popping
 */
public class Simbolo {
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private int valor;
    private boolean label;
    private int endereco;
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    /**
     * CONSTRUTOR.
     * @author Micael Popping.
     */
    public Simbolo(){
        
        setValor(-1);
        setLabel(false);
    }
    
    /**
     * CONSTRUTOR.
     * @author Micael Popping.
     */
    public Simbolo(int valor){
        
        setValor(valor);
        setLabel(true);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    /**
     * Alterar o valor de valor.
     * @param valor, novo valor para valor.
     * @author Micael Popping.
     */
    void setValor(int valor){
        
        this.valor = valor;
    }
    
    /**
     * Alterar o valor de label.
     * @param label, novo valor para label.
     * @author Micael Popping.
     */
    private void setLabel(boolean label){
        
        this.label = label;
    }
    
    /**
     * Alterar o valor de endereco.
     * @param endereco, novo valor para endereco.
     * @author Micael Popping.
     */
    void setEndereco(int endereco){
        
        this.endereco = endereco;
    }
    
    /**
     * Retorna o valor de valor.
     * @return o valor de valor.
     * @author Micael Popping.
     */
    int getValor(){
        
        return valor;
    }
    
    /**
     * Retorna o valor de label.
     * @return o valor de label.
     * @author Micael Popping.
     */
    boolean getLabel(){
        
        return label;
    }
    
    /**
     * Retorna o valor de endereco.
     * @return o valor de endereco.
     * @author Micael Popping.
     */
    public int getEndereco(){
        
        return endereco;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=    

   @Override
    public String toString(){
        
        return " | Endereco: " + getEndereco() + " | Valor: " + getValor() + " | Label? " + getLabel();
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=  
}
