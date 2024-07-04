package Loja;

public abstract class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private TipoProduto tipo;

    public Produto(String nome, double preco, int quantidadeEstoque, TipoProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public abstract double calcularValorTotalEstoque();
    public abstract void imprimirDetalhesProduto();
}

