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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int promedioA = 0;
        int promedioB = 0;
        String V1 = "";
        String V2 = "";
        String VR = "";
        
        System.out.println("programa de Promedios de alumnos");
        
        int [] notasA = new int[5];
        int [] notasB = new int[5];
        int [] resultado = new int[4];
        
        System.out.println("Ingrese notas de Alumnos seccion A");
        for (int i = 0; i < notasA.length; i++) {
            int n = 0;
            System.out.println("Ingrese nota" + i);
            n = scan.nextInt();
            notasA[i] = n;
            promedioA = promedioA + n;
        } 
        
        System.out.println("Ingrese notas de Alumnos seccion B");
        for (int i = 0; i < notasB.length; i++) {
            int n = 0;
            System.out.println("Ingrese nota" + i);
            n = scan.nextInt();
            notasB[i] = n;
            promedioB = promedioB + n;
        } 
        
        promedioA = promedioA/5;        
        promedioB = promedioB/5;
        
        if (promedioA > promedioB) {
            System.out.println("Clase A con mayor promedio de " + promedioA);
        }else{
            
            System.out.println("Clase B con mayor promedio de " + promedioB);
        }
        
    }
     
}
