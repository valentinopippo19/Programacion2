// ------------------------------
// Archivo: interfaz/Inodo.java
// ------------------------------

package interfaz;

/**
 * Interfaz que define las operaciones de un nodo en una lista doblemente enlazada.
 */
public interface Inodo {

    /**
     * Obtiene el dato almacenado en el nodo.
     *
     * @return objeto contenido en el nodo
     */
    Object getDato();

    /**
     * Establece el dato del nodo.
     * Precondición: dato != null
     *
     * @param dato objeto a almacenar
     */
    void setDato(Object dato);

    /**
     * Obtiene el nodo siguiente.
     *
     * @return nodo siguiente, o null si no existe
     */
    Inodo getSiguiente();

    /**
     * Establece el nodo siguiente.
     *
     * @param nodo nodo que será el siguiente
     */
    void setSiguiente(Inodo nodo);

    /**
     * Obtiene el nodo anterior.
     *
     * @return nodo anterior, o null si no existe
     */
    Inodo getAnterior();

    /**
     * Establece el nodo anterior.
     *
     * @param nodo nodo que será el anterior
     */
    void setAnterior(Inodo nodo);
}