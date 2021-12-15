
package sv.edu.usam.Principal;

import sv.edu.usam.Operaciones.ListCircular;


public class ListacirPrincipal {
    public static void main(String[] args) {
        ListCircular oblstCir = new ListCircular();
        
       
        oblstCir.insertarInicio(3);
       
        //oblstCir.insertarInicio(5);
        //oblstCir.insertarInicio(7);
        //oblstCir.insertarFinal(6);
        oblstCir.imprimir();
    }
    
}
