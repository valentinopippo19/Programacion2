package Main;

import Modulo.Persona;

import Modulo.vehiculo;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Valentino");

        vehiculo v1 = new vehiculo("Toyota", "Corolla");
        vehiculo v2 = new vehiculo("Ford", "Fiesta");
        vehiculo v3 = new vehiculo("Honda", "Civic");

        p1.agregarVehiculo(v1);
        p1.agregarVehiculo(v2);
        p1.agregarVehiculo(v3);

        p1.mostrarVehiculos();

        System.out.println("\nEliminando el Ford Fiesta...");
        p1.eliminarVehiculo(v2);
        p1.mostrarVehiculos();
    }
}

