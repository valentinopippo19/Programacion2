public class Test {
  public static void main(String[] args) {
    Lista<String> l = new Lista<>();
    l.insertar("A"); l.insertar("B"); l.insertar("C");
    l.mostrar(); l.eliminar("B"); l.mostrar();
    System.out.println(l.buscar("A"));

    Persona p = new Persona("Juan");
    p.agregar(new Vehiculo("ABC123"));
    p.agregar(new Vehiculo("XYZ789"));
    p.mostrar();
  }
}
