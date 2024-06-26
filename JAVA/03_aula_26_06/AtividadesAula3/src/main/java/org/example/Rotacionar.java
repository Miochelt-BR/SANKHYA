package org.example;

import java.util.Arrays;

public class Rotacionar {
    public static void main(String[] args) {
        //7. Rotacionar um Array: Crie uma função para rotacionar os elementos de um array para a esquerda ou para a direita por um número específico de posições.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int posicao = 3;
        ObterArrayRotacionado(array, posicao);
        System.out.println(Arrays.toString(array));
    }

    public static void ObterArrayRotacionado(int[] array, int posicao) {
        int tamanho = array.length;
        int aux = array[posicao];
        for (int i = posicao; i < tamanho; i++) {
            array[i] = array[i - posicao];
        }
        array[tamanho - posicao] = aux;
    }
}
