
package Guia1PRO;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        int n1,n2,n3,resultado;
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Bienvenido al programa que suma dos numeros y su resultado con el tercero");
        System.out.println("Ingrese 3 numeros");
        n1=scan.nextInt();
        n2=scan.nextInt();
        n3=scan.nextInt();
        resultado=n1+n2;
        System.out.println("La suma de los primeros dos numeros es: "+resultado);
        resultado=resultado+n3;
        System.out.println("La suma del resultado + el tercer numero es: "+resultado);
    }
    
}
