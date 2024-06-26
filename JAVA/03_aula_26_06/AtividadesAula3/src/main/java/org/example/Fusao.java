package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fusao {
    public static void main(String[] args) {
        int[] inicial = {1, 2, 3, 4, 5};
        int[] novo = {8, 6, 8};


        int[] atualizado = mesclarArraysOrdenados(inicial, novo);
        System.out.println(Arrays.toString(atualizado)); // Saída esperada: [1, 2, 2, 3, 4, 5, 6, 8]
    }

    // Função para mesclar dois arrays ordenados em um único array ordenado
    public static int[] mesclarArraysOrdenados(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        // Percorre ambos os arrays até que um deles seja completamente percorrido
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }


        while (i < array1.length) {
            result[k++] = array1[i++];
        }


        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        return result;
    }
}

