
package controlador;
import modelo.*;


public class RadioController {
    public static void main(String[] args) {
        Radio radiopeque = new Radio();
        
        radiopeque.setVolumen(10);
        radiopeque.setestacion(100.1);        
        radiopeque.cambiarEstacion();
        
        radiopeque.subirVolumen();
        
        radiopeque.setVolumen(7);
        radiopeque.bajarVolumen();
        radiopeque.setestacion(92.5);
        radiopeque.cambiarEstacion();
        
        radiopeque.setVolumen(2);
        radiopeque.bajarVolumen();
        
        radiopeque.setVolumen(1);
        radiopeque.bajarVolumen();
        
        radiopeque.setVolumen(0);
        
        Tabla tabla=new Tabla();
        tabla.calcularTabla(2);
        
        

    }
    
}
