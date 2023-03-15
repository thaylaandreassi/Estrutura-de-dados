package org.example;

public class Main {
    public static void main(String[] args) {

        Integer troca = 0;
        Integer cont = 0;
        // testando
        int[] v = {4, 5, 1, 3, 7, 9, 2, 6, 8};

        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[i]) {
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                    troca++;
                }
                cont++;
            }
        }
        for (int resultado : v
        ) {
            System.out.print(resultado + "\t");
        }

        // Mostrando as trocas e a comparacao
        System.out.println("");
        System.out.println(troca);
        System.out.println(cont);
    }
}
