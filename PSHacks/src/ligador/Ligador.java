/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Victor Barros
 * 4 de dezembro de 2018
 */
public class Ligador {
    
    public ArrayList <String> codigo;

    
    public Ligador(){
        
    }
    
    public void ler(String primeiroArquivo, String segundoArquivo) throws FileNotFoundException{
       
            Scanner realizaLeitura = new Scanner(new FileReader(primeiroArquivo)).useDelimiter("\n");
            Scanner realizaLeituraSegundo = new Scanner(new FileReader(segundoArquivo)).useDelimiter("\n");
            
            while(realizaLeitura.hasNext()){
            
                this.codigo.add(realizaLeitura.nextLine());
                
            }
            
            while(realizaLeituraSegundo.hasNext()){
                
                this.codigo.add(realizaLeituraSegundo.nextLine());
                
            }
    }
    
    public void pegarLinhas(String primeiraLinha, String segundaLinha)throws FileNotFoundException{
         
    }
    
    public void getTabelaDefinicaoSimbololos(String primeiraTabela, String segundaTabela)throws FileNotFoundException{
        
    }
    
    public void getTabelaGlobal(String primeiraTabela, String segundaTabela)throws FileNotFoundException{
        
    }
    
    public void substituicaoSimbolos(){
        
    }
    
    public void ultimaPassagem(){
        
    }
    
    public void imprimeTabelaSimbolosGlobais(){
        
    }
    
    public void impressaoTabelaGlobal(){
        
    }
    
    public void impressaoCodigoIntermediario(){
        
    }
    
    public void impressaCodigoFinal(String codigoFinal)throws IOException{
        
    }
    
    public static void main(String[] args){
        
    }
}
