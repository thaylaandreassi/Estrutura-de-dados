import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {
        // Desafio 1
        // Exibir a soma dos elementos do vetor

        int[] vetor = { 10, 20, 30, 40, 50, 60, 70 };
        int total = 0;
        for(int i=0; i < vetor.length; i++){
             total += vetor[i];
        }
        System.out.println("A soma dos vetores deu um total de: " +total + ".");

        // Desafio 2
        // Exibir a quantidade de elementos pares do vetor
        int[] vetor2 = {1, 2, 3, 4};
        int par = 0;
        for(int i =0; i < vetor2.length; i++){
            if(vetor2[i] %2 == 0){
                par++;
            }

        }
        System.out.println("A quantidade de números pares são: " + par + ".");

        // Desafio 3
        // Criar um vetor com os nomes dos dias da semana (Domingo, Segunda, Terça e etcc)
        // Solicitar que o usuário digite um número de 1 a 7
        // E ficar num loop enquanto o valor não for entre 1 a 7
        // Se o número for válido, exibir o dia da semana correspondente
        // Considerando que 1 é o Domingo, 2 é segunda, 3 é Terça, etcc..


        Scanner leitor = new Scanner(System.in);
        int valor = leitor.nextInt();
        String[] vetor3 = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        do{
            System.out.println("Informe um número que darei o dia da semana: ");
             leitor.nextInt();
        }
        while(valor < 1 || valor > 7);
            System.out.println("O dia da semana correspondente é " + vetor3[valor-1]);


        // Declaração de 5o vetor de inteiros, cujo tamanho será digitado pelo usuário
        int[] vet5;

        // Criação das variáveis
        int soma = 0, contaPares =0;
        int escolha;


    }
}
