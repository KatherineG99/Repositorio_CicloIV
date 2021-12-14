package sv.edu.usam.Ejemplo1;
import javax.swing.JOptionPane;

public class PilaMain {

    public static void main(String[] args) {
        String cadena;
        String caracter;
        Pila mipila = new Pila();
        Pila pilafrase = new Pila();

        System.out.println("\t\t---Parte I ---");
        mipila.Push("p");
        mipila.Push("b");
        mipila.Push("z");
        mipila.Push("s");
        mipila.mostrar();
        System.out.println("");

        mipila.Pop();
        mipila.mostrar();
        System.out.println("");

        System.out.println("\t\t---Parte II ---");
        System.out.println("Ingrese la palabra");
        cadena = JOptionPane.showInputDialog(null, "Ingrese el valor");
        System.out.println(cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.substring(i, i+1);
            pilafrase.Push(caracter);
        }
        pilafrase.mostrar();
        System.out.println("");
    }
}
