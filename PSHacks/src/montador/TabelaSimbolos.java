package montador;

import java.util.HashMap;

/**
 * Classe que simula a tabela de simbolos.
 * @author Micael Popping
 */
class TabelaSimbolos {
 
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private HashMap<String, Simbolo> simbolos;
    private int quantidadeDados;
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     */
    public TabelaSimbolos(){
        
        setSimbolos(new HashMap<>());
        setQuantidadeDados(0);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Inserir um novo simbolo na tabela de simbolos.
     * @param simbolo, simbolo que deve ser inserido na tabela.
     * @return true se o simbolo foi inserido e false se o simbolo já estava na tabela.
     * @author Micael Popping.
     */
    public boolean inserir(String simbolo){
        
        if(!contem(simbolo))
            return false;
        
        getSimbolos().put(simbolo, new Simbolo());
        incrementarQuantidadeDados();
        
        return true;
    }
    
    //inserir
    
    /**
     * Verifica se o simbolo está presente na tabela.
     * @param simbolo, que dever ser verificada a existencia na tabela.
     * @return true se o simbolo estiver presente e false caso contrario.
     * @author Micael Popping.
     */
    public boolean contem(String simbolo){
        
        return getSimbolos().containsKey(simbolo);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Incrementa o valor de quantidadeDados.
     * @author Micael Popping.
     */
    private void incrementarQuantidadeDados(){
        
        setQuantidadeDados(getQuantidadeDados() + 1);
    }
    
    /**
     * Decrementa o valor de quantidadeDados.
     * @author Micael Popping.
     */
    private void decrementarQuantidadeDados(){
        
        setQuantidadeDados(getQuantidadeDados() - 1);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Altera o valor de simbolos.
     * @param simbolos, novo valor para simbolos.
     * @author Micael Popping.
     */
    private void setSimbolos(HashMap<String, Simbolo> simbolos){
        
        this.simbolos = simbolos;
    }
    
    /**
     * Altera o valor de quantidadeDados.
     * @param quantidadeDados, novo valor para quantidadeDados.
     * @author Micael Popping.
     */
    private void setQuantidadeDados(int quantidadeDados){
        
        this.quantidadeDados = quantidadeDados;
    }
    
    /**
     * Retorna o valor de simbolos.
     * @return o valor de simbolos.
     * @author Micael Popping.
     */
    private HashMap<String, Simbolo> getSimbolos(){
        
        return simbolos;
    }
    
    /**
     * Retorna o valor de quantidadeDados.
     * @return o valor de quantidadeDados.
     * @author Micael Popping.
     */
    private int getQuantidadeDados(){
        
        return quantidadeDados;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
