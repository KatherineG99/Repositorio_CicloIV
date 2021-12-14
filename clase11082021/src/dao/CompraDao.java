
package dao;
import modelo.CompraCarro;

public class CompraDao {
    public void consultarCompra(CompraCarro Cc){
        
        System.out.println("El id es: "+Cc.getId());
        System.out.println("La marca es: "+Cc.getMarcaC());
        System.out.println("El nombre es: "+Cc.getNombre());
        System.out.println("El precio es de : "+Cc.getPrecio());
    } 
}
