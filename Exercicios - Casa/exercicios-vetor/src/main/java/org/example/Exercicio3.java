package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] nome = new String[10];

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome do vetor [" + i + "]");
            nome[i] = leitor.next();
        }

        System.out.println("Informe um nome para buscar: ");
        String nomeBusca = leitor.next();


        for (int i = 0; i < 10; i++) {
            if (nome[i].equals(nomeBusca)) {
                System.out.println("Nome encontrado no índice " + i);
                break;
            } else {
                System.out.println("Nome não encontrado!");
            }
        }

    }
}
