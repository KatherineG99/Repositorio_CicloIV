
package Ejemplos;

/**
 *
 * @author Alumno 34
 */
public class Empleado {
     private String nombre;
    private String division;

    public Empleado (String n, String d){
        nombre = n;
        division = d;
    }
    
    public String getName(){
        return nombre;
    }
    
    public void print(){
        System.out.println("Nombre: " + nombre + " Division: " + division);
    }
}
