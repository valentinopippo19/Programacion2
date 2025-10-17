package Modulo;

/**
 * Clase que implementa una lista enlazada genérica simple.
 *
 * @param <T> tipo de datos que almacena la lista
 */
public class MiLista<T> {

    private NodoLista<T> cabeza;
    private int size;

    /**
     * Clase interna que representa un nodo de la lista.
     *
     * @param <T> tipo de dato del nodo
     */
    private static class NodoLista<T> {
        T dato;
        NodoLista<T> siguiente;

        /**
         * Constructor de nodo con un dato.
         *
         * @param dato valor a almacenar en el nodo
         */
        NodoLista(T dato) {
            this.dato = dato;
        }
    }

    /**
     * Agrega un elemento al final de la lista.
     *
     * @param dato elemento a agregar
     */
    public void agregar(T dato) {
        NodoLista<T> nodo = new NodoLista<>(dato);
        if (cabeza == null) cabeza = nodo;
        else {
            NodoLista<T> temp = cabeza;
            while (temp.siguiente != null) temp = temp.siguiente;
            temp.siguiente = nodo;
        }
        size++;
    }

    /**
     * Devuelve el elemento en la posición indicada.
     *
     * @param index posición del elemento a obtener
     * @return el elemento en la posición index, o null si el índice es inválido
     */
    public T obtener(int index) {
        if (index < 0 || index >= size) return null;
        NodoLista<T> temp = cabeza;
        for (int i = 0; i < index; i++) temp = temp.siguiente;
        return temp.dato;
    }

    /**
     * Devuelve la cantidad de elementos en la lista.
     *
     * @return número de elementos de la lista
     */
    public int size() {
        return size;
    }

    /**
     * Devuelve una representación en cadena de la lista.
     *
     * @return cadena con los elementos de la lista entre corchetes
     */
    public String toString() {
        String s = "[";
        NodoLista<T> temp = cabeza;
        while (temp != null) {
            s += temp.dato;
            if (temp.siguiente != null) s += ", ";
            temp = temp.siguiente;
        }
        s += "]";
        return s;
    }
}
