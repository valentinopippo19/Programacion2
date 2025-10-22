package Interfaz;

/**
 * Interfaz que define las operaciones básicas de un punto (nodo) genérico.
 *
 * <p><b>Precondiciones generales:</b>
 * <ul>
 *   <li>El nombre del punto no debe ser nulo ni vacío.</li>
 * </ul>
 *
 * <p><b>Poscondiciones generales:</b>
 * <ul>
 *   <li>El punto mantiene su nombre asignado tras la creación.</li>
 * </ul>
 *
 * <p><b>Axiomas:</b>
 * <ul>
 *   <li>Un punto representa un nodo único en un grafo ponderado.</li>
 * </ul>
 */
public interface IPunto {
    /**
     * Devuelve el nombre del punto.
     *
     * <p><b>Precondición:</b> el punto fue creado correctamente con un nombre válido.
     * <br><b>Poscondición:</b> retorna el nombre asignado al crear el punto.
     *
     * @return nombre del punto
     */
    String getNombre();
}
