package Interfaz;

public interface ILista<T> {
    void agregar(T dato);
    void eliminar(T dato);
    T obtener(int indice);
    int tamaño();
    boolean contiene(T dato);
}
