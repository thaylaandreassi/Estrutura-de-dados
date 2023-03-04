package org.example;

import java.util.List;

public class GuiaTuristico {
    private Integer idGuia;
    private String nome;
    private String idioma;
    private Integer qtdHoraTrabalho;


    public GuiaTuristico(Integer idGuia, String nome, String idioma, Integer qtdHoraTrabalho) {
        this.idGuia = idGuia;
        this.nome = nome;
        this.idioma = idioma;
        this.qtdHoraTrabalho = qtdHoraTrabalho;
    }

    public Double salarioGuia(){
       return qtdHoraTrabalho * 0.4;
    }

    @Override
    public String toString() {
        return "GuiaTuristico{" +
                "idGuia=" + idGuia +
                ", nome='" + nome + '\'' +
                ", idioma='" + idioma + '\'' +
                ", qtdHoraTrabalho=" + qtdHoraTrabalho +
                '}';
    }
}
