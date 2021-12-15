package ej2CalculadoraBasica;

public class Operaciones {
    
    public void Suma(double n1, double n2){
        
       double resultado = n1 + n2;
       
        System.out.println(" El resultado de la Suma es " + resultado);
    }
    
    public void Resta(double n1, double n2){
        
        double res = n1-n2;
        System.out.println("El Resultado de la resta es " + res);
    }
    
    public void Muliplicacion(double n1, double n2){
        
        double res  = n1*n2;
        System.out.println(" El Resultado de la multiplicacion es " + res);
    }
    
    public void Division(double n1, double n2){
        
        double res = n1/n2;
        System.out.println("El resultado de la division es " + res);
    }
}
