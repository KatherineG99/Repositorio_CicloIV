
package Operacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Grafo {
    private List<Nodo> nodos;
    
     public void agregarNodo(Nodo nodo){
         if (nodos == null) {
             nodos = new ArrayList<>();
         }
         nodos.add(nodo);
    }

    public List<Nodo> getNodos() {
        return nodos;
    }

   /* public void setNodos(List<Nodo> nodos) {
        this.nodos = nodos;
    }*/
    
    public String toString(){
        return "Grafo [nodos = "+nodos+"]";
    }
    
   
}
