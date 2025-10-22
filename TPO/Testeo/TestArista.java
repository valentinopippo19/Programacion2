package Testeo;

import Modulo.Arista;
import Modulo.Punto;

/**
 * Clase de prueba para la clase {@link Arista}.
 * <p>
 * Verifica el correcto funcionamiento de los métodos de la arista genérica.
 */
public class TestArista {

    /**
     * Método principal que ejecuta las pruebas de {@link Arista}.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Ejemplo con Integer
        Arista<Integer> a1 = new Arista<>(0, 1, 10);
        System.out.println("Arista Integer: " + a1);

        // Ejemplo con String
        Arista<String> a2 = new Arista<>("A", "B", 5);
        System.out.println("Arista String: " + a2);

        // Ejemplo con objetos personalizados
        Arista<Punto> a3 = new Arista<>(new Punto("Alice"), new Punto("Bob"), 15);
        System.out.println("Arista Persona: " + a3);
    }
}
