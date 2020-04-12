package Trabalho01;

class teste {

    public static void main(String[] args) {
        
        PilhaVetor<Integer> lista = new PilhaVetor<>();

        System.out.println(lista.vazia());

        lista.push(1);

        lista.push(2);

        lista.push(3);

        lista.push(4);     

        System.out.println(lista.pop());
        
        System.out.println(lista.peek());

    }

}