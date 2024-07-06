package org.example.orientacaoObjeto.ExerciciosFinalNoite.conversormoedas.coversor;

import java.text.DecimalFormat;

public class app {
    public static void main(String[] args) {
        ConversorMoedas converter = new ConversorMoedas();

        DecimalFormat formato = new DecimalFormat("0.00");

        System.out.println("valor de :100 reais :R$" +formato.format(converter.conveterDolarParameters(100.0)));
        System.out.println("valor de :100 dolar :R$" + formato.format(converter.conveterRealParameters(100.0)));
    }
}
