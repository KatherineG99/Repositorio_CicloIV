
package Practica;

import java.util.List;


public interface Crud<T> {
    public boolean insertar(T object);
    public List<T> mostrar();
    public boolean eliminar(T object);
    public List<T> selectbyid(int id);
    public boolean actualizar(T object);
}
