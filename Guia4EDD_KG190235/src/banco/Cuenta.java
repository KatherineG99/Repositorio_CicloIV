
package banco;


public class Cuenta {
   private String Nombrecliente;
   private String numcuenta;
   private double tipoint;
   private double saldo; 

    public String getNombrecliente() {
        return Nombrecliente;
    }

    public void setNombrecliente(String Nombrecliente) {
        this.Nombrecliente = Nombrecliente;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta =numcuenta;
    }

    public double getTipoint() {
        return tipoint;
    }

    public void setTipoint(double tipoint) {
        this.tipoint = tipoint;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Cuenta(){
    
    }

    public Cuenta(String Nombrecliente, String numcuenta, double tipoint, double saldo) {
        this.Nombrecliente = Nombrecliente;
        this.numcuenta = numcuenta;
        this.tipoint = tipoint;
        this.saldo = saldo;
    }
    
    
    public Cuenta( Cuenta c){
         Nombrecliente = c.Nombrecliente;
         numcuenta = c.numcuenta;
         tipoint = c.tipoint;
         saldo = c.saldo;
    }
    
    public boolean ingreso(double in){
        boolean ingreso = true;
        if(in<0)
        {
            ingreso= false;
        }else
        {
            saldo= saldo +in;
        }
        
        return ingreso;
    }
    
    public boolean reintegro(double re){
        boolean reintegro = true;
        if(re<0)
        {
            reintegro= false;
        }else if( saldo>=re)
        {
            saldo-=re;
        }else
        {
            reintegro= false;
        }
        
        return reintegro;
    }
    
    public boolean transferencia(Cuenta c, double tra){
        boolean transferencia = true;
        if(tra<0){
            transferencia= false;
        }else if(saldo>= tra){
            reintegro(tra);
            c.ingreso(tra);
        }else{
            transferencia = false;
        }
        
        return transferencia;
    }

    
    /*public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

 
        Cuenta cuenta1 = new Cuenta();

        System.out.print("Digita tu nombre de usuario : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("Tipo de interes de su banco : ");
        tipo = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();

        cuenta1.setNombrecliente(nombre);
        cuenta1.setNumcuenta(numero);
        cuenta1.setTipoint(tipo);
        cuenta1.setSaldo(importe);


        Cuenta cuenta2 = new Cuenta("Ariel Gomez", "152635896541", 5.00, 300);                       


        


        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombrecliente());
        System.out.println("Número de cuenta: " + cuenta1.getNumcuenta());
        System.out.println("Tipo de interés: " + cuenta1.getTipoint());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();


        cuenta1.ingreso(4000);


        System.out.println("Saldo: " + cuenta1.getSaldo());


        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.getNombrecliente());
        System.out.println("Número de cuenta: " + cuenta2.getNumcuenta());
        System.out.println("Tipo de interés: " + cuenta2.getTipoint());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();




        cuenta1.transferencia(cuenta2, 10);


        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();


        System.out.println("Saldo de la cuenta 1");
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();
    }*/
   
}
