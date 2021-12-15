
package Ejercicio1.Principal;

import Ejercicio1.Operaciones.Operaciones;


public class Principal {
    public static void main(String[] args) {
        Operaciones lg = new Operaciones();
        lg.insertaPrimero(10);
        lg.imprimir();
        System.out.println("segunda impresion prueba");
        lg.insertaPrimero(12);
        lg.insertaPrimero(6);
        lg.imprimir();
        System.out.println("tercera impresion prueba");
        lg.insertaFinal(1);
        lg.insertaPrimero(9);
        lg.insertaFinal(0);
        lg.imprimir();
        System.out.println("cuarta prueba");
        lg.insertarseg(0);
        lg.imprimir();
        System.out.println("quinta prueba");
        lg.insertarseg(10);
        lg.imprimir();
        lg.insertarseg(11);
        lg.imprimir();
        System.out.println("sexta prueba");
        lg.insertaAUltimo(12);
        lg.imprimir();
        System.out.println("septima prueba");
        lg.borar1();
        lg.imprimir();
        lg.borar1();
        lg.imprimir();
        System.out.println("octava prueba");
        lg.borrar2();
        lg.imprimir();
        lg.borrar2();
        lg.imprimir();
        lg.borar1();
        lg.imprimir();
        System.out.println("relleno de nodo");
        lg.insertaPrimero(9);
        lg.insertaFinal(2);
        lg.insertaAUltimo(5);
        lg.insertarseg(8);
         lg.insertaPrimero(7);
        lg.insertaFinal(25);
        lg.insertaAUltimo(50);
        lg.insertarseg(80);
        lg.imprimir();
        System.out.println("novena prueba");
        lg.borrarUltimo();
        lg.imprimir();
        lg.borrarUltimo();
        lg.imprimir();
        System.out.println("decima prueba");
        lg.borrarMayor();
        lg.imprimir();
        System.out.println("decima.0 prueba");
        lg.borrarMayor();
        lg.imprimir();
        lg.borrarMayor();
        lg.imprimir();
    }
}
