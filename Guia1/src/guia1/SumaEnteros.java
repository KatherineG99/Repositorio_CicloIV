
package guia1;

import javax.swing.JOptionPane;

public class SumaEnteros {
    public static void main(String[] args) {
        String primernumero;
        String segundonumero;
        int numero1;
        int numero2;
        int suma;
        
        do{
            primernumero = JOptionPane.showInputDialog("Digite su primer numero");
            segundonumero = JOptionPane.showInputDialog("Digite su segundo numero");
            numero1 = Integer.parseInt(primernumero);
            numero2 = Integer.parseInt(segundonumero);
            if(numero1 < 0 || numero2 <0 ){
                JOptionPane.showMessageDialog(null,"Porfavor ingrese numeros positivos","Mensaje De Informacion",JOptionPane.INFORMATION_MESSAGE);
            }

        }while(numero1 < 0 || numero2 <0 );
        
        suma = numero1 +numero2;
        
        JOptionPane.showMessageDialog(null,"La suma es "+ suma, "Resultado",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
        
    }
    
}
