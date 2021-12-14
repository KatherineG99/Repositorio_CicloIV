
package inventario;

/**
 *
 * @author Katherine Gomez
 */
public class Computadoras {
    private int id;
    private String tipocomp;
    private int cantidadexiste,cantminima,stock;
    private double valorc;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipocomp() {
        return tipocomp;
    }

    public void setTipocomp(String tipocomp) {
        this.tipocomp = tipocomp;
    }

    public int getCantidadexiste() {
        return cantidadexiste;
    }

    public void setCantidadexiste(int cantidadexiste) {
        this.cantidadexiste = cantidadexiste;
    }

    public int getCantminima() {
        return cantminima;
    }

    public void setCantminima(int cantminima) {
        this.cantminima = cantminima;
    }

   
    public double getValorc() {
        return valorc;
    }

    public void setValorc(double valorc) {
        this.valorc = valorc;
    }
    
    
}
