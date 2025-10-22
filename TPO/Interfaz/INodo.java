package Interfaz;

/**
 * Interfaz que define operaciones básicas de un nodo genérico.
 *
 * @param <T> tipo de dato almacenado en el nodo
 *
 * <p><b>Precondiciones:</b>
 * <ul>
 *   <li>El dato del nodo no debe ser nulo.</li>
 * </ul>
 *
 * <p><b>Poscondiciones:</b>
 * <ul>
 *   <li>El nodo almacena correctamente el dato proporcionado.</li>
 * </ul>
 */
public interface INodo<T> {

    /**
     * Devuelve el valor almacenado en el nodo.
     *
     * <p><b>Precondición:</b> el nodo ha sido inicializado
     * <br><b>Poscondición:</b> retorna el dato almacenado
     *
     * @return dato del nodo
     */
    T getDato();

    /**
     * Devuelve una representación en cadena del nodo.
     *
     * <p><b>Precondición:</b> el nodo ha sido inicializado
     * <br><b>Poscondición:</b> retorna un String con el valor del nodo
     *
     * @return representación en cadena del nodo
     */
    String toString();
}
