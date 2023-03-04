package org.example;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] modelo = new String[5];
        double[] rendimento = new double[5];

        // digitar os modelos e rendimentos

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o modelo do carro " + (i + 1));
            modelo[i] = leitor.next();

            double rendimentos;

            do{
                System.out.println("Digite o rendimento em km/h para o modelo " + modelo[i]);
                rendimentos = leitor.nextDouble();

                if(rendimentos <= 0){
                    System.out.println("Valor inválido");
                }
            } while(rendimentos <= 0);

            rendimento[i] = rendimentos;
        }

        // modelo mais econômico

        int carroEconomico = 0;
        for (int i = 0; i < 5; i++){
            if(rendimento[i] > rendimento[carroEconomico]){
                carroEconomico = i;
            }
        }

        // result
        System.out.println("O modelo mais econômico é o " + modelo[carroEconomico]);
    }
}
