package org.example;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[7];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor: ");
            vetor[i]= leitor.nextInt();
        }

        System.out.println("Ordem normal: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Invertido: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }




    }
}