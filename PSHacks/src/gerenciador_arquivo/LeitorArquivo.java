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
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     * @param nomeArquivo, nome do arquivo que deve ser aberto.
     * @author Micael Popping
     */
    LeitorArquivo(String nomeArquivo){
        
        setNomeArquivo(nomeArquivo);
        
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
    
    /**
     * Altera o valor de bufferLeitura.
     * @param bufferLeitura, novo valor para bufferLeitura.
     * @author Micael Popping.
     */
    private void setBufferLeitura(BufferedReader bufferLeitura){
        
        this.bufferLeitura = bufferLeitura;
    }
    
    /**
     * Altera o valor de nomeArquivo.
     * @param nomeArquivo, novo valor para nomeArquivo.
     * @author Micael Popping.
     */
    private void setNomeArquivo(String nomeArquivo){
        
        int indice;
        
        indice = nomeArquivo.indexOf('.');
        
        this.nomeArquivo = nomeArquivo.substring(0, indice); 
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
    public String getNomeArquivo(){
        
        return nomeArquivo;
    }
        
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
}
