
/* Autores
 * 
 *  Luis Augusto Kühn
 *  Tharcisio Hernani Vitor Felipe Pereira
 *  Thomas Ricardo Reinke
 *  
*/

package Trabalho01;

public class PilhaVetor<T> implements Pilha<T> {

    private int n = 0; //Inseridos
    private int tam = 5; //Tamanho
    private T[] vet = (T[])new Object[this.tam]; //Lista

	@Override
	public void push(T v) {
		
        if (this.n < this.tam) {

            this.vet[this.n] = v;

            this.n++;

        } else {

            throw new ListaException("A lista está cheia!");

        }
		
	}

	@Override
	public T pop() {
		
        if (this.n == 0) {

            throw new ListaException("Não possui Elementos"); 

        } else {

            T valorRetirado = this.vet[this.n - 1];

            this.vet[this.n - 1] = null;

            this.n--;

            return valorRetirado;

        }

	}

	@Override
	public T peek() {

        if (this.n == 0) {

            return null;

        } else {

            T valorRetirado = this.vet[this.n - 1];

            return valorRetirado;

        }
		
	}

	@Override
	public boolean vazia() {
        
        if (this.n == 0) {

            return true;

        }

		return false;

	}

	@Override
	public void libera() {

        this.vet = (T[]) new PilhaVetor().vet;

        this.n = 0;
		
	}

}