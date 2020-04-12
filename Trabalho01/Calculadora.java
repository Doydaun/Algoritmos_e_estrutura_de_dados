
/* Autores
 * 
 *  Luis Augusto Kühn
 *  Tharcisio Hernani Vitor Felipe Pereira
 *  Thomas Ricardo Reinke
 *  
*/

package Trabalho01;

public class Calculadora<T> {


	private double n1, n2;
	private String operador;
	private String expressao;

	public void setExpressao(String expressao) {

		this.expressao = expressao;

	}

	public double calc() {

		switch (this.operador) {

		case "+":

			return this.n2 + this.n1;

		case "-":

			return this.n2 - this.n1;

		case "/":

			return this.n2 / this.n1;

		case "*":

			return this.n2 * this.n1;

		default:

			return 0;

		}

	}

	public double usePilhaLista() {

		PilhaLista<Double> lista = new PilhaLista<>();

		for (String caracter : this.expressao.split(" ")) {

			if (caracter.matches("-?\\d+(\\.\\d+)?")) {

				lista.push(Double.parseDouble(caracter));

			} else {

				this.operador = caracter;

				this.n1 =  lista.pop();
				this.n2 =  lista.pop();

				lista.push(this.calc());

			}

		}

		return lista.pop();

	}

	public double usePilhaVetor() {

		PilhaVetor<Double> lista = new PilhaVetor<>();

		for (String caracter : this.expressao.split(" ")) {

			if (caracter.matches("-?\\d+(\\.\\d+)?")) {

				lista.push(Double.parseDouble(caracter));

			} else {

				this.operador = caracter;

				this.n1 =  lista.pop();
				this.n2 =  lista.pop();

				lista.push(this.calc());

			}

		}

		return lista.pop();

	}

}
