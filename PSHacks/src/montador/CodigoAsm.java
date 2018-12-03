package montador;

import java.util.ArrayList;

/**
 * Estrutura que contem o codigo asm, facilitando o manuseamento.
 * @author Micael Popping
 */
public class CodigoAsm {
 
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private ArrayList<String> instrucoes;
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     */
    public CodigoAsm(){
        
         setInstrucoes(new ArrayList<>());
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Insere uma linha de instrucao na estrutura.
     * @param linha, linha que deve ser inserida na estrutura.
     * @author Micael Popping.
     */
    public void inserirLinha(String linha){
        
        instrucoes.add(linha);
    }
    
    /**
     * Pega uma linha da estrutura.
     * @param indiceLinha, indice da linha que deve ser pega
     * @return conteudo da linha.
     * @author Micael Popping.
     */
    public String pegarLinha(int indiceLinha){
        
        return instrucoes.get(indiceLinha);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Altera o valor de instrucoes.
     * @param instrucoes, novo valor para instrucoes.
     * @author Micael Popping.
     */
    private void setInstrucoes(ArrayList<String> instrucoes){
        
        this.instrucoes = instrucoes;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
