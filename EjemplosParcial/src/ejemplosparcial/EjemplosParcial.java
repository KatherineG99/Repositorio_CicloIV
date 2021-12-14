package ejemplosparcial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EjemplosParcial {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("");
        lista.add("Kathy");
        lista.add("Ariel");
        lista.add("Gomez");
        lista.add("daniel");
        lista.remove(1);

        Iterator<String> it = lista.iterator();
        /*System.out.println(it.next());*/

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
