package org.example;

public abstract class Produto implements Tributavel {
    // Atributos
    private Integer codigo;
    private String descricao;
    private Double preco;

    // Construtor

    public Produto(Integer codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Métodos

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao='" + descricao + '\'' + ", preco=" + preco +  ", tributo= " + getValorTributo() +'}';
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }
}
