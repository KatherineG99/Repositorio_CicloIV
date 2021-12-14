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
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int tamanio = 0;
        int suma = 0;
        String V1 = "";
        String V2 = "";
        String VR = "";
        
        System.out.println("programa de Vector tamaño N");
        
        
        System.out.println("Ingrese tamaño del Vetor ");
        
        tamanio = scan.nextInt();
        
        int [] VectorN = new int[tamanio];

        System.out.println("El tamaño del vector es " + VectorN.length);
        System.out.println("Ingrese los datos para llenar el vector");
        for (int i = 0; i < VectorN.length; i++) {
            VectorN[i] = scan.nextInt();
        } 
        
        for (int i = 0; i < VectorN.length; i++) {
         
         suma = suma + VectorN[i];
           
        }
        
        System.out.println("La suma de los elementos del vector es " + suma );
    }
}
