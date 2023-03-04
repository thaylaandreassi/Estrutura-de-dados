package org.example;

public class Alimento extends Produto {

    // Atributo
    private Integer quantVitamina;

    // Construtor

    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    // Métodos

    // Implementação do método abstrato

    @Override
    public Double getValorTributo() {
        return getPreco() * 0.15;
    }

    // Implementação do toString

    @Override
    public String toString() {
        return "Alimento{" +
                "quantVitamina=" + quantVitamina +
                "} " + super.toString();
    }
}
