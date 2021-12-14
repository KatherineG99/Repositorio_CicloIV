
package guia1;

import javax.swing.JOptionPane;

public class Comparaciòn {
    public static void main(String[] args) {
        String primernumero;
        String segundonumero;
        String resultado;
        int numero1;
        int numero2;
        int suma;
        
         primernumero = JOptionPane.showInputDialog("Digite su primer numero");
        segundonumero = JOptionPane.showInputDialog("Digite su segundo numero");
        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);
        suma = numero1 +numero2;
        resultado="";
        if (numero1 == numero2){
            resultado = resultado + numero1 + "==" + numero2; 
        }
        if(numero1 != numero2) {
            resultado = resultado + numero1 + "!=" + numero2;
        }
        if(numero1 < numero2){
            resultado = resultado + "\n" + numero1 + "<" + numero2;
        }
        if(numero1 > numero2){
            resultado = resultado + "\n" + numero1 + ">" + numero2;
        }
        if(numero1 <= numero2){
            resultado = resultado + "\n" + numero1 + "<=" + numero2;
        }
        if(numero1 >= numero2){
            resultado = resultado + "\n" + numero1 + ">=" + numero2;
        }
        JOptionPane.showConfirmDialog(null,resultado,"Resultado de la comparaciòn",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
    
}
