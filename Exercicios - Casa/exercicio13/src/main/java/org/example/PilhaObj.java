package org.example;

public class PilhaObj<T> {

    // Atributos
    private T[] pilha;
    private int topo;

    // Construtor
    public PilhaObj(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Deve ser maior que zero.");
        }
        pilha = (T[]) new Object[capacidade];
        topo = -1;
    }

    // Métodos

    // Retorna true se a pilha estiver vazia e false caso contrário
    public boolean isEmpty() {
        if(topo == -1) {
            return true;
        }
        return false;
    }

    // Retorna true se a pilha estiver cheia e false caso contrário
    public boolean isFull() {
        if(topo == pilha.length - 1) {
            return true;
        }
        return false;
    }

    // Se a pilha estiver cheia, deve lançar IllegalStateException
    // Se a pilha não estiver cheia, empilha info
    public void push(T info) {
        if (isFull()) {
            throw new IllegalStateException("Está cheia.");
        }
        topo++;
        pilha[topo] = info;
    }

    // Desempilha e retorna o elemento do topo da pilha
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T elemento = pilha[topo];
        pilha[topo] = null;
        topo--;
        return elemento;
    }

    // Retorna o elemento do topo da pilha, sem desempilhar
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return pilha[topo];
    }

    // Exibe o conteúdo da pilha
    public void exibe() {
        if (isEmpty()) {
            System.out.println("Pilha vazia.");
        } else {
            for (int i = topo; i >= 0; i--) {
                System.out.println(pilha[i]);
            }
        }
    }

}