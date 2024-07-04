package Transporte;

public abstract class Transporte {
    protected int numeroDeAssentos;
    protected int capacidade;
    protected double tarifa;

    public Transporte(int numeroDeAssentos, int capacidade, double tarifa) {
        this.numeroDeAssentos = numeroDeAssentos;
        this.capacidade = capacidade;
        this.tarifa = tarifa;
    }

    public abstract double calcularTarifaTotal(int numeroDePassageiros);
    public abstract void imprimirDetalhes();
}

