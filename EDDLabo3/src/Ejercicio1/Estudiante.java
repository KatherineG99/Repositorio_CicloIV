
package Ejercicio1;
import java.util.Scanner;

public class Estudiante {
    String nombreA,apellido;
    int edad,numcar;
    String[] materias = new String[5];
    Scanner sc= new Scanner(System.in);
    
    
    public void DatosPersonales(){
        System.out.println("    Bienvenido Usuario Porfavor Ingrese sus Datos Personales    ");
        System.out.println("Ingrese su Nombre");
        nombreA=sc.next();
        System.out.println("Ingrese su Apellido");
        apellido=sc.next();
        System.out.println("Ingrese su Edad");
        edad=sc.nextInt();
        System.out.println("Ingrese su carnet");
        numcar=sc.nextInt();
    }
    
    public void Materias(){
        
        System.out.println("\n\n Porfavor "+nombreA+" Ingrese el nombre de sus materias a cursar");
         
        for (int i = 0; i < materias.length; i++) {
            
            System.out.println("Ingrese su Materia Nº " + i);
            materias[i] = sc.next();   
        }
    }
    
    public void Mostrar(){
        System.out.println("Estudiante con nombre "+nombreA);
        System.out.println("Con apellido "+apellido);
        System.out.println("Con carnet "+numcar+" y edad de "+edad);
        System.out.println("    Se encuantra cursando las materias de   ");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Su materia Nº "+i+ " es "+materias[i]);
            
        }
        
    }
    
}
