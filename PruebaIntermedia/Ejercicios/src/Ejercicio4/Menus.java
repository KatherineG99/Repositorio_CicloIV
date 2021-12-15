
package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Menus {
    
        public static void menuEntrada (ArrayList <Tienda> productos) {
        int opcion;
 
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Bienvenido a la Gestion de una Tienda de bebidas");
            System.out.println("");
            System.out.println("Pulse 1 para acceso al Menu de registro de productos");
            System.out.println("Pulse 2 para acceder al Menu de Ventas");
            System.out.println("Pulse 0 para salir ");
            opcion = teclado.nextInt();
 
            switch (opcion) {
                case 1: {
                    menuProductos(productos);
                    break;
                }
                case 2: {
                    menuVentas(productos);
                    break;
                }
                default: {
                    System.out.println("movimientos finalizados");
                    break;
                }
            }
 
        } while (opcion != 0);
 
 
    }
 
    public static void menuProductos(ArrayList<Tienda> productos) {
        String respuesta = "no";
        
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Menu de registro de Productos ");
 
            productos.add(new Tienda());
 
            System.out.println("¿Desea dar registrar otro Producto?");
            respuesta = teclado.nextLine();
          
        } while (respuesta=="si");
 
    }
 
    public static void menuVentas(ArrayList<Tienda> productos) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int unidades=0;
        String respuesta;
        double factura = 0;
        boolean res;
        do {
            System.out.println("Menu de venta de productos");
            System.out.println("");
 
            for (int i = 0; i < productos.size(); i++) {
                System.out.println("Pulse " + i + " Para comprar " + productos.get(i).devolverNombre() + " cuyo precio es de " + productos.get(i).devolverPrecio() + " y el stock es de " + productos.get(i).devolverStok() + " unidades");
            }
 
            opcion = teclado.nextInt();
 
            System.out.println("Ha elegido comprar " + productos.get(opcion).devolverNombre());
 
            for (int i = opcion; i < productos.size(); i++) {
 
                unidades = unidades(productos);
 
                if (productos.get(i).quedaStock(unidades) == true) {
                    productos.get(i).modificarStock(unidades);
                     unidades = unidades * productos.get(i).devolverPrecio();
                }
                break;
            }
 
            factura = factura + unidades;
 
            System.out.println("¿Desea comprar otro producto?\n digite si o no");
            respuesta = teclado.next();
             
        } while (respuesta=="si");
 
        
 
        System.out.println("El total de su compra es: " + factura);
 
    }
 
    public static int unidades(ArrayList<Tienda> productos) {
        Scanner teclado = new Scanner(System.in);
        int unidades;
 
        System.out.println("¿Cuantas unidades quieres?");
        unidades = teclado.nextInt();
 
        return unidades;
    }
}
