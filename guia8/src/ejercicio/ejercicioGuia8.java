package ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicioGuia8 {

    public ArrayList<Integer> leerValores() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int escan = -999999999;
        try {
            do {
                if (escan == -999999999) {
                    System.out.println("introducir numero");
                    escan = sc.nextInt();
                } else {
                    lista.add(escan);
                    System.out.println("introducir numero");
                    escan = sc.nextInt();
                }
            } while (escan != -99);

            if (escan == -99) {
                return lista;
            } else {

            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return lista;
    }

    public int calcularSuma(ArrayList<Integer> li) {
        Iterator<Integer> iter = li.iterator();
        int suma = 0;
        while (iter.hasNext()) {
            suma = suma + iter.next();
        }
        return suma;
    }

    public void mostrarResultados(ArrayList<Integer> li, int suma, int media) {

        System.out.println(" El Resultado de la suma es  " + suma);
        System.out.println(" El Resultado de la media aritmetica es  " + media);
        System.out.println(" Numeros matores que la media ::: ");
        for (int i = 0; i < li.size(); i++) {
            int n = li.get(i);
            if (n > media) {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        ejercicioGuia8 c = new ejercicioGuia8();
        ArrayList<Integer> p = new ArrayList<Integer>();

        p = c.leerValores();
        int suma = c.calcularSuma(p);
        int media = suma / p.size();

        c.mostrarResultados(p, suma, media);

    }
}
