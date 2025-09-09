// ------------------------------
// Archivo: Modulo/Nodo.java
// ------------------------------

package Modulo;

import interfaz.Inodo;

/**
 * Implementación de un nodo para lista doblemente enlazada.
 * Cada nodo almacena un dato y referencias al nodo siguiente y anterior.
 */
public class Nodo implements Inodo {

    private Object dato;
    private Inodo siguiente;
    private Inodo anterior;

    /**
     * Constructor que crea un nodo con un dato específico.
     * Precondición: dato != null
     * Postcondición: nodo creado con dato y referencias siguiente/anterior en null.
     *
     * @param dato objeto a almacenar en el nodo
     */
    public Nodo(Object dato) {
        if (dato == null) throw new IllegalArgumentException("El dato no puede ser null");
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    @Override
    public Object getDato() { 
        return dato; 
    }

    @Override
    public void setDato(Object dato) { 
        if (dato == null) throw new IllegalArgumentException("El dato no puede ser null");
        this.dato = dato; 
    }

    @Override
    public Inodo getSiguiente() { 
        return siguiente; 
    }

    @Override
    public void setSiguiente(Inodo nodo) { 
        this.siguiente = nodo; 
    }

    @Override
    public Inodo getAnterior() { 
        return anterior; 
    }

    @Override
    public void setAnterior(Inodo nodo) { 
        this.anterior = nodo; 
    }
}