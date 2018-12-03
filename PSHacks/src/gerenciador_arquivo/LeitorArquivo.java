package gerenciador_arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Abre o arquivo para manipulação de seu conteudo.
 * @author Micael Popping
 */
public class LeitorArquivo {
    
    private BufferedReader bufferLeitura;
    private String nomeArquivo;
    boolean valido;
    
   //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     * @param nome do arquivo que deve ser aberto.
     * @author Micael Popping
     */
    LeitorArquivo(String nomeArquivo){
        
        verificarExtensaoArquivo(nomeArquivo);
        
        try{
            
            setBufferLeitura(new BufferedReader(new FileReader(nomeArquivo)));
        }catch (IOException e){
            
            System.err.printf("Erro, não foi possivel abrir o aquivo: %s\n", e.getMessage());
        }  
    }
    
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    /**
     * Fecha o leitor de arquivo.
     * @return null.
     * @author Micael Popping.
     */
    public LeitorArquivo close(){

        try{

            getBufferLeitura().close();
            setBufferLeitura(null);
        }catch(IOException e){
            
            System.err.printf("Erro, não foi possivel fechar o aquivo: %s\n", e.getMessage());
        }

        return null;
    }
    
    /**
     * Retorna a proxima linha do buffer.
     * @return string, a proxima do buffer.
     * @author Micael Popping.
     */
    public String proximaLinha(){
        
        String linha = "";
        
        try{
            
            linha = getBufferLeitura().readLine();
        }catch(IOException e){
            
            System.err.printf("Erro, não foi possivel ler o aquivo: %s\n", e.getMessage());
        }
        
        return linha;
    }
    
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private boolean verificarExtensaoArquivo(String nomeArquivo){
        
        int indice;
        String auxiliar;
        
        if ((indice = nomeArquivo.indexOf('.')) == -1)
            return false;
        
        auxiliar = nomeArquivo.substring(indice + 1, nomeArquivo.length());
        
        if(auxiliar.equals("asm")){
            
            auxiliar = nomeArquivo.substring(0, indice);
            setNomeArquivo(auxiliar);
            setValido(true);
        } else
            setValido(false);
        
        return getValido();
    }
    
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Altera o valor de bufferLeitura.
     * @param novo valor para bufferLeitura.
     * @author Micael Popping.
     */
    private void setBufferLeitura(BufferedReader bufferLeitura){
        
        this.bufferLeitura = bufferLeitura;
    }
    
    /**
     * Altera o valor de nomeArquivo.
     * @param novo valor para nomeArquivo.
     * @author Micael Popping.
     */
    private void setNomeArquivo(String nomeArquivo){
        
        this.nomeArquivo = nomeArquivo;
    }
    
     /**
     * Altera o valor de valido.
     * @param novo valor para valido.
     * @author Micael Popping.
     */
    private void setValido(boolean valido){
        
        this.valido = valido;
    }

    /**
     * Retorna o valor de bufferLeitura.
     * @return valor de bufferLeitura.
     * @author Micael Popping.
     */
    private BufferedReader getBufferLeitura(){
        
        return bufferLeitura;
    }
    
    /**
     * Retorna o valor de nomeArquivo.
     * @return valor de nomeArquivo.
     * @author Micael Popping.
     */
    private String getNomeArquivo(){
        
        return nomeArquivo;
    }
    
    /**
     * Retorna o valor de valido.
     * @return valor de valido.
     * @author Micael Popping.
     */
    public boolean getValido(){
        
        return valido;
    }
    
   //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
}
