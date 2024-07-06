package org.example.orientacaoObjeto.projetLivro;

public class LIvro implements Calculavel {
    private String titulo;
    private int ano;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }






    @Override
    public double calcularPrecoFinal(double desconto) {
        double precoFinal = getPreco() - (getPreco() * desconto / 100);
        return precoFinal;
    }
}
