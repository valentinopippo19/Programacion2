// ------------------------------
// Archivo: Main/Main.java
// ------------------------------

package Main;

import Modulo.Persona;
import Modulo.Vehiculo;

/**
 * Clase principal para ejecutar el programa de prueba de vehículos.
 */
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Valentino");

        Vehiculo v1 = new Vehiculo("Toyota");
        Vehiculo v2 = new Vehiculo("Ford");
        Vehiculo v3 = new Vehiculo("Honda");

        p1.agregarVehiculo(v1);
        p1.agregarVehiculo(v2);
        p1.agregarVehiculo(v3);

        p1.mostrarVehiculos();

        System.out.println("\nEliminando el Ford Fiesta...");
        p1.eliminarVehiculo(v2);
        p1.mostrarVehiculos();
    }
}
