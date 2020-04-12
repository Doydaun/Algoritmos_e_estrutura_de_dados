
/* Autores
 * 
 *  Luis Augusto K�hn
 *  Tharcisio Hernani Vitor Felipe Pereira
 *  Thomas Ricardo Reinke
 *  
*/

package Trabalho01;

public interface Pilha<T> {

    // m�todos
    void push(T v);

    T pop();

    T peek();

    boolean vazia();

    void libera();

}
