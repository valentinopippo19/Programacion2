package Modulo;

import Interfaz.IPersona;

public class Persona implements IPersona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser vacío");
        if (edad < 0)
            throw new IllegalArgumentException("La edad no puede ser negativa");
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public int getEdad() { return edad; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setEdad(int edad) { this.edad = edad; }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
