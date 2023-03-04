package org.example;


import java.util.Scanner;

public class Main {
    public static void exibeVetor(int[] v){
        for(int i=0; i < v.length; i++){
        System.out.print("vetor [" + i + "]= " + v[i] + "\t");
        }
    }
    public static void main(String[] args) {
      //

        // Criação de um objeto leitor
        Scanner leitor = new Scanner(System.in);

        // Criação de um vetor de inteiros, tamanho 5
        int[] vetor = new int[5];

        // Criação de um 2o vetor de inteiros, já inicializado com valores
        int[] vet2 = { 100, 200, 300, 400, 500, 600, 700 };

        // Criação de um 3o vetor de Strings
        String[] vet3 = new String[4];


        // Inicializar o vetor com o valores

        for(int i =0; i < vetor.length; i++){
            vetor[i] = i * 10;
        }

        // Exibindo o vetor

       // for (int i=0; i < vetor.length; i++){
         //   System.out.println("vetor [" + i + "]= " + vetor[i]);
        // }

        // exibe o vetor
        // exibeVetor(vetor);

        // Solicita que o usuário digite os valores
        for (int i= 0; i < vetor.length; i++){
            System.out.println("Digite o valor do vetor [" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        // exibe o vetor
        //exibeVetor(vet2);

        // Solicita que o usuário digite os valores do vet4
        for (int i= 0; i < vet3.length; i++){
            System.out.println("Digite o valor do vet3 [" + i + "]");
            vet3[i] = leitor.next();
        }

        // exibe o vet3
        for(String s : vet3){
            System.out.println(s);
        }
        System.out.println();

        // Desafio 1
        // Exibir a soma dos elementos do vetor


        // Desafio 2
        // Exibir a quantidade de elementos pares do vetor

        //Desafio 3
        // Criar um vetor com os nomes dos dias da semana (Domingo, Segunda, Terça e etcc)
        // Solicitar que o usuário digite um número de 1 a 7
        // E ficar num loop enquanto o valor não for entre 1 a 7
        // Se o número for válido, exibir o dia da semana correspondente
        // Considerando que 1 é o Domingo, 2 é segunda, 3 é Terça, etcc..
    }
}