package org.example;

public class Teste {
    public static void main(String[] args) {
        Professor professor = new Professor("Julia", 20, 100.0);
        Coordenador coordenador = new Coordenador("Lara", 25, 150.0, 12, 200.0);

        ControleBonus controle = new ControleBonus();

        controle.adcEducador(professor);
        controle.adcEducador(coordenador);

        controle.listarProfissional();

        controle.calcTotalBonus();
    }
}
