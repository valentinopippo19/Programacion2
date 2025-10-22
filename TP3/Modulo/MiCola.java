package Modulo;

import Interfaz.ICola;

public class MiCola<T> implements ICola<T> {

    private NodoCola<T> frente;
    private NodoCola<T> fin;
    private int size = 0; // tamaño de la cola

    private static class NodoCola<T> {
        T dato;
        NodoCola<T> siguiente;

        NodoCola(T dato) {
            this.dato = dato;
        }
    }

    @Override
    public void encolar(T dato) {
        NodoCola<T> nodo = new NodoCola<>(dato);
        if (fin != null) {
            fin.siguiente = nodo;
        }
        fin = nodo;
        if (frente == null) {
            frente = fin;
        }
        size++;
    }

    @Override
    public T desencolar() {
        if (frente == null) return null;
        T dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        size--;
        return dato;
    }

    @Override
    public T frente() {
        return (frente != null) ? frente.dato : null;
    }

    @Override
    public boolean estaVacia() {
        return frente == null;
    }

    @Override
    public int tamaño() {
        return size;
    }
}
