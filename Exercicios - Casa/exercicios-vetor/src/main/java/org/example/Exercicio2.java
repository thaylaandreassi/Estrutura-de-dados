package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        Integer soma = 0;
        Integer somaMedia = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor: ");
            vetor[i]= leitor.nextInt();

            soma += vetor[i];

            for(int v = 0; v < vetor.length; v++){
                 somaMedia = soma / vetor.length;
            }
        }

        System.out.println("A soma dos vetores: " + soma);

        System.out.println("A média dos valores é: " + somaMedia);

        for (int i = 0; i < vetor.length; i++){
            if(somaMedia < vetor[i]){
                System.out.println("A maior média é de: " + vetor[i]);
            }
        }


    }
}
