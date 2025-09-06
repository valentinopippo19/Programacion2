package Testing;

import Modulo.Persona;

import Modulo.Vehiculo;

public class TestLista {
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