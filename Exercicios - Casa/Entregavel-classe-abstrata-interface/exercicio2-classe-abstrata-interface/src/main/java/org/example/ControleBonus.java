package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Professor> bonificacao;

    public ControleBonus() {
        bonificacao = new ArrayList<>();
    }

    public void adcEducador(Professor p){
        bonificacao.add(p);
        System.out.println(p);
    }

    public void listarProfissional(){
        for(Professor p : bonificacao){
            System.out.println(p);
        }
    }

    public void calcTotalBonus(){
        Double total = 0.0;
        for(Professor p : bonificacao){
            total += p.getValorBonus();
        }
        System.out.println(total);
    }
}
