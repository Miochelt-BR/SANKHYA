package org.example.orientacaoObjeto.ExerciciosFinalNoite.conversormoedas.salaretangular;

public class CalcularSalaRetangular  implements CalculoGeometrico {


    @Override
    public double calcularArea(double base, double altura) {
        double area = base * altura;
        return area;


    }

    @Override
    public double calcularPerimetro(double base, double altura) {
        double perimetro = 2 * (base + altura);
        return perimetro;
    }

    }


