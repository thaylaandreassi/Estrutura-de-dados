package org.example;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Digite o dia de 1 - 31: ");
        Integer dia = leitor.nextInt();

        System.out.println("Digite o mês de 1 - 12: ");
        Integer mes = leitor.nextInt();

        if(mes < 1 || mes > 12){
            System.out.println("Mês inválido");
        } else if(dia < 1 || dia > diasPorMes[mes-1]){
            System.out.println("Dia inválido");
        } else {
            int diaMes = 0;
            for(int i = 0; i < mes -1; i++){
                diaMes += diasPorMes[i];
            }
            int diaAno = diaMes + dia;
            System.out.println("O dia " + dia + " do mês " + mes + " corresponde ao dia " + diaAno + " do ano!");
        }
    }
}
