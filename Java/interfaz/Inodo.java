package interfaz;

public interface Inodo<T> {
    T getDato();
    void setDato(T dato);
    Inodo<T> getSiguiente();
    void setSiguiente(Inodo<T> nodo);
    Inodo<T> getAnterior();
    void setAnterior(Inodo<T> nodo);
}