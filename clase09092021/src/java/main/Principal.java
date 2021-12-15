package main;

import herencia.Abstracta;
import herencia.UsuarioA;

public class Principal {
    
    public static void main(String[] args) {
        UsuarioA userA = new UsuarioA();
        
        System.out.println("La suma es: " + userA.sumar(10, 30));
        Abstracta abs = new Abstracta(){

            @Override
            public void suma() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
    }
}
