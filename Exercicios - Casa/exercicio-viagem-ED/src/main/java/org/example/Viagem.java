package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Viagem {
    private String destino;
    private String dataHoraEmbarque;
    private String aeroporto;
    private Double valorViagem;
    private Boolean isComprovanteVacina;

    private List<Viagem> viajante;
    public Viagem(String destino, String dataHoraEmbarque, String aeroporto, Double valorViagem, Boolean isComprovanteVacina) {
        this.destino = destino;
        this.dataHoraEmbarque = dataHoraEmbarque;
        this.aeroporto = aeroporto;
        this.valorViagem = valorViagem;
        this.isComprovanteVacina = isComprovanteVacina;
        this.viajante = new ArrayList<>();
    }
    public abstract Double calcSeguroViagem();
    public String getDestino() {

        return destino;
    }

    public void setDestino(String destino) {

        this.destino = destino;
    }

    public String getDataHoraEmbarque() {
        return dataHoraEmbarque;
    }

    public void setDataHoraEmbarque(String dataHoraEmbarque) {
        this.dataHoraEmbarque = dataHoraEmbarque;
    }

    public String getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(String aeroporto) {
        this.aeroporto = aeroporto;
    }

    public Double getValorViagem() {
        return valorViagem;
    }

    public void setValorViagem(Double valorViagem) {
        this.valorViagem = valorViagem;
    }

    public Boolean getComprovanteVacina() {
        return isComprovanteVacina;
    }

    public void setComprovanteVacina(Boolean comprovanteVacina) {
        isComprovanteVacina = comprovanteVacina;
    }


    @Override
    public String toString() {
        return "Viagem{" +
                "destino='" + destino + '\'' +
                ", dataHoraEmbarque='" + dataHoraEmbarque + '\'' +
                ", aeroporto='" + aeroporto + '\'' +
                ", valorViagem=" + valorViagem +
                ", isComprovanteVacina=" + isComprovanteVacina +
                '}';
    }
}
