
package main;

import Herencia.UsuarioaA;


public class Principal {
    public static void main(String[] args) {
        UsuarioaA userA = new UsuarioaA();
        
        userA.borra();
        userA.setId(10);
        System.out.println("el id es : "+userA.getId());
        System.out.println("el valor suma es :"+userA.sumar());
    }
    
}
