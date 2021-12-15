
package Ejercicio2Cb;


public class CalculadoraBasica {
    double resultado;
    public void Suma(double n1, double n2){
        
       resultado = n1 + n2;
       
        System.out.println(" El resultado de la Suma es " + resultado);
    }
    
    public void Resta(double n1, double n2){
        
        resultado = n1-n2;
        System.out.println("El Resultado de la resta es " + resultado);
    }
    
    public void Muliplicacion(double n1, double n2){
        
        resultado  = n1*n2;
        System.out.println(" El Resultado de la multiplicacion es " + resultado);
    }
    
    public void Division(double n1, double n2){
        
        resultado = n1/n2;
        System.out.println("El resultado de la division es " + resultado);
    }
}
