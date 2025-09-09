// ------------------------------
// Archivo: Modulo/Persona.java
// ------------------------------

package Modulo;

/**
 * Clase que representa una persona con una lista de vehículos.
 * Invariante: la lista de vehículos nunca es null.
 */
public class Persona {

    private String nombre;
    private Lista vehiculos;

    public Persona(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser null ni vacío");
        }
        this.nombre = nombre;
        this.vehiculos = new Lista();
    }

    public void agregarVehiculo(Vehiculo v) {
        if (v == null) throw new IllegalArgumentException("El vehículo no puede ser null");
        vehiculos.insertarFin(v);
    }

    public void eliminarVehiculo(Vehiculo v) {
        if (v == null) throw new IllegalArgumentException("El vehículo no puede ser null");
        vehiculos.eliminar(v);
    }

    public void mostrarVehiculos() {
        System.out.println("Vehículos de " + nombre + ":");
        vehiculos.mostrarAdelante();
    }
}