package Modulo;

public class Persona {
    private String nombre;
    private Lista vehiculos; // sin generics

    public Persona(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new Lista();
    }

    public void agregarVehiculo(Object v) {
        vehiculos.insertarFin(v);
    }

    public void eliminarVehiculo(Object v) {
        vehiculos.eliminar(v);
    }

    public void mostrarVehiculos() {
        System.out.println("Vehículos de " + nombre + ":");
        vehiculos.mostrarAdelante();
    }
}
