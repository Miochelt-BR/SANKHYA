package org.example;

public class MaiorSeguencia {
    public static void main(String[] args) {
        //. Maior Sequência Crescente: Encontre a maior sequência crescente de números em um array e imprima os números dessa sequência.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        System.out.println( "numero maior "+ maior);


    }
}
