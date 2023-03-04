public abstract class Funcionario {

    // Atributos
    private String cpf;
    private String nome;

    // Construtor

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // Métodos

    // Método abstrato calcSalario
    public abstract Double calcSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + calcSalario() +
                '}';
    }
}
