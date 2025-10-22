package Testeo;

import Modulo.*;

/**
 * Clase de prueba para la implementación de la clase {@link Grafo}.
 * <p>
 * Crea un grafo dirigido de ejemplo con nodos de tipo {@link Persona}, 
 * agrega aristas, muestra la matriz de adyacencia y realiza recorridos DFS y BFS.
 */
public class TestGrafo {

    /**
     * Método principal que ejecuta la prueba del grafo.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear un grafo dirigido con capacidad para 5 nodos
        Grafo<Persona> grafo = new Grafo<>(5, true);

        // Agregar nodos
        grafo.agregarNodo(new Persona("Juan", 25));
        grafo.agregarNodo(new Persona("Ana", 30));
        grafo.agregarNodo(new Persona("Luis", 20));
        grafo.agregarNodo(new Persona("Marta", 27));

        // Agregar aristas
        grafo.agregarArista(0, 1);
        grafo.agregarArista(1, 2);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 0);

        // Mostrar matriz de adyacencia
        grafo.mostrarMatrizAdyacencia();

        // Mostrar recorrido DFS y BFS desde el nodo 0
        System.out.println("DFS: " + grafo.dfs(0));
        System.out.println("BFS: " + grafo.bfs(0));
    }
}
