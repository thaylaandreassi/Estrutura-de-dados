package org.example;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor: ");
            vetor[i] = leitor.nextInt();

        }
        System.out.println("Informe um valor para buscar: ");
        Integer valor = leitor.nextInt();

        int contador = 0;

        for(int i = 0; i < 10; i++){
            if(vetor[i] == valor){
                contador++;
            }
        }
        if(contador == 0) {
            System.out.println("O número " + valor + " não ocorre nenhuma vez");

        } else {
            System.out.println("O número " + valor + " ocorre " + contador + " vezes");
        }

    }
}
