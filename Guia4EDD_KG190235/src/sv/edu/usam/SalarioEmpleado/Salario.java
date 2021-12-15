
package sv.edu.usam.SalarioEmpleado;

public class Salario {
    private int diasLaborados;

    public int getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(int diasLaborados) {
        this.diasLaborados = diasLaborados;
    }
    
    public double CalcularSalario(int diaslab,double valordia){
        double totalsalario = diaslab * valordia;
        return totalsalario;
            }
    
    
}
