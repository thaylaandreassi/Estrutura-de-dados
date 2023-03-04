package org.example;

public class Professor extends Educador {
    private Integer qtdAulaSemanal;
    private Double valorHoraAula;

    public Professor(String nome, Integer qtdAulaSemanal, Double valorHoraAula) {
        super(nome);
        this.qtdAulaSemanal = qtdAulaSemanal;
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public Double getValorBonus() {
        return qtdAulaSemanal * valorHoraAula * 4.5 * 0.15;
    }

    public Integer getQtdAulaSemanal() {
        return qtdAulaSemanal;
    }

    public void setQtdAulaSemanal(Integer qtdAulaSemanal) {
        this.qtdAulaSemanal = qtdAulaSemanal;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "qtdAulaSemanal=" + qtdAulaSemanal +
                ", valorHoraAula=" + valorHoraAula +
                "} " + super.toString();
    }
}
