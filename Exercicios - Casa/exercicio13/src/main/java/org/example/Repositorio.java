package org.example;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Viagem> lista;
    private PilhaObj<Viagem> pilha;
    private FilaObj<Viagem> fila;

    public Repositorio() {
        lista = new ArrayList<>();
        pilha = new PilhaObj<>(10);
        fila = new FilaObj<>(10);
    }

    public void salvar(Viagem obj) {
        lista.add(obj);
    }

    public void deletarPeloId(int id) {
        int index = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Viagem viagemDeletada = lista.get(index);
            lista.remove(index);
            pilha.push(viagemDeletada);
        } else {
            System.out.println("ID inválido.");
        }
    }

    public void desfazer() {
        if (pilha.isEmpty()) {
            System.out.println("Nenhuma operação a desfazer.");
        } else {
            Viagem viagemDesfeita = pilha.pop();
            lista.add(viagemDesfeita);
        }
    }

    public void agendarSalvar(Viagem obj) {
        fila.insert(obj);
    }

    public void executarAgendado(int qtdOperacoes) {
        if (qtdOperacoes < 0 || qtdOperacoes > fila.size()) {
            System.out.println("Quantidade de operações inválida.");
        } else if (fila.isEmpty()) {
            System.out.println("Nenhuma operação agendada.");
        } else {
            for (int i = 0; i < qtdOperacoes; i++) {
                Viagem viagemAgendada = fila.peek();
                salvar(viagemAgendada);
            }
        }
    }

    public void exibirRepositorio() {
        System.out.println("Conteúdo da lista:");
        for (Viagem viagem : lista) {
            System.out.println(viagem);
        }

        System.out.println("Conteúdo da pilha:");
        pilha.exibe();

        System.out.println("Conteúdo da fila:");
        fila.exibe();
    }
}

