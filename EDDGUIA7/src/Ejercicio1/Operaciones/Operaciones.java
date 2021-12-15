package Ejercicio1.Operaciones;

public class Operaciones {

    Nodo raiz;

    public Operaciones() {
        raiz = null;
    }

    public void insertaPrimero(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.info = dato;
        nuevo.sig = raiz;
        if (raiz != null) {
            raiz.ant = nuevo;
        }
        raiz = nuevo;
    }

    public void imprimir() {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.println("<-I-> " + reco.info + " <-F->");
            reco = reco.sig;
        }
        System.out.println();
    }

    public void insertaFinal(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.info = dato;
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo reco = raiz;
            while (reco.sig != null) {
                reco = reco.sig;
            }
            reco.sig = nuevo;
            nuevo.ant = reco;
        }
    }

    public void insertarseg(int dato) {
        if (!vacia()) {
            Nodo nuevo = new Nodo();
            nuevo.info = dato;
            if (raiz.sig == null) {
                raiz.sig = nuevo;
                nuevo.ant = raiz;
            } else {
                Nodo siguiente = raiz.sig;
                nuevo.sig = siguiente;
                siguiente.ant = nuevo;
                raiz.sig = nuevo;
                nuevo.ant = raiz;
            }
        }
    }

    public void insertaAUltimo(int dato) {
        if (!vacia()) {
            Nodo nuevo = new Nodo();
            nuevo.info = dato;
            if (raiz.sig == null) {
                nuevo.sig = raiz;
                raiz = nuevo;
            } else {
                Nodo reco = raiz;
                while (reco.sig != null) {
                    reco = reco.sig;
                }
                Nodo anterior = reco.ant;
                nuevo.sig = reco;
                nuevo.ant = anterior;
                anterior.sig = nuevo;
                reco.ant = nuevo;
            }
        }
    }

    public void borar1() {
        if (!vacia()) {
            raiz = raiz.sig;
            if (!vacia()) {
                raiz.ant = null;
            }
        }
    }

    public void borrar2() {
        if (!vacia()) {
            if (raiz.sig != null) {
                Nodo tercerval = raiz.sig;
                tercerval = tercerval.sig;
                raiz.sig = tercerval;
                if (tercerval != null) {
                    tercerval.ant = raiz;

                }
            }
        }
    }

    public void borrarUltimo(){
        if(!vacia()){
            if(raiz.sig==null){
                raiz=null;
            }else{
                Nodo reco=raiz;
                while(reco.sig!=null){
                    reco=reco.sig;
                }
                reco=reco.ant;
                reco.sig=null;
            }
        }
    }
    
    public void borrarMayor(){
        if(!vacia()){
            Nodo reco=raiz;
            int mayor=raiz.info;
            while(reco!=null){
                if(reco.info>mayor){
                    mayor=reco.info;
                }
                reco=reco.sig;
            }
            reco=raiz;
            while(reco!=null){
                if(reco.info==mayor){
                    if(reco==raiz){
                        raiz=raiz.sig;
                        if(raiz!=null){
                            raiz.ant=null;
                        }
                        reco=raiz;
                    }else{
                        Nodo anterior=reco.ant;
                        anterior.sig=reco.sig;
                        reco=reco.sig;
                        if(reco!=null){
                            reco.ant=anterior;
                        }
                    }
                }else{
                    reco=reco.sig;
                }
            }
        }
    }
    
    public boolean vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

   

}
