
package guia1;
import javax.swing.JOptionPane;

public class notas {
    public static void main(String[] args) {
        String nota1,nota2,nota3;
        int notap,notas,notat;
        double suma;
        nota1=JOptionPane.showInputDialog("Ingresa la primera nota del alumno");
        nota2=JOptionPane.showInputDialog("Ingresa la segunda nota del alumno");
        nota3=JOptionPane.showInputDialog("Ingresa la tercera nota del alumno");
        notap = Integer.parseInt(nota1);
        notas = Integer.parseInt(nota2);
        notat = Integer.parseInt(nota3);
        
        suma= (notap+notas+notat)/3;
        if(suma>=7.0){
            JOptionPane.showMessageDialog(null,"Felicidades aprobaste la materia","Sin Icono",JOptionPane.PLAIN_MESSAGE);
            
        }else if(suma<=6.90 && suma>=6.50){
            JOptionPane.showMessageDialog(null,"Puede realizar un examen para aprobar","Informacion",JOptionPane.INFORMATION_MESSAGE);
          
        }else{
             JOptionPane.showMessageDialog(null,"Reprobado","Advertencia",JOptionPane.WARNING_MESSAGE);
           
        }
        
        
    }
}
