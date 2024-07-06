package org.example.orientacaoObjeto.AricaFlixOne.calculadora;

import org.example.orientacaoObjeto.AricaFlixOne.modelo.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui(Filme filme) {
            tempoTotal += filme.getDuracaoEmMinutos();

    }

    }

