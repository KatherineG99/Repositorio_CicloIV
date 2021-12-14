package inventario;

import java.util.Scanner;

/**
 *
 * @author Katherine Gomez
 */
public class Operaciones {

    Computadoras com;
    Scanner scn = new Scanner(System.in);
    int cont = 1;

    public void insertrapro() {
        com = new Computadoras();
        
        System.out.println("Bienvenido Porfavotr ingrese la informacion de los productos");
        com.setId(cont++);
        System.out.println("Ingrese el tipo de computador");
        com.setTipocomp(scn.next());
        System.out.println("Ingrese la cantidad que ingresara ");
        com.setStock(scn.nextInt());
        System.out.println("Ingrese la cantidad minima que debe haber en stock");
        com.setCantminima(scn.nextInt());
        System.out.println("Ingrese el costo por unidad");
        com.setValorc(scn.nextDouble());
    }
    
   
    
    public void cantidadminima(int minima) {
       
        minima =com.getCantminima();
        int existente = com.getCantidadexiste();
        if (existente<=minima) {
            System.out.println( "la cantidad minima de este producto es :" + minima);
       
           
            
        }
        
        System.out.println("");
    }
    
    public void venta() {
       
        System.out.println("Ingrese la cantidad que desee comprar");
        int canticom=scn.nextInt();
        System.out.println("venta exitosa");
        double precio=com.getValorc();
        double venta = precio*canticom;
        System.out.println("Con un total de: $"+venta);
        int existe = com.getCantidadexiste();
        existe = existe - canticom;
        com.setStock(existe);
        System.out.println(com.getCantidadexiste());
        
    }
    public void mostrar() {
        
        com.setCantidadexiste(com.getStock());
        System.out.println("Id del ingreso");
        System.out.println(com.getId());
        System.out.println("Tipo de computador");
        System.out.println(com.getTipocomp());
        System.out.println("Cantidad existente");
        System.out.println(com.getCantidadexiste());
        System.out.println("Cda uno tiene un valor de: $" + com.getValorc());
        cantidadminima(com.getCantidadexiste());
        
    }
}
