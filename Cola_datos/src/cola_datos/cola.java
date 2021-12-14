/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola_datos;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Dell
 */
public class cola {

    public Queue cola = new LinkedList();
            
    public void insertar(String X) {
        cola.add(X);

    }
    
    public void sacar(){
        cola.poll();
    }
    
    public void mostrar(){
        System.out.println("Los datos de la cola son : "+cola);
        
    }

    public static void main(String[] args) {
        cola cm = new cola();
        
        cm.insertar("katherine");
        cm.insertar("ariel");
        cm.mostrar();
    }
}
