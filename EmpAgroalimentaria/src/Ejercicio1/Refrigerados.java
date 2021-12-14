
package Ejercicio1;

/**
 *
 * @author Katherine Gomez
 */
public class Refrigerados extends Productos{
    private int codorganismo;

    public int getCodorganismo() {
        return codorganismo;
    }

    public void setCodorganismo(int codorganismo) {
        this.codorganismo = codorganismo;
    }
   

    public Refrigerados(String nombre, String Fechacaduca, int numerolote, String fechaenvasado, String paisorigen, double temprecomend,int codorganismo) {
        super(nombre, Fechacaduca, numerolote, fechaenvasado, paisorigen, temprecomend);
        this.codorganismo= codorganismo;
    }

    
    
}
