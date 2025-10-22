package Interfaz;

/**
 * Interfaz que define las operaciones básicas de una arista genérica en un grafo.
 *
 * @param <T> tipo de nodo que conecta la arista
 *
 * <p><b>Precondiciones generales:</b>
 * <ul>
 *   <li>Los nodos 'desde' y 'hacia' no deben ser nulos.</li>
 *   <li>El peso de la arista debe ser mayor o igual a cero.</li>
 * </ul>
 *
 * <p><b>Poscondiciones generales:</b>
 * <ul>
 *   <li>La arista mantiene los nodos de origen y destino correctos.</li>
 *   <li>El peso de la arista permanece inalterado tras su creación.</li>
 * </ul>
 *
 * <p><b>Axiomas:</b>
 * <ul>
 *   <li>Una arista conecta exactamente dos nodos distintos o iguales dependiendo del grafo.</li>
 *   <li>El peso refleja correctamente la magnitud asignada al crear la arista.</li>
 * </ul>
 */
public interface IArista<T> {

    /**
     * Devuelve el nodo de origen de la arista.
     *
     * <p><b>Precondición:</b> la arista ha sido creada con un nodo válido.
     * <br><b>Poscondición:</b> retorna el nodo de origen asignado al construir la arista.
     *
     * @return nodo de origen de tipo T
     */
    T getDesde();

    /**
     * Devuelve el nodo de destino de la arista.
     *
     * <p><b>Precondición:</b> la arista ha sido creada con un nodo válido.
     * <br><b>Poscondición:</b> retorna el nodo de destino asignado al construir la arista.
     *
     * @return nodo de destino de tipo T
     */
    T getHacia();

    /**
     * Devuelve el peso de la arista.
     *
     * <p><b>Precondición:</b> la arista ha sido creada con un peso válido (>=0).
     * <br><b>Poscondición:</b> retorna el peso asignado al construir la arista.
     *
     * @return peso de la arista
     */
    int getPeso();
}
