package Transporte;

public class Trem extends Transporte implements Manutencao, HorarioDeFuncionamento {
    public Trem(int numeroDeAssentos, int capacidade, double tarifa) {
        super(numeroDeAssentos, capacidade, tarifa);
    }

    @Override
    public double calcularTarifaTotal(int numeroDePassageiros) {
        return numeroDePassageiros * tarifa;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Trem: ");
        System.out.println("Número de assentos: " + numeroDeAssentos);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Tarifa: " + tarifa);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção do trem realizada.");
    }

    @Override
    public String getHorarioDeFuncionamento() {
        return "04:00 - 01:00";
    }
}
