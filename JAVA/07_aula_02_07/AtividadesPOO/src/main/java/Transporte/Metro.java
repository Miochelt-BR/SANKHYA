package Transporte;

public class Metro extends Transporte implements Manutencao, HorarioDeFuncionamento {
    public Metro(int numeroDeAssentos, int capacidade, double tarifa) {
        super(numeroDeAssentos, capacidade, tarifa);
    }

    @Override
    public double calcularTarifaTotal(int numeroDePassageiros) {
        return numeroDePassageiros * tarifa;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Metrô: ");
        System.out.println("Número de assentos: " + numeroDeAssentos);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Tarifa: " + tarifa);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção do metrô realizada.");
    }

    @Override
    public String getHorarioDeFuncionamento() {
        return "24 horas";
    }
}
