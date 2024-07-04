package Loja;

public class Alimento extends Produto {
    public Alimento(String nome, double preco, int quantidadeEstoque) {
        super(nome, preco, quantidadeEstoque, TipoProduto.ALIMENTOS);
    }

    @Override
    public double calcularValorTotalEstoque() {
        return getPreco() * getQuantidadeEstoque();
    }

    @Override
    public void imprimirDetalhesProduto() {
        System.out.println("Alimento: " + getNome() + ", Preço: " + getPreco() + ", Quantidade em estoque: " + getQuantidadeEstoque());
    }
}
