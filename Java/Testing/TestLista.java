// ------------------------------
// Archivo: Testing/TestLista.java
// ------------------------------

package Testing;

import Modulo.Persona;
import Modulo.Vehiculo;

/**
 * Clase de prueba para verificar el funcionamiento de Persona y su lista de vehículos.
 * Crea vehículos, los agrega, los elimina y muestra resultados por consola.
 */
public class TestLista {

    /**
     * Método principal de la prueba.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        // Creamos una persona
        Persona p = new Persona("Valentino");

        // Creamos vehículos
        Vehiculo v1 = new Vehiculo("Toyota");
        Vehiculo v2 = new Vehiculo("Ford");
        Vehiculo v3 = new Vehiculo("Honda");

        // Agregamos vehículos a la persona
        p.agregarVehiculo(v1);
        p.agregarVehiculo(v2);
        p.agregarVehiculo(v3);

        // Mostramos los vehículos iniciales
        System.out.println("Vehículos iniciales:");
        p.mostrarVehiculos();

        // Eliminamos un vehículo específico
        System.out.println("\nEliminando el Ford Fiesta...");
        p.eliminarVehiculo(v2);

        // Mostramos los vehículos nuevamente después de la eliminación
        p.mostrarVehiculos();
    }
}