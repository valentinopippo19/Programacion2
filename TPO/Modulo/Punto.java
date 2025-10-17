package Modulo;

/**
 * Clase que representa un punto o ubicación en un grafo ponderado.
 * Puede ser utilizado como nodo en {@link GrafoPesado}.
 */
public class Punto {

    private String nombre;

    /**
     * Constructor que crea un punto con un nombre específico.
     *
     * @param nombre nombre del punto
     */
    public Punto(String nombre) {
        this.nombre = nombre;
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
