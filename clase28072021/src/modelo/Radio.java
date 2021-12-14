
package modelo;


public class Radio {
    private int Volumen;
    private double estacion;
    
    public Radio(){
        
    }
    
    public void subirVolumen(){
        System.out.println("subiendo volumen "+ Volumen);
    }
    public void bajarVolumen(){
        System.out.println("bajando volumen "+ Volumen);
    }
    public void cambiarEstacion(){
        if(estacion==92.5){
            System.out.println("Cambiando estacion a Club");
        }
        if(estacion==100.1){
            System.out.println("cambiando estacion a ABC");
        }
        System.out.println("cambiando estacion N."+ estacion);
    }
    public void encender(){
        System.out.println("encendiendo");
    }
    public void apagar(){
        System.out.println("apagando.......");
    }
    public void setVolumen(int Volumen){
        this.Volumen=Volumen;
        if(this.Volumen<1){
            apagar();
        }
    }
    public int getVolumen(){
        return Volumen;
    }
    public void setestacion(double estacion){
        this.estacion=estacion;
        
    }
    public double getestacion(){
        return estacion;
    }
    
    
}
