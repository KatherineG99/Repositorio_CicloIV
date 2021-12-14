
package sv.edu.usam.Principal;
import javax.swing.JOptionPane;

import sv.edu.usam.operaciones.Operaciones;

public class Principal {
    public static void main(String[] args) {
        int dato;
        Operaciones obj = new Operaciones();
        obj.llenar();
        dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su valor"));
        obj.Imprimir(dato);
    }
}
