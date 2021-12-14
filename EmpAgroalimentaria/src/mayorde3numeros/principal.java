package mayorde3numeros;

import java.util.Scanner;

/**
 *
 * @author Katherine Gomez
 */
public class principal {

    public static void main(String[] args) {
        evaluacion ev = new evaluacion();
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = sc.nextInt();
        
        ev.Evaluacion(n1, n2, n3);
        
    }

}
