package Ejercicio2.Principal;

import Ejercicio2.Operaciones.Lista;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Lista ld = new Lista();
        Scanner scan = new Scanner(System.in);
        int opc, car;
        String nombre;
        do {

            System.out.println("Que desea hacer? "
                    + "\n 1- Insertar un empleado al inicio"
                    + "\n 2- Insertar un empleado al final"
                    + "\n 3- Insertar un empleado en segundo lugar"
                    + "\n 4- Insertar un empleado en Ante penultimo lugar"
                    + "\n 5- Borrar un empleado de el inicio"
                    + "\n 6- Borrar un empleado de el final"
                    + "\n 7- Borrar un empleado de el segundo lugar"
                    + "\n 8- Borrar al empleado que tenga el numero de identificacion mas alto"
                    + "\n 0- Salir");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite su numero de identificacion");
                    car = scan.nextInt();
                    System.out.println("Digite su nombre");
                    nombre =scan.next();
                    ld.insertarinicio(car, nombre);
                    System.out.println("");
                    ld.imprimir();
                    break;
                case 2:
                    System.out.println("Digite su numero de identificacion");
                    car = scan.nextInt();
                    System.out.println("Digite su nombre");
                    nombre = scan.next();
                    ld.insertarultimo(car, nombre);
                    System.out.println("");
                    ld.imprimir();
                    break;
                case 3:
                    System.out.println("Digite su numero de identificacion");
                    car = scan.nextInt();
                    System.out.println("Digite su nombre");
                    nombre = scan.next();
                    ld.insertarseg(car, nombre);
                    System.out.println("");
                    ld.imprimir();
                    break;
                case 4:
                    System.out.println("Digite su numero de identificacion");
                    car = scan.nextInt();
                    System.out.println("Digite su nombre");
                    nombre = scan.next();
                    ld.insertarAUltimo(car, nombre);
                    System.out.println("");
                    ld.imprimir();
                    break;
                case 5:
                    ld.borrar1();
                    System.out.println("");
                    ld.imprimir();
                    break;
                case 6:
                    ld.borrarUltimo();
                    System.out.println("");
                    ld.imprimir();
                    break;
                case 7:
                    ld.borrar2();
                    System.out.println("");
                    ld.imprimir();
                    break;
                case 8:
                    ld.borarmayor();
                    System.out.println("");
                    ld.imprimir();
                    break;
                default:
                    break;
            }

        } while (opc != 0);

    }

}
