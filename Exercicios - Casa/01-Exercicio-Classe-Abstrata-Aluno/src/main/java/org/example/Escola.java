package org.example;

import java.util.ArrayList;
import java.util.List;

public class Escola {
private String nome;
private List<Aluno> aluno;

// construtor
    public Escola() {
        this.nome = nome;
        aluno = new ArrayList<>();

    }
    // métodos

    // adicionar aluno
    public void adicionaAluno(Aluno a ){
        aluno.add(a);
    }

    // exibir os alunos
    public void exibeTodos(){
        System.out.println("Lista de alunos: ");
        for (Aluno a : aluno){
            System.out.println(a);
        }
    }

    // exibir aluno graduação
    public void exibeAlunoGraduacao(){
        System.out.println("Lista aluno graduação: ");
        for(Aluno a : aluno){
            if(a instanceof AlunoGraduacao){
                System.out.println(a);
            }
        }
    }

    // exibir alunos aprovados
    public void exibeAprovados(){
        System.out.println("Lista de alunos aprovados: ");
        for (Aluno a : aluno){
            if(a.calculaMedia() >= 6.0){
                System.out.println(a);
            }
        }
        System.out.println("Este aluno não foi aprovado...");
    }

    // buscando Aluno por RA
    // por ser um void pode usar um return dentro do if
    public void buscaAluno(Integer ra){
        System.out.println("Aluno pelo RA: ");
        for(Aluno a : aluno){
            if(a.getRa().equals(ra)){
                System.out.println(a);
            }
        }
        System.out.println("Aluno não encontrado");
    }
}
