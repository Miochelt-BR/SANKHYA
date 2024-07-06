package org.example.orientacaoObjeto.ExerciciosFinalNoite.conversormoedas.conversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double fazerConversion1(double celsius) {
        return celsius * 9 / 5 + 32;




    }
    public double fazerConversion2(double felsius) {
        return (felsius - 32) * 5 / 9;
    }
}
