package Modulo;

import Interfaz.IGrafo;

/**
 * Implementación de un grafo genérico utilizando una matriz de adyacencia.
 *
 * @param <T> tipo de datos que almacenan los nodos del grafo
 */
public class Grafo<T> implements IGrafo<T> {

    private Nodo<T>[] nodos;
    private int[][] matrizAdyacencia;
    private int cantidad;
    private boolean dirigido;

    /**
     * Constructor que inicializa un grafo con un número máximo de nodos
     * y determina si es dirigido o no.
     *
     * @param maxNodos número máximo de nodos del grafo
     * @param dirigido true si el grafo es dirigido, false si es no dirigido
     */
    public Grafo(int maxNodos, boolean dirigido) {
        nodos = new Nodo[maxNodos];
        matrizAdyacencia = new int[maxNodos][maxNodos];
        cantidad = 0;
        this.dirigido = dirigido;
    }

    /**
     * Agrega un nuevo nodo al grafo con el dato proporcionado.
     *
     * @param dato el valor a almacenar en el nuevo nodo
     */
    @Override
    public void agregarNodo(T dato) {
        if (cantidad < nodos.length) {
            nodos[cantidad++] = new Nodo<>(dato);
        } else {
            System.out.println("No se pueden agregar más nodos");
        }
    }

    /**
     * Agrega una arista entre dos nodos del grafo.
     *
     * @param desde índice del nodo de origen
     * @param hacia índice del nodo de destino
     */
    @Override
    public void agregarArista(int desde, int hacia) {
        if (desde >= cantidad || hacia >= cantidad) return;
        matrizAdyacencia[desde][hacia] = 1;
        if (!dirigido) matrizAdyacencia[hacia][desde] = 1;
    }

    /**
     * Muestra la matriz de adyacencia del grafo por consola.
     */
    @Override
    public void mostrarMatrizAdyacencia() {
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Realiza un recorrido en profundidad (DFS) a partir de un nodo inicial.
     *
     * @param inicio índice del nodo desde donde iniciar el recorrido
     * @return lista con los nodos visitados en orden DFS
     */
    @Override
    public MiLista<T> dfs(int inicio) {
        boolean[] visitado = new boolean[cantidad];
        MiLista<T> resultado = new MiLista<>();
        dfsRec(inicio, visitado, resultado);
        return resultado;
    }

    /**
     * Método auxiliar recursivo para DFS.
     *
     * @param actual nodo actual
     * @param visitado arreglo de nodos visitados
     * @param resultado lista de nodos visitados
     */
    private void dfsRec(int actual, boolean[] visitado, MiLista<T> resultado) {
        visitado[actual] = true;
        resultado.agregar(nodos[actual].getDato());

        for (int i = 0; i < cantidad; i++) {
            if (matrizAdyacencia[actual][i] == 1 && !visitado[i]) {
                dfsRec(i, visitado, resultado);
            }
        }
    }

    /**
     * Realiza un recorrido en amplitud (BFS) a partir de un nodo inicial.
     *
     * @param inicio índice del nodo desde donde iniciar el recorrido
     * @return lista con los nodos visitados en orden BFS
     */
    @Override
    public MiLista<T> bfs(int inicio) {
        boolean[] visitado = new boolean[cantidad];
        MiLista<T> resultado = new MiLista<>();
        MiCola<Integer> cola = new MiCola<>();

        cola.encolar(inicio);
        visitado[inicio] = true;

        while (!cola.estaVacia()) {
            int actual = cola.desencolar();
            resultado.agregar(nodos[actual].getDato());

            for (int i = 0; i < cantidad; i++) {
                if (matrizAdyacencia[actual][i] == 1 && !visitado[i]) {
                    cola.encolar(i);
                    visitado[i] = true;
                }
            }
        }

        return resultado;
    }
}
