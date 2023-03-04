package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aviao {
    private List<Viagem> viajante;

    public Aviao() {
        viajante = new ArrayList<>();
    }

    public void adicionarSeguroViagem(Viagem v){
        viajante.add(v);
        System.out.println("Seguro adicionado com sucesso!!!");
    }

    public void adicionarDestino(Viagem d){
        if(d.getComprovanteVacina()== true){
            System.out.println("Pode viajar!");
        } else{
            System.out.println("Proibido viajar sem vacina!");
        }


    }

    @Override
    public String toString() {
        return "Aviao{" +
                "viajante=" + viajante +
                '}';
    }
}
