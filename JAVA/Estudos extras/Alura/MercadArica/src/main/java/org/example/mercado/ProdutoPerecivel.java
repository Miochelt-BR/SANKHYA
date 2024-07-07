package org.example.mercado;

public class ProdutoPerecivel  extends Produto {

    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    public <dataValidade> String tempoDeValidde( String dataValidade) {
        if (dataValidade.equals("01/01/2022")) {
            return "Validade em " + tempoDeValidde(this.dataValidade) + " dias";
        } else {
            return "Validade em " + tempoDeValidde(this.dataValidade) + " dias";
        }
    }
}
