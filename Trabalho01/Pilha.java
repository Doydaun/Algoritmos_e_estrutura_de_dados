package Trabalho01;

public interface Pilha<T> {

    // m�todos
    void push(T v);

    T pop();

    T peek();

    boolean vazia();

    void libera();

}
