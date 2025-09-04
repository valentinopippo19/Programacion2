package Testing;

import Modulo.Persona;

import Modulo.vehiculo;

public class TestLista {
    public static void main(String[] args) {
        // Creamos una persona
        Persona p = new Persona("Valentino");

        // Creamos vehículos
        vehiculo v1 = new vehiculo("Toyota", "Corolla");
        vehiculo v2 = new vehiculo("Ford", "Fiesta");
        vehiculo v3 = new vehiculo("Honda", "Civic");

        // Agregamos vehículos a la persona
        p.agregarVehiculo(v1);
        p.agregarVehiculo(v2);
        p.agregarVehiculo(v3);

        // Mostramos los vehículos
        System.out.println("Vehículos iniciales:");
        p.mostrarVehiculos();

        // Eliminamos un vehículo
        System.out.println("\nEliminando el Ford Fiesta...");
        p.eliminarVehiculo(v2);

        // Mostramos los vehículos nuevamente
        p.mostrarVehiculos();
    }
}