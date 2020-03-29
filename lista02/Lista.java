package Lista02;

public interface Lista {

	// métodos
	void insere(String valor);

	void insere(String valor, int posicao);

	int localiza(String valor);

	String retira(int posicao);

	String imprime();

	Lista concatena(Lista outra);

	String busca(int posicao);

	int getQuantidade();

	Lista divide();

	Lista copia();

	boolean estaVazia();

}
