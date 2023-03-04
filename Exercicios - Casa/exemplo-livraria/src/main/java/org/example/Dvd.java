package org.example;

public class Dvd extends Produto{
    // Atributos
    private String nome;
    private String gravadora;

    // construtor
    public Dvd(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public Double getValorVenda() {
        return getPrecoCusto() * 1.20;
    }

    @Override
    public String toString() {
        return String.format("---DVD--- \n" +
                "Nome:%s \n" +
                "Gravadora: %s \n" +
                "Valor: R$%.2f \n", nome, gravadora, this.getValorVenda());
    }
}
