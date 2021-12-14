
package Mapa;

import java.util.HashMap;

/**
 *
 * @author Dell
 */
public class Mapa2 {
     public HashMap<Integer, String> mapa = new HashMap<Integer, String>();
     public HashMap<Integer, String>  direccion= new HashMap<Integer, String>();
     public HashMap<Integer, String>  telefono= new HashMap<Integer, String>();
     public HashMap<Integer, String>  genero= new HashMap<Integer, String>();
            

    public void insertar(int indice,String dato,String dato2,String dato3,String dato4) {
        mapa.put(indice, dato);
        direccion.put(indice, dato2);
        telefono.put(indice, dato3);
        genero.put(indice, dato4);

    }
    
    public void eliminar(int indice ){
        mapa.remove(indice);
        direccion.remove(indice);
        telefono.remove(indice);
        genero.remove(indice);
    }
    
    public void actualizar1(int indice,String dato,String dato2,String dato3,String dato4) {
        mapa.replace(indice, dato);
        direccion.replace(indice, dato2);
        telefono.replace(indice, dato3);
        genero.replace(indice, dato4);
        
    }
     public void actualizarnom(int indice,String dato) {
        mapa.replace(indice, dato);
        
        
    }
      public void actualizardire(int indice,String dato) {
        
        direccion.replace(indice, dato);
        
        
    }
       public void actualizartele(int indice,String dato) {
       
        telefono.replace(indice, dato);
        
        
    }
        public void actualizargen(int indice,String dato) {
        genero.replace(indice, dato);
        
    }
}
