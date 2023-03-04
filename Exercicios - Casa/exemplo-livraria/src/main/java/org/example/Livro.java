package org.example;

public class Livro extends Produto{
    // Atributos
    private String nome;
    private String autor;
    private String isbn;

    // Construtor
    public Livro(Integer codigo, Double precoCusto, String nome, String autor, String isbn) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    // Métodos

    @Override
    public Double getValorVenda() {
        return getPrecoCusto() * 1.10;
    }

    @Override
    public String toString() {
        return String.format("---Livro--- \n" +
                        "Nome:%s \n" +
                        "Autor: %s \n" +
                        "Isbn: %s \n" +
                        "Valor: R$%.2f \n", nome, autor, isbn, this.getValorVenda());
    }
}
