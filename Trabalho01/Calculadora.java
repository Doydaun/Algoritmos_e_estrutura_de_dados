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

                return this.n1 + this.n2;

            case "-":

                return this.n1 - this.n2;

            case "/":

                return this.n1 / this.n2;

            case "*":

                return this.n1 * this.n2;

            default:

                return 0;

        }

    }
	
	public void usePilhaLista() {
		
        PilhaLista lista = new PilhaLista();

		for (String caracter : this.expressao.split(" ")) {
			
			
            // Aqui entra todos os números

            // 1
            // -1
            // -2.4
            // -? d+ (. d+)?
            if (caracter.matches("-?\\d+(\\.\\d+)?")) {

                lista.push(caracter);

            // Aqui entra quando for operação
            } else {

                //lista.push(caracter);

                this.operador = caracter;

                this.n1 =  (Double) lista.pop();
                this.n2 =  (Double) lista.pop();

                lista.push(this.calc());
                               

            }

        }

        System.out.println(lista.peek());

	}
	
	public void usePilhaVetor() {
		
		
	}
    

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();

        calc.setExpressao("1 7 + 7 -");          

        calc.usePilhaLista();

    }

	
	
    
}


//divide a primeira posição por espaços e guarda em parts[]
//		String[] parts = entrada[0].split(" ");


