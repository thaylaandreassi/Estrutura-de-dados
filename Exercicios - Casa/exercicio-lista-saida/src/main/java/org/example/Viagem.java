package org.example;

public class Viagem {
    private int id;
    private int nmoPassagem;
    private String destino;
    private double valorPassagem;
    private String classeAviao;
    private String aeroportoOrigem;
    private int dias;

    public Viagem(int id) {
        this.id = id;
        this.nmoPassagem = nmoPassagem;
        this.destino = destino;
        this.valorPassagem = valorPassagem;
        this.classeAviao = classeAviao;
        this.aeroportoOrigem = aeroportoOrigem;
        this.dias = dias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNmoPassagem() {
        return nmoPassagem;
    }

    public void setNmoPassagem(int nmoPassagem) {
        this.nmoPassagem = nmoPassagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public String getClasseAviao() {
        return classeAviao;
    }

    public void setClasseAviao(String classeAviao) {
        this.classeAviao = classeAviao;
    }

    public String getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public void setAeroportoOrigem(String aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Viagem{" +
                "id=" + id +
                ", nmoPassagem=" + nmoPassagem +
                ", destino='" + destino + '\'' +
                ", valorPassagem=" + valorPassagem +
                ", classeAviao='" + classeAviao + '\'' +
                ", aeroportoOrigem='" + aeroportoOrigem + '\'' +
                ", dias=" + dias +
                '}';
    }
}