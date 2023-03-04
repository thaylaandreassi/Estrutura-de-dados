package org.example;

public class Teste {
    public static void main(String[] args) {

        Professor professor = new Professor("Julia", 25, 100.0);
        Coordenador coordenador = new Coordenador("Marcela", 20, 150.0);

        ControleBonus controle = new ControleBonus();

        controle.adcBonus(professor);
        controle.adcBonus(coordenador);

        controle.listar();

        controle.calcTotalBonus();



    }
}
