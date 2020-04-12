package Trabalho01;

public class ElementoLista<T>{

    private T info;
    private ElementoLista prox;

    public T getInfo(){

        return this.info;

    }

    public void setInfo(T info){

        this.info = info;

    }

    public ElementoLista getProx() {

        return this.prox;
        
    }

    public void setProx(ElementoLista prox) {

        this.prox = prox;

    }

    public String toString(){

        return "Info: " + this.info + " - Prox: " + this.prox;

    }

}
