
package Ejercicio2Ca;


public class CalculadoraAvanzada {
    
    
    public void Potencia(double n1, double n2){
        double resultado = 1;
        for (int i = 1; i <= n2; i++) {
            resultado = resultado*n1;
        }
        System.out.println("El resultado de potenciar el numero "+n1+" con el "+n2 +" es "+ resultado);
    }
    
    public void opuesto(double n1,double n2){
        n1=-n1;
        n2=-n2;
         System.out.println("El valor opuesto del primer numero es "+n1);
         System.out.println("El valor opuesto del segundo numero es "+n2);
    }
    
    public void factorial(double n1 ,double n2){
        double resultado=1;
        for (int i = 2; i <= n1; i++) {
             resultado= resultado*i;
        }
        System.out.println("el factorial del primer numero es "+resultado);
        double resultado2=1;
        for (int i = 2; i <= n1; i++) {
             resultado2= resultado2*i;
        }
        System.out.println("el factorial del primer numero es "+resultado);
   
    }
    
}
