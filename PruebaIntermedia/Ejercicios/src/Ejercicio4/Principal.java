package Ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Principal {

    public static void main(String[] args) {
        Menus men = new Menus();
        ArrayList<Tienda> productos = new ArrayList<>();
        men.menuEntrada(productos);
    }
}
