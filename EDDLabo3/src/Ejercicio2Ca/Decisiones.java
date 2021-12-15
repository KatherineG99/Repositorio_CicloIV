
package Ejercicio2Ca;
import Ejercicio2Cb.CalculadoraBasica;
import java.util.Scanner;

public class Decisiones {
    public void decision(){
        double n1;
        double n2;
        int opcion = 0, decision=0;
        Scanner sc = new Scanner(System.in);
        CalculadoraBasica cb=new CalculadoraBasica();
        CalculadoraAvanzada ca=new CalculadoraAvanzada();
        
        System.out.println("Bienvenido a que calculadora desea ingresar?");
        System.out.println("Calculadora Basica = 1");
        System.out.println("Calculadora Avanzada = 2");
        decision = sc.nextInt();
        
        switch(decision){
            case(1):
                
                System.out.println("Bienvenido a Calculadora Basica ");
                System.out.println(" Ingrese los dos numeros a evaluar");
                System.out.println("Numero 1");
                n1 = sc.nextDouble();
                System.out.println("Numero 2");
                n2 = sc.nextDouble();
        
                System.out.println("Que operación desea realizar ?");
                System.out.println("Suma = 1");
                System.out.println("Resta = 2");
                System.out.println("Multiplicación = 3");
                System.out.println("Division = 4");
                opcion = sc.nextInt();
        
                switch(opcion){
                    case (1):
                        cb.Suma(n1, n2);
                    break;
                    case (2):
                        cb.Resta(n1, n2);
                    break;
                    case (3):
                        cb.Muliplicacion(n1, n2);
                    break;
                    case (4):
                        cb.Division(n1, n2);
                    break;
           
                    default:
                    break;
                }
            break;
            case  (2):
                System.out.println("Bienvenido a Calculadora Avanzada ");
                System.out.println(" Ingrese los dos numeros a evaluar");
                System.out.println("Numero 1");
                n1 = sc.nextDouble();
                System.out.println("Numero 2");
                n2 = sc.nextDouble();
        
                System.out.println("Que operación desea realizar ?");
                System.out.println("Potenciar = 1");
                System.out.println("Numero Opuesto = 2");
                System.out.println("Factorial = 3");
                opcion = sc.nextInt();
        
                switch(opcion){
                    case (1):
                        ca.opuesto(n1, n2);
                    break;
                    case (2):
                        ca.opuesto(n1, n2);
                    break;
                    case (3):
                        ca.factorial(n1, n2);
                    break;
                    
           
                    default:
                    break;
                }
                
            break;
                
        }
    }
}
