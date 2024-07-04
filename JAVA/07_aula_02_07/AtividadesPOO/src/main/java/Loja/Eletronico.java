package Loja;

public class Eletronico extends Produto {
    public Eletronico(String nome, double preco, int quantidadeEstoque) {
        super(nome, preco, quantidadeEstoque, TipoProduto.ELETRONICOS);
    }

    @Override
    public double calcularValorTotalEstoque() {
        return getPreco() * getQuantidadeEstoque();
    }

    @Override
    public void imprimirDetalhesProduto() {
        System.out.println("Eletrônico: " + getNome() + ", Preço: " + getPreco() + ", Quantidade em estoque: " + getQuantidadeEstoque());
    }
}
