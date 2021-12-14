package sv.edu.usam.Ejemplo2;

import static javafx.beans.binding.Bindings.convert;

public class Pila {
    public static void main(String[] args) {
        String miPila;
        miPila = new pila();
        int opcion;
        
        do {
            //nuevo.Clear();
            opcion = menu();
            
            switch (opcion){
                case 1:
            {
                String ref = null;
                agregar(ref miPila);
                    break;
                case 2:
                    eliminar(ref miPila);
                    break;
                case 3:
                    limpiar(ref miPila);
                    break;
                case 4:
                    imprimir(miPila);
                    break;
                case 5: break;
                default:
                    System.out.println("Error: La opcion no es valida. Intente de nuevo");
                    break;
                            
            }
        } while (opcion !=5);
        System.out.println("El programa ha finalizado");
        
    }

    public static void agregar(String ref) {
        System.out.println("\n Ingrese valor: ");
        try
        {
           int valor = valor. 
        }
    }   
}
