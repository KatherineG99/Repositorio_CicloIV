
package Guia1PRO;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int horas;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Digite el numero de horas en nuestro estacionamiento");
        horas=scan.nextInt();
        
        if (horas==1) {
            System.out.println("El total a pagar por su estadia es de: $150");
        }else{
            System.out.println("El total a pagar por su estadia es de: "+((horas*100)+150));
            
        }
    }
}
