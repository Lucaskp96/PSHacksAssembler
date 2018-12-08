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
        
        getInstrucoes().add(linha);
    }
    
    /**
     * Pega uma linha da estrutura.
     * @param indiceLinha, indice da linha que deve ser pega
     * @return conteudo da linha.
     * @author Micael Popping.
     */
    public String pegarLinha(int indiceLinha){
        
        return getInstrucoes().get(indiceLinha);
    }
    
    /**
     * Retorna a quantidade de linhas presente no codigoAsm.
     * @return a quantidade de linhas no codigo asm.
     * @author Micael Popping.
     */
    public int quantidadeLinhas(){
        
        return getInstrucoes().size();
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
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
     * Retorna o valor de instrucoes.
     * @return o valor de instrucoes.
     * @author Micael Popping.
     */
    private ArrayList<String> getInstrucoes(){
        
        return instrucoes;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    @Override
    public String toString(){
        
        String retorno = "";
        
        for(int i = 0, limite = getInstrucoes().size(); i < limite; i++)
            retorno += "End.: " + i + " Instr.: " + getInstrucoes().get(i) + "\n";
        
        return retorno;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
