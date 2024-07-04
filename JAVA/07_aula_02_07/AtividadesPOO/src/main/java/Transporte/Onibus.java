package Transporte;

public class Onibus extends Transporte implements Manutencao, HorarioDeFuncionamento {
    public Onibus(int numeroDeAssentos, int capacidade, double tarifa) {
        super(numeroDeAssentos, capacidade, tarifa);
    }

    @Override
    public double calcularTarifaTotal(int numeroDePassageiros) {
        return numeroDePassageiros * tarifa;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Ônibus: ");
        System.out.println("Número de assentos: " + numeroDeAssentos);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Tarifa: " + tarifa);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção do ônibus realizada.");
    }

    @Override
    public String getHorarioDeFuncionamento() {
        return "05:00 - 23:00";
    }
}
