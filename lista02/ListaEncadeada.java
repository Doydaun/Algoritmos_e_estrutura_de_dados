package Lista02;

public class ListaEncadeada implements Lista {
	
	private ItemLista primeiro; // = null
	private ItemLista ultimo; // = null
	private int qtdeElementos; // = 0

	@Override
	public void insere(String valor) {
		ItemLista novo = new ItemLista();
		novo.setInfo(valor);
		if (this.estaVazia()) {
			primeiro = novo;
		} else {
			ultimo.setProx(novo);
		}
		ultimo = novo;
		qtdeElementos++;
	}

	@Override
	// para 25/03
	public void insere(String valor, int posicao) {
		if (posicao < 0 || posicao > qtdeElementos) {
			throw new ListaException("Posi��o inv�lida");
		}
		if (posicao == qtdeElementos || this.estaVazia()) { // �ltima posi��o
			this.insere(valor);
		}
		else {
			ItemLista novo = new ItemLista();
			novo.setInfo(valor);
			if (posicao == 0) { // primeira posi��o
				novo.setProx(primeiro);
				primeiro = novo;
			}
			else { // posi��o intermedi�ria
				ItemLista anterior = this.descobre(posicao-1);
				novo.setProx(anterior.getProx());
				anterior.setProx(novo);
			}
			qtdeElementos++;
		}
	}

	@Override
	public int localiza(String valor) {
		ItemLista atual = primeiro;
		int contador = 0;
		while (atual != null) {
			if (valor.equals(atual.getInfo())) {
				return contador;
			}
			atual = atual.getProx();
			contador++;
		}
		return -1;
	}

	@Override
	public String retira(int posicao) {
		if (posicao < 0 || posicao > qtdeElementos) {
			throw new ListaException("Posi��o inv�lida");
		}
		String retorno = null;
		if (posicao == 0) { // primeira posi��o
			retorno = primeiro.getInfo();
			primeiro = primeiro.getProx();
			if (primeiro == null) {
				ultimo = null;
			}
		}
		else {
			ItemLista anterior = this.descobre(posicao-1);
			if (posicao == qtdeElementos-1) { // �ltima posi��o
				retorno = ultimo.getInfo();
				ultimo = anterior;
				ultimo.setProx(null);
			}
			else { // posi��o intermedi�ria
				ItemLista atual = anterior.getProx();
				retorno = atual.getInfo();
				anterior.setProx(atual.getProx());
			}
		}
		qtdeElementos--;
		return retorno;
	}

	@Override
	public String imprime() {
		String resultado = "[";
		ItemLista atual = primeiro;
		while (atual != null) {
			resultado = resultado + atual.getInfo();
			atual = atual.getProx();
			if (atual != null) {
				resultado += ", ";
			}
		}
		return resultado + "]";
	}

	@Override
	public Lista concatena(Lista outra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String busca(int posicao) {
		if (posicao < 0 || posicao >= qtdeElementos) {
			throw new ListaException("Posi��o inv�lida");
		}
		return this.descobre(posicao).getInfo();
	}
	private ItemLista descobre(int posicao) {
		ItemLista atual = primeiro;
		int contador = 0;
		while (atual != null) {
			if (contador == posicao) {
				return atual;
			}
			/*
			 * ItemLista temp = atual.getProx(); atual = temp;
			 */
			atual = atual.getProx();
			contador++;
		}
		return null;
	}

	@Override
	public int getQuantidade() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Lista divide() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lista copia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean estaVazia() {
		return (primeiro == null);
	}

}