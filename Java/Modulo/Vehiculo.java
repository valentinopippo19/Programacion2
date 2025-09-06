package Modulo;

public class Vehiculo {
    private String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
