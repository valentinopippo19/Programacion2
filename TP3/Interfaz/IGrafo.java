package Interfaz;

import Modulo.MiLista;

/**
 * Interfaz que define las operaciones básicas de un grafo genérico.
 *
 * @param <T> tipo de datos que almacenan los nodos del grafo
 *
 * <p><b>Precondiciones generales:</b>
 * <ul>
 *   <li>Los índices de los nodos deben ser válidos (>= 0 y < número de nodos).</li>
 *   <li>Los datos de los nodos no deben ser nulos.</li>
 * </ul>
 *
 * <p><b>Poscondiciones generales:</b>
 * <ul>
 *   <li>La estructura del grafo se mantiene consistente tras cualquier operación.</li>
 *   <li>Las listas retornadas por DFS y BFS contienen exactamente los nodos accesibles desde el nodo inicial, sin repeticiones.</li>
 * </ul>
 *
 * <p><b>Axiomas:</b>
 * <ul>
 *   <li>Agregar un nodo incrementa el número de nodos en 1.</li>
 *   <li>Agregar una arista entre nodos existentes crea una conexión única en la matriz de adyacencia.</li>
 *   <li>DFS y BFS recorren todos los nodos conectados al nodo inicial y ningún nodo fuera de esa componente.</li>
 * </ul>
 */
public interface IGrafo<T> {

    /**
     * Agrega un nuevo nodo al grafo con el dato proporcionado.
     *
     * <p><b>Precondición:</b> dato != null
     * <br><b>Poscondición:</b> El nodo se agrega al grafo y el número total de nodos incrementa en 1.
     *
     * @param dato el valor a almacenar en el nuevo nodo
     */
    void agregarNodo(T dato);

    /**
     * Agrega una arista dirigida entre dos nodos del grafo.
     *
     * <p><b>Precondición:</b> 0 <= desde < número de nodos, 0 <= hacia < número de nodos
     * <br><b>Poscondición:</b> La matriz de adyacencia refleja la nueva conexión.
     *
     * @param desde el índice del nodo de origen
     * @param hacia el índice del nodo de destino
     */
    void agregarArista(int desde, int hacia);

    /**
     * Muestra por consola la matriz de adyacencia del grafo.
     *
     * <p><b>Poscondición:</b> Se imprime la representación actual de la matriz de adyacencia.
     */
    void mostrarMatrizAdyacencia();

    /**
     * Realiza un recorrido en profundidad (DFS) a partir de un nodo inicial.
     *
     * <p><b>Precondición:</b> 0 <= inicio < número de nodos
     * <br><b>Poscondición:</b> La lista retornada contiene todos los nodos alcanzables desde el nodo inicial, sin repeticiones.
     *
     * @param inicio el índice del nodo desde donde iniciar el recorrido
     * @return una lista con los nodos visitados en orden DFS
     */
    MiLista<T> dfs(int inicio);

    /**
     * Realiza un recorrido en amplitud (BFS) a partir de un nodo inicial.
     *
     * <p><b>Precondición:</b> 0 <= inicio < número de nodos
     * <br><b>Poscondición:</b> La lista retornada contiene todos los nodos alcanzables desde el nodo inicial, en orden BFS, sin repeticiones.
     *
     * @param inicio el índice del nodo desde donde iniciar el recorrido
     * @return una lista con los nodos visitados en orden BFS
     */
    MiLista<T> bfs(int inicio);
}
