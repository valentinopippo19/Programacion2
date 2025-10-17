package Modulo;

import Interfaz.IGrafoPesado;

/**
 * Implementación de un grafo ponderado utilizando una matriz de pesos.
 *
 * @param <T> tipo de datos que almacenan los nodos del grafo
 */
public class GrafoPesado<T> implements IGrafoPesado<T> {

    private Nodo<T>[] nodos;
    private int[][] matrizPesos;
    private int cantidad;

    /**
     * Constructor que crea un grafo ponderado con un número máximo de nodos.
     * Inicializa la matriz de pesos con -1 indicando que no hay conexión.
     *
     * @param maxNodos número máximo de nodos en el grafo
     */
    public GrafoPesado(int maxNodos) {
        nodos = new Nodo[maxNodos];
        matrizPesos = new int[maxNodos][maxNodos];
        cantidad = 0;
        for (int i = 0; i < maxNodos; i++)
            for (int j = 0; j < maxNodos; j++)
                matrizPesos[i][j] = -1; // -1 indica sin conexión
    }

    /**
     * Agrega un nodo al grafo.
     *
     * @param dato valor a almacenar en el nodo
     */
    @Override
    public void agregarNodo(T dato) {
        if (cantidad < nodos.length) nodos[cantidad++] = new Nodo<>(dato);
    }

    /**
     * Agrega una arista ponderada entre dos nodos.
     *
     * @param desde índice del nodo de origen
     * @param hacia índice del nodo de destino
     * @param peso peso de la arista
     */
    @Override
    public void agregarArista(int desde, int hacia, int peso) {
        if (desde < cantidad && hacia < cantidad) matrizPesos[desde][hacia] = peso;
    }

    /**
     * Calcula las distancias mínimas desde un nodo inicial a todos los demás nodos
     * usando el algoritmo de Dijkstra.
     *
     * @param inicio índice del nodo desde donde iniciar el cálculo
     * @return arreglo de enteros con las distancias mínimas
     */
    @Override
    public int[] dijkstra(int inicio) {
        int[] dist = new int[cantidad];
        boolean[] visitado = new boolean[cantidad];
        for (int i = 0; i < cantidad; i++) dist[i] = Integer.MAX_VALUE;
        dist[inicio] = 0;

        for (int i = 0; i < cantidad; i++) {
            int u = minDist(dist, visitado);
            if (u == -1) break;
            visitado[u] = true;
            for (int v = 0; v < cantidad; v++) {
                if (matrizPesos[u][v] != -1 && !visitado[v] &&
                    dist[u] + matrizPesos[u][v] < dist[v])
                    dist[v] = dist[u] + matrizPesos[u][v];
            }
        }
        return dist;
    }

    /**
     * Encuentra el nodo no visitado con la distancia mínima.
     *
     * @param dist arreglo de distancias desde el nodo inicial
     * @param visitado arreglo que indica si un nodo fue visitado
     * @return índice del nodo con distancia mínima, -1 si no hay ninguno
     */
    private int minDist(int[] dist, boolean[] visitado) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < cantidad; i++)
            if (!visitado[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        return minIndex;
    }

    /**
     * Muestra las distancias calculadas desde un nodo inicial.
     *
     * @param dist arreglo de distancias a cada nodo
     */
    public void mostrarDistancias(int[] dist) {
        for (int i = 0; i < dist.length; i++)
            System.out.println(nodos[i] + ": " + dist[i]);
    }
}
