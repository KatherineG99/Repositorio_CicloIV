package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Tienda {

    String nombrePr;
    int stock;
    int precio;

    public Tienda() {
        NombreProducto();
        StockProducto();
        PrecioProducto();
    }

    public static int solicitaProducto() {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuantos productos desea registrar?");

        numero = teclado.nextInt();
        return numero;
    }

    public void NombreProducto() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del producto: ");
        nombrePr = teclado.nextLine();
    }

    public String devolverNombre() {
        return nombrePr;
    }

    public void StockProducto() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el stock de: " + devolverNombre() + " : ");
        stock = teclado.nextInt();
    }

    public int devolverStok() {
        return stock;
    }

    public void PrecioProducto() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el precio de: " + devolverNombre() + " : ");
        precio = teclado.nextInt();
    }

    public int devolverPrecio() {
        return precio;
    }
    
      public void modificarStock(int stockP){
        stock = stock -stockP;
        System.out.println("se realizo la venta");
    }
    public boolean quedaStock(int stockP){
 
        if (stock >= stockP) {
 
            return true;
 
        } else {
            System.out.println("ERROR");
            System.err.println(" Quedan " + stock + " unidades");
 
            return false;
        }
    }
}
