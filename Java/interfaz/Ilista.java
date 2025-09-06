package interfaz;

public interface Ilista {
    void insertarInicio(Object dato);
    void insertarFin(Object dato);
    void eliminar(Object dato);
    Inodo buscar(Object dato);
    void mostrarAdelante();
    void mostrarAtras();
    boolean estaVacia();
}
