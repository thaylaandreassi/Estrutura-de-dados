package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String t1 [] = new String[10];
        String t2 [] = new String[10];

        Integer cont1 = 0;
        Integer cont2 = 0;

        Integer opcao = 1;
        String nome;

        while(opcao != 0){
            System.out.println("TURMA DA BAGUNÇA");
            System.out.println("-----------------------");
            System.out.println("Digite 1 se você quer cadastrar na t1");
            System.out.println("Digite 2 se você quer cadastrar na t2");
            System.out.println("Digite 3 se você quer ver a quantidade de alunos de cada turma");
            System.out.println("Digite 0 para sair");
            System.out.println("-----------------------");
            opcao = leitor.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Informe o nome do aluno na turma 1: ");
                    System.out.println("----------------");

                    nome = leitor.next();

                    if(nome != null){
                        t1[cont1] = nome;
                        cont1++;
                    }
                    break;
                case 2:
                    System.out.println("Informe o nome do aluno na turma 2:");
                    System.out.println("----------------");

                    nome = leitor.next();
                    if(nome != null){
                        t2[cont2] = nome;
                        cont2++;
                    }
                    break;
                case 3:
                    System.out.println("Quantidade de alunos na T1: " + cont1);
                    System.out.println("Quantidade de alunos na T2: " + cont2);

                    for (int i = 0; i < cont1; i++) {
                        System.out.println( "Os alunos da T1 são: " + t1[i]);
                    }
                    for (int i = 0; i < cont2; i++) {
                        System.out.println( "Os alunos da T2 são: " + t2[i]);
                    }
                    break;
                default:

            }

        }

    }
}