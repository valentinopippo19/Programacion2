// ------------------------------
// Archivo: Modulo/Persona.java
// ------------------------------

package modulo;

/**
 * Clase que representa una persona con DNI y nombre.
 * Se puede comparar por DNI o por nombre según la bandera compararPorDni.
 */
public class Persona implements Comparable<Persona> {

    // DNI de la persona
    private int dni;

    // Nombre de la persona
    private String nombre;

    // Indica si la comparación se hace por DNI (true) o por nombre (false)
    private boolean compararPorDni; 

    /**
     * Constructor de Persona.
     * Precondición: nombre != null
     * Postcondición: se crea una Persona con los valores especificados y el modo de comparación.
     *
     * @param dni DNI de la persona
     * @param nombre nombre de la persona
     * @param compararPorDni true para comparar por DNI, false para comparar por nombre
     */
    public Persona(int dni, String nombre, boolean compararPorDni) {
        this.dni = dni;
        this.nombre = nombre;
        this.compararPorDni = compararPorDni;
    }

    /**
     * Devuelve el DNI de la persona.
     *
     * @return DNI
     */
    public int getDni() {
        return dni;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Compara esta persona con otra según la bandera compararPorDni.
     * Precondición: otra != null
     * Postcondición: devuelve:
     *   - negativo si esta < otra
     *   - 0 si esta == otra
     *   - positivo si esta > otra
     *
     * @param otra Persona a comparar
     * @return resultado de la comparación
     */
    @Override
    public int compareTo(Persona otra) {
        if (compararPorDni) {
            return Integer.compare(this.dni, otra.dni);
        } else {
            return this.nombre.compareTo(otra.nombre);
        }
    }

    /**
     * Devuelve una representación en String de la persona.
     * Postcondición: retorna "nombre (dni)"
     *
     * @return representación en String
     */
    @Override
    public String toString() {
        return nombre + " (" + dni + ")";
    }
}
