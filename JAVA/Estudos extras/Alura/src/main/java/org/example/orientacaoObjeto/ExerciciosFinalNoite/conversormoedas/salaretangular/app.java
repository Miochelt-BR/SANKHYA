package org.example.orientacaoObjeto.ExerciciosFinalNoite.conversormoedas.salaretangular;

public class app {
    public static void main(String[] args) {
        CalcularSalaRetangular calculo = new CalcularSalaRetangular();

        System.out.println("Area da sala retangular :" + calculo.calcularArea(10,10));
        System.out.println("Perimetro da sala retangular :" + calculo.calcularPerimetro(10,10));

    }
}
