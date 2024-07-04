package org.example.Restaurante;

public class EntradaComDesconto extends Entrada implements Desconto {
    private double percentualDesconto;

    public EntradaComDesconto(String nome, double preco, double percentualDesconto, TipoRefeicao entrada) {
        super(nome, preco);
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * (percentualDesconto / 100);
    }
}
