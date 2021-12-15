
package guia3;
import java.text.DecimalFormat;

public class Tiempo1 extends Object {
    private int horas;
    private int minuto;
    private int segundo;
    
    public Tiempo1(){
        establecerHora(0, 0, 0);
    }
    
    public void establecerHora(int h, int m, int s){
        horas =((h >= 0 &&  h < 24) ? h : 0);
        minuto = ((m>=0 && m<60)? m: 0);
        segundo=((s>=0 && s<60)?s:0);
    }
    
    public String aStringUniversal(){
        DecimalFormat dosDigitos=new DecimalFormat("00");
        return dosDigitos.format(horas)+":" + dosDigitos.format(minuto)+":"
                +dosDigitos.format(segundo);
    }
    
    public String aStringEstandar(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        return((horas==12 ||  horas==0)? 12: horas %12)+":"+dosDigitos.format(minuto)+":"
                +dosDigitos.format(segundo)+(horas<12?"AM":"PM");
    }
}
