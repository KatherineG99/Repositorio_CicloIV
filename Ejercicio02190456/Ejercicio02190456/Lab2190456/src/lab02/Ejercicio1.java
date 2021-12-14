/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Scanner;

/**
 *
 * @author Alumno 28
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int sumaVector = 0;
        int contador = 0;
        
        System.out.println("programa de vector de 8 elementos");
        
        int [] elementos = new int[8];
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese numero posición " + i);
            
            int numIngresa = 0;
            numIngresa = scan.nextInt();
            elementos[i] = numIngresa;
            
            sumaVector = sumaVector + numIngresa;
            
        }    
            
            for (int j = 0; j < elementos.length; j++) {
                int elemento = elementos[j];

                if (elemento == 50 || elemento > 50 ){
                    contador = contador + 1;
                    
                }
                
            }
            System.out.println("El total de los elementos en el arreglo es " + sumaVector);
            System.out.println("Total de elementos mayores o iguales  a 50 " + contador);   
    }
    
}
