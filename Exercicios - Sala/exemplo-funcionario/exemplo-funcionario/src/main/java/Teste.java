public class Teste {

    public static void main(String[] args) {
        //Não é possível fazer new de uma classe abstrata
        //Por isso, a linha abaixo dá erro!
        //Funcionario f = new Funcionario("1234", "João");

        // Criação dos objetos das classes herdeiras de Funcionario
        Engenheiro e = new Engenheiro("1234", "João",
                                       15000.0);
        Vendedor v = new Vendedor("5678", "Mickey",
                                30000.0, 0.10);
        Horista h = new Horista("3456", "Pateta",
                                20, 100.0);

        // Exibição dos dados dos objetos
        System.out.println(e);
        System.out.println(v);
        System.out.println(h);

        // Criação do objeto Empresa
        Empresa sptech = new Empresa();

        // Adicionando os objetos à Empresa
        sptech.adicionaFunc(e);
        sptech.adicionaFunc(v);
        sptech.adicionaFunc(h);

        System.out.println();
        sptech.exibeTodos();

        System.out.println();
        sptech.exibeTotalSalario();

        System.out.println();
        sptech.exibeHoristas();


    }
}
