package Ejercicio1;

/**
 *
 * @author Katherine Gomez
 */
public abstract class Productos {

    private String Fechacaduca;
    private int numerolote;
    private String fechaenvasado;
    private String paisorigen;
    private double temprecomend;
    private String nombre;

    public Productos(String nombre,String fechaenvasado,String Fechacaduca, int numerolote, String paisorigen) {
        this.Fechacaduca = Fechacaduca;
        this.numerolote = numerolote;
        this.fechaenvasado = fechaenvasado;
        this.paisorigen = paisorigen;
        this.nombre = nombre;
    }

    

   
    

   

    public Productos(String nombre,String Fechacaduca, int numerolote, String fechaenvasado, String paisorigen, double temprecomend) {
        this.nombre = nombre;
        this.Fechacaduca = Fechacaduca;
        this.numerolote = numerolote;
        this.fechaenvasado = fechaenvasado;
        this.paisorigen = paisorigen;
        this.temprecomend = temprecomend;
    }

    public void Mostrar1() {
        System.out.println("El nombre del producto es: "+this.nombre);
        System.out.println("La fecha de envasado es :" + this.fechaenvasado);
        System.out.println("La fecha de caducidad es : "+this.Fechacaduca);
        System.out.println("El numero de Lote es :" + this.numerolote);
        System.out.println("El pais de origen es :"+this.paisorigen);
        
    }

    public void Mostrar2() {
        System.out.println("El nombre del producto es: "+this.nombre);
        System.out.println("La fecha de caducidad es :" + this.Fechacaduca);
        System.out.println("El numero de Lote es :" + this.numerolote);
        System.out.println("La fecha de envasado es :"+this.fechaenvasado);
        System.out.println("El pais de Origen es :"+this.paisorigen);
        System.out.println("La temperatura recomendada es: "+this.temprecomend);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getFechacaduca() {
        return Fechacaduca;
    }

    public void setFechacaduca(String Fechacaduca) {
        this.Fechacaduca = Fechacaduca;
    }

    public int getNumerolote() {
        return numerolote;
    }

    public void setNumerolote(int numerolote) {
        this.numerolote = numerolote;
    }

    public String getFechaenvasado() {
        return fechaenvasado;
    }

    public void setFechaenvasado(String fechaenvasado) {
        this.fechaenvasado = fechaenvasado;
    }

    public String getPaisorigen() {
        return paisorigen;
    }

    public void setPaisorigen(String paisorigen) {
        this.paisorigen = paisorigen;
    }

    public double getTemprecomend() {
        return temprecomend;
    }

    public void setTemprecomend(double temprecomend) {
        this.temprecomend = temprecomend;
    }

}
