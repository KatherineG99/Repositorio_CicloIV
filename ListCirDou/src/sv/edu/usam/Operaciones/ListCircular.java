package sv.edu.usam.Operaciones;

public class ListCircular {

    Nodo nuevo;
    Nodo aux;
    Nodo inicio;

    public ListCircular() {
        inicio = null;
    }
    
    

    public void insertarInicio(int dato) {
        nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;

        } else {
            aux = inicio;
            while (aux.getSiguiente() == inicio) {
                aux = aux.getSiguiente();

            }

            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void insertarFinal(int dato) {
        nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;

        } else {
            aux = inicio;
            while (aux.getSiguiente() != inicio) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);

        }
    }

    public void imprimir() {
        if (inicio == null) {
            System.out.println("<--> NULL <-->");
        } else {
            Nodo aux = inicio;
            System.out.println("<--> Inicio" + aux.getDato());

            do{
                
                System.out.println("<-->" + aux.getDato());
                
                aux = aux.getSiguiente();
            } while (aux != inicio);
            System.out.println("<--> NULL <-->");

        }
    }

    public void ordenar(int dato) {

    }

}
