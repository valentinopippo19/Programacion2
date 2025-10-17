package Testeo;

import Modulo.*;

/**
 * Clase de prueba para las estructuras de datos {@link MiLista} y {@link MiCola}.
 * <p>
 * Verifica el correcto funcionamiento de los métodos principales y asegura
 * que las operaciones básicas de lista y cola funcionan como se espera.
 */
public class TestEstructuras {

    /**
     * Método principal que ejecuta las pruebas de MiLista y MiCola.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // ===== Pruebas de MiLista =====
        System.out.println("=== Pruebas de MiLista ===");
        MiLista<String> lista = new MiLista<>();
        lista.agregar("A");
        lista.agregar("B");
        lista.agregar("C");

        System.out.println("Lista completa: " + lista);
        System.out.println("Elemento en posición 0: " + lista.obtener(0)); // A
        System.out.println("Elemento en posición 1: " + lista.obtener(1)); // B
        System.out.println("Elemento en posición 2: " + lista.obtener(2)); // C
        System.out.println("Contiene 'B'? " + (lista.obtener(1).equals("B"))); // true
        System.out.println("Tamaño de la lista: " + lista.size()); // 3

    }
}