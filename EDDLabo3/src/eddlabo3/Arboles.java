
package eddlabo3;


public class Arboles {
    
    public Arboles(){
        System.out.println("Un árbol generico");
        
    }
    
    public Arboles(String tipo){
        System.out.println("Un árbol tipo "+tipo);
    }
    
    public Arboles(int altura){
        System.out.println("Un árbol de "+altura+" Metro");
    }
    
    public Arboles(int altura, String tipo){
        System.out.println("un "+tipo+" de "+altura+" Metros");
    }
}
