package org.example;

public class Ordenacao {
    public static void main(String[] args) {


                int[] v = {4, 5, 1, 3, 7, 9, 2, 6, 8};
                bubble(v);

                int numEncontrar = 5;
                binario(numEncontrar, v);
    }

            public static void sort(int[] v) {
                for (int i = 0; i < v.length - 1; i++) {
                    for (int j = i + 1; j < v.length; j++) {
                        if (v[j] < v[i]) {
                            int aux = v[i];
                            v[i] = v[j];
                            v[j] = aux;

                        }
                    }
                }
                for (int i = 0; i < v.length; i++) {
                    System.out.println(v[i]);
                }
            }

            // segunda forma com o menor
            public static void sortMenor(int[] v) {
                int intMenor = 0;
                for (int i = 0; i < v.length - 1; i++) {
                    for (int j = i + 1; j < v.length; j++) {
                        if (v[j] < v[i]) {
                            int aux = v[i];
                            v[i] = v[j];
                            v[j] = v[i];

                        }
                    }

                }
                for (int i = 0; i < v.length; i++) {
                    System.out.println(v[i]);

                }
            }

            // bubble
            public static void bubble(int[] v) {
                int troca = 0;
                int comp = 0;
                for (int i = 0; i < v.length - 1; i++) {
                    for (int j = 1; j < v.length; j++) {
                        comp++;

                        if (v[j - 1] > v[j]) {
                            int aux = v[j];
                            v[j] = v[j - 1];
                            v[j - 1] = aux;
                            troca++;
                        }
                    }
                }
                for (int i = 0; i < v.length; i++) {
                    System.out.println(v[i]);
                    System.out.println("troca = " + troca);
                    System.out.println("comparacao = " + comp);
                }
            }

            public static void binario(int numEncontrar, int[] v) {
                bubble(v);
                Boolean e = false;

                int start = 0;
                int end = v.length - 1;
                int middle = (start + end) / 2;

                while (!e) {
                    if (numEncontrar == v[middle]) {
                        System.out.println(middle);
                        e = true;
                    } else if (numEncontrar > v[middle]) {
                        start = middle + 1;
                    } else {
                        end = middle - 1;
                    }
                }
            }

    }