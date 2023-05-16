package org.example;

import java.util.Scanner;
import java.util.Stack;

import static org.example.PilhaObj.inverteFrase;

public class Main {

    public static boolean ehPalindromo(int[] vetor) {
        Pilha pilha = new Pilha(vetor.length);
        for (int i = 0; i < vetor.length; i++) {
            pilha.push(vetor[i]);
        }
        for (int i = 0; i < vetor.length; i++) {
            int elemento = pilha.pop();
            if (elemento != vetor[i]) {
                return false;
            }
        }
        return true;
    }

    public static void converteParaBinario(int decimal) {
        Pilha pilha = new Pilha(decimal);
        while (decimal > 0) {
            int resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal / 2;
        }
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        System.out.println();
    }

    public static boolean ehPolindrome(String str) {
        Stack<Character> stack = new Stack<>();
        String processedStr = processString(str);

        // Empilha os caracteres da primeira metade da cadeia de caracteres
        for (int i = 0; i < processedStr.length() / 2; i++) {
            stack.push(processedStr.charAt(i));
        }

        // Verifica se a segunda metade da cadeia de caracteres é palíndroma
        for (int i = (processedStr.length() + 1) / 2; i < processedStr.length(); i++) {
            if (stack.empty() || processedStr.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    private static String processString(String str) {
        return str.replaceAll("[\s-]", "")
                .toLowerCase()
                .replaceAll("[áàâãä]", "a")
                .replaceAll("[éèêë]", "e")
                .replaceAll("[íìîï]", "i")
                .replaceAll("[óòôõö]", "o")
                .replaceAll("[úùûü]", "u");
    }
    public static void main(String[] args) {

        // ex: 1
        int[] vetor = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        if (ehPalindromo(vetor)) {
            System.out.println("O vetor é palíndromo.");
        } else {
            System.out.println("O vetor não é palíndromo.");
        }

        // ex: 2
        int decimal1 = 9;
        int decimal2 = 12;
        int decimal3 = 32;
        System.out.print(decimal1 + " em binário: ");
        converteParaBinario(decimal1);
        System.out.print(decimal2 + " em binário: ");
        converteParaBinario(decimal2);
        System.out.print(decimal3 + " em binário: ");
        converteParaBinario(decimal3);


        // ex: 3
        PilhaObj<String> pilha = new PilhaObj<>(5);
        pilha.push("aaa");
        pilha.push("bbb");
        pilha.push("ccc");
        pilha.exibe();
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());


        // ex: 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();
        String fraseInv = inverteFrase(frase);
        System.out.println("Frase invertida: " + fraseInv);

        // ex:5
        String[] testStrings = {"radar", "ovo", "Ana", "subi no ônibus", "Socorram-me subi no ônibus em Marrocos", "anotaram a data da maratona", "a torre da derrota", "Viajar de avião é legal"};

        for (String str : testStrings) {
            if (ehPolindrome(str)) {
                System.out.println(str + " é palíndroma");
            } else {
                System.out.println(str + " não é palíndroma");
            }
        }
    }
}