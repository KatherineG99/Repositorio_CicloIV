
package Modelo;


public class TablaBean {
    private int num1;
    private int num2;
    
    public void elaborarTabla(int num1){
        for(int i=1; i<=10 ;i++){
            System.out.println(num1+"*"+i+"="+(num1*i));
        }
    }
    public void tablasRango(int num1,int num2){
        
        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= 10; j++) {
                  System.out.println(i+"*"+i+"="+(i*j));
       
            }
        }
        
    }
    
   /*public void setnume(int num1){
       this.num1=num1;
    }
   public void getnume(){
    return elaborarTabla();
    }*/
   
}
