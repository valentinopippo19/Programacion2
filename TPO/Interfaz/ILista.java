package Interfaz;

/**
 * Interfaz que define operaciones básicas de una lista enlazada genérica.
 *
 * @param <T> tipo de dato almacenado en la lista
 *
 * <p><b>Precondiciones generales:</b>
 * <ul>
 *   <li>Los datos agregados no deben ser nulos.</li>
 * </ul>
 *
 * <p><b>Poscondiciones generales:</b>
 * <ul>
 *   <li>La lista mantiene todos los elementos en el orden correcto.</li>
 * </ul>
 *
 * <p><b>Axiomas:</b>
 * <ul>
 *   <li>Agregar un elemento incrementa el tamaño de la lista en 1.</li>
 * </ul>
 */
public interface ILista<T> {

    /**
     * Agrega un elemento al final de la lista.
     *
     * <p><b>Precondición:</b> dato != null
     * <br><b>Poscondición:</b> La lista contiene el nuevo elemento al final.
     *
     * @param dato elemento a agregar
     */
    void agregar(T dato);

    /**
     * Elimina un elemento de la lista.
     *
     * <p><b>Precondición:</b> dato != null y existe en la lista
     * <br><b>Poscondición:</b> El elemento ya no está en la lista, y el tamaño se reduce en 1.
     *
     * @param dato elemento a eliminar
     */
    void eliminar(T dato);

    /**
     * Devuelve el elemento en la posición indicada.
     *
     * <p><b>Precondición:</b> 0 <= index < tamaño de la lista
     * <br><b>Poscondición:</b> Retorna el elemento correcto.
     *
     * @param index posición del elemento
     * @return elemento en la posición index
     */
    T obtener(int index);

    /**
     * Devuelve la cantidad de elementos en la lista.
     *
     * @return tamaño de la lista
     */
    int tamaño();

    /**
     * Verifica si la lista contiene un elemento específico.
     *
     * @param dato elemento a buscar
     * @return true si la lista contiene el elemento, false en caso contrario
     */
    boolean contiene(T dato);
}
