
package Mapa;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class PrincipalEj {
    public static void main(String[] args) {
        Mapa2 mp = new Mapa2();
        int nmemp=1;
        String direccion,telefono,genero;
        Scanner scn = new Scanner(System.in);
        System.out.println("---------------------------Bienvenido---------------------------");
        System.out.println("Que desea hacer el dia de hoy?");
        System.out.println("1-Ingresar sus 4 empleados");
        System.out.println("2-Ver los datos");
        System.out.println("3-actualizar todos los datos de un registro");
        System.out.println("4-actalizar nombre");
        System.out.println("5-actualizar direccion");
        System.out.println("6-actualizar telefono");
        System.out.println("7-eliminar");
        System.out.println("x-salir");
        do{
        System.out.println("Porfavor ingrese los datos de el empleado nº"+nmemp);
            System.out.println("Ingrese el nombre");
        String nombre;
        nombre=scn.next();
            System.out.println("Ingrese la direccion");
            direccion=scn.next();
            System.out.println("Ingrese el telefono");
            telefono= scn.next();
            System.out.println("Ingrese el genero");
            genero=scn.next();
        mp.insertar(nmemp, nombre, nombre, nombre, nombre);
        }while(nmemp<=4);
    }
}
