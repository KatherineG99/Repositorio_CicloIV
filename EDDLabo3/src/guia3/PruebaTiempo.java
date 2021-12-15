
package guia3;
import javax.swing.JOptionPane;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo1 tiempo=new Tiempo1();
        String salida="La hora universal inicial es: "
        + tiempo.aStringUniversal()+"\n La hora estándar inicial es: "
                +tiempo.aStringEstandar();
        
        tiempo.establecerHora(13, 27, 6);
        salida +="\n\n La hora universal despues de establecerHora es : "
                + tiempo.aStringUniversal()
                +"\n L ahora estandar despues de establecerHora es : "
                + tiempo.aStringEstandar();
        
        tiempo.establecerHora(99, 99, 99);
        salida+="\n\n Despues de intentar ajustes validos: "+"\n Hora universal: "
                + tiempo.aStringUniversal()+"\n Hora estandar: "+tiempo.aStringEstandar();
        
        JOptionPane.showMessageDialog(null,salida,"Prueba de la clase Tiempo1",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
    
}
