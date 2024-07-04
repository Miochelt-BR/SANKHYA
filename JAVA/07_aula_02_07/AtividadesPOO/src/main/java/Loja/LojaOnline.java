package Loja;

public class LojaOnline {
    public static void main(String[] args) {

        Produto tv = new Eletronico("TV", 1500.0, 10);
        Produto camisa = new Roupa("Camisa", 50.0, 100);
        Produto arroz = new Alimento("Arroz", 20.0, 200);


        tv.imprimirDetalhesProduto();
        camisa.imprimirDetalhesProduto();
        arroz.imprimirDetalhesProduto();


        System.out.println("Valor total do estoque de TV: " + tv.calcularValorTotalEstoque());
        System.out.println("Valor total do estoque de Camisa: " + camisa.calcularValorTotalEstoque());
        System.out.println("Valor total do estoque de Arroz: " + arroz.calcularValorTotalEstoque());


        if (tv instanceof Desconto) {
            double novoPreco = ((Desconto) tv).aplicarDesconto(10);
            System.out.println("Novo preço da TV com desconto: " + novoPreco);
        }

        if (camisa instanceof Desconto) {
            double novoPreco = ((Desconto) camisa).aplicarDesconto(15);
            System.out.println("Novo preço da Camisa com desconto: " + novoPreco);
        }


    }
}