
package modelo;


public class Tabla {
    private double numero1;
    private double numero2;
    
    private double res;
    
    public void multi(int num1, int num2){
        res=num1*num2;
        System.out.println("el resultado es: "+res);
    }
    public void calcularTabla(int num){
        double res=num*1;
        System.out.println(num+"* 1 = "+res);
        double res2=num*2;
        System.out.println(num+"* 2 = "+res2);
        double res3=num*3;
        System.out.println(num+"* 3 = "+res3);
        double res4=num*4;
        System.out.println(num+"* 4 = "+res4);
        double res5=num*5;
        System.out.println(num+"* 5 = "+res5);
        double res6=num*6;
        System.out.println(num+"* 6 = "+res6);
        double res7=num*7;
        System.out.println(num+"* 7 = "+res7);
        double res8=num*8;
        System.out.println(num+"* 8 = "+res8);
        double res9=num*9;
        System.out.println(num+"* 9 = "+res9);
        double res10=num*10;
        System.out.println(num+"* 10 = "+res10);
    }
    
}
