package org.example;

import java.util.Scanner;

public class TesteViagem {
    public static void main(String[] args) {
    ListaObj<Viagem> listaViagem = new ListaObj<>(5);
        Scanner leitor = new Scanner(System.in);

        while(true){
            System.out.println("--- AGENCIA DA THAY ---");
            System.out.println("1 - Adicionar uma viagem");
            System.out.println("2 - Exibir as viagens cadastradas");
            System.out.println("3 - Encerrar");

            int opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    Viagem novaViagem = new Viagem(5);

                    System.out.println("Informe o destino: ");
                    novaViagem.setDestino(leitor.next());

                    System.out.println("Informe o nmr da passagem: ");
                    novaViagem.setNmoPassagem(leitor.nextInt());

                    System.out.println("Informe o valor da viagem: ");
                    novaViagem.setValorPassagem(leitor.nextDouble());

                    System.out.println("Informe qtd de dias da viagem: ");
                    novaViagem.setDias(leitor.nextInt());

                    System.out.println("Informe a classe: ");
                    novaViagem.setClasseAviao(leitor.next());

                    break;

                case 2:
                    System.out.printf("%-15S %-7S %-10S %-10S -%10S\n", "Destino", "Passagem", "Valor", "Dias", "Clase");
                    for(int i = 0; i < listaViagem.getTamanho(); i++){
                        Viagem viagem = listaViagem.getElemento(i);
                        System.out.printf("%-15s %-7d %-10.2f %-10d -%10s", viagem.getDestino(), viagem.getNmoPassagem(), viagem.getValorPassagem(), viagem.getDias(), viagem.getClasseAviao());
                    }
                    break;
                case 3:
                    leitor.close();
                    System.out.println("Encerrado!");
                    return;
                default:
                    System.out.println("Opção inválida.");


            }
        }
    }
}
