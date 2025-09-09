// ------------------------------
// Archivo: interfaz/Ilista.java
// ------------------------------

package interfaz;

/**
 * Interfaz que define las operaciones de una lista doblemente enlazada.
 */
public interface Ilista {

    /**
     * Inserta un elemento al inicio de la lista.
     * Precondición: dato != null
     * Postcondición: el elemento queda al inicio de la lista.
     *
     * @param dato objeto a insertar
     */
    void insertarInicio(Object dato);

    /**
     * Inserta un elemento al final de la lista.
     * Precondición: dato != null
     * Postcondición: el elemento queda al final de la lista.
     *
     * @param dato objeto a insertar
     */
    void insertarFin(Object dato);

    /**
     * Elimina un elemento de la lista.
     * Precondición: dato != null
     * Postcondición: si el elemento existía, se elimina de la lista.
     *
     * @param dato objeto a eliminar
     */
    void eliminar(Object dato);

    /**
     * Busca un elemento en la lista.
     * Precondición: dato != null
     * Postcondición: devuelve el nodo que contiene el dato, o null si no existe.
     *
     * @param dato objeto a buscar
     * @return nodo que contiene el objeto, o null
     */
    Inodo buscar(Object dato);

    /**
     * Muestra los elementos de la lista de inicio a fin.
     * Postcondición: se imprimen todos los elementos en orden ascendente.
     */
    void mostrarAdelante();

    /**
     * Muestra los elementos de la lista de fin a inicio.
     * Postcondición: se imprimen todos los elementos en orden inverso.
     */
    void mostrarAtras();

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si está vacía, false si tiene elementos
     */
    boolean estaVacia();
}