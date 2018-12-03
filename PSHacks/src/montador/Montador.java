/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montador;

import gerenciador_arquivo.LeitorArquivo;

/**
 * Classe responsavel por metodos que montam o codigo assembly em linguagem de maquina.
 * @author Micael Popping
 */
public class Montador {
   
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    /**
     * Tem como entrada um arquivo .asm e gera o equivalente em .hacks.
     * @param nomeArquivo, nome do arquivo que deve ser convertido em hacks.
     * @return um valor logico, true se foi possivel fazer a conversão e false caso contrario.
     * @author Micael Popping.
     */
    public static boolean gerarAquivoHacks(String nomeArquivo){
        
        LeitorArquivo leitor;
        String linha;
        
        if(!verificarExtensaoArquivo(nomeArquivo, "asm"))
            return false;
        
        leitor = new LeitorArquivo(nomeArquivo);
        
        while(true){
            
            if((linha = leitor.proximaLinha()) == null)
                break;
            
            //FAZER
        }
        
        leitor = leitor.close();
        
        return true;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    /**
     * Verifica se a extensão de um  arquivo é uma extensão especificada.
     * @param nomeArquivo, nome do arquivo que deve ser verificado.
     * @param extensao, extensão que deve ser verificada.
     * @return valor logico, sendo true se a extensão do arquivo bater com a especificada e false caso contrario.
     * @author Micael Popping.
     */
    private static boolean verificarExtensaoArquivo(String nomeArquivo, String extensao){
        
        int indice;
        String auxiliar;
        
        if ((indice = nomeArquivo.indexOf('.')) == -1)
            return false;
        
        auxiliar = nomeArquivo.substring(indice + 1, nomeArquivo.length());
        
        if(auxiliar.equals(extensao))
            return true;
        else
            return false;
    }
}
