
package Guia2PRO;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("sistema dados tres numeros mostrar el mayor y el menor");
        System.out.println("Ingrese tres numeros");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        
        if (n1>n2 && n1>n3) {
            
            System.out.println("el primero numero es mayor con : "+n1);
      
        }else if(n2>n3 && n2>n1){
            System.out.println("el segundo numero es mayor con : "+n2);
            
        }else{
            System.out.println("el tercero numero es mayor con : "+n3);
        }
        
        if (n1<n2 && n1<n3) {
            
            System.out.println("el primero numero es menor con : "+n1);
      
        }else if(n2<n3 && n2<n1){
            System.out.println("el segundo numero es menor con : "+n2);
            
        }else{
            System.out.println("el tercero numero es menor con : "+n3);
        }
    }
    
}
