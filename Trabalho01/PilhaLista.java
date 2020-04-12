package Trabalho01;

public class PilhaLista<T> implements Pilha<T> {

    private ElementoLista topo;

	@Override
	public void push(T v) {
		
        ElementoLista novoEl = new ElementoLista();

        if(this.topo == null) {

            novoEl.setInfo(v);

            this.topo = novoEl;

        } else {

            novoEl.setInfo(v);

            novoEl.setProx(this.topo);

            this.topo = novoEl;

        }
		
	}

	@Override
	public T pop() {
		
        if(this.topo == null) {

            throw new ListaException("Não possui Elementos");

        } else {

            ElementoLista proximo = this.topo.getProx();

            T valorRetirado = (T) this.topo.getInfo();

            this.topo = proximo;

            return valorRetirado;

        }

	}

	@Override
	public T peek() {

        if (this.topo == null) {

            return null;

        } else {

            return (T) this.topo.getInfo();

        }

	}

	@Override
	public boolean vazia() {
		
        if(this.topo == null) {

            return true;

        }

        return false;

	}

	@Override
	public void libera() {
		
        ElementoLista proximo = this.topo.getProx();

        while(proximo.getProx() != null) {

            proximo = this.topo.getProx();

            this.topo.setProx(null);

            this.topo = proximo;

        }

        this.topo.setProx(null);

        this.topo = null;
		
	}

    

}