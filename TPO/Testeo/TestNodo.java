package Testeo;

import Modulo.Nodo;

/**
 * Clase de prueba para la clase {@link Nodo}.
 * <p>
 * Verifica que los nodos genéricos almacenen y retornen correctamente los datos.
 */
public class TestNodo {

    /**
     * Método principal que ejecuta las pruebas de Nodo.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear nodo de tipo String
        Nodo<String> nodo1 = new Nodo<>("Hola");
        System.out.println("Dato del nodo1: " + nodo1.getDato());
        System.out.println("Representación nodo1: " + nodo1);

        // Crear nodo de tipo Integer
        Nodo<Integer> nodo2 = new Nodo<>(123);
        System.out.println("Dato del nodo2: " + nodo2.getDato());
        System.out.println("Representación nodo2: " + nodo2);

        // Crear nodo de tipo Double
        Nodo<Double> nodo3 = new Nodo<>(45.67);
        System.out.println("Dato del nodo3: " + nodo3.getDato());
        System.out.println("Representación nodo3: " + nodo3);
    }
}
