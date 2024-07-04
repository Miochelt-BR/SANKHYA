package gerenciamento;

public class Desenvolvedor extends Funcionario implements Treinamento {
    public Desenvolvedor(String nome, int idade, double salario, Departamento departamento) {
        super(nome, idade, salario, departamento);
    }

    @Override
    public double calcularBonusAnual() {
        return getSalario() * 0.10;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Desenvolvedor: " + getNome() + ", Idade: " + getIdade() + ", Salário: " + getSalario() + ", Departamento: " + getDepartamento());
    }

    @Override
    public void realizarTreinamento() {
        System.out.println("Realizando treinamento para o desenvolvedor Master Bora Codar " + getNome());
    }
}
