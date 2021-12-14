
package guia1;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        while (true){
            try{
                String nombre= JOptionPane.showInputDialog("Ingresa tus nombres");
                String Apellidos= JOptionPane.showInputDialog("Ingresa tus apellidos");
                String ingreso=JOptionPane.showInputDialog("Ingresa tu Edad");
                String Carrera=JOptionPane.showInputDialog("Ingresa tu Carrera");
                int edad=Integer.parseInt(ingreso);
                JOptionPane.showMessageDialog(null,"Hola, "+"\n Su nombre es: "+ nombre + ". "+"\n Sus apellidos son: "+ Apellidos + ". "
                        + "\n su edad es: " +(edad) + "años"+"\n Su carrera es: "+ Carrera + ". ","Resultado",JOptionPane.INFORMATION_MESSAGE);
                break;
                
            }
            catch(Exception e){
                System.out.println("Error en algun dato de entrada");
                JOptionPane.showMessageDialog(null,"Error en algun dato de entrada","Error",JOptionPane.ERROR_MESSAGE);
                String seleccion=(String) JOptionPane.showInputDialog(null,"Desea Salir","Seleccione una opcion",JOptionPane.QUESTION_MESSAGE,
                        null, 
                new Object[] { "Si", "No" },"si");

                if (seleccion.equals("Si")){
                    System.exit(0);
                    break;
                }
            }
        }
    }
    
}
