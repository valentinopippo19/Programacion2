package Testeo;

import Modulo.Punto;

/**
 * Clase de prueba para la clase {@link Punto}.
 * <p>
 * Verifica el correcto funcionamiento de los métodos de la clase Punto.
 */
public class TestPunto {

    /**
     * Método principal que ejecuta las pruebas de {@link Punto}.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Punto p1 = new Punto("A");
        Punto p2 = new Punto("B");

        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);
        System.out.println("Nombre Punto 1: " + p1.getNombre());
        System.out.println("Nombre Punto 2: " + p2.getNombre());
    }
}
