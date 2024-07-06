package org.example.orientacaoObjeto.precobom;

public class Servico  implements Vendavel {
    private String nome;
    private int quantidade;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal(int quantidade, double desconto) {
        double precoFinal = quantidade -    (quantidade * desconto / 100);
        return precoFinal;
    }

}
