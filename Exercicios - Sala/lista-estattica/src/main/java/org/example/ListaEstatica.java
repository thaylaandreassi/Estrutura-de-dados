package org.example;

public class ListaEstatica {
    public static void main(String[] args) {
    }

    private int vetor[];
    private int nroElem;

    public ListaEstatica(int[] vetor){
        vetor = new int[5];
        nroElem = 0;
    }

    public void add(Integer novoVetor){
        if(nroElem < vetor.length){
            vetor[nroElem] = novoVetor;
        } else {
            System.out.println("Lista cheia");
        }
    }

    public void show(){
        for(int i = 0; i < nroElem; i++){
            System.out.println(vetor[i]);
        }
    }

    public int find(Integer indice){
        for(int i = 0; i < nroElem; i++){
           if(indice == vetor[nroElem]){
               return vetor[nroElem];
           }
        }
        return -1;
    }

    public boolean removeForId(Integer indice){
        for(int i = 0; i < nroElem; i++){
            
        }
    }


}