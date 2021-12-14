package Ejercicio1;

/**
 *
 * @author Katherine Gomez
 */
public final class Congelados extends Productos {

    private String metodocongelacion;

    public String getMetodocongelacion() {
        return metodocongelacion;
    }

    public void setMetodocongelacion(String metodocongelacion) {
        this.metodocongelacion = metodocongelacion;
    }

    public Congelados(String nombre,String Fechacaduca, int numerolote, String fechaenvasado, String paisorigen, double temprecomend, String metodocongelacion) {
        super(nombre,Fechacaduca,numerolote, fechaenvasado, paisorigen,temprecomend);
        this.metodocongelacion = metodocongelacion;
        if (null != metodocongelacion) 
        switch (metodocongelacion) {
            case "aire":
                Aire();
                break;
            case "agua":
                Agua();
                break;
            case "nitrogeno":
                Nitrogeno();
                break;
            default:
                break;
        }
        {

        }
    }

    public void Aire() {
        int nitrogeno = 0;
        int oxigeno = 0;
        int carbono = 0;
        int vaporagua = 0;

        System.out.println("El porcentaje de Nitrogeno es : " + nitrogeno + "%");
        System.out.println("El porcentaje de Oxigeno es : " + oxigeno + "%");
        System.out.println("El porcentaje de Dioxido de carbono es : " + carbono + "%");
        System.out.println("El porcentaje de Vapor de agua es : " + vaporagua + "%");
    }

    public void Agua() {
        int gramos = 0;
        int litros = 0;

        System.out.println("La salinidad de la congelacion es " + gramos + " de sal por " + litros + " litros de agua");
    }

    public void Nitrogeno() {
        int segundos = 0;
        int grados = 0;
        System.out.println("La congelacion se llevo a : " + grados + " grados por unos " + segundos + " segundos");
    }

}
