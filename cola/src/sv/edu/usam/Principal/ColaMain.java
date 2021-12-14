/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.usam.Principal;

import sv.edu.usam.Raiz.Cola;

/**
 *
 * @author Dell
 */
public class ColaMain {
    
    public static void main(String[] args) {
        Cola objc = new Cola();
        objc.Insertar(1);
        objc.Insertar(2);
        objc.Insertar(6);
        objc.Insertar(8);
        
        objc.imprimr();
        
        objc.extraer();
        objc.imprimr();
        objc.extraer();
        objc.imprimr();
        objc.extraer();
        objc.imprimr();
        objc.extraer();
        objc.imprimr();
    }
    
    
    
    
}
