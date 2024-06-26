package org.example;

public class Desvio {

    public static void main(String[] args) {
        //Escreva um programa que calcule a média e o desvio padrão de um array de números inteiros ou de ponto flutuante.
        double media = calcularMedia(new double[]{4, 5, 6, 7, 8, 9});
        System.out.println("Média: " + media);
        double desvioPadrao = calcularDesvioPadrao(new double[]{4, 5, 6, 7, 8, 9});
        System.out.println("Desvio padrão: " + desvioPadrao);

    }

    public static double calcularMedia(double[] numeros) {
        double soma = 0.0; // Inicializa a variável soma com 0.0
        for (double num : numeros) { // Percorre cada número no array
            soma += num; // Adiciona o número atual à soma
        }
        return soma / numeros.length; // Retorna a soma dividida pelo número de elementos no array
    }

    public static double calcularDesvioPadrao(double[] numeros) {
        double media = calcularMedia(numeros); // Calcula a média do array
        double somaQuadrados = 0.0; // Inicializa a variável somaQuadrados com 0.0
        for (double num : numeros) { // Percorre cada número no array
            somaQuadrados += Math.pow(num - media, 2); // Adiciona o quadrado da diferença entre o número e a média à somaQuadrados
        }
        return Math.sqrt(somaQuadrados / numeros.length);
    }
}