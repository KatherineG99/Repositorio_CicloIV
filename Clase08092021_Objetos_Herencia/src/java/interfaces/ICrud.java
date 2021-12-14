
package interfaces;

import Herencia.Usuario;
import java.util.List;


public interface ICrud {
    //una diferencia de interfaz y clas normal es que los metodos no lleva llaves 
    public int sumar();
    public boolean insert(Usuario user);
    public boolean modify(Usuario user);
    public boolean delete(int id); 
    public List<Usuario> selectAll();
    public List<Usuario> selectById(int id);
    
}
