package montador;

import java.util.HashMap;

/**
 * Classe que simula a tabela de simbolos.
 * @author Micael Popping
 */
public class TabelaSimbolos {
 
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private HashMap<String, Simbolo> simbolos;
    private int quantidadeSimbolos;
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     */
    public TabelaSimbolos(){
        
        setSimbolos(new HashMap<>());
        setQuantidadeSimbolos(0);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Inserir um novo simbolo na tabela de simbolos.
     * @param simbolo, simbolo que deve ser inserido na tabela.
     * @return true se o simbolo foi inserido e false se o simbolo já estava na tabela.
     * @author Micael Popping.
     */
    public boolean inserir(String simbolo){
        
        if(contem(simbolo))
            return false;
        
        getSimbolos().put(simbolo, new Simbolo());
        atualizarQuantidadeSimbolos();
        
        return true;
    }
    
    /**
     * Inserir um novo simbolo na tabela de simbolos, sabe-se que é um label.
     * @param simbolo, simbolo que deve ser inserido na tabela.
     * @param valor, valor do simbolo que está sendo inserido.
     * @return true se o simbolo foi inserido e false se o simbolo já estava na tabela.
     * @author Micael Popping.
     */
    public boolean inserir(String simbolo, int valor){
            
        getSimbolos().put(simbolo, new Simbolo(valor));
        atualizarQuantidadeSimbolos();
        
        return true;
    }
    
    /**
     * Verifica se o simbolo está presente na tabela.
     * @param simbolo, que dever ser verificada a existencia na tabela.
     * @return true se o simbolo estiver presente e false caso contrario.
     * @author Micael Popping.
     */
    public boolean contem(String simbolo){
        
        return getSimbolos().containsKey(simbolo);
    }
    
    /**
     * Gera os enderecos para cada entrada da tabela simbolos.
     * @author Micael Popping.
     */
    public void gerarEnderecos(){
        
        Simbolo simbolo;
        int enderecoAtual = 0;
        
        for (String key : getSimbolos().keySet()) {
            
            simbolo = getSimbolos().get(key);
            
            simbolo.setEndereco(enderecoAtual);
            enderecoAtual++;
        }
    }
    
    /**
     * Gera uma string baseada na tabela simbolos.
     * @return string com dados da tabela simbolos.
     * @authro Micael Popping.
     */
    public String gerarStringTabelaSimbolos(){
        
        String resultado = "";
        Simbolo value;
                
        for(String key : getSimbolos().keySet()){
            
            value = getSimbolos().get(key);
            resultado += value.getEndereco() + " " + key + " " + value.getValor() + ";";
        }
        
        return resultado;
    }
    
    public Simbolo pegarValor(String simbolo){
        
        return getSimbolos().get(simbolo);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Atualiza o valor de quantidadeSimbolos.
     * @author Micael Popping.
     */
    private void atualizarQuantidadeSimbolos(){
        
        setQuantidadeSimbolos(getSimbolos().size());
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
     * Altera o valor de quantidadeSimbolos.
     * @param quantidadeSimbolos, novo valor para quantidadeSimbolos.
     * @author Micael Popping.
     */
    private void setQuantidadeSimbolos(int quantidadeSimbolos){
        
        this.quantidadeSimbolos = quantidadeSimbolos;
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
     * Retorna o valor de quantidadeSimbolos.
     * @return o valor de quantidadeSimbolos.
     * @author Micael Popping.
     */
    public int getQuantidadeSimbolos(){
        
        return quantidadeSimbolos;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    @Override
    public String toString(){
        
        String resultado = "";
        
        for(String key : getSimbolos().keySet()){
            
            Simbolo value = getSimbolos().get(key);
            resultado += "Simbolo: " + key + value.toString() + "\n";
        }
        
        resultado += "\nQuantidade de simbolos: " + getQuantidadeSimbolos() + "\n";
        
        return resultado;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
