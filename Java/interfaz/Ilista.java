package interfaz;

public interface Ilista<T> {
    void insertarInicio(T dato);
    void insertarFin(T dato);
    void eliminar(T dato);
    Inodo<T> buscar(T dato);
    void mostrarAdelante();
    void mostrarAtras();
    boolean estaVacia();
}
