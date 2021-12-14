/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

/**
 *
 * @author Dell
 */
public class PrincipalMapa {
    public static void main(String[] args) {
        Mapa mp = new Mapa();
        mp.insertar(0, "Hola soy el dato jsjsjsj");
        mp.insertar(1, "prueba");
        mp.insertar(2, "Juego quita vida");
        mp.insertar(3, "ya casi suena la alarma");
        
        System.out.println(mp.mapa);
        mp.actualizar(3, "por ahi maria");
        System.out.println(mp.mapa);
        mp.eliminar(1);
        System.out.println(mp.mapa);
        
    }
    
}
