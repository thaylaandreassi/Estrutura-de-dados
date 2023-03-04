package org.example;

public class Coordenador extends Professor{
    private Integer qtdHoraCoordenador;
    private Double valorHoraCoordenador;

    public Coordenador(String nome, Integer qtdAulaSemanal, Double valorHoraAula, Integer qtdHoraCoordenador, Double valorHoraCoordenador) {
        super(nome, qtdAulaSemanal, valorHoraAula);
        this.qtdHoraCoordenador = qtdHoraCoordenador;
        this.valorHoraCoordenador = valorHoraCoordenador;
    }

    @Override
    public Double getValorBonus() {
        return super.getValorBonus() + qtdHoraCoordenador * valorHoraCoordenador * 4.5 * 0.2;
    }

    public Integer getQtdHoraCoordenador() {
        return qtdHoraCoordenador;
    }

    public void setQtdHoraCoordenador(Integer qtdHoraCoordenador) {
        this.qtdHoraCoordenador = qtdHoraCoordenador;
    }

    public Double getValorHoraCoordenador() {
        return valorHoraCoordenador;
    }

    public void setValorHoraCoordenador(Double valorHoraCoordenador) {
        this.valorHoraCoordenador = valorHoraCoordenador;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "qtdHoraCoordenador=" + qtdHoraCoordenador +
                ", valorHoraCoordenador=" + valorHoraCoordenador +
                "} " + super.toString();
    }
}
