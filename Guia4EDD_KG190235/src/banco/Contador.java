
package banco;


public class Contador {
    private int cont;

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if(cont<0){
            this.cont = 0;
        }else{
            this.cont = cont;
        }
    }
    
    public Contador(){
        
    }

    public Contador(int cont) {
        if(cont<0){
            this.cont = 0;
        }else{
            this.cont = cont;
        }
        
    }
    
    public Contador(Contador c){
        cont =c.cont;
    }
    
    public void incrementar(){
        cont++;
    }
    
    public void decrementar(){
        cont--;
        if(cont<0){
            
            cont=0;
        }
    }
    
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        Contador contador = new Contador();
      
        int n;
        String opc;
        
        System.out.println("Introduzca un valor de inicio: ");                                     
        n = sc.nextInt();
       
        
        contador.setCont(n);
        
        do{
            System.out.println("Que desea hacer "
                    + "\n i - Incrementar el contador"
                    + "\n d - Decrementar el contador"
                    +" \n x - Salir");
            opc = sc.next().toUpperCase();
            
            switch(opc)
            {
                case "I":
                    contador.incrementar();
                    System.out.println(contador.getCont());
                    break;
                case "D":
                    contador.decrementar();
                    System.out.println(contador.getCont());
                    break;
                default:
                    break;     
            }
            
            
        }while(!opc.equals("X"));
        
        System.out.println("Valor final del contador "+contador.getCont());
        
    }*/
    
}
