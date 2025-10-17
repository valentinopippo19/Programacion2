package Modulo;

/**
 * Clase que representa una arista ponderada en un grafo.
 * Contiene el nodo de origen, el nodo de destino y el peso de la arista.
 */
public class Arista {

    int desde;
    int hacia;
    int peso;

    /**
     * Constructor que crea una arista entre dos nodos con un peso específico.
     *
     * @param desde índice del nodo de origen
     * @param hacia índice del nodo de destino
     * @param peso peso de la arista
     */
    public Arista(int desde, int hacia, int peso) {
        this.desde = desde;
        this.hacia = hacia;
        this.peso = peso;
    }
}
