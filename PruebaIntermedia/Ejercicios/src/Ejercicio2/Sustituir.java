
package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Sustituir {
    
    public static void Numeros(ArrayList<Integer>lista){
        Integer numero;
        Scanner scn = new Scanner(System.in);
        boolean respuesta;
        String res;
        
        boolean contador=true;
        
        do{
            if(contador==true){
                System.out.println("Introduce un numero mayor a 0");
                numero=scn.nextInt();
                if(numero<=0){
                    System.out.println("La lista solo acepta numeros mayores a 0");
                }else{
                    lista.add(numero);
                    contador=false;
                }
            }else{
             System.out.println("Introduce otro numero mayor a 0");
                numero=scn.nextInt();
                if(numero<=0){
                    System.out.println("La lista solo acepta numeros mayores a 0");
                }else{
                    lista.add(numero);
                    contador=false;
                }
            }
            System.out.println("Digita S si deseas salir \n digita n si desea continuar");
            res=scn.next();
            if(res.equals("S")){
            respuesta=true;
        }else{
                respuesta=false;
            }
            
                
        }while(respuesta==false);
        
        
        
    }
    
    public void mostrar(ArrayList<Integer>lista){
        System.out.println("La lista de numeros es:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
    }
    
    public void relleno(ArrayList<Integer>lista){
            ArrayList lista2= (ArrayList)lista.clone();
            for (int i = 0; i < lista.size(); i++) {
                for (int j = 0; j < lista2.size(); j++) {
                    if((i!=j)&&(lista.get(i)==lista2.get(j))){
                        
                        lista.set(j, 0);
                    }
                }
            }
    }
    
    
}

