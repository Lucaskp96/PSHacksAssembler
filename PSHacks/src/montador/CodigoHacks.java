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
    
    /**
     * Insere uma instrucao na estrutura.
     * @param instrucao, instrução que deve ser inserida.
     * @author Micael Popping.
     */
    public void inserirLinha(String instrucao){
        
        getCodigoHacks().add(instrucao);
    }
    
    /**
     * Pega a linha de indice i.
     * @param i, indice da linha que deve ser pega.
     * @return a linha.
     * @author Micael Popping.
     */
    public String pegarLinha(int i){
        
        return getCodigoHacks().get(i);
    }
    
    /**
     * Insere a tabela de simbolos na estrutura.
     */
    public void inserirTabelaSimbolos(){
        
        String simbolos = tabelaSimbolos.gerarStringTabelaSimbolos(), auxiliar;
        int i = simbolos.indexOf(';');
        
        inserirLinha(String.valueOf(tabelaSimbolos.getQuantidadeSimbolos()));
        
        while(i != -1){
            
            auxiliar = simbolos.substring(0, i);
            
            inserirLinha(auxiliar);
            
            simbolos = simbolos.substring(i + 1, simbolos.length());
            i = simbolos.indexOf(';');
        }
    }
    
    /**
     * Retorna o objeto simbolo de acordo com a chave informada.
     * @param simbolo, chave que deve ser buscada.
     * @return o objeto simbolo.
     * @author Micael Popping.
     */
    Simbolo pegarSimbolo(String simbolo){
        
        return tabelaSimbolos.pegarValor(simbolo);
    }
    
    public int getTamanhoCodigoHacks(){
        
        return getCodigoHacks().size();
    }
    
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
    
    /**
     * Retorna o valor de codigoHacks.
     * @reutrn o valor para codigoHacks.
     * @auhtor Micael Popping.
     */
    private ArrayList<String> getCodigoHacks(){
        
        return codigoHacks;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    @Override
    public String toString(){
        
        String retorno = "";
        
        for(int i = 0, limite = getCodigoHacks().size(); i < limite; i++)
            retorno += "End.: " + i + " Instr.: " + getCodigoHacks().get(i) + "\n";
        
        return retorno;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
