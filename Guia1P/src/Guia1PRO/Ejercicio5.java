
package Guia1PRO;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double Vcompra,Iva;
        Scanner scan=new Scanner (System.in);
        
        System.out.println("Bienvenido Usuario");
        System.out.println("Ingrese el valor de su compra");
        Vcompra=scan.nextInt();
        
        if (Vcompra>=10000) {
            Iva=Vcompra*0.13;
            Vcompra=Vcompra-(Vcompra*0.25);
            System.out.println("El IVA de su compra es de: "+Iva);
            System.out.println("Aplica a descuento de 25%, ahora su total a pagar es de: "+Vcompra);
            
        }else{
            Iva=Vcompra*0.13;
             Vcompra=Vcompra-Iva;
            System.out.println("El IVA de su compra es de: "+Iva);
            System.out.println("no se le aplicara impuesto, Su total a pagar es de: "+Vcompra);
        }
        
        
    }
    
}
