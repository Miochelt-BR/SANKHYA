package org.example.orientacaoObjeto.ExerciciosFinalNoite.conversormoedas.coversor;

import org.example.orientacaoObjeto.ExerciciosFinalNoite.conversormoedas.coversor.ConversorFinanceiro;

public class ConversorMoedas implements ConversorFinanceiro {

@Override
public double conveterDolarParameters(double valorDolar) {
     double valorReal = valorDolar * 5.0;

     return valorReal;

        }

    @Override
    public double conveterRealParameters(double valorReal) {
        double valorDolar = valorReal / 5.0;
        return valorDolar;
    }
}
;

