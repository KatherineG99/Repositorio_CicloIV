 
package grafostopologicos;

import java.util.Scanner;

/**
 *
 * @author Alumno 06
 */
public class GrafosTopologicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grafo g = new  Grafo(7);
        Scanner scn = new Scanner (System.in);
               
        g.agregarArista(1, 2);
        g.agregarArista(1, 3);
        g.agregarArista(1, 5);
        g.agregarArista(1, 4);
        g.agregarArista(4, 5);
        g.agregarArista(5, 3);
        g.agregarArista(3, 2);
        //g.agregarArista(9, 4);
        
        System.out.println("El orden topologico es :");
        g.ordenamientoTopologico();
        System.out.println("");
        /*int f=scn.nextByte();
        g.recorridoAnchura(f);/*/
    }
    
}
