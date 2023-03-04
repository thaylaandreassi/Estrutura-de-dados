package org.example;

public class TesteAluno {
    public static void main(String[] args) {

        AlunoFundamental fundamental = new AlunoFundamental(1, "João", 10.0, 10.0, 10.0, 10.0);
        AlunoGraduacao graduacao = new AlunoGraduacao(2, "Felipe", 4.0,3.5);
        AlunoPos posGraduacao = new AlunoPos(3, "Isabela", 7.0,6.0,8.0);

        // adicionando uma escola
        Escola sptech = new Escola();

        // adicionando alunos
        sptech.adicionaAluno(graduacao);
        sptech.adicionaAluno(posGraduacao);
        sptech.adicionaAluno(fundamental);

        // mostrando o aluno graduacao
        System.out.println(graduacao);

        // mostrando alunos aprovados
        sptech.exibeAprovados();

        // buscando aluno por RA
        sptech.buscaAluno(0);

    }
}