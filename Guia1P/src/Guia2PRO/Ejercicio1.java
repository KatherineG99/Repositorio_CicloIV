
package Guia2PRO;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        String Nombre;
        int edad;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        Nombre=sc.next();
        System.out.println("Ingrese su edad");
        edad=sc.nextInt();
        
        System.out.println("\n Su nombre es: "+Nombre+"\n Su edad es: "+edad);
    
    
    }
    
    
}
