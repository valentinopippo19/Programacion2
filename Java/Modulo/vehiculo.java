package Modulo;

public class vehiculo {
    private String marca;
    private String modelo;

    public vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}