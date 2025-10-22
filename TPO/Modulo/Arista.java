package Modulo;

import Interfaz.IArista;

public class Arista<T> implements IArista<T> {

    private T desde;
    private T hacia;
    private int peso;

    /**
     * Constructor que crea una arista entre dos nodos con un peso específico.
     *
     * <p><b>Precondición:</b> desde != null, hacia != null, peso >= 0
     * <br><b>Poscondición:</b> Se crea la arista con los nodos y peso indicados.
     *
     * @param desde nodo de origen
     * @param hacia nodo de destino
     * @param peso peso de la arista
     */
    public Arista(T desde, T hacia, int peso) {
        if (desde == null || hacia == null)
            throw new IllegalArgumentException("Los nodos no pueden ser nulos");
        if (peso < 0)
            throw new IllegalArgumentException("El peso no puede ser negativo");

        this.desde = desde;
        this.hacia = hacia;
        this.peso = peso;
    }

    /**
     * Devuelve el nodo de origen de la arista.
     *
     * @return nodo de origen de tipo T
     */
    @Override
    public T getDesde() { return desde; }

    /**
     * Devuelve el nodo de destino de la arista.
     *
     * @return nodo de destino de tipo T
     */
    @Override
    public T getHacia() { return hacia; }

    /**
     * Devuelve el peso de la arista.
     *
     * @return peso de la arista
     */
    @Override
    public int getPeso() { return peso; }

    /**
     * Representación en cadena de la arista.
     *
     * @return cadena con nodos y peso
     */
    @Override
    public String toString() {
        return "Arista: " + desde + " -> " + hacia + " [peso=" + peso + "]";
    }
}