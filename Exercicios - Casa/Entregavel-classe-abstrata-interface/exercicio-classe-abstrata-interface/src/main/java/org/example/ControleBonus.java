package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<IBonus> bonificados;

    public ControleBonus() {

        bonificados = new ArrayList<>();
    }

    public void adcBonus(IBonus b) {
        bonificados.add(b);
    }

    public void listar(){
        for(IBonus b : bonificados){
            System.out.println(b);
        }
    }

    public void calcTotalBonus(){
        Double total = 0.0;
        for(IBonus b : bonificados){
            total += b.getValorBonus();
        }
        System.out.println(total);
    }

    @Override
    public String toString() {
        return "ControleBonus{" +
                "bonificados=" + bonificados +
                '}';
    }
}
