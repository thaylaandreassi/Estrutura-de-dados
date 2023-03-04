package org.example;

public class TestaTributo {
    public static void main(String[] args) {
        Alimento arroz = new Alimento(123, "Arroz", 18.90, 8);
        Perfume malbec = new Perfume(321, "Malbec", 450.0, "amadeirado");
        Servico pintura = new Servico("Pintura de parede", 1500.0);


        Tributo trib = new Tributo();

        trib.adicionaTributavel(arroz);
        trib.adicionaTributavel(malbec);
        trib.adicionaTributavel(pintura);

        trib.exibeTodos();

        System.out.printf("\n O total de tributos é R$: %.2f\n",
                trib.calculaTotalTributo());


    }
}
