package org.example;

public class FilaObj<T> {
    // Atributos
    private int tamanho;
    private T[] fila;
    private int inicio;
    private int fim;

    // Construtor
    public FilaObj(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade inválida");
        }
        this.tamanho = 0;
        this.fila = (T[]) new Object[capacidade];
        this.inicio = 0;
        this.fim = -1;
    }

    // Métodos

    // Retorna true se a fila está vazia e false caso contrário
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Retorna true se a fila está cheia e false caso contrário
    public boolean isFull() {
        return tamanho == fila.length;
    }

    // Retorna o tamanho da fila
    public int size() {
        return tamanho;
    }

    // Se a fila não estiver cheia, insere info na fila
    // Se a fila estiver cheia, deve lançar IllegalStateException
    public void insert(T elemento) {
        if (!isFull()) {
            fila[tamanho] = elemento;
            tamanho++;
        } else {
            throw new IllegalStateException("Fila cheia!");
        }
    }

    // Retorna o primeiro da fila
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return fila[inicio];
    }

    // Remove e retorna o primeiro elemento da fila
    // Antes de retornar, se a fila não estiver vazia, deve fazer a fila "andar"
    public T poll() {
        if (!isEmpty()) {
            T elemento = fila[inicio];
            for (int i = 0; i < tamanho - 1; i++) {
                fila[i] = fila[i + 1];
            }
            tamanho--;
            return elemento;
        } else {
            throw new RuntimeException("Fila vazia!");
        }
    }

    // Exibe os elementos da fila
    public void exibe() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(fila[(inicio + i) % fila.length] + " ");
            }
            System.out.println();
        }
    }

    // Retorna o vetor fila
    public T[] getFila() {
        return fila;
    }


}