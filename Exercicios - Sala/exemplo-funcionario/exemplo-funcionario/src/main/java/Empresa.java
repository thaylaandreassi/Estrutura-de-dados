import java.util.ArrayList;
import java.util.List;

public class Empresa {

    // Atributo
    private List<Funcionario> lista;

    // Construtor
    public Empresa() {
        lista = new ArrayList<Funcionario>();
    }

    // Métodos

    public void adicionaFunc(Funcionario f) {
        lista.add(f);
    }

    public void exibeTodos() {
        System.out.println("Lista dos funcionários:");
        for (Funcionario f : lista) {
            System.out.println(f);
        }
    }

    public void exibeTotalSalario() {
        Double total = 0.0;
        for (Funcionario f : lista) {
            total += f.calcSalario();
        }
        System.out.printf("O total dos salários é R$ %.2f\n", total);
    }

    public void exibeHoristas() {
        System.out.println("Lista dos horistas:");
        for (Funcionario f : lista) {
            if (f instanceof Horista) {
                System.out.println(f);
            }
        }

    }

}
