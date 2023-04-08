package org.example;

public class TesteListaObj {
    public static void main(String[] args) {
        int indRetornado;

        ListaObj <String> lista = new ListaObj(5);

        lista.show();

        lista.add("A");
        lista.add("B");
        lista.add("C");

        lista.show();

        lista.add("D");
        lista.add("E");
        System.out.println("\nTentando adicionar o sexto elemento");
        lista.add("F");

        lista.show();

        System.out.println("\nBuscando o elemento D");
        indRetornado = lista.find("D");
        if (indRetornado == -1) {
            System.out.println("Elemento D nao foi encontrado");
        }
        else {
            System.out.println("Elemento D encontrado no indice " + indRetornado);
        }

        System.out.println("\nBuscando o elemento H");
        indRetornado = lista.find("H");
        if (indRetornado == -1) {
            System.out.println("Elemento H nao foi encontrado");
        }
        else {
            System.out.println("Elemento H encontrado no indice " + indRetornado);
        }

        System.out.println("\nRemovendo o elemento do indice 3");
        if (lista.removeForId(3)) {
            System.out.println("Removido elemento do indice 3");
        }
        else {
            System.out.println("Remocao invalida");
        }

        lista.show();

        System.out.println("\nRemovendo o elemento do indice 0");
        if (lista.removeForId(0)) {
            System.out.println("Removido elemento do indice 0");
        }
        else {
            System.out.println("Remocao invalida");
        }

        lista.show();

        System.out.println("\nRemovendo o elemento do indice 7");
        if (lista.removeForId(7)) {
            System.out.println("Removido elemento do indice 7");
        }
        else {
            System.out.println("Remocao invalida");
        }

        lista.show();

        System.out.println("\nRemovendo o elemento B");
        if (lista.removeElement("B")) {
            System.out.println("Removido elemento B");
        }
        else {
            System.out.println("Remocao invalida");
        }

        lista.show();

        System.out.println("\nRemovendo o elemento K");
        if (lista.removeElement("K")) {
            System.out.println("Removido elemento K");
        }
        else {
            System.out.println("Remocao invalida");
        }

        lista.show();

        System.out.println("Tamanho da lista: " + lista.getTamanho());

        System.out.println("Elemento do indice 1: " + lista.getElemento(1));

        lista.show();
        lista.limpa();
        lista.show();


    }
}
