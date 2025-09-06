package Modulo;

public class Persona {
    private String nombre;
    private Lista vehiculos; // lista sin generics

    public Persona(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new Lista();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.insertarFin(v);
    }

    public void eliminarVehiculo(Vehiculo v) {
        vehiculos.eliminar(v);
    }

    public void mostrarVehiculos() {
        System.out.println("Vehículos de " + nombre + ":");
        vehiculos.mostrarAdelante();
    }
}
