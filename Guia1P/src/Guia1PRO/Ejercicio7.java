//PAQUETE DE CLASES
package Guia1PRO;
/*importamos el paquete java util para acceder a la clase Scanner
mediante esta clase podremos ingresar datos desde teclado ya sean primitivos como int, double,etc
y tambien datos tipos string*/
import java.util.Scanner;

public class Ejercicio7 {
    //clase principal
    
    
    public static void main(String[] args) {
        //metodo main que es la que permite ejecutar el codigo del programa o aplicacion
         String Nombre,Pais;
        int edad;
        /*declaracion de varibales dos de tipo cadena(String) y una de tipo entero(int)*/
        Scanner sc=new Scanner(System.in);
        /*
        instanciamos la clase Scanner para poder leer o ingresar deatos desde teclado
        y creamos un objeto de tipo Scanner
        */
        
        System.out.println("*****************    Bienvenido Usuario    ****************");
        System.out.println("Ingrese su nombre");
        //mandamos a imprimir a consola la linea de texto que esta entre comillas("")
        Nombre=sc.next();
        /*
        pedimos el ingreso de datos mediantes el objeto sc de tipo Scanner y le indicamos 
        de que tipo debe ser la entrada en este caso es de tipo sring y asi llenamos la varible
        */
        System.out.println("Ingrese su edad");
        //mandamos a imprimir a consola la linea de texto que esta entre comillas("")
        edad=sc.nextInt();
        /*
        pedimos el ingreso de datos mediantes el objeto sc de tipo Scanner y le indicamos 
        de que tipo debe ser la entrada en este caso es de tipo int y asi llenamos la varible
        */
        System.out.println("Ingrese su Pais de residencia");
        //mandamos a imprimir a consola la linea de texto que esta entre comillas("")
        Pais=sc.next();
        /*
        pedimos el ingreso de datos mediantes el objeto sc de tipo Scanner y le indicamos 
        de que tipo debe ser la entrada en este caso es de tipo sring y asi llenamos la varible de tipo string
        */
        System.out.println("*****************    La informacion Ingresada es la siguiente    ****************\n");
        //mandamos a imprimir a consola la linea de texto que esta entre comillas("")
        System.out.println("Su nombre es: "+Nombre+ "\n Su edad es : "+edad + "\n su pais de origen es: "+Pais);
        /*
        mandamos a imprimir a consola lo que esta entre comillas y concatenamos la variable que llenamos con anterioridad
        para mostrar el dato que se ingreso
        */
       
    }
    
    
}
