/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafostopologicos;

import java.util.*;

/**
 *
 * @author Alumno 06
 */
public class Grafo {

    private int v;
    private LinkedList<Integer> adj[];

    public Grafo(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void agregarArista(int v, int w) {
        adj[v].add(w);
    }

    public void ordenamientoTopologico() {
        Stack pila = new Stack();
        boolean visita[] = new boolean[v];
        int sum;
        for (int i = 0; i < v; i++) {
            visita[i] = false;
        }
        for (int i = 0; i < v; i++) {
            if (visita[i] == false) {
                ordenTopologico(i, visita, pila);
            }
        }
        while (pila.empty() == false) {
            
            System.out.print(pila.pop() + " ");
            
        }
    }

    public void ordenTopologico(int v, boolean visita[], Stack pila) {
        visita[v] = true;
        Integer i;
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visita[i]) {
                ordenTopologico(i, visita, pila);
            }
        }
        pila.push(new Integer(v));
    }
    
   
     /*public ArrayList<Integer> recorridoAnchura(int v){
         ArrayList<Integer> recorrido = new ArrayList<>();
          boolean visita[] = new boolean[v];
         //visita[v] = true;
         ArrayList<Integer> cola = new ArrayList<>();
         recorrido.add(v);
         cola.add(v);
         while(!cola.isEmpty()){

             int m = cola.remove(v);
             for (int i = 0; i < adj.length; i++) {
                 if(adj[m].get(i)==1&!visita[i]){
                     cola.add(i);
                     recorrido.add(i);
                     visita[i]=true;
                 }
             }
         }
         
         
        return recorrido;
    }
     
    public ArrayList<Integer> recorridoProfundidad(int v){
         ArrayList<Integer> recorrido = new ArrayList<Integer>();
         boolean visita[] = null;
         visita[v] = true;
         
         return new ArrayList<Integer>();
         
     }*/
     
    /* public void recorrido(int v){
         
     }
     */
     
}
