
package banco;

import java.util.Random;
import javax.swing.JOptionPane;


public class Cliente {
    Infopriv info = new Infopriv();
    static String[] tipcuenta = {"CC-00001","CA-00001","CP-00001"};
    static String[] formato = {"Corriente","Ahorro","Plazos"};
    double monto;
    String NIT;
    int acum1,acum;
    String cuenta;
    String cadenaregistro,nombrecompleto;
    static String[] sucursal = {"CITI","AZUL","BAMC","BACU","BAGR"};
    

   
    
    
    
    public void registro() {
        String Nombre, Apellido;
        
        
        
        Nombre= JOptionPane.showInputDialog(null, "Ingrese sus dos nombre");
        info.setNombre(Nombre);
        Apellido = JOptionPane.showInputDialog(null,"Ingrese sus dos Apellido");
        info.setApellido(Apellido);
        NIT = JOptionPane.showInputDialog(null,"Ingrese su numero de NIT");
        info.setNIT(NIT);
        acum1=Integer.parseInt(JOptionPane.showInputDialog(null, "Que tipo de cuenta desea tener ? \n"
        +"presione : \n"
        +" 0 - Cuenta Corriente \n"
        +" 1 - Cuenta de Ahorro \n"
        +" 2 - Cuenta a Plazos "));
        acum=Integer.parseInt(JOptionPane.showInputDialog(null, "Con que sucursal desea sacar su cuenta ? \n"
        +"presione : \n"
        +" 0 - CITIBANK, N.A \n"
        +" 1 - BANCO AZUL DE EL SALVADOR, SOCIEDAD ANONIMA \n"
        +" 2 - BANCO DE AMERICA CENTRAL, S.A \n"
        +" 3 - BANCO CUSCATLAN DE EL SALVADOR, S.A \n"
        +" 4 - BANCO AGRICOLA, S.A "));
        monto = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese su cantidad de apertura la cual no debe ser menor de $50"
                + "\n monto de cada movimiento sera de $5.00 + iva"));
        cuenta= String.valueOf(numerocuenta());
        
        info.setCuenta(cuenta);
        
        cadenaregistro=("sv"+tipcuenta[acum1]+sucursal[acum]+info.getCuenta()+62);
        nombrecompleto =info.getNombre()+" "+info.getApellido();
        
    }
    
    public static long numerocuenta() {
        
        Random random = new Random();
        char[] digits = new char[12];
        digits[0] = (char) (random.nextInt(9) + '1');
        
            for (int i = 1; i < 12; i++) {
                digits[i] = (char) (random.nextInt(10) + '0');
            }
            return Long.parseLong(new String(digits));
    }
    
    
    public void infoimpresion(){
        
        JOptionPane.showConfirmDialog(null, "Porfavor confirme su informacion :"
        +"\n cliente con nomre: "+info.getNombre()+" "+info.getApellido()
        + "\n con numero de NIT: "+info.getNIT()
        +"\n solicita tipo de cuenta : "+tipcuenta[acum1]
        +"\n En la sucursal de : "+sucursal[acum]
        +"\n se le asigna el numero de cuenta : "+info.getCuenta()
        +"\n Su codigo de registro para su cuenta bancaria es : "+cadenaregistro);
        
        
        
    }
    
    /*public static void main(String[] args) {
        Cliente cl = new Cliente();
        
        cl.registro();
        cl.infoimpresion();
    }*/
}
