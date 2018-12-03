package montador;

import java.util.ArrayList;

/**
 * Estrutura que contem o codigo asm, facilitando o manuseamento.
 * @author Micael Popping
 */
public class CodigoAsm {
 
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private ArrayList<String> instrucoes;
    private int quantidadeLinhas;
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     */
    public CodigoAsm(){
        
        setInstrucoes(new ArrayList<>());
        setQuantidadeLinhas(0);
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Insere uma linha de instrucao na estrutura.
     * @param linha, linha que deve ser inserida na estrutura.
     * @author Micael Popping.
     */
    public void inserirLinha(String linha){
        
        instrucoes.add(linha);
        incrementarQuantidadeLinhas();
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
     * Incrementa a quantidade de linhas.
     * @author Micael Popping.
     */
    private void incrementarQuantidadeLinhas(){
        
        setQuantidadeLinhas(getQuantidadeLinhas() + 1);
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
    
    /**
     * Altera o valor de quantidadeLinhas.
     * @param quantidadeLinhas, novo valor para quantidadeLinhas.
     * @author Micael Popping.
     */
    private void setQuantidadeLinhas(int quantidadeLinhas){
        
        this.quantidadeLinhas = quantidadeLinhas;
    }
    
    /**
     * Retorna o valor de quantidadeLinhas.
     * @return valor de quantidadeLinhas.
     * @author Micael Popping.
     */
    public int getQuantidadeLinhas(){
     
        return quantidadeLinhas;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
