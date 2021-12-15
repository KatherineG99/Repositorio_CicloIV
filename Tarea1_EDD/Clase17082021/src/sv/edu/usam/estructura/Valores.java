
package sv.edu.usam.estructura;

public class Valores {
    private double valor1;
    private double valor2;
    private Object oper;

    public Valores() {
        this.valor1=0;
        this.valor2=0;
        this.oper=0;
    }
    

    // Object no definido string, int, double

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public Object getOper() {
        return oper;
    }

    public void setOper(Object oper) {
        this.oper = oper;
    }
}
