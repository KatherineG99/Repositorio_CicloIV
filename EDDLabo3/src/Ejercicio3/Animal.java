
package Ejercicio3;

import javax.swing.JOptionPane;


public class Animal {
    public String nombre,alimento;
    public int edad;
    
    public void ingresodatos(){
        nombre=JOptionPane.showInputDialog("Ingrese el Nombre del animal");
        alimento = JOptionPane.showInputDialog("Ingrese el alimento de el animal");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de el animal(el numero de meses que tiene)"));
    }
    public void mostrardatos(){
        JOptionPane.showConfirmDialog(null, "Los datos ingresados son los siguientes: \n "+nombre+"\n alimentacion de "+alimento+"\n Con edad de : "+edad);
    }
}

class Gallo extends Animal{
    protected String colorPlumas;
    protected String altura;
    
    public void ingresoG(){
        ingresodatos();
        colorPlumas =JOptionPane.showInputDialog("Ingrese el color de plumas del gallo");
        altura = JOptionPane.showInputDialog("Ingrese la altura de su gallo");
    }
    public void mostraG(){
        mostrardatos();
        JOptionPane.showConfirmDialog(null, "Los datos distintivos son los siguientes: \n Color de plumas "+colorPlumas+"\n con altura de "+altura ); 
    }
    
}

class Perro extends Animal{
    protected String colorpelaje;
    protected String raza;
    
     public void ingresoP(){
        ingresodatos();
        colorpelaje =JOptionPane.showInputDialog("Ingrese el color del eplaje del perro");
        raza = JOptionPane.showInputDialog("Ingrese la raza de su perro");
    }
    public void mostraP(){
        mostrardatos();
        JOptionPane.showConfirmDialog(null, "Los datos distintivos son los siguientes: \n Coloe de pelaje"+colorpelaje+"\n de raza "+raza ); 
    }
}

class Gato extends Animal{
    protected String colorpelaje;
    protected String colorojos;
    
     public void ingresoGat(){
        ingresodatos();
        colorpelaje =JOptionPane.showInputDialog("Ingrese el color de pelaje de su gato");
        colorojos = JOptionPane.showInputDialog("Ingrese el color de ojos de su gatito");
    }
    public void mostraGat(){
        mostrardatos();
        JOptionPane.showConfirmDialog(null, "Los datos distintivos son los siguientes: \n El color de pelaje "+colorpelaje+"\n con color de ojos "+colorojos ); 
    }
}

class Hamster extends Animal{
    protected String colorpelaje;
    protected Double peso;
    
     public void ingresoH(){
        ingresodatos();
        colorpelaje =JOptionPane.showInputDialog("Ingrese el color del pelaje de su hamster");
        peso =Double.parseDouble( JOptionPane.showInputDialog("Ingrese el peso de su hamster"));
    }
    public void mostraH(){
        mostrardatos();
        JOptionPane.showConfirmDialog(null, "Los datos distintivos son los siguientes: \n El color de su pelaje "+colorpelaje+"\n con peso de "+peso ); 
    }
}

