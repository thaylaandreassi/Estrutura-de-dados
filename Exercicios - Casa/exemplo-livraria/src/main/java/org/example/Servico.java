package org.example;

public class Servico implements Vendavel {
    //Atributos
    private String descricao;
    private Integer codigo;
    private Integer quantHoras;
    private Double valorHora;

    // Construtor

    public Servico(String descricao, Integer codigo, Integer quantHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(Integer quantHoras) {
        this.quantHoras = quantHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public Double getValorVenda() {

        return quantHoras * valorHora;
    }

    @Override
    public String toString() {
        return String.format("---Serviço--- \n" +
                "Descrição: %s \n" +
                "Código: %d \n" +
                "Quantidade de Horas: %d \n" +
                "Valor da hora: R$%.2f \n" +
                "Valor: R$%.2f \n", descricao, codigo, quantHoras, valorHora, this.getValorVenda());
    }
}
