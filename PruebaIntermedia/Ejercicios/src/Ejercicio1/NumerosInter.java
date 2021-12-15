
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NumerosInter {
    
    
    public void introvalores(ArrayList<Integer>lista){
       
        Scanner scan= new Scanner(System.in);
        Integer numeros;
        do{
             System.out.println("Introduce el numero que desee "+"\n presiona 0 para salir");
            numeros=scan.nextInt();
            lista.add(numeros); 
            System.out.println("");
        }while(numeros>0);
        
        for(int i=0;i<lista.size();i++){
            if(lista.get(i)==0){
                lista.remove(i);
            }
        }
    }
    
    public void mostrar(ArrayList<Integer>Lista){
        System.out.println("La lista contiene los siguientes numeros");
        System.out.println(Lista);
    }
    
    public void intercambio(ArrayList<Integer>lista){
        Integer posicion;
        
        posicion=lista.get(1);
        lista.set(1, lista.get(3));
        lista.set(3, posicion);
    }
}
