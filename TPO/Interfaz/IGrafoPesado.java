package Interfaz;

/**
 * Interfaz que define las operaciones básicas de un grafo ponderado.
 *
 * @param <T> tipo de datos que almacenan los nodos del grafo
 *
 * <p><b>Precondiciones generales:</b>
 * <ul>
 *   <li>Los índices de los nodos deben ser válidos: 0 <= índice &lt; número de nodos.</li>
 *   <li>El peso de una arista debe ser mayor o igual a 0.</li>
 * </ul>
 *
 * <p><b>Poscondiciones generales:</b>
 * <ul>
 *   <li>Agregar un nodo incrementa el número de nodos en 1.</li>
 *   <li>Agregar una arista actualiza la matriz de adyacencia con el peso correcto.</li>
 *   <li>El método {@code dijkstra} devuelve un arreglo de distancias mínimas desde el nodo inicial a todos los demás nodos.</li>
 * </ul>
 *
 * <p><b>Axiomas:</b>
 * <ul>
 *   <li>La distancia de un nodo a sí mismo siempre es 0.</li>
 *   <li>Las distancias calculadas por Dijkstra son siempre menores o iguales a cualquier otra ruta posible.</li>
 *   <li>Agregar una arista no altera los nodos existentes ni otras aristas.</li>
 * </ul>
 */
public interface IGrafoPesado<T> {

    /**
     * Agrega un nuevo nodo al grafo con el dato proporcionado.
     *
     * <p><b>Precondición:</b> dato != null
     * <br><b>Poscondición:</b> El nodo se agrega al grafo y el número total de nodos incrementa en 1.
     *
     * @param dato valor a almacenar en el nuevo nodo
     */
    void agregarNodo(T dato);

    /**
     * Agrega una arista ponderada entre dos nodos del grafo.
     *
     * <p><b>Precondición:</b> 0 <= desde &lt; número de nodos, 0 <= hacia &lt; número de nodos, peso >= 0
     * <br><b>Poscondición:</b> La matriz de adyacencia refleja la nueva arista con el peso indicado.
     *
     * @param desde índice del nodo de origen
     * @param hacia índice del nodo de destino
     * @param peso peso de la arista
     */
    void agregarArista(int desde, int hacia, int peso);

    /**
     * Calcula las distancias mínimas desde un nodo inicial a todos los demás
     * usando el algoritmo de Dijkstra.
     *
     * <p><b>Precondición:</b> 0 <= inicio &lt; número de nodos
     * <br><b>Poscondición:</b> Devuelve un arreglo con las distancias mínimas desde el nodo inicial a todos los demás nodos.
     *
     * @param inicio índice del nodo desde donde iniciar el cálculo
     * @return arreglo de enteros con las distancias mínimas a cada nodo
     */
    int[] dijkstra(int inicio);
}
