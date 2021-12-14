package Mapa;

import java.util.HashMap;

/**
 *
 * @author Dell
 */
public class Mapa {

    public HashMap<Integer, String> mapa = new HashMap<Integer, String>();
            

    public void insertar(int indice,String dato) {
        mapa.put(indice, dato);

    }
    
    public void eliminar(int indice ){
        mapa.remove(indice);
    }
    
    public void actualizar(int indice,String dato) {
        mapa.replace(indice, dato);
    }
}
