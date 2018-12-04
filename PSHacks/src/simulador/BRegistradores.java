/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author Victor Barros 
 * 30 de novembro de 2018
 */
public class BRegistradores {
    
    private static short registradorA; //Registrador A
    private static short registradorD; //Registrador D
    private static short[] memoriaDeDados = new short[32768]; //Memória de Dados 2^15
    private static String[] memoriaDeInstrucoes = new String[32768]; //Memória de Instruções
    private static int i = 0; //Índice 
    private static int programCounter = 0; //Program Counter
    
    public void setRegistradorA(){
        BRegistradores.registradorA = 0;
    }
    
    public void setRegistradorD(){
        BRegistradores.registradorD = 0;
    }
    
     public void setMemoriaDeDados(){
        i = 0;
        while (i < 32768){
            memoriaDeDados[i] = 0;
            i++;
        }
    }
    
    public void setMemoriaDeInstrucoes(){
        i = 0;

        while (i < 32768){
            memoriaDeInstrucoes[i] = null;
            i++;
        }
    }
    
    public void setVariaveli(){
        BRegistradores.i = 0;
    }
    
    //REGISTRADOR A
    public short getRegistradorA() {
        return BRegistradores.registradorA;
    }
    
    public void setRegistradorA(short registradorA){
        BRegistradores.registradorA = registradorA;
    }
    
    //REGISTRADOR D
    public short getRegistradorD() {
        return BRegistradores.registradorD;
    }

    public void setRegistradorD(short registradorD) {
        BRegistradores.registradorD = registradorD;
    }
    
    //Posição da Mémoria
    
    //Retorna Memoria[A]
    public short getMemoriaDeDados() {
        return memoriaDeDados[getRegistradorA()]; 
    }

    //Retorna Posição da Memória 
    public short getMemoriaDeDados(int i) { 
        return memoriaDeDados[i]; 
    }
    
    //Memoria [A] = valorEntrada
    public void setMemoriaDeDados(short valorEntrada) {
        memoriaDeDados[getRegistradorA()] = valorEntrada; 
    }
    
    //Program Counter - Memória de Instruções
    public int getPc() {
        return programCounter;
    }

    public void setPc(int programCounter) {
        BRegistradores.programCounter = programCounter;
    }
    
    //Retorno do ProgramCounter
    public String getMemoriaDeInstrucoes() {
        return memoriaDeInstrucoes[programCounter];
    }

    //Retorno da Posição
    public String getMemoriaDeIntrucoes(int i) { 
        return memoriaDeInstrucoes[i];
    }
    
    public void setMemoriaDeInstrucoes(String valorEntrada) {
        memoriaDeInstrucoes[programCounter] = valorEntrada; //
        setPc(getPc()+1); //Somador do Program Counter = PC += 1
    }
     
   
   
}
