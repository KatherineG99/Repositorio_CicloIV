
package Ejemplos;

import java.util.Iterator;


public class Principal {
     public static void main(String[] args) {
        Division d = new Division("Mi Sucursal");
        d.add("Empleado 1");
        d.add("Empleado 2");
        
        
        Iterator<Empleado> iter = d.Iterator();
        while(iter.hasNext()){
            Empleado e = iter.next();
            e.print();
        }
    }
}
