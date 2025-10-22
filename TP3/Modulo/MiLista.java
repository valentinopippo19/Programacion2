package Modulo;

import Interfaz.ILista;

public class MiLista<T> implements ILista<T> {

    private NodoLista<T> cabeza;
    private int size;

    private static class NodoLista<T> {
        T dato;
        NodoLista<T> siguiente;
        NodoLista(T dato) { this.dato = dato; }
    }

    @Override
    public void agregar(T dato) {
        NodoLista<T> nodo = new NodoLista<>(dato);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            NodoLista<T> temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nodo;
        }
        size++;
    }

    @Override
    public T obtener(int index) {
        if (index < 0 || index >= size) return null;
        NodoLista<T> temp = cabeza;
        for (int i = 0; i < index; i++) temp = temp.siguiente;
        return temp.dato;
    }

    @Override
    public boolean contiene(T dato) {
        NodoLista<T> temp = cabeza;
        while (temp != null) {
            if (temp.dato.equals(dato)) return true;
            temp = temp.siguiente;
        }
        return false;
    }

    @Override
    public void eliminar(T dato) {
        if (cabeza == null) return;

        // Si el dato está en la cabeza
        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            size--;
            return;
        }

        NodoLista<T> temp = cabeza;
        while (temp.siguiente != null && !temp.siguiente.dato.equals(dato)) {
            temp = temp.siguiente;
        }

        if (temp.siguiente != null) { // Encontró el dato
            temp.siguiente = temp.siguiente.siguiente;
            size--;
        }
    }

    @Override
    public int tamaño() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        NodoLista<T> temp = cabeza;
        while (temp != null) {
            sb.append(temp.dato);
            if (temp.siguiente != null) sb.append(", ");
            temp = temp.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}
