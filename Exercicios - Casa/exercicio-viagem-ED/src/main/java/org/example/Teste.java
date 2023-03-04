package org.example;

public class Teste {
    public static void main(String[] args) {
        ViagemNacional nacional = new ViagemNacional("Rio de Janeiro", "05-06-2023 : 21:00",
                "Rio Galeão", 500.0, true, "32123-4","0502124-1", "123456-78");

        ViagemInternacional internacional = new ViagemInternacional("Roma", "02-04-2023 : 00:20", "Leonardo da Vinci",
                2300.50, true, "212121-3", "Dom Hotel", true, "euro");

        GuiaTuristico guia = new GuiaTuristico(1, "Jorge", "inglês", 8);

        Aviao viajante = new Aviao();


        // adicionando seguro viagem
         viajante.adicionarSeguroViagem(nacional);
         viajante.adicionarDestino(internacional);

        System.out.println("-------------------------------------");

        // calcular o seguro
        System.out.println("Seguro adicionado e o valor é de: ");
        System.out.println("Nacional: ");
        nacional.calcSeguroViagem();
        System.out.println("Internacional: ");
        internacional.calcSeguroViagem();

        System.out.println("---------------------------------");


        // mostrando os destinos completos
        System.out.println("Viagem completa:");
        System.out.println(nacional);
        System.out.println(internacional);

        System.out.println("--------------------");

        // cotação da moeda
        internacional.cotacaoMoeda();





    }
}

