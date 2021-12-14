package sv.edu.usam.ListasDinamicas;

public class ListaGenerica {

    Nodo raiz;

    public ListaGenerica() {
        raiz = null;
    }

    void insertar(int pos, int valor) {

        if (pos <= cantidad() + 1) {
            Nodo nuevo = new Nodo();
            nuevo.info = valor;
            if (pos == 1) {
                nuevo.siguiente=raiz;
            }
        }

    }

    int extraer() {
        return 0;
    }

    void intercambio() {
    }

    int posicMayor() {
        return 0;
    }

    int cantidad() {
        return 0;
    }

    boolean ordenad() {
        return false;
    }

    boolean vacia() {
        return false;
    }

    public void imprimir() {
    }

}
