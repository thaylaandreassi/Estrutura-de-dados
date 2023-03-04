package org.example;

public class Perfume extends Produto{

    // Atributo
    private String fragnancia;

    // Construtor
    public Perfume(Integer codigo, String descricao, Double preco, String fragnancia) {
        super(codigo, descricao, preco);
        this.fragnancia = fragnancia;

    }

    // Métodos

    @Override
    public Double getValorTributo() {
        return getPreco() * 0.27;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "fragnancia='" + fragnancia + '\'' +
                "} " + super.toString();
    }
}
