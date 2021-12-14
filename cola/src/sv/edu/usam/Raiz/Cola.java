
package sv.edu.usam.Raiz;


public class Cola {
    private Nodo raiz, fondo;
    
    
    public Cola(){
        raiz = null;
        fondo = null;
    }
    
    public boolean Vacio(){
        if(raiz== null){
            return true;
        }else{
            return false;
        }
    }
    
    public void Insertar(int x){
        Nodo nuevo = new Nodo();
        nuevo.info=x;
        nuevo.siguiente=null;
        if(Vacio()){
            raiz= nuevo;
            fondo= nuevo;
            
        }else{
            fondo.siguiente=nuevo;
            fondo=nuevo;
        }
        
        
    }
    public int extraer(){
        int infor;   
        if(!Vacio()) {
            infor= raiz.info;
            if(raiz==fondo){
                 raiz=null;
                 fondo= null;
                 
            }
            else{
                raiz=raiz.siguiente;   
            }
          return infor;  
        }else{
    return Integer.MAX_VALUE;
    }
    
    }
    
    public void imprimr(){
        Nodo recorrido = raiz;
        System.out.println("Los elementos de la cola son :");
        while(recorrido!=null){
            System.out.println(recorrido.info+"_");
            recorrido = recorrido.siguiente;
        }
        System.out.println("");
    }
}
