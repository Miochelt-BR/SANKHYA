package org.example.Restaurante;

public class PratoPrincipalComOferta extends PratoPrincipal implements OfertaEspecial {
    private String descricaoOferta;

    public PratoPrincipalComOferta(String nome, double preco, String descricaoOferta) {
        super(nome, preco);
        this.descricaoOferta = descricaoOferta;
    }

    @Override
    public String obterDescricaoOferta() {
        return descricaoOferta;
    }
}
