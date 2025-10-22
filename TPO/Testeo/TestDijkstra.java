package Testeo;

import Modulo.*;

/**
 * Clase de prueba para la implementación de grafos ponderados {@link GrafoPesado}.
 * <p>
 * Crea un grafo ponderado de ejemplo con nodos de tipo {@link Punto}, 
 * agrega aristas con pesos, y realiza el cálculo de distancias mínimas
 * usando el algoritmo de Dijkstra.
 */
public class TestDijkstra {

    /**
     * Método principal que ejecuta la prueba de Dijkstra.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear un grafo ponderado con 4 nodos
        GrafoPesado<Punto> grafo = new GrafoPesado<>(4);

        // Agregar nodos
        grafo.agregarNodo(new Punto("Depósito"));
        grafo.agregarNodo(new Punto("Tienda A"));
        grafo.agregarNodo(new Punto("Tienda B"));
        grafo.agregarNodo(new Punto("Tienda C"));

        // Agregar aristas con pesos
        grafo.agregarArista(0, 1, 10);
        grafo.agregarArista(0, 2, 15);
        grafo.agregarArista(1, 3, 12);
        grafo.agregarArista(2, 3, 10);

        // Calcular distancias mínimas desde el nodo 0
        int[] dist = grafo.dijkstra(0);

        // Mostrar distancias
        grafo.mostrarDistancias(dist);
    }
}
