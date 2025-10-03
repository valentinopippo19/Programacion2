// ------------------------------
// Archivo: Testeo/TestArbol.java
// ------------------------------

package testeo;

import modulo.*;

/**
 * Clase de prueba para el Árbol Binario de Búsqueda con objetos Persona.
 * Se realizan pruebas comparando por DNI y por nombre.
 */
public class TestArbol {

    public static void main(String[] args) {

        // -----------------------------
        // Árbol comparando por DNI
        // -----------------------------
        System.out.println("Árbol comparando por DNI:");
        ArbolBinarioBusqueda<Persona> arbolDni = new ArbolBinarioBusqueda<>();

        // Insertar 15 personas (comparando por DNI)
        arbolDni.insertar(new Persona(400, "Juan", true));
        arbolDni.insertar(new Persona(250, "Ana", true));
        arbolDni.insertar(new Persona(600, "Pedro", true));
        arbolDni.insertar(new Persona(100, "Luis", true));
        arbolDni.insertar(new Persona(350, "Marta", true));
        arbolDni.insertar(new Persona(550, "Sofia", true));
        arbolDni.insertar(new Persona(700, "Diego", true));
        arbolDni.insertar(new Persona(50, "Carla", true));
        arbolDni.insertar(new Persona(150, "Pablo", true));
        arbolDni.insertar(new Persona(300, "Julia", true));
        arbolDni.insertar(new Persona(375, "Lucas", true));
        arbolDni.insertar(new Persona(500, "Nadia", true));
        arbolDni.insertar(new Persona(580, "Bruno", true));
        arbolDni.insertar(new Persona(650, "Clara", true));
        arbolDni.insertar(new Persona(800, "Andres", true));

        // Mostrar recorridos del árbol
        arbolDni.mostrarInOrden();
        arbolDni.mostrarPreOrden();
        arbolDni.mostrarPostOrden();

        // Buscar una persona por DNI
        System.out.println("\nBuscar DNI 350: " + arbolDni.buscar(new Persona(350, "", true)));

        // Eliminar una persona por DNI
        arbolDni.eliminar(new Persona(350, "", true));
        System.out.println("Árbol tras eliminar DNI 350:");
        arbolDni.mostrarInOrden();

        // -----------------------------
        // Árbol comparando por Nombre
        // -----------------------------
        System.out.println("\nÁrbol comparando por Nombre:");
        ArbolBinarioBusqueda<Persona> arbolNombre = new ArbolBinarioBusqueda<>();

        // Insertar 15 personas (comparando por nombre)
        arbolNombre.insertar(new Persona(400, "Juan", false));
        arbolNombre.insertar(new Persona(250, "Ana", false));
        arbolNombre.insertar(new Persona(600, "Pedro", false));
        arbolNombre.insertar(new Persona(100, "Luis", false));
        arbolNombre.insertar(new Persona(350, "Marta", false));
        arbolNombre.insertar(new Persona(550, "Sofia", false));
        arbolNombre.insertar(new Persona(700, "Diego", false));
        arbolNombre.insertar(new Persona(50, "Carla", false));
        arbolNombre.insertar(new Persona(150, "Pablo", false));
        arbolNombre.insertar(new Persona(300, "Julia", false));
        arbolNombre.insertar(new Persona(375, "Lucas", false));
        arbolNombre.insertar(new Persona(500, "Nadia", false));
        arbolNombre.insertar(new Persona(580, "Bruno", false));
        arbolNombre.insertar(new Persona(650, "Clara", false));
        arbolNombre.insertar(new Persona(800, "Andres", false));

        // Mostrar recorridos del árbol
        arbolNombre.mostrarInOrden();
        arbolNombre.mostrarPreOrden();
        arbolNombre.mostrarPostOrden();
    }
}
