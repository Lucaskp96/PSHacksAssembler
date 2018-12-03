package montador;

import java.util.ArrayList;

/**
 * Classe que simula a tabela de simbolos.
 * @author Micael Popping
 */
class TabelaSimbolos {
 
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private ArrayList<Simbolo> simbolos;
    private int quantidadeDados;
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     */
    public TabelaSimbolos(){
        
        setSimbolos(new ArrayList<>());
        setQuantidadeDados(0);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Altera o valor de simbolos.
     * @param simbolos, novo valor para simbolos.
     * @author Micael Popping.
     */
    private void setSimbolos(ArrayList<Simbolo> simbolos){
        
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
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
}
