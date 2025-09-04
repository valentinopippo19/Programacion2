package Modulo;

import interfaz.Inodo;

public class Nodo<T> implements Inodo<T> {
    private T dato;
    private Inodo<T> siguiente;
    private Inodo<T> anterior;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    @Override
    public T getDato() { return dato; }

    @Override
    public void setDato(T dato) { this.dato = dato; }

    @Override
    public Inodo<T> getSiguiente() { return siguiente; }

    @Override
    public void setSiguiente(Inodo<T> nodo) { this.siguiente = nodo; }

    @Override
    public Inodo<T> getAnterior() { return anterior; }

    @Override
    public void setAnterior(Inodo<T> nodo) { this.anterior = nodo; }
}
