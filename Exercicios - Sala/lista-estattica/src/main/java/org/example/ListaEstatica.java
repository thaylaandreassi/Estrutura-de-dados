package org.example;

public class ListaEstatica {

    private int vetor[];
    private int nroElem;
    private int capacidade;

    public ListaEstatica(int tamanho) {
        vetor = new int[tamanho];
        nroElem = 0;
        capacidade = capacidade;
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

    public int find(Integer elementoBuscando){
       for(int i = 0; i < nroElem; i++){
           if(vetor[i] == elementoBuscando){
               return i;
           }
       }
       return -1;
    }

    public boolean removeForId(Integer indice){
       if(indice < 0 || indice >= nroElem){
           System.out.println("Indice inválido");
           return false;
       }
       for (int i = indice; i < nroElem-1; i++){
           vetor[i] = vetor[i + 1];
       }
       nroElem--;
       return true;
    }
    public boolean removeElement(Integer elementoARemover) {
        return removeForId(find(elementoARemover));
    }

    public boolean substitui(int valorAntigo, int valorNovo){
        for (int i = 0; i < this.nroElem; i++){
            if(this.vetor[i] == valorAntigo){
                this.vetor[i] = valorNovo;
                return true;
            }
        }
        System.out.println("Valor não encontrado.");
        return false;
    }

    public int contaOcorrencias(int valor){
        int contagem = 0;
        for(int i = 0; i < this.nroElem; i++){
            if(this.vetor[i] == valor){
                contagem++;
            }
        }
        return contagem;
    }

    public boolean adicionaNoInicio(int elemento){
        if(nroElem == vetor.length){
            System.out.println("Lista cheia");
            return false;
        }
        for (int i = nroElem + 1; i >= 0; i--){
            vetor[i + 1] = vetor[i];
        }
        vetor[0] = elemento;

        nroElem ++;
        return true;

    }




}