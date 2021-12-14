
package Ejemplos;
import javax.swing.*;

public class SentenciaIF {
    public static void main(String[] args) {
       String datos,a;
       double sueldo, afp=0, isss, totalre, nsueldo, renta;
       a=JOptionPane.showInputDialog("Digite el numero de empleado");
       do{
       datos = JOptionPane.showInputDialog(" Ingrese el sueldo del empleado " +(a));
       sueldo = Double.parseDouble(datos);
       if(sueldo<0 ){
                JOptionPane.showMessageDialog(null,"Porfavor ingrese numeros positivos","Mensaje De Informacion",JOptionPane.INFORMATION_MESSAGE);
            }
       }while(sueldo<0);

       if(sueldo>300){
           afp = (sueldo*0.0625);
        }

        JOptionPane.showMessageDialog(null, " Este empleado tiene un sueldo de " + sueldo + " y el descuento del AFP es "+ afp);
        datos= (String) JOptionPane.showInputDialog(null,"Ingrese el Sexo:\nSi es Masculino (M)\nSi es Femenino (F)",
        "Sexo del Empleado",JOptionPane.QUESTION_MESSAGE,null, //Icono por defecto
        new Object[] { "M", "F"},"F"); //opcion por defecto
        if(datos == "M")//Si es de sexo Masculino
        {
            isss = sueldo*0.03;
            renta=sueldo*0.10;
            totalre = afp+isss+renta;
            nsueldo = sueldo - totalre;
            JOptionPane.showMessageDialog(null,"Al empleado nº"+a+ "se le detiene" + isss+ "enconcepto de ISSS\nAdemas se le retiene: "+ renta+ "En concepto de Renta\nLo que hace un total de "+
            totalre+ "\nY su nuevo Sueldo es de:"+ nsueldo);
        }
 
    }
}
