package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ListaDoble {

    Integer semanas, temperatura;
    String[] dias;
    Scanner scan = new Scanner(System.in);

    public static void rellenoDias(String[] dias) {

        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miercoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sabado";
        dias[6] = "Domingo";

    }

    public void rellenomes(ArrayList<ArrayList<Integer>> mes, String[] dias) {

        semanas = 4;
        for (int i = 0; i < semanas; i++) {
            for (int j = 0; j < dias.length; j++) {

                System.out.println("Introduzca la temperatura para la semana: " + i + " El dia" + dias[j] + " :");
                temperatura = scan.nextInt();
                mes.add(new ArrayList<Integer>());
                mes.get(i).add(temperatura);

            }
        }

    }

    public void mostrar(ArrayList<ArrayList<Integer>> mes, String[] dias) {
        for (int i = 0; i < mes.size(); i++) {

            for (int j = 0; j < mes.get(i).size(); j++) {

                System.out.println("Para el dia " + dias[j] + " de la semana " + i + " hizo una temperatura de: " + mes.get(i).get(j));
            }
        }
    }

    public static void calcularM(ArrayList< ArrayList< Integer>> mes, String[] dias) {

        double media = 0;
        Integer suma = 0;
        int contador = 0;
        for (int i = 0; i < mes.size(); i++) {

            for (int j = 0; j < mes.get(i).size(); j++) {

                suma = suma + mes.get(i).get(j);
                contador++;

            }

        }
        media = suma / contador;
        System.out.println("La temperatura media es : " + media + "ºc");
    }

    public static void diaCaluroso(ArrayList< ArrayList< Integer>> mes, String[] dias) {
        Integer mayor;
        int se;
        String di;
        mayor = mes.get(0).get(0);
        di = dias[0];
        se = 0;

        for (int i = 0; i < mes.size(); i++) {

            for (int j = 0; j < mes.get(i).size(); j++) {

                if (mes.get(i).get(j) > mayor) {

                    mayor = mes.get(i).get(j);
                    di = dias[j];
                    se = i;
                }
            }
        }
        System.out.println(
                " El " + di + " de la semana " + se + " es el mas caluroso: " + mayor);

    }

}
