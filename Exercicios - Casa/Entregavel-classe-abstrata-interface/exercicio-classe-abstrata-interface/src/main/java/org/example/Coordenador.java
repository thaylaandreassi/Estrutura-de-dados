package org.example;

public class Coordenador extends Educador{
    private Integer qtdHoraCoordenacao;
    private Double valorHrCoordenacao;

    public Coordenador(String nome, Integer qtdHoraCoordenacao, Double valorHrCoordenacao) {
        super(nome);
        this.qtdHoraCoordenacao = qtdHoraCoordenacao;
        this.valorHrCoordenacao = valorHrCoordenacao;
    }

    @Override
    public Double getValorBonus() {
        return qtdHoraCoordenacao * valorHrCoordenacao * 4.5 * 0.2;
    }

    public Integer getQtdHoraCoordenacao() {
        return qtdHoraCoordenacao;
    }

    public void setQtdHoraCoordenacao(Integer qtdHoraCoordenacao) {
        this.qtdHoraCoordenacao = qtdHoraCoordenacao;
    }

    public Double getValorHrCoordenacao() {
        return valorHrCoordenacao;
    }

    public void setValorHrCoordenacao(Double valorHrCoordenacao) {
        this.valorHrCoordenacao = valorHrCoordenacao;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "qtdHoraCoordenacao=" + qtdHoraCoordenacao +
                ", valorHrCoordenacao=" + valorHrCoordenacao +
                "} " + super.toString();
    }
}
