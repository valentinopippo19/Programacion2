package Modulo;

public class Persona {
    private String nombre;
    private Lista vehiculos; // lista sin genéricos

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

    public static void main(String[] args) {
        Persona p = new Persona("Juan");

        Vehiculo v1 = new Vehiculo("Toyota", "Corolla");
        Vehiculo v2 = new Vehiculo("Ford", "Focus");
        Vehiculo v3 = new Vehiculo("Honda", "Civic");

        p.agregarVehiculo(v1);
        p.agregarVehiculo(v2);
        p.agregarVehiculo(v3);

        p.mostrarVehiculos(); // Toyota Corolla <-> Ford Focus <-> Honda Civic <-> null

        p.eliminarVehiculo(v2);
        p.mostrarVehiculos(); // Toyota Corolla <-> Honda Civic <-> null
    }
}
