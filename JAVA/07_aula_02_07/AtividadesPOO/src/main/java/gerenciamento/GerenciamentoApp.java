package gerenciamento;

public class GerenciamentoApp {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Alice", 45, 10000, Departamento.TI);
        Funcionario desenvolvedor = new Desenvolvedor("Bob", 30, 5000, Departamento.TI);
        Funcionario analista = new Analista("Carlos", 28, 4000, Departamento.MARKETING);
        Funcionario chefe = new Desenvolvedor("David", 40, 6000, Departamento.RH);

        gerente.imprimirDetalhes();
        desenvolvedor.imprimirDetalhes();
        analista.imprimirDetalhes();

        System.out.println("Bônus anual do Gerente: " + gerente.calcularBonusAnual());
        System.out.println("Bônus anual do Desenvolvedor: " + desenvolvedor.calcularBonusAnual());
        System.out.println("Bônus anual do Analista: " + analista.calcularBonusAnual());

        ((AvaliacaoDesempenho) gerente).avaliarDesempenho();
        ((Treinamento) desenvolvedor).realizarTreinamento();
        ((AvaliacaoDesempenho) analista).avaliarDesempenho();
        ((Treinamento) analista).realizarTreinamento();
    }
}

