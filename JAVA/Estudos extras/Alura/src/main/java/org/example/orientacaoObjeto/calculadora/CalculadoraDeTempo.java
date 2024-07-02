package org.example.orientacaoObjeto.calculadora;

import org.example.orientacaoObjeto.AricaFlixOne.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui(Filme filme) {
            tempoTotal += filme.getDuracaoEmMinutos();

    }

    }

