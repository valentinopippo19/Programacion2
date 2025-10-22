package Testeo;

import Modulo.*;

/**
 * Clase de prueba para las estructuras de datos {@link MiLista} y {@link MiCola}.
 * <p>
 * Verifica el correcto funcionamiento de sus métodos principales.
 */
public class TestEstructuras {

    /**
     * Método principal que ejecuta las pruebas de MiLista y MiCola.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Pruebas de MiLista
        System.out.println("=== Pruebas de MiLista ===");
        MiLista<String> lista = new MiLista<>();
        lista.agregar("A");
        lista.agregar("B");
        lista.agregar("C");

        System.out.println("Lista completa: " + lista);
        System.out.println("Elemento en posición 0: " + lista.obtener(0));
        System.out.println("Elemento en posición 1: " + lista.obtener(1));
        System.out.println("Elemento en posición 2: " + lista.obtener(2));
        System.out.println("Contiene 'B'? " + lista.contiene("B"));
        System.out.println("Contiene 'D'? " + lista.contiene("D"));
        System.out.println("Tamaño de la lista: " + lista.tamaño());

        // Pruebas de MiCola
        System.out.println("\n=== Pruebas de MiCola ===");
        MiCola<Integer> cola = new MiCola<>();
        System.out.println("¿Cola vacía? " + cola.estaVacia());

        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        System.out.println("Desencolar: " + cola.desencolar()); // 1
        System.out.println("Desencolar: " + cola.desencolar()); // 2
        System.out.println("¿Cola vacía? " + cola.estaVacia());
        System.out.println("Desencolar: " + cola.desencolar()); // 3
        System.out.println("¿Cola vacía? " + cola.estaVacia());
    }
}
