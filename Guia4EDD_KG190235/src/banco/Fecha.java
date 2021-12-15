
package banco;


public class Fecha {
    private int dia, mes , año;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public Fecha(){
        
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    private boolean Bisiesto(){
        return(año / 4 == 0 && año / 100 != 0 || año /400 == 0);
    }
    
    public boolean fechacor(){
        boolean diac,mesc,añoc;
        añoc= año>0;
        mesc=mes>=1 && mes<=12;
        
        switch (mes) {
            case 2:
                if (Bisiesto()) {
                    diac = dia >= 1 && dia <= 29;
                } else {
                    diac = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
                diac = dia >= 1 && dia <= 30;
                break;
            case 6:
                diac = dia >= 1 && dia <= 30;
                break;
            case 9:
                diac = dia >= 1 && dia <= 30;
                break;
            case 11:
                diac = dia >= 1 && dia <= 30;
                break;
            default:
                diac = dia >= 1 && dia <= 31;
        }
     return diac && mesc && añoc;
    }
    
    public void Dsiguiente(){
        dia++;
        if(!fechacor()){
            dia=1;
            mes++;
            if(!fechacor()){
                mes=1;
                año++;
            }
        }
    }
    
   
    @Override
    public String toString(){
        String nd,md,final1;
        if (dia< 10){
            nd=("0"+dia);
        }else{
            nd=String.valueOf(dia);
        }
        final1=(nd+"-");
        if(mes<10){
            md=("0"+mes);
        }else{
            md= String.valueOf(mes);
        }
        final1=final1+md+"-"+año;
        
        return final1;
        
        
        
    }
    
    
    
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, m, a;

        
        System.out.println("Introduce fecha: ");
        System.out.print("dia: ");
        d = sc.nextInt();
        System.out.print("mes: ");
        m = sc.nextInt();
        System.out.print("año: ");
        a = sc.nextInt();

      
        Fecha fecha = new Fecha(d,m,a);

        if (fecha.fechacor()) { 

           
            System.out.println("Fecha introducida: " + fecha);

                                          
            System.out.println("Los 10 días siguientes son:");
            for (int i = 1; i <= 30; i++) {
                fecha.Dsiguiente();
                System.out.println(fecha);
            }

        } else { 
            System.out.println("Fecha no valida");
        }
    }*/
    
}
