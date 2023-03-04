package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Vendavel> cart;

    // Construtor

    public Carrinho() {
        cart = new ArrayList<>();
    }

    // Métodos
    public void adicionaVendavel(Vendavel v){
        System.out.println("Adicionando uma Vendavel: ");
        cart.add(v);
    }
    public Double calculaTotalVenda(){
    Double total = 0.0;
        for(Vendavel v : cart){
            total += v.getValorVenda();
        }
        return total;
    }
    public void exibeItensCarrinho(){
        System.out.println("Lista de todos os items do carrinho: ");
        for(Vendavel v : cart){
            System.out.println(v);
        }
    }
}
