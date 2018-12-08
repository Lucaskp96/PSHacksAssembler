package instrucoes;

import montador.Simbolo;

/**
 * Classe que contem as instrucoes do hacks.
 * @author Micael Popping.
 */
public class Instrucoes {
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private static InstrucoesC instrucoesC;
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     * @author Micael Popping.
     */
    public Instrucoes(){
        
        setInstrucoesC(new InstrucoesC());
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Analisa se a instrução é valida e qual o tipo.
     * @param instrucao, instrução que deve ser analisada.
     * @return uma stream contendo informações sobre a analise.
     * @author Micael Popping.
     */
    public String analisarInstrucao(String instrucao){
        
        String analise;
        
        if(instrucao.charAt(0) == '@'){
            
            analise = "A";
            analise += instrucao.substring(1, instrucao.length());
            
            return analise;
        }
        
        if(instrucao.charAt(0) == '('){
            
            if(instrucao.charAt(instrucao.length() - 1) != ')')
                return null;
            
            analise = "L";
            analise += instrucao.substring(1, instrucao.length() - 1);
            
            return analise;
        }
        
        if(instrucoesC.isTipo(instrucao)){
            
            return "C";
        }
        
        return null;
    }
    
    /**
     *
     */
    public String gerarLinhaBin(String linhaInstrucao, Simbolo simbolo){
        
        int endereco = simbolo.getEndereco();
        
        return gerarBinario(endereco) + " r";
    }
    
    /**
     *
     */
    public String gerarLinhaBin(String linhaInstrucao){
        
        int igual, pVirgula;
        String resultado = "111", dest = null, comp = null, jump = null; 
        
        igual = linhaInstrucao.indexOf('=');
        pVirgula = linhaInstrucao.indexOf(';');
        
        if((igual != -1) && (pVirgula == -1)){
            
            dest = linhaInstrucao.substring(0, igual);
            comp = linhaInstrucao.substring(igual + 1, linhaInstrucao.length());
            
            resultado += instrucoesC.compBin(comp);
            resultado += instrucoesC.destBin(dest);
            resultado += instrucoesC.jumpBin("");
            
            return resultado + " a";
        }else
        if((igual == -1) && (pVirgula != -1)){
            
            comp = linhaInstrucao.substring(0, pVirgula);
            jump = linhaInstrucao.substring(pVirgula + 1, linhaInstrucao.length()).trim();
            
            resultado += instrucoesC.compBin(comp);
            resultado += instrucoesC.destBin("");
            resultado += instrucoesC.jumpBin(jump);
            
            return resultado + " a";
        }else
        if((igual != -1) && (pVirgula != -1)){
            
            dest = linhaInstrucao.substring(0, igual);
            comp = linhaInstrucao.substring(igual + 1, pVirgula);
            jump = linhaInstrucao.substring(pVirgula + 1, linhaInstrucao.length()).trim();
            
            resultado += instrucoesC.compBin(comp);
            resultado += instrucoesC.destBin(dest);
            resultado += instrucoesC.jumpBin(jump);
            
            return resultado + " a";
        }
        
       return null;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     *
     */
    private String gerarBinario(int numero){
        
        String resultado = "";
        int valorAtual = 0;
        
        for(int i = 15; i > -1; i--){
            
            if(valorAtual + Math.pow(2, i) <= numero){
                
                valorAtual += Math.pow(2, i);
                resultado += "1";
            }else{
                
                resultado += "0";
            }
        }
        
        return resultado;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Altera o valore de instrucoesC.
     * @param instrucoesC, novo valor para instrucoesC.
     * @author Micael Popping.
     */
    private void setInstrucoesC(InstrucoesC instrucoesC){
        
        this.instrucoesC = instrucoesC;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
