package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteCarrinho {
    public static void main(String[] args) {

        // objeto
        Carrinho carrinho = new Carrinho();

        Scanner string = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        Scanner opcao = new Scanner(System.in);

        Integer opt = 0;

        while(opt != 6){
            System.out.println("-- Escolha uma opção --");
            System.out.println("1 - Adicionar Livro \n" +
                    "2 - Adicionar DVD \n" +
                    "3 - Adicionar Serviço \n" +
                    "4 - Exibir itens do Carrinho \n" +
                    "5 - Exibir total de Vendas \n" +
                    "6 - FIM");
            opt = opcao.nextInt();

            switch (opt){
                case 1:
                    System.out.println("1 - ADICIONAR LIVRO");

                    System.out.println("Código:");
                    Integer codigoL = numero.nextInt();

                    System.out.println("Preço: ");
                    Double precoL = numero.nextDouble();

                    System.out.println("Nome: ");
                    String nomeL = string.nextLine();

                    System.out.println("Autor: ");
                    String autorL = string.nextLine();

                    System.out.println("ISBN: ");
                    String isbn = string.nextLine();

                    Livro livro = new Livro(codigoL, precoL, nomeL, autorL, isbn);

                    carrinho.adicionaVendavel(livro);
                    break;
                case 2:
                    System.out.println("1 - ADICIONAR DVD: ");

                    System.out.println("Código:");
                    Integer codigoD = numero.nextInt();

                    System.out.println("Preço: ");
                    Double precoD = numero.nextDouble();

                    System.out.println("Nome: ");
                    String nomeD = string.nextLine();

                    System.out.println("Nome Gravadora: ");
                    String gravadora = string.nextLine();

                    Dvd dvd = new Dvd(codigoD, precoD, nomeD, gravadora);

                    carrinho.adicionaVendavel(dvd);
                    break;
                case 3:
                    System.out.println("1 - ADICIONAR SERVIÇO: ");

                    System.out.println("Descrição:");
                    String descricao = string.nextLine();

                    System.out.println("Código de Serviço: ");
                    Integer codigo = numero.nextInt();

                    System.out.println("Quantidade de horas: ");
                    Integer horas = numero.nextInt();

                    System.out.println("Valor da hora:: ");
                    Double valor = numero.nextDouble();

                    Servico servico = new Servico(descricao, codigo, horas, valor);

                    carrinho.adicionaVendavel(servico);
                    break;
                case 4:
                    carrinho.exibeItensCarrinho();
                    break;
                case 5:
                    System.out.printf("Total das vendas: R$ %.2f\n", carrinho.calculaTotalVenda());
                    break;
                case 6:
                    System.out.println("FIM DE PROGRAMA!");
                    break;
                default:
                    System.out.println("Valor inválido.. Tente novamente.");
            }
        }


    }
}
