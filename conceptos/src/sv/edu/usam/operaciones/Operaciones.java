package sv.edu.usam.operaciones;

public class Operaciones {

 
    String[] X = new String[12];

    public Operaciones() {
     

    }

    public void llenar() {
        
        X[0] = "h";
        X[1] = "o";
        X[2] = "l";
        X[3] = "a";
        X[4] = " ";
        X[5] = "a";
        X[6] = " ";
        X[7] = "t";
        X[8] = "o";
        X[9] = "d";
        X[10] = "o";
        X[11] = "s";

    }
    
    public void Imprimir(int idx){
        System.out.println("El indice es : "+idx+" su valor en el arreglo es : "+X[idx]);
    }

}
