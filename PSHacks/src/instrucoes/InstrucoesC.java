package instrucoes;

import java.util.HashMap;

/**
 * Instrucoes do tipo C do hacks.
 * @author Micael Popping.
 */
class InstrucoesC {
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private static final HashMap<String, String> COMP = startComp();
    private static final HashMap<String, String> DEST = startDest();
    private static final HashMap<String, String> JUMP = startJump();
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     * @author Micael Popping.
     */
    public InstrucoesC(){
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Inicia o valor de comp.
     * @return uma estrutura HashMap.
     * @author Micael Popping.
     */
    private static HashMap<String, String> startComp(){
        
        HashMap<String, String> comp = new HashMap<>(38); //Inicia a HashMap com 38 posicoes, sendo assim consegue colocar as 28 possibilidades sem rehash
        
        comp.put("0", "0101010");
        comp.put("1", "0111111");
        comp.put("-1", "0111010");
        comp.put("D", "0001100");
        comp.put("A", "0110000");
        comp.put("!D", "0001101");
        comp.put("!A", "0110001");
        comp.put("-D", "0001111");
        comp.put("-A", "0110011");
        comp.put("D+1", "0011111");
        comp.put("A+1", "0110111");
        comp.put("D-1", "0001110");
        comp.put("A-1", "0110010");
        comp.put("D+A", "0000010");
        comp.put("D-A", "0010011");
        comp.put("A-D", "0000111");
        comp.put("D&A", "0000000");
        comp.put("D|A", "0010101");
        comp.put("M", "1110000");
        comp.put("!M", "110001");
        comp.put("-M", "1110011");
        comp.put("M+1", "1110111");
        comp.put("M-1", "1110010");
        comp.put("D+M", "1000010");
        comp.put("D-M", "1010011");
        comp.put("M-D", "1000111");
        comp.put("D&M", "1000000");
        comp.put("D|M", "1010101"); 
        
        return comp;
    }
    
    /**
     * Inicia o valor de dest.
     * @return uma estrutura HashMap.
     * @author Micael Popping.
     */
    private static HashMap<String, String> startDest(){
        
        HashMap<String, String> dest = new HashMap<>(11); //Inicia a HashMap com 11 posicoes, sendo assim consegue colocar as 8 possibilidades sem rehash
        
        dest.put("", "000");
        dest.put("M", "001");
        dest.put("D", "010");
        dest.put("MD", "011");
        dest.put("A", "100");
        dest.put("AM", "101");
        dest.put("AD", "110");
        dest.put("AMD", "111");
        
        return dest;
    }
    
    /**
     * Inicia o valor de jump.
     * @return uma estrutura HashMap.
     * @author Micael Popping.
     */
    private static HashMap<String, String> startJump(){
        
        HashMap<String, String> jump = new HashMap<>(11); //Inicia a HashMap com 11 posicoes, sendo assim consegue colocar as 8 possibilidades sem rehash
        
        jump.put("", "000");
        jump.put("JGT", "001");
        jump.put("JEQ", "010");
        jump.put("JGE", "011");
        jump.put("JLT", "100");
        jump.put("JNE", "101");
        jump.put("JLE", "110");
        jump.put("JMP", "111");
        
        return jump;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
