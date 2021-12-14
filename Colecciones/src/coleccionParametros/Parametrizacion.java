
package coleccionParametros;

import java.util.LinkedList;

/**
 *
 * @author Dell
 */
public class Parametrizacion {
    
    public void pruebaPara(){
        LinkedList prueba = new LinkedList();
        int i = 1;
        String hola="Hola mundo";
        prueba.add(i);
        prueba.add(hola);
        prueba.add(3);
        prueba.add(20);
        prueba.add(5);
        prueba.add("hola mundocruel");
        prueba.add(6);
        prueba.add(190235);
        prueba.add(8);
        prueba.add("Katherine");
        prueba.add(10);
        prueba.add("Ariel");
        prueba.add(12);
        prueba.add(true);
        prueba.add(14);
        prueba.add(false);
        prueba.add(16);
        prueba.add("holi");
        prueba.add(18);
        prueba.add(" jsjsjjsjsjjsjs");
        int k=1;
        for (int j = 0; j < 10; j++) {
             System.out.println(prueba.get(j)+" "+prueba.get(k));
             k++;
        }
       
    }
    
    
   
}
