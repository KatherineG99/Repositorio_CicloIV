
package eddlabo3;
import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    String apellido;
    private String edad;
    
    public Persona(){
        nombre="Katherine";
        apellido="Gomez";
        edad="21";
    }
    
    public Persona(String nombre,String apellido,String edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    
    public void ingresoDatos(){
        nombre=JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido=JOptionPane.showInputDialog("Ingrese el Apellido");
        edad=JOptionPane.showInputDialog("Ingrese su edad");
    }
    
    public void mostrarDatos(){
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su apellido es: "+apellido);
        System.out.println("Su edad es: "+edad);
        System.out.println("*****************************************");
    }
    
}
