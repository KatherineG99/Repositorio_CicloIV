/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import javax.swing.JOptionPane;
public class tienda {
   
    public static void main(String[] args) {
         String bolita,pproducto;
         int valor,respuesta;
         
        pproducto = JOptionPane.showInputDialog("Ingrese el valor de su compra");
        valor = Integer.parseInt(pproducto);
        
       String seleccion=(String) JOptionPane.showInputDialog(null,"Desea Participar en descuento?","Seleccione una opcion",JOptionPane.QUESTION_MESSAGE,
                        null, 
                new Object[] { "Si", "No" },"si");

                if (seleccion.equals("Si")){
                    bolita = JOptionPane.showInputDialog("Ingrese un numero de 1 a 3");
                    respuesta = Integer.parseInt(bolita);
        
                    switch ( respuesta ) {
                    case 1:
                        JOptionPane.showMessageDialog(null,"Felicidades te llevas 10% de descuento deberas cancelar el valor de: "+(valor-(valor*0.10))+" Por tus productos","Bolita Roja",JOptionPane.PLAIN_MESSAGE);
                    break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Felicidades te llevas 5% de descuento deberas cancelar el valor de: "+(valor-(valor*0.05))+" Por tus productos","Bolita Verde",JOptionPane.PLAIN_MESSAGE);
                    break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Gracias por participar deberas cancelar el valor de: "+valor+" Por tus productos","Bolita Blanca",JOptionPane.PLAIN_MESSAGE);
                    break;
                   
                    default:
                        System.out.println("error" );
                    break;
                    }
                    
                }else{
                JOptionPane.showMessageDialog(null,"deberas cancelar el valor de: "+valor+" Por tus productos","Gracias por su compra",JOptionPane.PLAIN_MESSAGE);
                }
    }
 
   
}
