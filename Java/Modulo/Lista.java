// ------------------------------
// Archivo: Modulo/Lista.java
// ------------------------------

package Modulo;

import interfaz.Ilista;
import interfaz.Inodo;

/**
 * Implementación de una lista doblemente enlazada.
 * Invariante: si la lista está vacía, primero y ultimo son null.
 */
public class Lista implements Ilista {

    private Inodo primero;
    private Inodo ultimo;

    public Lista() {
        this.primero = null;
        this.ultimo = null;
    }

    @Override
    public boolean estaVacia() { 
        return primero == null; 
    }

    @Override
    public void insertarInicio(Object dato) {
        if (dato == null) throw new IllegalArgumentException("dato no puede ser null");
        Nodo nuevo = new Nodo(dato);

        // Si la lista está vacía, el nuevo nodo será primero y último
        if (estaVacia()) {
            primero = ultimo = nuevo;
        } else {
            // Enlazar el nuevo nodo al inicio
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
    }

    @Override
    public void insertarFin(Object dato) {
        if (dato == null) throw new IllegalArgumentException("dato no puede ser null");
        Nodo nuevo = new Nodo(dato);

        if (estaVacia()) {
            primero = ultimo = nuevo;
        } else {
            // Enlazar el nuevo nodo al final
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
    }

    @Override
    public void eliminar(Object dato) {
        if (dato == null) throw new IllegalArgumentException("dato no puede ser null");
        if (estaVacia()) return;

        Inodo actual = primero;
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
    public Inodo buscar(Object dato) {
        if (dato == null) throw new IllegalArgumentException("dato no puede ser null");
        Inodo actual = primero;
        while (actual != null) {
            if (actual.getDato().equals(dato)) return actual;
            actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public void mostrarAdelante() {
        Inodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getDato() + " <-> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

    @Override
    public void mostrarAtras() {
        Inodo actual = ultimo;
        while (actual != null) {
            System.out.print(actual.getDato() + " <-> ");
            actual = actual.getAnterior();
        }
        System.out.println("null");
    }
}