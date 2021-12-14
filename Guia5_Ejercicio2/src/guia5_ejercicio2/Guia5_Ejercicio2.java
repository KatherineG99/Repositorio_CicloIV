
package guia5_ejercicio2;

import java.io.Console;
import java.util.Stack;

public class Guia5_Ejercicio2 {

   
     static void main(String[] args) {
        Stack mipila= new Stack(); 
        
        int opcion;
        
        do{
            Console.Clear();
            opcion = menu();
            
            switch(opcion)
                {
                case 1:
                    agregar(ref mipila);
                    break;
                case 2: 
                    eliminar(ref mipila);
                    break;
                case 3:
                    limpiar(ref mipila);
                    break;
                case 4 :
                    imprimir(mipila);
                    break;
                case 5:
                    break;
                default:
                    mensaje("ERROR: la opcion noes valida. Intente de nuevo.");
                    break;
            }
            
        }while(opcion !=5);
        mensaje("El programa ah finalizado.");
        
    }
    
    static void agregar(ref Stack pila)
    {
        Console.Write(" >Ingrese valor:");
        try
            {
                int valor = Convert.ToInt32(Console.ReadLine());
                if(valor > 99 || valor <= 0)
                    {
                        mensaje("Solo numeros del 1 al 99");
                    }
                else{
                    pila.Push(valor);
                    imprimir(pila);
                }
                
            }
        catch(Exception e){
            mensaje("ERROR: solo numeros del 1 al 99");
            
        }
    }
    
    static void limpiar(ref Stack pila)
    {
        pila.Clear();
        imprimir(pila);
    }
    
    static void eliminar(ref Stack pila)
    {
        if(pila.Count>0)
            {
                int Valor=(int)pila.Pop();
                mensaje("Elemento "+valor+"eliminado");
            }else
            {
                imprimir(pila);
            }
    }
    
    static inr menu()
}
