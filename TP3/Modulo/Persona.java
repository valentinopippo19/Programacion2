package Modulo;

/**
 * Clase que representa a una persona con nombre y edad.
 */
public class Persona {

    private String nombre;
    private int edad;

    /**
     * Constructor que crea una persona con nombre y edad.
     *
     * @param nombre nombre de la persona
     * @param edad edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Devuelve una representación en cadena de la persona.
     *
     * @return cadena con el nombre y la edad de la persona
     */
    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
