package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Principal {

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        String[] dias = new String[7];
        lista.rellenoDias(dias);
        ArrayList< ArrayList< Integer>> mes = new ArrayList<>();
        lista.rellenomes(mes, dias);
        lista.mostrar(mes, dias);
        
        lista.calcularM(mes,dias);
        lista.diaCaluroso(mes,dias);
    }
}
