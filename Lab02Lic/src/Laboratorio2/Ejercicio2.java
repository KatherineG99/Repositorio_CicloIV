
package Laboratorio2;
import javax.swing.*;


public class Ejercicio2 {
    
    
    public static void main(String[] args) {
        String v1,v2;
        int r1,r2;
        int Vector1[]=new int[4];
        int Vector2[]=new int[4];
        int Vector3[]=new int[4];
    
        JOptionPane.showMessageDialog(null,"Bienvenido Usuario","Bienvenida",JOptionPane.INFORMATION_MESSAGE);    
    
        for (int i = 0; i < 4 ; i++) {
            v1=JOptionPane.showInputDialog(null,"Ingrese un valor en el vector 1 en la posicion: "+i);
            r1= Integer.parseInt(v1);
            Vector2[i]=r1;
        }
        for (int j = 0; j < 4; j++) {
            v2=JOptionPane.showInputDialog(null,"Ingrese un valor en el vector 2 en la posicion: "+j);
            r2=Integer.parseInt(v2);
            Vector2[j]=r2;
            
        }
        for (int k = 0; k < 4; k++) {
            int dato1=0;
            int dato2=0;
            
            dato1=Vector1[k];
            dato2=Vector2[k];
            
            Vector3[k]=(dato1+dato2);
            JOptionPane.showMessageDialog(null,"El resultado de la suma "+k"="+Vector[3],"Bienvenida",JOptionPane.INFORMATION_MESSAGE);
        }
        
            
        
    
    
}
}
