
        
package recursivo;
import java.io.File;
/**
 *
 * @author Dell
 */
public class recursivos {
    
    public void cargar(String inicio, String altura){
        File reg= new File(inicio);
        String[] directorio=reg.list();
        for (int i = 0; i < directorio.length; i++) {
            File reg2 = new File(inicio+directorio[i]);
            if (reg2.isFile()) {
                System.out.println(altura+directorio[i]);
            }
            if (reg2.isDirectory()) {
                System.out.println(altura+"Directorio: "+ directorio[i].toUpperCase());
                cargar(inicio+directorio[i]+"\\",altura+" ");
            }
        }
    }
}
