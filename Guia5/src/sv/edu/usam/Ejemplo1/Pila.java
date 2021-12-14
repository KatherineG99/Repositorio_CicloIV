package sv.edu.usam.Ejemplo1;
public class Pila {
    private Nodo raiz;
    
    public void Push(String elemento){
        Nodo nuevo = new Nodo();
        nuevo.info = elemento;
        if (raiz==null) {
            nuevo.siguiente = null;
            raiz = nuevo;
        }else{
        nuevo.siguiente = raiz;
        raiz = nuevo;
        }
    }
    
    public void mostrar(){
    Nodo recorridoPila=raiz;
        //System.out.println("{0}"+recorridoPila.info);
        while(recorridoPila!=null){
            
            System.out.println("{0}"+recorridoPila.info);
            recorridoPila=recorridoPila.siguiente;
        }
        System.out.println();
    }
    
    public String Pop(){
    String inf="";
        if (raiz != null) {
            inf=raiz.info;
            raiz=raiz.siguiente;
            return inf;
        }else{
            System.out.println("Pila Vacia");
        }
        return inf;
    }
}
