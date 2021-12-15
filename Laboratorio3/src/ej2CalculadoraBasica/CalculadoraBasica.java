package ej2CalculadoraBasica;

import java.util.Scanner;

public class CalculadoraBasica {
    Operaciones op = new Operaciones();
    
    
    public void Todas (double n1, double n2){
        
        op.Suma(n1, n2);
        op.Resta(n1, n2);
        op.Muliplicacion(n1, n2);
        op.Division(n1, n2);
    }
    
    
    public static void main(String[] args) {
        double n1 = 0;
        double n2 = 0;
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Operaciones o = new Operaciones();
        
        System.out.println("Bienvenido a Calculadora Basica ");
        System.out.println(" Ingrese los dos numeros a evaluar");
        System.out.println("Numero 1");
        n1 = sc.nextDouble();
        System.out.println("Numero 2");
        n2 = sc.nextDouble();
        
        System.out.println("Que operación desea realizar ???");
        System.out.println("Suma = 1");
        System.out.println("Resta = 2");
        System.out.println("Multiplicación = 3");
        System.out.println("Division = 4");
        System.out.println("Todas = 5");
        opcion = sc.nextInt();
        
        switch(opcion){
            case (1):
                o.Suma(n1, n2);
                break;
            case (2):
                o.Resta(n1, n2);
                break;
            case (3):
                o.Muliplicacion(n1, n2);
                break;
            case (4):
                o.Division(n1, n2);
                break;
            case (5):
                CalculadoraBasica c = new CalculadoraBasica();
                c.Todas(n1, n2);
                
                break;
            default:
                break;
        }
        
    }    
}
