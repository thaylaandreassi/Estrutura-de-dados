public class ListaObj <T> {
    private T[] vetor;
    private int nroElem;
    private int capacidade;

    public ListaObj(int tamanho) {
        this.vetor = (T[]) new Object[tamanho];
        nroElem = 0;
        capacidade = capacidade;
    }

    public void add(T novoVetor){
        if(nroElem < vetor.length){
            vetor[nroElem].equals(novoVetor);
        } else {
            System.out.println("Lista cheia");
        }
    }

    public void show(){
        for(int i = 0; i < nroElem; i++){
            System.out.println(vetor[i]);
        }
    }

    public int find(T elementoBuscando){
        for(int i = 0; i < nroElem; i++){
            if(vetor[i].equals(elementoBuscando)){
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
//    public boolean removeElement(T elementoARemover) {
//        return removeForId(find(elementoARemover);
//    }

    public int getTamanho(){
        return nroElem;
    }

    public T getElemento(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return null;
        }
        return vetor[indice];
    }

    public void limpa(){
        for(int i = 0; i <= nroElem + 1; i++) {
            vetor[i] = null;
            nroElem--;
        }
    }


}
