package inventario;

/**
 *
 * @author Katherine
 */
public class Principal {

    public static void main(String[] args) {
        Operaciones op = new Operaciones();

        op.insertrapro();
        op.venta();
        
        Operaciones op2 = new Operaciones();

        op2.insertrapro();    
        op2.venta();
        op.mostrar();
        op2.mostrar();
       

    }

}
