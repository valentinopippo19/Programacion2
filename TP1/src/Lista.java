class Nodo<T> {
  T dato; Nodo<T> sig;
  Nodo(T d) { dato = d; }
}

public class Lista<T> {
  Nodo<T> primero;

  void insertar(T d) {
    Nodo<T> n = new Nodo<>(d);
    n.sig = primero; primero = n;
  }

  void eliminar(T d) {
    Nodo<T> a = primero, ant = null;
    while (a != null && !a.dato.equals(d)) { ant = a; a = a.sig; }
    if (a != null) { if (ant == null) primero = a.sig; else ant.sig = a.sig; }
  }

  boolean buscar(T d) {
    for (Nodo<T> a = primero; a != null; a = a.sig)
      if (a.dato.equals(d)) return true;
    return false;
  }

  void mostrar() {
    for (Nodo<T> a = primero; a != null; a = a.sig)
      System.out.print(a.dato + " -> ");
    System.out.println("null");
  }
}