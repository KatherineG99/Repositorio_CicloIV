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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int sumaVector = 0;
        int contador = 0;
        String V1 = "";
        String V2 = "";
        String VR = "";
        
        System.out.println("programa de suma de vectores de 4 elementos");
        
        int [] elementos1 = new int[4];
        int [] elementos2 = new int[4];
        int [] resultado = new int[4];
        
        System.out.println("Ingrese datos Vector 1");
        for (int i = 0; i < elementos1.length; i++) {
            System.out.println("Ingrese numero posición " + i);
            elementos1[i] = scan.nextInt();
        } 
        
        for (int i = 0; i < elementos1.length; i++) {
            int f = elementos1[i];
            V1 = V1 + " " + f;
            
        }
        
        System.out.println("Ingrese datos Vector 2");
        for (int i = 0; i < elementos2.length; i++) {
            System.out.println("Ingrese numero posición " + i);
            elementos2[i] = scan.nextInt();
        }
        
        for (int i = 0; i < elementos2.length; i++) {
            int f = elementos2[i];
            V2 = V2 + " " + f;
            
        }

        for (int i = 0; i < 4; i++) {
            int dato1 = 0;
            int dato2 = 0;
            
            dato1 = elementos1[i];
            dato2 = elementos2[i];
            
            resultado[i] = (dato1 + dato2);
        }
        
        for (int i = 0; i < resultado.length; i++) {
            int f = resultado[i];
            VR = VR + " " + f;
            
        }
        
        System.out.println(V1);
        System.out.println(V2);
        System.out.println(VR);
                
        
    }
    
}
