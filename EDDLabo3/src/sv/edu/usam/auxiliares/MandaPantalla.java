
package sv.edu.usam.auxiliares;
import sv.edu.usam.escritura.Pantalla;

public class MandaPantalla {
    public static void main(String[] args) {
        Pantalla primera=new Pantalla();
        primera.conSalto("Esto es un renglon CON salto de linea");
        primera.conSalto("Esta linea tambien tiene salto");
        primera.sinSalto("Linea Continua");
        primera.sinSalto("Linea Continua");
        primera.conSalto("Esta linea si tiene salto");
        primera.sinSalto("Termina sin slato");
        System.out.println(" Se termina el uso de funciones ");
    }
}
