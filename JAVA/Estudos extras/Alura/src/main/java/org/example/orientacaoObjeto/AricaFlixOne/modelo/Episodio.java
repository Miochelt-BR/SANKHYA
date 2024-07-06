package org.example.orientacaoObjeto.AricaFlixOne.modelo;

import org.example.orientacaoObjeto.AricaFlixOne.calculadora.Classificavel;

public class Episodio  implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }


    @Override
    public int getclassificacao() {
        if (totalVisualizacoes > 100)
            return 4;
        else if (totalVisualizacoes > 50)
            return 3;
        else if (totalVisualizacoes > 20)
            return 2;
        else
            return 1;
    }
}
