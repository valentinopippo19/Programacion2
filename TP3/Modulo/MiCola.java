package Modulo;

/**
 * Clase que implementa una cola genérica (FIFO) utilizando nodos enlazados.
 *
 * @param <T> tipo de datos que almacena la cola
 */
public class MiCola<T> {

    private NodoCola<T> frente;
    private NodoCola<T> fin;

    /**
     * Clase interna que representa un nodo de la cola.
     *
     * @param <T> tipo de dato del nodo
     */
    private static class NodoCola<T> {
        T dato;
        NodoCola<T> siguiente;

        /**
         * Constructor del nodo de la cola.
         *
         * @param dato valor a almacenar en el nodo
         */
        NodoCola(T dato) {
            this.dato = dato;
        }
    }

    /**
     * Agrega un elemento al final de la cola.
     *
     * @param dato elemento a encolar
     */
    public void encolar(T dato) {
        NodoCola<T> nodo = new NodoCola<>(dato);
        if (fin != null) {
            fin.siguiente = nodo;
        }
        fin = nodo;
        if (frente == null) {
            frente = fin;
        }
    }

    /**
     * Retira y devuelve el elemento al frente de la cola.
     *
     * @return el elemento en el frente de la cola, o null si la cola está vacía
     */
    public T desencolar() {
        if (frente == null) return null;
        T dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        return dato;
    }

    /**
     * Indica si la cola está vacía.
     *
     * @return true si la cola no contiene elementos, false en caso contrario
     */
    public boolean estaVacia() {
        return frente == null;
    }
}
