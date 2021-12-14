/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivo;

/**
 *
 * @author Dell
 */
public class Recursivo {
    
    public void repetir(){
        repetir();
    }
    
    public int factorial(int dato){
        if(dato>0){
        int valor = dato*factorial(dato-1);
        return valor;
        }else{
            return 1;
        }
    }
    
    public void mostrar(int dato){
        if(dato>0){
            System.out.println(dato);
            mostrar(dato - 1);  
        }
       
    }
    
    
}
