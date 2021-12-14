
package controlador;
import modelo.CompraCarro;
import dao.CompraDao;

public class CompraController {
    public static void main(String[] args) {
        CompraCarro Cc= new CompraCarro();
        CompraDao CD = new CompraDao();
        
        Cc.setId(1);
        Cc.setMarcaC("BMW");
        Cc.setNombre("BMW M2");
        Cc.setPrecio(150000);
        
        CD.consultarCompra(Cc);
    }
    
}
