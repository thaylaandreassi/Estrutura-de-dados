package org.example;

import javax.imageio.IIOException;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TesteViagem {
    public static void gravaArquivoCsv(ListaObj<Viagem> lista, String nomeArq) {

        FileWriter arq = null;

        Formatter saida = null;

        Boolean deuRuim = false;

        nomeArq += ".csv";

        try {
            arq = new FileWriter(nomeArq);
            saida = new Formatter(arq);
        } catch (IIOException erro) {
            System.out.println("erro ao abrir o arquivo");
            System.exit(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            for (int i = 0; i < lista.getTamanho(); i++) {

                Viagem viagem = lista.getElemento(i);
                saida.format("%d;%s;%d;%.2f;%d;%s\n",viagem.getId(),viagem.getDestino(), viagem.getNmoPassagem(), viagem.getValorPassagem(), viagem.getDias(), viagem.getClasseAviao());

            }
        } catch (FormatterClosedException erro) {
            System.out.println("erro ao gravar arquivo");
            deuRuim = true;
        } finally {
            saida.close();
            try {
                arq.close();
            } catch (IOException erro) {
                System.out.println("erro ao fechar arquivo");
                deuRuim = true;
            }
            if (deuRuim){
                System.exit(1);
            }
        }
    }
    public static void lerArquivoCsv(String nomeArq){
        FileReader arq = null;
        Scanner entrada = null;
        Boolean deuRuim = false;

        nomeArq += ".csv";

        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException erro){
            System.out.println("Arquivo nao encontrado");
            System.exit(1);
        }

        try {
            System.out.printf("%-5S %-20S %-10S %-15S %-10S %-10S\n","id","destino","passagem", "valor","dias", "classe");
            while (entrada.hasNext()){
                int id = entrada.nextInt();
                String destino = entrada.next();
                int nmoPassagem = entrada.nextInt();
                Double valorPassagem = entrada.nextDouble();
                int dias = entrada.nextInt();
                String classeAviao = entrada.next();
                System.out.printf("%-5d %-20s %-10d %-15.2f %-10d %-10s\n",id, destino, nmoPassagem, valorPassagem, dias, classeAviao);

            }
        } catch (NoSuchElementException erro){
            System.out.println("Arquivo com problema");
            deuRuim = true;
        } catch (IllegalStateException erro){

        } finally {
            entrada.close();
            try {
                arq.close();
            } catch (IOException erro) {
                System.out.println("erro ao fechar arquivo");
                deuRuim = true;
            }
            if (deuRuim){
                System.exit(1);
            }
        }

    }

    public static void gravaRegistro (String registro, String nomeArq) {
        BufferedWriter saida = null;

        // Bloco try-catch para abrir o arquivo
        try {
            saida = new BufferedWriter(new FileWriter(nomeArq, true));
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        // Bloco try-catch para gravar e fechar o arquivo
        try {
            saida.append(registro + "\n");
            saida.close();
        }
        catch (IOException erro) {
            System.out.println("Erro ao gravar no arquivo");
        }
    }

    public static void gravaArquivoTxt(List<Viagem> lista, String nomeArq) {
        int contaRegDadosGravados = 0;

        // Monta o registro de header
        String header = "00VIAGEM20231";
        header += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        header += "01";

        // Grava o registro de header
        gravaRegistro(header, nomeArq);

        // Monta e grava os registros de dados ou registros de corpo
        String corpo;
        for (int i = 0; i < lista.size(); i++) {
            Viagem v = lista.get(i);
            corpo = "02";
            corpo += String.format("%-5d", v.getId());
            corpo += String.format("%-20.20s", v.getDestino());
            corpo += String.format("%-10d", v.getNmoPassagem());
            corpo += String.format("%%-15.2f", v.getValorPassagem());
            corpo += String.format("%-10d", v.getDias());
            corpo += String.format("%-10.10s", v.getClasseAviao());
            gravaRegistro(corpo, nomeArq);
            contaRegDadosGravados++;
        }

        // Monta e grava o registro de trailer
        String trailer = "01";
        trailer += String.format("%010d",contaRegDadosGravados);
        gravaRegistro(trailer, nomeArq);

    }

    public static void leArquivoTxt(String nomeArq) {
        BufferedReader entrada = null;
        String registro, tipoRegistro;
        String destino, classeAviao, aeroportoOrigem;
        Double valorPassagem;
        int id, nmoPassagem, dias;
        int contaRegDadosLidos = 0;
        int qtdRegDadosGravados;

        List<Viagem> listaLida = new ArrayList<>();

        // try-catch para abrir o arquivo
        try {
            entrada = new BufferedReader(new FileReader(nomeArq));
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        try {
            // le o 1o registro do arquivo
            registro = entrada.readLine();

            while (registro != null) {
                tipoRegistro = registro.substring(0,2);
                if (tipoRegistro.equals("00")) {
                    System.out.println("É um registro de header");
                    System.out.println("Tipo do arquivo: " + registro.substring(3,6));
                    System.out.println("Data e hora de gravação do arquivo: " + registro.substring(7,26));
                    System.out.println("Versão do documento: " + registro.substring(27,28));
                }
                else if (tipoRegistro.equals("01")) {
                    System.out.println("É um registro de trailer");
                    qtdRegDadosGravados = Integer.parseInt(registro.substring(2,12));
                    if (qtdRegDadosGravados == contaRegDadosLidos) {
                        System.out.println("Quantidade de registros de dados gravados compatível com "
                                + "quantidade de registros de dados lidos");
                    }
                    else {
                        System.out.println("Quantidade de registros de dados gravados incompatível com "
                                + "quantidade de registros de dados lidos");
                    }
                }
                else if (tipoRegistro.equals("02")) {
                    System.out.println("É um registro de dados ou corpo");
                    id = Integer.parseInt(registro.substring(3,4));
                    destino = registro.substring(10,39).trim();
                    nmoPassagem = Integer.parseInt(registro.substring(5,9));
                    valorPassagem = Double.valueOf(registro.substring(40,45).replace(',','.'));
                    classeAviao = registro.substring(46,65).trim();
                    dias = Integer.parseInt(registro.substring(96,98));
                    Viagem v = new Viagem(id, destino, nmoPassagem, valorPassagem, dias, classeAviao);
                    contaRegDadosLidos++;

                    listaLida.add(v);

                }
                else {
                    System.out.println("Tipo de registro inválido!");
                }
                // le o próximo registro
                registro= entrada.readLine();
            }
            entrada.close();
        }
        catch (IOException erro) {
            System.out.println("Erro ao ler o arquivo");
        }

        // Exibe a lista lida
        System.out.println("\nLista contendo os dados lidos do arquivo:");
        for (Viagem v : listaLida) {
            System.out.println(v);
        }

    }


    public static void main(String[] args) {
    ListaObj<Viagem> listaViagem = new ListaObj<>(5);
        Scanner string = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        Scanner opcao = new Scanner(System.in);


        Integer opt = 0;

        while(opt != 5){
            System.out.println("--- AGENCIA DA THAY ---");
            System.out.println("1 - Adicionar uma viagem");
            System.out.println("2 - Exibir as viagens cadastradas");
            System.out.println("3 - Gravar viagens CSV");
            System.out.println("4 - Ler viagens CSV");
            System.out.println("5 - Gravar viagens TXT");
            System.out.println("6 - Ler viagens TXT ");
            System.out.println("7 - Encerrar");

             opt = opcao.nextInt();


            switch (opt){
                case 1:
                    System.out.println("Informe o ID:");
                    Integer id = numero.nextInt();

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
                    listaViagem.adiciona(viagem);

                    break;

                case 2:
                    System.out.printf("%-5S %-20S %-10S %-15S %-10S %-10S\n", "ID","Destino", "Passagem", "Valor", "Dias", "Classe");
                    for(int i = 0; i < listaViagem.getTamanho(); i++){
                        Viagem viagemLista = listaViagem.getElemento(i);
                        System.out.printf("%-5d %-20s %-10d %-7.2f %-10d %-10s\n", viagemLista.getId(),viagemLista.getDestino(), viagemLista.getNmoPassagem(), viagemLista.getValorPassagem(), viagemLista.getDias(), viagemLista.getClasseAviao());
                    }
                    break;
                case 3:
                    if (listaViagem.getTamanho() <= 0){
                        System.out.println("Lista vazia. Não há nada a gravar");

                        break;
                    }
                    gravaArquivoCsv(listaViagem, "viagens");

                    System.out.println("Arquivo gerado com sucesso!");
                    break;
                case 4:
                    lerArquivoCsv("viagens");
                    System.out.println("Leitura finalizada.");
                    break;
                case 5:
                    if (listaViagem.getTamanho() <= 0){
                        System.out.println("Lista vazia. Não há nada a gravar");

                        break;
                    }
                    List<Viagem> lista2 = new ArrayList<>();
                    lista2.add(new Viagem(listaViagem));
                    gravaArquivoTxt(lista2, "viagens");

                    System.out.println("Arquivo gerado com sucesso!");
                    break;

                case 6:
                    leArquivoTxt("viagens");
                    System.out.println("Leitura finalizada.");
                    break;
                case 7:
                    opcao.close();
                    System.out.println("Encerrado!");
                    return;
                default:
                    System.out.println("Opção inválida.");


            }
        }
    }
}
