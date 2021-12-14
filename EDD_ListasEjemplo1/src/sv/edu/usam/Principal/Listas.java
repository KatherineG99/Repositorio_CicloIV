
package sv.edu.usam.Principal;

import sv.edu.usam.Operaciones.ListaGenerica;

/**
 *
 * @author Katherine Gomez
 */
public class Listas {
    public static void main(String[] args) {
        ListaGenerica lg = new ListaGenerica();
        
        lg.insertar(1,10);
        lg.insertar(2, 20);
        lg.insertar(3, 30);
        lg.insertar(2, 15);
        lg.insertar(5, 115);
        lg.imprimir();
        System.out.println("Luego de Borrar el primero");
        lg.borrar(1);
        lg.imprimir();
        System.out.println("Luego de Extraer el segundo");
        lg.extraer(2);
        lg.imprimir();
        System.out.println("Luego de intercambiar el primero con el tercero");
        lg.intercambiar(1, 3);
        lg.imprimir();
        if (lg.existe(20)) {
            System.out.println("Se encuentra el 20 en la lista ");
            
        }else{
            System.out.println("No se encuentra el 20 en la lista");
        }
        System.out.println("La posicion mayor es: "+lg.posMayor());
        
        if (lg.ordenada()) {
            System.out.println("La lista esta ordenada de menor a mayor");
        }else{
            System.out.println("La lista no esta ordenada de menor a mayor");
        }
        
        
    }
    
}
