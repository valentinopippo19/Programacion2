package Modulo;

import Interfaz.IPunto;

/**
 * Clase que representa un punto o ubicación en un grafo ponderado.
 */
public class Punto implements IPunto {

    private String nombre;

    /**
     * Constructor que crea un punto con un nombre específico.
     *
     * <p><b>Precondición:</b> nombre != null y no vacío
     * <br><b>Poscondición:</b> se crea un punto con el nombre asignado
     *
     * @param nombre nombre del punto
     */
    public Punto(String nombre) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre del punto no puede ser nulo ni vacío");
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del punto.
     *
     * @return nombre del punto
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve una representación en cadena del punto.
     *
     * @return nombre del punto
     */
    @Override
    public String toString() {
        return nombre;
    }
}
