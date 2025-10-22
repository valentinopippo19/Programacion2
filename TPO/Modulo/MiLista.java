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
        if (dato == null) throw new IllegalArgumentException("El dato no puede ser nulo");
        NodoLista<T> nodo = new NodoLista<>(dato);
        if (cabeza == null) cabeza = nodo;
        else {
            NodoLista<T> temp = cabeza;
            while (temp.siguiente != null) temp = temp.siguiente;
            temp.siguiente = nodo;
        }
        size++;
    }

    @Override
    public void eliminar(T dato) {
        if (dato == null) return;
        if (cabeza == null) return;

        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            size--;
            return;
        }

        NodoLista<T> temp = cabeza;
        while (temp.siguiente != null && !temp.siguiente.dato.equals(dato)) {
            temp = temp.siguiente;
        }
        if (temp.siguiente != null) {
            temp.siguiente = temp.siguiente.siguiente;
            size--;
        }
    }

    @Override
    public T obtener(int index) {
        if (index < 0 || index >= size) return null;
        NodoLista<T> temp = cabeza;
        for (int i = 0; i < index; i++) temp = temp.siguiente;
        return temp.dato;
    }

    @Override
    public int tamaño() { return size; }

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
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        NodoLista<T> temp = cabeza;
        while (temp != null) {
            s.append(temp.dato);
            if (temp.siguiente != null) s.append(", ");
            temp = temp.siguiente;
        }
        s.append("]");
        return s.toString();
    }
}
