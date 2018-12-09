package gerenciador_arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Micael Popping
 */
public class EscritorArquivo {

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    private BufferedWriter bufferEscrita;
    private String nomeArquivo;
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * CONSTRUTOR.
     * @param nomeArquivo, nome do arquivo.
     * @author Micael Popping.
     */
    public EscritorArquivo(String nomeArquivo){
        
        setNomeArquivo(nomeArquivo);
               
        try {
            
            setBufferEscrita(new BufferedWriter(new FileWriter(getNomeArquivo())));
        } catch (IOException e) {
            
            System.err.printf("Erro, não foi possivel abrir o arquivo de escrita: %s!\n", e);
        }
        
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Fecha o escritor de arquivo.
     * @return null.
     * @author Micael Popping.
     */
    public EscritorArquivo close(){
        
        try{
            
            getBufferEscrita().close();
        }catch(IOException e){
            
            System.err.printf("Erro, não foi possivel fechar o aquivo: %s\n", e.getMessage());
        }
        
        return null;
    }
    
    /**
     * Escrece uma linha no arquivo.
     * @param linha, linha que deve ser escrita.
     * @author Micael Popping.
     */
    public void escreverLinha(String linha){
        
        try {
            
            getBufferEscrita().append(linha + "\n");
        } catch (IOException e) {
            
            System.err.printf("Erro, não foi possivel escrever a linha no arquivo: %s!", e);
        }
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Modifica a extensão do arquivo de .txt para .hacks.
     * @param nomeArquivo, nome de arquivo que deve ser modificado.
     * @return nome do arquivo modificado.
     * @author Micael Popping.
     */
    private String modificarExtensao(String nomeArquivo){ //REFAZE. ESTA ERRADO.
        
        int i;
        String auxiliar = "";
        
        i = nomeArquivo.indexOf(".txt");
        
        nomeArquivo = nomeArquivo.substring(0, i);
        nomeArquivo += ".hacks";
        
        return nomeArquivo;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    /**
     * Altera o valor de bufferEscrita.
     * @param bufferEscrita, novo valor para bufferEscrita.
     * @author Micael Popping.
     */
    private void setBufferEscrita(BufferedWriter bufferEscrita){
        
        this.bufferEscrita = bufferEscrita;
    }
    
    /**
     * Altera o valor de nomeArquivo e ajustando a extensao do mesmo.
     * @param nomeArquivo, novo valor para nomeArquivo.
     * @auhtor Micael Popping.
     */
    private void setNomeArquivo(String nomeArquivo){
        
        this.nomeArquivo = modificarExtensao(nomeArquivo);
    }
    
     /**
     * Retorna o valor de bufferEscrita.
     * @return o valor de bufferEscrita.
     * @auhtor Micael Popping.
     */
    private BufferedWriter getBufferEscrita(){
        
        return bufferEscrita;
    }
    
    /**
     * Retorna o valor de nomeArquivo.
     * @return o valor de nomeArquivo.
     * @auhtor Micael Popping.
     */
    public String getNomeArquivo(){
        
        return nomeArquivo;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
}
