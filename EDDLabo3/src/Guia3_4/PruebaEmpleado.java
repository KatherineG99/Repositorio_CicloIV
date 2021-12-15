
package Guia3_4;
import javax.swing.JOptionPane;


public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        profesor pro = new profesor();
        JOptionPane.showMessageDialog(null, "Clase empleado");
        emp.ingresodatos();
        emp.mostrardatos();

    }
        
}
