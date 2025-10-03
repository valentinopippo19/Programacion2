// ------------------------------
// Archivo: Modulo/NodoArbol.java
// ------------------------------

package modulo;

/**
 * Clase que representa un nodo de un Árbol Binario de Búsqueda (ABB).
 * 
 * @param <T> tipo de dato almacenado en el nodo, debe ser Comparable en el árbol
 */
public class NodoArbol<T> {

    // Dato almacenado en el nodo
    private T dato;

    // Referencia al subárbol izquierdo
    private NodoArbol<T> izquierdo;

    // Referencia al subárbol derecho
    private NodoArbol<T> derecho;

    /**
     * Constructor que inicializa un nodo con un dato.
     * Precondición: dato != null
     * Postcondición: se crea un nodo con dato y sin hijos.
     *
     * @param dato valor a almacenar en el nodo
     */
    public NodoArbol(T dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }

    /**
     * Devuelve el dato almacenado en el nodo.
     *
     * @return dato del nodo
     */
    public T getDato() {
        return dato;
    }

    /**
     * Devuelve el subárbol izquierdo del nodo.
     *
     * @return nodo izquierdo o null si no existe
     */
    public NodoArbol<T> getIzquierdo() {
        return izquierdo;
    }

    /**
     * Devuelve el subárbol derecho del nodo.
     *
     * @return nodo derecho o null si no existe
     */
    public NodoArbol<T> getDerecho() {
        return derecho;
    }

    /**
     * Asigna un subárbol izquierdo al nodo.
     *
     * @param izquierdo nodo a colocar a la izquierda
     */
    public void setIzquierdo(NodoArbol<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    /**
     * Asigna un subárbol derecho al nodo.
     *
     * @param derecho nodo a colocar a la derecha
     */
    public void setDerecho(NodoArbol<T> derecho) {
        this.derecho = derecho;
    }
}
