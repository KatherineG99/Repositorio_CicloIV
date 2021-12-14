
package Ejercicio2.Operaciones;


public class Lista {
     private Nodo raiz;
     
     public Lista() {
        raiz=null;
    }

    public void insertarinicio(int num,String nombre) {
        Nodo nuevo = new Nodo();
        nuevo.info = num;
        nuevo.empleado= nuevo.info+" "+nombre;
        if (raiz == null) {
            raiz = nuevo;
        } else {

            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }

    public void imprimir() {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.println(reco.empleado + " ");
            reco = reco.sig;
        }
        System.out.println();
    }

    public void insertarultimo(int num2,String nombre) {
        Nodo nuevo = new Nodo();
        nuevo.info = num2;
         nuevo.empleado= nuevo.info+" "+nombre;
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo reco = raiz;
            while (reco.sig != null) {
                reco = reco.sig;
            }
            reco.sig = nuevo;

        }
    }

    public void insertarseg(int segundo,String nombre) {
        if (!vacia()) {
            Nodo nuevo = new Nodo();
            nuevo.info = segundo;
             nuevo.empleado= nuevo.info+" "+nombre;
            if (raiz.sig == null) {
                raiz.sig = nuevo;

            } else {

                nuevo.sig = raiz.sig;
                raiz.sig = nuevo;

            }
        }

    }

    public void insertarAUltimo(int num3,String nombre) {
        if (!vacia()) {
            Nodo nuevo = new Nodo();
            nuevo.info = num3;
             nuevo.empleado= nuevo.info+" "+nombre;
            if (raiz.sig == null) {
                nuevo.sig = raiz;
                raiz = nuevo;
            } else {

                Nodo reco = raiz.sig;
                Nodo anterior = raiz;
                while (reco.sig != null) {
                    anterior = reco;
                    reco = reco.sig;
                }
                nuevo.sig = anterior.sig;
                anterior.sig = nuevo;
            }
        }
    }

    public void borrar1() {
        if (raiz != null) {
            raiz = raiz.sig;
        }
    }

    public void borrarUltimo() {
        if (!vacia()) {
            if (raiz.sig == null) {
                raiz = null;
            } else {
                Nodo reco = raiz.sig;
                Nodo anterior = raiz;
                while (reco.sig != null) {
                    anterior = reco;
                    reco = reco.sig;
                }
                anterior.sig = null;
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

    public void borarmayor() {
        if (!vacia()) {
            int may = raiz.info;
            Nodo reco = raiz;
            while (reco != null) {
                if (reco.info > may) {
                    may = reco.info;
                }
                reco = reco.sig;

            }
           reco=raiz;
           Nodo anterior = raiz;
           while(reco!=null){
               if (reco.info==may) {
                   if (reco==raiz) {
                       raiz=raiz.sig;
                       anterior=raiz;
                       reco=raiz;
                   }else{
                       anterior.sig=reco.sig;
                       reco=reco.sig;
                   }
               }else{
                   anterior=reco;
                   reco=reco.sig;
               }
           }
        } 
    }
    
    public void borrar2(){
        if(!vacia()){
             if(raiz.sig!=null){
                 Nodo anterior = raiz.sig;
                 anterior=anterior.sig;
                 raiz.sig=anterior;
             } 
        }
    }
}
