package Modulo;

import interfaz.Ilista;

import interfaz.Inodo;

public class lista<T> implements Ilista<T> {
    private Inodo<T> primero;
    private Inodo<T> ultimo;

    public lista() {
        this.primero = null;
        this.ultimo = null;
    }

    @Override
    public boolean estaVacia() { return primero == null; }

    @Override
    public void insertarInicio(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            primero = ultimo = nuevo;
        } else {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
    }

    @Override
    public void insertarFin(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
    }

    @Override
    public void eliminar(T dato) {
        if (estaVacia()) return;

        Inodo<T> actual = primero;
        while (actual != null) {
            if (actual.getDato().equals(dato)) {
                if (actual == primero) {
                    primero = actual.getSiguiente();
                    if (primero != null) primero.setAnterior(null);
                } else if (actual == ultimo) {
                    ultimo = actual.getAnterior();
                    if (ultimo != null) ultimo.setSiguiente(null);
                } else {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                return;
            }
            actual = actual.getSiguiente();
        }
    }

    @Override
    public Inodo<T> buscar(T dato) {
        Inodo<T> actual = primero;
        while (actual != null) {
            if (actual.getDato().equals(dato)) return actual;
            actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public void mostrarAdelante() {
        Inodo<T> actual = primero;
        while (actual != null) {
            System.out.print(actual.getDato() + " <-> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

    @Override
    public void mostrarAtras() {
        Inodo<T> actual = ultimo;
        while (actual != null) {
            System.out.print(actual.getDato() + " <-> ");
            actual = actual.getAnterior();
        }
        System.out.println("null");
    }
}
