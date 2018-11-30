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
    
    public void decodificar (String valorAzinho, String comp, String dest, String jump){
        
        switch (comp){
            
            case "101010":
                if ("0".equals(valorAzinho)){
                    this.variavelTemporaria = 0;
                    salvaOperacao = "0";
                }
                break;
            
            case "111111":
                if ("0". equals (valorAzinho)){
                    this.variavelTemporaria = 1;
                    salvaOperacao = "1";
                }
                break;
                
                
            
                
            
                
            
        }
    }
    
}
