/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.usam.Principal;

import java.util.Iterator;
import java.util.Queue;
import sv.edu.usam.Operaciones.Operaciones;

/**
 *
 * @author Dell
 */
public class Colareload {
    
    public static void main(String[] args) {
        Operaciones objoper= new Operaciones();
        String []nombre= new String[2];
        
        objoper.Insertaradd(3);
        objoper.Insertaroffer(6);
        objoper.Cola.add(3);
        objoper.Cola.offer(8);
        objoper.Cola1.offer("Juan");
        objoper.Insertaradd(26);
        objoper.test();
        int suma=0;
        int resta= 0;
        
        for (int i = 0; i < objoper.Cola.size(); i++) {
            Queue nuevacola = objoper.Cola;
            resta = (int)nuevacola.peek() -resta;
            nuevacola.poll();
        }
        
        for(Iterator it = objoper.Cola.iterator(); it.hasNext();){
            suma=(int )it.next()+suma;
        }
        
        System.out.println("Cola llena: "+ objoper.Cola+"Edad"+objoper.Cola1);
        
       System.out.println("Inicio Cola ---->"+objoper.Cola);
        objoper.Quitarpoll();
        System.out.println("El dato a eliminar es : "+objoper.Cola.peek());
        objoper.QuitarRemove();
        objoper.Cola.poll();
        objoper.Cola.remove();
        System.out.println("Inicio Cola ---->"+objoper.Cola);
    }
}
