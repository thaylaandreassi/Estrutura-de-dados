package org.example;

public abstract class Educador implements IBonus {
    private String nome;

    public Educador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Educador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

