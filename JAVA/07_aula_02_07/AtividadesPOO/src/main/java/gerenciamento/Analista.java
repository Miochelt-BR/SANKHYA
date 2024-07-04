package gerenciamento;


    public class Analista extends Funcionario implements AvaliacaoDesempenho, Treinamento {
        public Analista(String nome, int idade, double salario, Departamento departamento) {
            super(nome, idade, salario, departamento);
        }

        @Override
        public double calcularBonusAnual() {
            return getSalario() * 0.15;
        }

        @Override
        public void imprimirDetalhes() {
            System.out.println("Analista: " + getNome() + ", Idade: " + getIdade() + ", Salário: " + getSalario() + ", Departamento: " + getDepartamento());
        }

        @Override
        public void avaliarDesempenho() {
            System.out.println("Avaliando desempenho do analista " + getNome());
        }

        @Override
        public void realizarTreinamento() {
            System.out.println("Realizando treinamento para o analista " + getNome());
        }
    }


