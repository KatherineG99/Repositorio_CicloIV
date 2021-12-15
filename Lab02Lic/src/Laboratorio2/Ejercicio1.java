
package Laboratorio2;
import javax.swing.*;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        String numero1;
        int numero,sumaV=0;
        int contador=0;
        int vector[]=new int[8];
        
        JOptionPane.showMessageDialog(null,"Bienvenido Usuario","Bienvenida",JOptionPane.INFORMATION_MESSAGE);
    
        for (int i = 0; i < 8; i++) {
            
            numero1 =JOptionPane.showInputDialog(null,"Ingrese un su "+ i+" numero");
           numero= Integer.parseInt(numero1);
           vector[i]=numero;
           if(numero>=36){
               sumaV = sumaV+numero;
           }
           sumaV = sumaV+numero;
        }
        
        for (int j = 0; j < 8; j++) {
            int Ingresos =vector[j];
            if(Ingresos>=50){
                contador=contador+1;
            }
            
        }
        JOptionPane.showMessageDialog(null,"El total de la suma de numeros mayores a 36 es :"+sumaV,"Resultado",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El total de numeros mayores a 50 es : "+contador,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
