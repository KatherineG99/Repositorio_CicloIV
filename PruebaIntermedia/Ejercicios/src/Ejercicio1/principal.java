
package Ejercicio1;


import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class principal {
    public static void main(String[] args) {
        NumerosInter num = new NumerosInter();
        ArrayList<Integer>Lista=new ArrayList<>();
       num.introvalores(Lista);
        
       num.mostrar(Lista);
       
       num.intercambio(Lista);
       num.mostrar(Lista);
    }
}
