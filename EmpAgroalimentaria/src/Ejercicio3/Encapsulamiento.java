
package Ejercicio3;

/**
 *
 * @author Katherine Gomez
 */
public class Encapsulamiento {
    private int id;
    String nombre;
    protected int numtelefono;
    static String empresa="lmplt.com";

    public void Descripcion(int id, String nombre, int numtelefono) {
        System.out.println(this.id = id);
        System.out.println(this.nombre = nombre);
        System.out.println( this.numtelefono = numtelefono);
        System.out.println(empresa);
        
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumtelefono() {
        return numtelefono;
    }

    public void setNumtelefono(int numtelefono) {
        this.numtelefono = numtelefono;
    }
    
    
    
    
}

