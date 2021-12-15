package main;

import herencia.ICrud;
import herencia.Usuario;
import java.util.List;

public class Crud implements ICrud{

    @Override
    public boolean insertar(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean update(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Usuario> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Usuario> selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean delete(int id) {        
        return true;
    }
    
}
