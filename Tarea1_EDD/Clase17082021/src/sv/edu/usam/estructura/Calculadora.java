package sv.edu.usam.estructura;

import javax.swing.JOptionPane;
import sv.edu.usam.operaciones.Operar;

public class Calculadora {

    Suma objSuma;
    Resta ObjResta;
    Valores objVal;
    String opc;
    Operar objOpr;
    public Calculadora() {
        Menu();
    }

    public void Menu() {
        double val1,val2;
        double A,B;
        
      
        do{
            
            opc = JOptionPane.showInputDialog(null, "Ingrese valor de operacion \n "
                + " + => para sumar \n"
                + " - => para sumar \n"
                + " * => para sumar \n"
                + " / => para sumar \n"
                + " x => para salir \n", JOptionPane.INFORMATION_MESSAGE);
        val1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese valor"));
        val2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese valor"));
        switch (opc) {
            case "+":
                objSuma = new Suma();
                objOpr= new Operar();
                objSuma.setValor1(val1);
                objSuma.setValor2(val2);
                A=objSuma.getValor1();
                B=objSuma.getValor2();
                JOptionPane.showMessageDialog(null,String.valueOf(objOpr.suma(objSuma.getValor1(),objSuma.getValor2())));
               // System.out.println(A+" y "+B);
               // System.out.println(objOpr.suma(A,B));
                break;
            case "-":
                ObjResta = new Resta();
                ObjResta.setValor1(val1);
                ObjResta.setValor2(val2);
                JOptionPane.showMessageDialog(null,objOpr.resta(ObjResta.getValor1(),ObjResta.getValor2()));
                break;
            case "*":
                objVal = new Valores();
                objVal.setValor1(val1);
                objVal.setValor2(val2);
                JOptionPane.showMessageDialog(null,objOpr.multi(objVal.getValor1(), objVal.getValor2()));
                break;
            case "/":
                objVal = new Valores();
                objVal.setValor1(val1);
                objVal.setValor2(val2);
                JOptionPane.showMessageDialog(null,objOpr.div(objVal.getValor1(), objVal.getValor2()));
                break;
            default:
                break;
        }
      //  opc="";
        }
        while( !opc.equals("x"));
    }
}
