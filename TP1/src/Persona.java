class NodoD {
  Vehiculo dato; NodoD sig, ant;
  NodoD(Vehiculo v) { dato = v; }
}

public class Persona {
  String nombre; NodoD primero, ultimo;
  Persona(String n) { nombre = n; }

  void agregar(Vehiculo v) {
    NodoD n = new NodoD(v);
    if (primero == null) primero = ultimo = n;
    else { ultimo.sig = n; n.ant = ultimo; ultimo = n; }
  }

  void mostrar() {
    System.out.print(nombre + ": ");
    for (NodoD a = primero; a != null; a = a.sig)
      System.out.print(a.dato + " <-> ");
    System.out.println("null");
  }
}