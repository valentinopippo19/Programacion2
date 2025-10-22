package Modulo;

/**
 * Clase que representa un nodo genérico para estructuras de datos como listas o grafos.
 *
 * @param <T> tipo de dato almacenado en el nodo
 */
public class Nodo<T> {

    private T dato;

    /**
     * Constructor que crea un nodo con el dato proporcionado.
     *
     * @param dato valor a almacenar en el nodo
     */
    public Nodo(T dato) {
        this.dato = dato;
    }

    /**
     * Devuelve el valor almacenado en el nodo.
     *
     * @return dato almacenado en el nodo
     */
    public T getDato() {
        return dato;
    }

    /**
     * Devuelve una representación en cadena del nodo.
     *
     * @return cadena con el valor del nodo
     */
    @Override
    public String toString() {
        return dato.toString();
    }
}
