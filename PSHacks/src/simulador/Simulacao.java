/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author Victor Barros e Gregory 
 * 30 de novembro de 2018
 */
public class Simulacao extends BRegistradores {
    
    private short variavelTemporaria;
    private static String salvaOperacao;
    private static int somenteZero = 0; //Usei pra fazer  -D (0-D)
    private static String salvaDestino;
    private static String salto;
    private static boolean increPC;
    
    public void decodificar(short a) {
        salvaOperacao = Integer.toString(a);
        salvaDestino = "A";
        salto = "null";
        setRegistradorA(a);
    }

    //Devolve qual o tipo de operação está fazendo.
    public String operacao() {
        return salvaOperacao;
    }

    public String destino() {
        return salvaDestino;
    }

    public String jump() {
        return salto;
    }

    public boolean getIncrementaPC() {
        return increPC;
    }

    public void setIncrementaPC(boolean PC) {
        increPC = PC;
    }

    
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
            
            case "111010":
                if ("0".equals(valorAzinho)){
                    this.variavelTemporaria = -1;
                    salvaOperacao = "-1";
                }
                break;
                
            case "001100":
                if ("0".equals(valorAzinho)){
                    this.variavelTemporaria = getRegistradorD();
                    salvaOperacao = "D";
                }
                break;
           
            case "110000":
                if ("0".equals(valorAzinho)){
                    this.variavelTemporaria = getRegistradorA();
                    salvaOperacao = "A";
                }
                else if ("1".equals(valorAzinho)){
                    this.variavelTemporaria = getMemoriaDeDados();
                    salvaOperacao = "M[RegistradorA]";
                }
                break;
            
            case "001101":
                if ("0".equals(valorAzinho)){
                    this.variavelTemporaria = getRegistradorD(); //FALTA DESCOBRIR A OPERACAO (!)
                    salvaOperacao = "!D";
                }
                break;
            
            case "110001":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = getRegistradorA();
                    salvaOperacao = "!A";
                    break;
                } else {
                    this.variavelTemporaria = getMemoriaDeDados();  
                    salvaOperacao = "!M[RegistradorA]";
                    break;
                }
                
            case "001111":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = (short) (somenteZero - getRegistradorD());
                    salvaOperacao = "-D";
                }
                break;   
            
            case "110011":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = (short) (somenteZero - getRegistradorA()); 
                    salvaOperacao = "-A";
                    break;
                    
                } else {
                    this.variavelTemporaria = (short) (somenteZero - getMemoriaDeDados()); 
                    salvaOperacao = "-M[RegistradorA]";
                    break;
                }
            
            case "011111":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = (short) ((short) getRegistradorD() + 1); 
                    salvaOperacao = "D+1";
                }
                break;    
            
            case "110111":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = (short) ((short) getRegistradorA() + 1); 
                    salvaOperacao = "A+1";
                    break;
                    
                } else {
                    this.variavelTemporaria = (short) ((short) getMemoriaDeDados() + 1); 
                    salvaOperacao = "M[RegistradorA]+1";
                    break;
                }
                
            case "001110":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = (short) ((short) getRegistradorD() - 1); 
                    salvaOperacao = "D-1";
                }
             
                break;
            
            case "110010":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = (short) ((short) getRegistradorA() - 1); 
                    salvaOperacao = "A-1";
                    break;
                } else {
                    this.variavelTemporaria = (short) ((short) getMemoriaDeDados() - 1); 
                    salvaOperacao = "M[RegistradorA-1]";
                    break;
                }
            
             case "000010":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = (short) (getRegistradorD() + getRegistradorA()); 
                    salvaOperacao = "D+A";
                    break;
                } else {
                    this.variavelTemporaria = (short) (getRegistradorD() + (short) getMemoriaDeDados());               
                    salvaOperacao = "D+M[RegistradorA]";
                    break;
                }
            
            case "010011":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = (short) (getRegistradorD() - getRegistradorA()); 
                    salvaOperacao = "D-A";
                    break;
                    
                } else {
                    this.variavelTemporaria = (short) (getRegistradorD() - (short) getMemoriaDeDados()); //D-M
                    salvaOperacao = "D-M[RegistradorA]";
                    break;
                }
                
            case "000111":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = (short) (getRegistradorA() - getRegistradorD()); 
                    salvaOperacao = "A-D";
                    break;
                } else {
                    this.variavelTemporaria = (short) ((short) getMemoriaDeDados() - getRegistradorD()); 
                    salvaOperacao = "M[RegistradorA]-D";
                    break;
                }

            case "000000":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = (short) (getRegistradorD() & getRegistradorA()); 
                    salvaOperacao = "D&A";
                    break;
                } else {
                    this.variavelTemporaria = (short) (getRegistradorD() & (short) getMemoriaDeDados()); 
                    salvaOperacao = "D&M[RegistradorA]";
                    break;
                }

            case "010101":
                if ("0".equals(valorAzinho)) {
                    this.variavelTemporaria = (short) (getRegistradorD() | getRegistradorA()); 
                    salvaOperacao = "D|A";
                    break;
                } else {
                    this.variavelTemporaria = (short) (getRegistradorD() | (short) getMemoriaDeDados()); 
                    salvaOperacao = "D|M[RegistradorA]";
                    break;
                }

            default:
                    
                System.out.println("Invalido!");
            
             
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
        
       switch (jump) {
            case "000":
                salto = "null";
                break; 
                
            case "001":
                if (this.variavelTemporaria > 0) {
                    increPC = false;
                }
                salto = "JGT MemoriaDeIntrucoes[A]";
                break;
                
            case "010":
                if (this.variavelTemporaria == 0) {
                    increPC = false;
                }
                salto = "JEQ MemoriaDeIntrucoes[A]";
                break;
                
            case "011":
                if (this.variavelTemporaria >= 0) {
                    increPC = false;
                }
                salto = "JGE MemoriaDeIntrucoes[A]";
                break;
                
            case "100":
                if (this.variavelTemporaria  < 0) {
                    increPC = false;
                }
                salto = "JLT MemoriaDeIntrucoes[A]";
                break;
                
            case "101":
                if (this.variavelTemporaria != 0) {
                    increPC = false;
                }
                salto = "JNE MemoriaDeIntrucoes[A]";
                break;
                
            case "110":
                if (this.variavelTemporaria <= 0) {
                    increPC = false;
                }
                salto = "JLE MemoriaDeIntrucoes[A]";
                break;
                
            case "111":
                salto = "JMP MemoriaDeIntrucoes[A]";
                increPC = false;
                break;
        } 
    }
    
}
