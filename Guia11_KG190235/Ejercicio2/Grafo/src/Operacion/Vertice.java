
package Operacion;

/**
 *
 * @author Dell
 */
public class Vertice {
   private Nodo origen;
    private Nodo destino;
    private double distancia;

    public Vertice(Nodo origen, Nodo destino, double distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Nodo getOrigen() {
        return origen;
    }

    public void setOrigen(Nodo origen) {
        this.origen = origen;
    }

    public Nodo getDestino() {
        return destino;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
   
    public String toString(){
        return "\n Vertice [origen =" + origen.getDepartamentos() + 
                ", destino =" + destino.getDepartamentos() + 
                ", distancia =" + distancia + "]";
    }
}
