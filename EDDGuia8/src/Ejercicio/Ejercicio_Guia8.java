
package Ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Ejercicio_Guia8 {
    public ArrayList<Integer> lectorValores(){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int esca = -999999999;
        try{
            do{
                if(esca==-999999999){
                    System.out.println("Introduzca un numero");
                    esca=scan.nextInt();
                }else{
                    lista.add(esca);
                    System.out.println("Introduzca un numero");
                    esca=scan.nextInt();
                }
            }while(esca!=-99);
            
            if(esca==-99){
                return lista;
            }else{
                
            }
        }catch(Exception e ){
            System.out.println("Error"+e);
        }
        return lista;
    }
    
    public int Calculo(ArrayList<Integer>lista){
       Iterator<Integer> iter = lista.iterator();
        int suma = 0;
        while (iter.hasNext()) {
            suma = suma + iter.next();
        }
        return suma;
    }
    
    public void mostrarResultados(ArrayList<Integer> li, int suma, int media) {

        System.out.println(" El Resultado de la suma es  " + suma);
        System.out.println(" El Resultado de la media aritmetica es  " + media);
        System.out.println(" Numeros matores que la media ::: ");
        for (int i = 0; i < li.size(); i++) {
            int n = li.get(i);
            if (n > media) {
                System.out.println(n);
            }
        }
    }
    
    public static void main(String[] args) {
        Ejercicio_Guia8 leer =new Ejercicio_Guia8();
        ArrayList<Integer> datos = new ArrayList<Integer>();
        
        datos=leer.lectorValores();
        int suma = leer.Calculo(datos);
        int media = suma/datos.size();
        
        leer.mostrarResultados(datos, suma, media);
        
    }
}
