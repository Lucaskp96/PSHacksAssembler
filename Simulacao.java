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
    private static String salvaDestino;
    
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
        switch(dest){
               case "000":
                   salvaDestino= "null";
                   break;
               case "001":
                   salvaDestino= "M";
                   setMemoriaDeDados(this.variavelTemporaria);
                   break;
               case "010":
                   salvaDestino= "D";
                   setRegistradorD(this.variavelTemporaria);
                   break;
               case "011":
                   salvaDestino= "MD";
                   setMemoriaDeDados(this.variavelTemporaria);
                   setRegistradorD(this.variavelTemporaria);
                   break;
               case "100":
                   salvaDestino= "A";
                   setRegistradorA(this.variavelTemporaria);
                   break;
               case "101":
                   salvaDestino= "AM";
                   setMemoriaDeDados(this.variavelTemporaria);
                   setRegistradorA(this.variavelTemporaria);
                   break;
               case "110":
                   salvaDestino= "AD";
                   setRegistradorD(this.variavelTemporaria);
                   setRegistradorA(this.variavelTemporaria);
                   break;
               case "111":
                   salvaDestino= "AMD";
                   setMemoriaDeDados(this.variavelTemporaria);
                   setRegistradorD(this.variavelTemporaria);
                   setRegistradorA(this.variavelTemporaria);
                   break;       
       } 
    }
    
}
