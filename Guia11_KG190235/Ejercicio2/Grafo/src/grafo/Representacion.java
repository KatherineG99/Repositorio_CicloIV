
package grafo;

import Operacion.Grafo;
import Operacion.Nodo;
import Operacion.Vertice;


public class Representacion {
    
    public static Grafo getDepartamentos(){
       Nodo sivar = new Nodo("SNS");
       Nodo lapaz = new Nodo("LAP");
       Nodo sanVicente = new Nodo("SNV");
       Nodo usulutan = new Nodo("USU");
       Nodo morazan = new Nodo("MOR");
       Nodo sanMiguel = new Nodo("SNM");
       
       sivar.agregarVertice(new Vertice(sivar,lapaz,100));
       sivar.agregarVertice(new Vertice(sivar,sanVicente,200));
       lapaz.agregarVertice(new Vertice(lapaz,usulutan,25));
       sanVicente.agregarVertice(new Vertice(sanVicente,usulutan,50));
       usulutan.agregarVertice(new Vertice(usulutan,morazan,25));
       usulutan.agregarVertice(new Vertice(usulutan,sanMiguel,30));
       morazan.agregarVertice(new Vertice(morazan,sanMiguel,25));
       
       Grafo grafo = new Grafo();
       grafo.agregarNodo(sivar);
       grafo.agregarNodo(lapaz);
       grafo.agregarNodo(sanVicente);
       grafo.agregarNodo(usulutan);
       grafo.agregarNodo(morazan);
       
       return grafo;
       
    }
    
    /*public static void imprimir(){
        
    }*/
    
      public static void main(String[] args) {
        Grafo grafo = getDepartamentos();
        System.out.println(grafo);
    }
}
