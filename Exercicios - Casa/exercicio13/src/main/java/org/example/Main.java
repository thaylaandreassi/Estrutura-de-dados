package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Repositorio repositorio = new Repositorio();
                Scanner scanner = new Scanner(System.in);
                Scanner string = new Scanner(System.in);
                Scanner numero = new Scanner(System.in);

                int opcao = 0;
                while (opcao != 7) {
                    System.out.println("1- Salvar");
                    System.out.println("2- Deletar pelo id");
                    System.out.println("3- Desfazer");
                    System.out.println("4- Agendar salvar");
                    System.out.println("5- Executar agendamento");
                    System.out.println("6- Exibir repositório");
                    System.out.println("7- Finalizar");
                    System.out.print("Escolha uma opção: ");
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Informe o ID:");
                            Integer id = numero.nextInt();

                            if(id < 200){
                                System.out.println("ID inválido. Acima de 200!");
                                break;
                            }

                            System.out.println("Informe o destino: ");
                            String destino = string.nextLine();

                            System.out.println("Informe o nmr da passagem: ");
                            Integer nmoPassagem = numero.nextInt();

                            System.out.println("Informe o valor da viagem: ");
                            Double valorPassagem = numero.nextDouble();

                            System.out.println("Informe qtd de dias da viagem: ");
                            Integer numDias = numero.nextInt();

                            System.out.println("Informe a classe: ");
                            String classeAviao = string.nextLine();

                            Viagem viagem = new Viagem(id, destino, nmoPassagem, valorPassagem, numDias, classeAviao);
                            repositorio.salvar(viagem);
                            break;
                        case 2:
                            System.out.print("Digite o ID a ser deletado: ");
                            int idDeletar = scanner.nextInt();
                            repositorio.deletarPeloId(idDeletar);
                            break;
                        case 3:
                            repositorio.desfazer();
                            break;
                        case 4:
                            System.out.println("Informe o ID:");
                            Integer idAgendamento = numero.nextInt();

                            System.out.println("Informe o destino: ");
                            String destinoAgendamento = string.nextLine();

                            System.out.println("Informe o nmr da passagem: ");
                            Integer nmoPassagemAgendamento = numero.nextInt();

                            System.out.println("Informe o valor da viagem: ");
                            Double valorPassagemAgendamento = numero.nextDouble();

                            System.out.println("Informe qtd de dias da viagem: ");
                            Integer numDiasAgendamento = numero.nextInt();

                            System.out.println("Informe a classe: ");
                            String classeAviaoAgendamento = string.nextLine();

                            Viagem viagemAgendada = new Viagem(idAgendamento, destinoAgendamento, nmoPassagemAgendamento, valorPassagemAgendamento, numDiasAgendamento, classeAviaoAgendamento);
                            repositorio.agendarSalvar(viagemAgendada);
                            break;
                        case 5:
                            System.out.print("Digite a quantidade de operações agendadas a serem executadas: ");
                            int qtdOperacoes = scanner.nextInt();
                            repositorio.executarAgendado(qtdOperacoes);
                            break;
                        case 6:
                            repositorio.exibirRepositorio();
                            break;
                        case 7:
                            System.out.println("Finalizando...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }

                    System.out.println();
    }

}