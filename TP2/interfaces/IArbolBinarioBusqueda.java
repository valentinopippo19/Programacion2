// ------------------------------
// Archivo: Interfaz/IArbolBinarioBusqueda.java
// ------------------------------

package interfaces;

/**

* Interfaz que define las operaciones de un Árbol Binario de Búsqueda (ABB).
  */
  public interface IArbolBinarioBusqueda<T extends Comparable<T>> {

  /**

  * Inserta un elemento en el árbol.
  * Precondición: dato != null y no debe existir previamente en el árbol.
  * Postcondición: el elemento queda insertado manteniendo la propiedad de ABB.
  *
  * @param dato elemento a insertar
    */
    void insertar(T dato);

  /**

  * Busca un elemento en el árbol.
  * Precondición: dato != null.
  * Postcondición: devuelve true si el elemento existe, false si no.
  *
  * @param dato elemento a buscar
  * @return true si está presente, false si no
    */
    boolean buscar(T dato);

  /**

  * Elimina un elemento del árbol.
  * Precondición: dato != null y debe existir en el árbol.
  * Postcondición: el elemento queda eliminado manteniendo la propiedad de ABB.
  *
  * @param dato elemento a eliminar
    */
    void eliminar(T dato);

  /**

  * Muestra los elementos en recorrido InOrden.
  * Precondición: ninguna.
  * Postcondición: se imprimen en orden creciente.
    */
    void mostrarInOrden();

  /**

  * Muestra los elementos en recorrido PreOrden.
  * Precondición: ninguna.
  * Postcondición: se imprimen en orden raíz–izquierda–derecha.
    */
    void mostrarPreOrden();

  /**

  * Muestra los elementos en recorrido PostOrden.
  * Precondición: ninguna.
  * Postcondición: se imprimen en orden izquierda–derecha–raíz.
    */
    void mostrarPostOrden();
    }
