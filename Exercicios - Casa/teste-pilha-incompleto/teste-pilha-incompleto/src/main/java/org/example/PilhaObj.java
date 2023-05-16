package org.example;

public class PilhaObj<T> {
    private int topo;
    private T[] elementos;

    public PilhaObj(int tamanho) {
        elementos = (T[]) new Object[tamanho];
        topo = -1;
    }

    public void push(T valor) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = valor;
        } else {
            System.out.println("Pilha cheia.");
        }
    }

    public T pop() {
        if (topo != -1) {
            T valor = elementos[topo];
            topo--;
            return valor;
        } else {
            System.out.println("Pilha vazia.");
            return null;
        }
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void exibe() {
        if (topo == -1) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.print("Pilha: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(elementos[i]);
            }
            System.out.println();
        }
    }

    public static String inverteFrase(String frase) {
        PilhaObj<Character> pilha = new PilhaObj<>(frase.length());

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            pilha.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!pilha.vazia()) {
            sb.append(pilha.pop());
        }

        return sb.toString();
    }
}
