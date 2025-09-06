package Modulo;

import interfaz.Inodo;

public class Nodo implements Inodo {
    private Object dato;
    private Inodo siguiente;
    private Inodo anterior;

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    @Override
    public Object getDato() { return dato; }

    @Override
    public void setDato(Object dato) { this.dato = dato; }

    @Override
    public Inodo getSiguiente() { return siguiente; }

    @Override
    public void setSiguiente(Inodo nodo) { this.siguiente = nodo; }

    @Override
    public Inodo getAnterior() { return anterior; }

    @Override
    public void setAnterior(Inodo nodo) { this.anterior = nodo; }
}
