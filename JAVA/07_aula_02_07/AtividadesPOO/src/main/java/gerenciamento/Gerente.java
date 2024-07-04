package gerenciamento;

public class Gerente extends Funcionario implements AvaliacaoDesempenho {
    public Gerente(String nome, int idade, double salario, Departamento departamento) {
        super(nome, idade, salario, departamento);
    }

    @Override
    public double calcularBonusAnual() {
        return getSalario() * 0.20;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Gerente: " + getNome() + ", Idade: " + getIdade() + ", Salário: " + getSalario() + ", Departamento: " + getDepartamento());
    }

    @Override
    public void avaliarDesempenho() {
        System.out.println("Avaliando desempenho do gerente " + getNome());
    }
}
