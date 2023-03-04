package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tributo {

// Criando a lista
private List<Tributavel> listaTrib;

// Construtor
    public Tributo() {
        listaTrib = new ArrayList<>();
    }

    // Métodos
    public void adicionaTributavel(Tributavel t) {
        System.out.println("Adicionando o Tributo: ");
        listaTrib.add(t);
    }

    public void exibeTodos(){
        System.out.println("Lista dos items tributáveis: ");
        for (Tributavel t : listaTrib){
            System.out.println(t);
        }
    }

    public Double calculaTotalTributo(){
        Double total = 0.0;
        System.out.println("Valor total dos tributos: ");
        for(Tributavel t : listaTrib){
            total += t.getValorTributo();
        }
        return total;
    }

}
