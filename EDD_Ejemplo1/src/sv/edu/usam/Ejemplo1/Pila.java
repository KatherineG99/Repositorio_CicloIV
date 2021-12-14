
package sv.edu.usam.Ejemplo1;

public class Pila {
    private nodo raiz ;

    public Pila() {
        raiz = null;
    }
    
    public void Push(String elemento){
        nodo nuevo = new nodo();
        nuevo.info= elemento;
        if(raiz == null){
            nuevo.siguiente=null;
            raiz = nuevo;
        }else{
            nuevo.siguiente= raiz;
            raiz= nuevo;
        }
    }
    
    public void mostrar(){
        nodo recorridoPila = raiz;
       // System.out.println("(0)"+recorridoPila.info);
        while(recorridoPila!=null)
            {
                System.out.println("(0)"+recorridoPila.info);
                recorridoPila=recorridoPila.siguiente;
            }
        System.out.println();
    }
        
    public String Pop(){
        String inf="";
        if(raiz!= null){
            inf=raiz.info;
            raiz=raiz.siguiente;
            return inf;
        }else{
            System.out.println("Pila Vacia");
        }
        return inf;
    }
}
