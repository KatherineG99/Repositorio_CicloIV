/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alumno 28
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String m0 = "";
        String m1 = "";

        
        System.out.println("programa de Vector tamaño N");
        System.out.println("Ingrese tamaño del Vetor ");
                
        int [][] matriz = new int[5][2];

        System.out.println("El tamaño del vector es " + matriz.length);
        System.out.println("Ingrese los datos para llenar la matriz");
        //for (int i = 0; i < matriz.length; i++) {
            //VectorN[i] = scan.nextInt();
        //} 
        //para llenar toda la matriz horizontalmente
        for (int i = 0; i < matriz.length; i++) {
            
            //para llenar la matriz verticalmente 
            for (int j = 0; j < matriz[0].length; j++) {
                    System.out.println("Ingresar datos en posición [" + i +"] ["+ j+"]");
                    
                    matriz[i][j] = scan.nextInt();
                }
        }
        
        //imprimiendo matriz 
        
        for (int i = 0; i < matriz.length; i++) {
            
            //para llenar la matriz verticalmente 
            for (int j = 0; j < matriz[i].length; j++) {
                
                
                System.out.println(Arrays.asList(matriz[i][j]));
            }
            System.out.println();        }
        System.out.println(m0);  
        System.out.println(m1);  
    }
    
}
