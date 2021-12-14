
package dao;
import modelo.Radio;

public class RadioDao {
   
    public void consultarRadio(Radio radio){
        
        System.out.println("el id es: "+radio.getId());
        System.out.println("la estacion es: "+ radio.getEstacion());
        System.out.println("el nombre es: "+radio.getNombrerad());
    }
    
}
