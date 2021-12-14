
package Guia2PRO;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Bienvenido al programa que hace las 4 operaciones aritmeticas");
        System.out.println("Ingresa dos numero");
        n1=sc.nextInt();
        n2=sc.nextInt();
        
        System.out.println("**********    suma    **********");
        System.out.println("La suma de los dos numero es: "+(n1+n2)+"\n");
        System.out.println("**********    resta    **********");
        System.out.println("La resta de los dos numeros es: "+(n1-n2)+"\n");
        System.out.println("**********    multiplicacion   **********");
        System.out.println("La multiplicacion de los dos numeros es: "+(n1*n2)+"\n");
        System.out.println("**********    division    **********");
        System.out.println("La division de los dos numeros es: "+(n1/n2)+"\n");
    
    }
    
    
    
}
