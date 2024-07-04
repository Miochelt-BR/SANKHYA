package org.example.Restaurante;

public class RestauranteApp {

    public static void main(String[] args) {
        Refeicao entrada = new Entrada("Salada", 20.0);
        Refeicao pratoPrincipal = new PratoPrincipal("Bife com Batatas", 50.0);
        Refeicao sobremesa = new Sobremesa("Torta de Maçã", 15.0);

        entrada.preparar();
        pratoPrincipal.preparar();
        sobremesa.preparar();

        EntradaComDesconto entradaDesconto = new EntradaComDesconto("Salada", 20.0, 10, TipoRefeicao.ENTRADA);
        System.out.println("Desconto na entrada: " + entradaDesconto.calcularDesconto());

        PratoPrincipalComOferta pratoOferta = new PratoPrincipalComOferta("Bife com Batatas", 50.0, "Compre um e leve outro grátis!"+TipoRefeicao.ENTRADA);
        System.out.println("Oferta no prato principal: " + pratoOferta.obterDescricaoOferta() );
    }
}


