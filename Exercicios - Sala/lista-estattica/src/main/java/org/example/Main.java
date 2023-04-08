package org.example;

public class Main {
    public static void main(String[] args) {
        int indRetornado;

        ListaEstatica lista = new ListaEstatica(20);

        lista.show();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        lista.show();

        lista.add(40);
        lista.add(50);
        System.out.println("\nTentando adicionar o sexto elemento");
        lista.add(60);

        lista.show();

        System.out.println("\nBuscando o elemento 30");
        indRetornado = lista.find(30);
        if (indRetornado == -1) {
            System.out.println("Elemento 30 não foi encontrado");
        }
        else {
            System.out.println("Elemento 30 encontrado no índice " + indRetornado);
        }

        System.out.println("\nBuscando o elemento 100");
        indRetornado = lista.find(100);
        if (indRetornado == -1) {
            System.out.println("Elemento 100 não foi encontrado");
        }
        else {
            System.out.println("Elemento 100 encontrado no índice " + indRetornado);
        }

        System.out.println("\nRemovendo o elemento do índice 4");
        if (lista.removeForId(4)) {
            System.out.println("Removido elemento do índice 4");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.show();

        System.out.println("\nRemovendo o elemento do índice 0");
        if (lista.removeForId(0)) {
            System.out.println("Removido elemento do índice 0");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.show();

        System.out.println("\nRemovendo o elemento do índice 7");
        if (lista.removeForId(7)) {
            System.out.println("Removido elemento do índice 7");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.show();

        System.out.println("\nRemovendo o elemento 30");
        if (lista.removeElement(30)) {
            System.out.println("Removido elemento 30");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.show();

        System.out.println("\nRemovendo o elemento 55");
        if (lista.removeForId(55)) {
            System.out.println("Removido elemento 55");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.add(10);
        lista.add(20);
        lista.add(30);

        lista.show();

        boolean substituiu = lista.substitui(30, 35);
        System.out.println("Substituiu? " + substituiu);

        substituiu = lista.substitui(60, 70);
        System.out.println("Substituiu? " + substituiu);

        int ocorrencias = lista.contaOcorrencias(20);
        System.out.println("Ocorrências de 20: " + ocorrencias);

        ocorrencias = lista.contaOcorrencias(50);
        System.out.println("Ocorrências de 50: " + ocorrencias);

        lista.add(10);
        lista.add(20);
        lista.add(30);

        lista.show();

        if(lista.adicionaNoInicio(20)) {
            System.out.println("Adicionado na lista");
        } else {
            System.out.println("Não adicionado");
        }

        lista.show();


    }
}
