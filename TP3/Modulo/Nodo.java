package Modulo;

import Interfaz.INodo;

public class Nodo<T> implements INodo<T> {
    private T dato;

    public Nodo(T dato) {
        this.dato = dato;
    }

    @Override
    public T getDato() {
        return dato;
    }

    @Override
    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}

