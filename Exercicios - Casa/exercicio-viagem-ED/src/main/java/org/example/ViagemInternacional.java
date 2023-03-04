package org.example;

public class ViagemInternacional extends Viagem{
    private String passaporte;
    private String comprovanteHospedagem;
    private Boolean isVisto;
    private String tipoMoeda;

    public ViagemInternacional(String destino, String dataHoraEmbarque, String aeroporto, Double valorViagem, Boolean isComprovanteVacina, String passaporte, String comprovanteHospedagem, Boolean isVisto, String tipoMoeda) {
        super(destino, dataHoraEmbarque, aeroporto, valorViagem, isComprovanteVacina);
        this.passaporte = passaporte;
        this.comprovanteHospedagem = comprovanteHospedagem;
        this.isVisto = isVisto;
        this.tipoMoeda = tipoMoeda;
    }

    public Double cotacaoMoeda(){
        if(tipoMoeda == "euro"){
            System.out.printf("A cotação do Euro é de: %.2f", 6.50);
        } else if(tipoMoeda == "dolar"){
            System.out.printf("A cotação do Dólar é de: %.2f", 5.20);
        } else if (tipoMoeda == "libra esterlina") {
            System.out.printf("A cotação da Libra é de: %.2f", 7.50);
        } else {
            System.out.println("Não trabalhamos com essa moeda!");

        }
        return null;
    }

    @Override
    public Double calcSeguroViagem() {
        Double calcSeguro = getValorViagem() * 0.4;
        System.out.println(calcSeguro);
        return null;
    }

    @Override
    public String toString() {
        return "ViagemInternacional{" +
                "passaporte='" + passaporte + '\'' +
                ", comprovanteHospedagem='" + comprovanteHospedagem + '\'' +
                ", isVisto=" + isVisto +
                ", tipoMoeda='" + tipoMoeda + '\'' +
                "} " + super.toString();
    }
}
