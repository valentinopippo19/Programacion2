package Modulo;

public class Persona {
    private String nombre;
    private lista<vehiculo> vehiculos;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new lista<>();
    }

    public void agregarVehiculo(vehiculo v) {
        vehiculos.insertarFin(v);
    }

    public void eliminarVehiculo(vehiculo v) {
        vehiculos.eliminar(v);
    }

    public void mostrarVehiculos() {
        System.out.println("Vehículos de " + nombre + ":");
        vehiculos.mostrarAdelante();
    }
}
