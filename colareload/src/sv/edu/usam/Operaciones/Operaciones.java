
package sv.edu.usam.Operaciones;

import java.util.Queue;
import java.util.LinkedList;

/*
Insertar
    add()
    offer()

Extraer
    remove()
    poll()

Consultar
    element()
    pick()

*/

public class Operaciones {
   public Queue Cola  = new LinkedList();
   public Queue Cola1  = new LinkedList();
    
    public void Insertaradd(int X){
        Cola.add(X);
    }
    public void Insertaroffer(int X){
        Cola.offer(X);
    }
    
    public void Quitarpoll(){
        Cola.poll();
    }
    public void QuitarRemove(){
        Cola.remove();
    }
    
    public void test(){
        Cola.addAll(Cola1);
        System.out.println(Cola.peek());
        
    }
}
