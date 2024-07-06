package org.example.orientacaoObjeto.ExerciciosFinalNoite.conversormoedas.conversorTemperatura;

public class App {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        System.out.println("feita a conversão celsius para fahrenheit " + conversor.fazerConversion1(100));
        System.out.println("feita a conversão fahrenheit para celsius " +  conversor.fazerConversion2(100));
    }
}
