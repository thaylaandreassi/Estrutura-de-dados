package org.example;

public class ViagemNacional extends Viagem {
    private String tituloEleitor;
    private String RG;
    private String CPF;

    public ViagemNacional(String destino, String dataHoraEmbarque, String aeroporto, Double valorViagem, Boolean isComprovanteVacina, String tituloEleitor, String RG, String CPF) {
        super(destino, dataHoraEmbarque, aeroporto, valorViagem, isComprovanteVacina);
        this.tituloEleitor = tituloEleitor;
        this.RG = RG;
        this.CPF = CPF;
    }

    @Override
    public Double calcSeguroViagem() {
        Double calcSeguro = getValorViagem() * 0.3;
        System.out.println(calcSeguro);
        return null;
    }

    @Override
    public String toString() {
        return "ViagemNacional{" +
                "tituloEleitor='" + tituloEleitor + '\'' +
                ", RG='" + RG + '\'' +
                ", CPF='" + CPF + '\'' +
                "} " + super.toString();
    }
}
