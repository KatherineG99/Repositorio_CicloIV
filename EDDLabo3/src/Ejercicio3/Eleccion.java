
package Ejercicio3;

import javax.swing.JOptionPane;

public class Eleccion {
    public void Principal(){
        Gallo g = new Gallo();
        Perro p = new Perro();
        Gato gt = new Gato();
        Hamster h= new Hamster();
        int opcion=0;
        do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog("Que animal desea registrar? \n Un Gallo(1)\n Un perro(2) \n un gato(3) \n Un hamster(4) \n Salir(0)"));
    
            switch(opcion){
                case(1):
                    g.ingresoG();
                    g.mostraG();
        
        
                    break;
                case(2):
                    p.ingresoP();
                    p.mostraP();
        
        
                    break;
                case(3) :
                    gt.ingresoGat();
                    gt.mostraGat();
       
        
                    break;
                case(4):
                    h.ingresoH();
                    h.mostraH();
                    break;
                default:
                    break;
            }
            if(opcion==0){
            break;
            }
        }while(opcion>=1 || opcion<=4);
        
    }
}
