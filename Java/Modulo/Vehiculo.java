
// ------------------------------
// Archivo: Modulo/Vehiculo.java
// ------------------------------

package Modulo;

/**
 * Clase que representa un vehículo con un nombre.
 * Invariante: nombre no puede ser null ni vacío.
 */
public class Vehiculo {

    private String nombre;

    /**
     * Constructor que crea un vehículo con un nombre específico.
     * Precondición: nombre != null ni vacío
     *
     * @param nombre nombre del vehículo
     */
    public Vehiculo(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del vehículo no puede ser null ni vacío");
        }
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}