
/* Autores
 * 
 *  Luis Augusto Kühn
 *  Tharcisio Hernani Vitor Felipe Pereira
 *  Thomas Ricardo Reinke
 *  
*/

package Trabalho01;

public interface Pilha<T> {

    // métodos
    void push(T v);

    T pop();

    T peek();

    boolean vazia();

    void libera();

}
