
package sv.edu.usam.SalarioEmpleado;
import javax.swing.JOptionPane;

public class Acciones {
    Empleado miEmpleado= new Empleado();
    Salario misalario = new Salario();
    
    public void Guardar(){
        String nombre, identificacion;
        double salario;
        int diasLaborados;
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado");
        identificacion = JOptionPane.showInputDialog(null,"Ingrese identificacion del empleado");
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese salario del empleado"));
        diasLaborados = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese salario del empleado"));
        miEmpleado.setNombre(nombre);
        miEmpleado.setIdentificacion(identificacion);
        miEmpleado.setSalarioDiario(salario);
        misalario.setDiasLaborados(diasLaborados);
        JOptionPane.showMessageDialog(null, "Datos ingresados con exito");
    }
    
    public void Calcular(){
        String Salario;
        Salario=(""+ misalario.CalcularSalario(misalario.getDiasLaborados(),miEmpleado.getSalarioDiario()));
        JOptionPane.showMessageDialog(null,"Empleado => "+miEmpleado.getNombre()+
                "\n Numero de ID => "+miEmpleado.getIdentificacion()+
                "\n El salario es => "+Salario);
    }
    
    public void Accion(){
        String opc;
        do{
            opc= JOptionPane.showInputDialog("******************************* "
            +"\n g - Para Guardar "
            +"\n c - para Calcular "
            +"\n x - para salir \n"
            +"**************************").toUpperCase();
            
            switch(opc)
            {
                case "G":
                    Guardar();
                    break;
                case "C":
                    Calcular();
                    break;
                default:
                    break;
                    
            }
        
        }while(!opc.equals("X"));
    }
}
