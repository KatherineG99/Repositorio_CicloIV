package herencia;

import java.util.List;

public interface ICrud {
        
    public boolean insertar(Usuario user);      
    public boolean update(Usuario user);     
    public List<Usuario> selectAll();
    public List<Usuario> selectById(int id);
    public boolean delete(int id);  
    
}
