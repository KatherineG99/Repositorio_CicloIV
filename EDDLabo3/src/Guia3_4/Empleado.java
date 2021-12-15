
package Guia3_4;
import javax.swing.JOptionPane;

public class Empleado {
    private String nombre;
    private String apellido;
    
    public void mostrardatos(){
        JOptionPane.showConfirmDialog(null, nombre+" "+apellido);
    }
    
    public void ingresodatos(){
        nombre=JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido = JOptionPane.showInputDialog("Ingrese el Apellido");
        
    }
    
    
}

class profesor extends Empleado{
    int sueldo;
    public void mostrar1(){
        mostrardatos();
    }
    
    public void ingreso2(){
        ingresodatos();
        String s = JOptionPane.showInputDialog("Ingrese el sueldo");
        sueldo = Integer.parseInt(s);
    }
}
