package org.example;

public class Professor {
    private String nome;
    private Integer qtdAulaSemanal;
    private Double valorHoraAula;

    public Professor(String nome, Integer qtdAulaSemanal, Double valorHoraAula) {
        this.nome = nome;
        this.qtdAulaSemanal = qtdAulaSemanal;
        this.valorHoraAula = valorHoraAula;
    }

    public Double getValorBonus(){
        return qtdAulaSemanal * valorHoraAula * 4.5 * 0.15;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
                "nome='" + nome + '\'' +
                ", qtdAulaSemanal=" + qtdAulaSemanal +
                ", valorHoraAula=" + valorHoraAula +
                '}';
    }
}
