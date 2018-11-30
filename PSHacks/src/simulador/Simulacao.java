/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author barros
 */
public class Simulacao extends BRegistradores {
    
    private short variavelTemporaria;
    private static String salvaOperacao;
    
    public void decodificar (String valorA, String comp, String dest, String jump){
        
        switch (comp){
            
            case "0101010":
                this.variavelTemporaria = 0;
                salvaOperacao = "0";
                break;
            
            case "0111111":
                this.variavelTemporaria = 1;
                salvaOperacao = "1";
                break;
                
            case "0111010":
                this.variavelTemporaria = -1;
                salvaOperacao = "-1";
                break;
                
            case "0001100":
                this.variavelTemporaria = getRegistradorD();
                salvaOperacao = "D";
                break
                
        }
    }
    
}
