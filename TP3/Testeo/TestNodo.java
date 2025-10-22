package Testeo;

import Modulo.*;

public class TestNodo {
    public static void main(String[] args) {
        Nodo<String> nodo = new Nodo<>("Hola");
        System.out.println("Dato del nodo: " + nodo.getDato());
        System.out.println("Representación: " + nodo);
    }
}
