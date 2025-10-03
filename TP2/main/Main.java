// ------------------------------
// Archivo: Main/Main.java
// ------------------------------

package main;

import testeo.TestArbol;

/**
 * Clase principal del programa.
 * Simplemente llama al método main de TestArbol para ejecutar las pruebas.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     * Postcondición: se ejecutan todos los tests definidos en TestArbol.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        // Llama al main de TestArbol para ejecutar las pruebas de Árbol Binario
        TestArbol.main(args);
    }
}
