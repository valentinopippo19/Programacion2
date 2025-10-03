// ------------------------------
// Archivo: Modulo/ArbolBinarioBusqueda.java
// ------------------------------

package Module;

import Interface.IArbolBinarioBusqueda;

/**
 * Implementación de un Árbol Binario de Búsqueda (ABB).
 * 
 * <p>Axiomas:</p>
 * <ul>
 *   <li>Los valores en el subárbol izquierdo son menores que el nodo actual.</li>
 *   <li>Los valores en el subárbol derecho son mayores que el nodo actual.</li>
 *   <li>No se permiten duplicados.</li>
 * </ul>
 *
 * @param <T> tipo de los elementos, que deben ser comparables
 */
public class ArbolBinarioBusqueda<T extends Comparable<T>> implements IArbolBinarioBusqueda<T> {

    // Raíz del árbol binario
    private NodoArbol<T> raiz;

    /**
     * Inserta un elemento en el árbol.
     * Precondición: dato != null y no existe previamente en el árbol.
     * Postcondición: el árbol contiene el elemento y mantiene la propiedad de ABB.
     */
    @Override
    public void insertar(T dato) {
        raiz = insertarRec(raiz, dato);
    }

    // Inserción recursiva en posición correcta
    private NodoArbol<T> insertarRec(NodoArbol<T> nodo, T dato) {
        if (nodo == null) return new NodoArbol<>(dato);

        if (dato.compareTo(nodo.getDato()) < 0)
            nodo.setIzquierdo(insertarRec(nodo.getIzquierdo(), dato));
        else if (dato.compareTo(nodo.getDato()) > 0)
            nodo.setDerecho(insertarRec(nodo.getDerecho(), dato));

        return nodo;
    }

    /**
     * Busca un elemento en el árbol.
     * Precondición: dato != null.
     * Postcondición: devuelve true si el elemento existe, false si no.
     */
    @Override
    public boolean buscar(T dato) {
        return buscarRec(raiz, dato);
    }

    private boolean buscarRec(NodoArbol<T> nodo, T dato) {
        if (nodo == null) return false;
        if (dato.compareTo(nodo.getDato()) == 0) return true;
        return (dato.compareTo(nodo.getDato()) < 0)
                ? buscarRec(nodo.getIzquierdo(), dato)
                : buscarRec(nodo.getDerecho(), dato);
    }

    /**
     * Elimina un elemento del árbol.
     * Precondición: dato != null y debe existir en el árbol.
     * Postcondición: el árbol ya no contiene el elemento y mantiene la propiedad de ABB.
     */
    @Override
    public void eliminar(T dato) {
        raiz = eliminarRec(raiz, dato);
    }

    private NodoArbol<T> eliminarRec(NodoArbol<T> nodo, T dato) {
        if (nodo == null) return null;

        if (dato.compareTo(nodo.getDato()) < 0)
            nodo.setIzquierdo(eliminarRec(nodo.getIzquierdo(), dato));
        else if (dato.compareTo(nodo.getDato()) > 0)
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), dato));
        else {
            if (nodo.getIzquierdo() == null) return nodo.getDerecho();
            if (nodo.getDerecho() == null) return nodo.getIzquierdo();
            nodo = reemplazarConMinimo(nodo);
        }
        return nodo;
    }

    private NodoArbol<T> reemplazarConMinimo(NodoArbol<T> nodo) {
        NodoArbol<T> actual = nodo.getDerecho();
        while (actual.getIzquierdo() != null) actual = actual.getIzquierdo();
        nodo = new NodoArbol<>(actual.getDato());
        return nodo;
    }

    /**
     * Muestra los elementos en InOrden.
     * Precondición: ninguna.
     * Postcondición: imprime elementos en orden creciente.
     */
    @Override
    public void mostrarInOrden() {
        System.out.print("InOrden: ");
        inOrden(raiz);
        System.out.println();
    }

    private void inOrden(NodoArbol<T> nodo) {
        if (nodo != null) {
            inOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            inOrden(nodo.getDerecho());
        }
    }

    /**
     * Muestra los elementos en PreOrden.
     * Precondición: ninguna.
     * Postcondición: imprime elementos en recorrido raíz–izquierda–derecha.
     */
    @Override
    public void mostrarPreOrden() {
        System.out.print("PreOrden: ");
        preOrden(raiz);
        System.out.println();
    }

    private void preOrden(NodoArbol<T> nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            preOrden(nodo.getIzquierdo());
            preOrden(nodo.getDerecho());
        }
    }

    /**
     * Muestra los elementos en PostOrden.
     * Precondición: ninguna.
     * Postcondición: imprime elementos en recorrido izquierda–derecha–raíz.
     */
    @Override
    public void mostrarPostOrden() {
        System.out.print("PostOrden: ");
        postOrden(raiz);
        System.out.println();
    }

    private void postOrden(NodoArbol<T> nodo) {
        if (nodo != null) {
            postOrden(nodo.getIzquierdo());
            postOrden(nodo.getDerecho());
            System.out.print(nodo.getDato() + " ");
        }
    }
}
