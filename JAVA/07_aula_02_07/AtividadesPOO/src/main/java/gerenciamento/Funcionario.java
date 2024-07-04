package gerenciamento;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private Departamento departamento;

    public Funcionario(String nome, int idade, double salario, Departamento departamento) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public abstract double calcularBonusAnual();

    public abstract void imprimirDetalhes();
}
