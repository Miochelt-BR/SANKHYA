package Loja;

public class Roupa extends Produto {
    public Roupa(String nome, double preco, int quantidadeEstoque) {
        super(nome, preco, quantidadeEstoque, TipoProduto.ROUPAS);
    }

    @Override
    public double calcularValorTotalEstoque() {
        return getPreco() * getQuantidadeEstoque();
    }

    @Override
    public void imprimirDetalhesProduto() {
        System.out.println("Roupa: " + getNome() + ", Preço: " + getPreco() + ", Quantidade em estoque: " + getQuantidadeEstoque());
    }
}
