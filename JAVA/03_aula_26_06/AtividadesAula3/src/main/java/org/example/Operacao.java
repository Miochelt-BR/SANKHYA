package org.example;

import java.util.Arrays;

public class Operacao {
    public static void main(String[] args) {
        //Escreva funções que realizem operações de união, interseção e diferença entre dois arrays.
       int [] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        // Chama a função para realizar a operação de união
        System.out.println("União: " + Arrays.toString(uniao(array1, array2))); // Saída esperada: [1, 2, 3, 4, 5, 6, 7]

        // Chama a função para realizar a operação de interseção
        System.out.println("Interseção: " + Arrays.toString(intersecao(array1, array2))); // Saída esperada: [3, 4, 5]

        // Chama a função para realizar a operação de diferença
        System.out.println("Diferença: " + Arrays.toString(diferenca(array1, array2))); // Saída esperada: [1, 2]
    }

    public static int[] uniao(int[] array1, int[] array2) {
        int[] temp = new int[array1.length + array2.length];
        int index = 0;

        // Adiciona todos os elementos de array1 ao array temporário
        for (int num : array1) {
            if (!contains(temp, index, num)) {
                temp[index++] = num;
            }
        }

        // Adiciona todos os elementos de array2 ao array temporário
        for (int num : array2) {
            if (!contains(temp, index, num)) {
                temp[index++] = num;
            }
        }

        // Cria um array resultante com o tamanho correto
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static int[] intersecao(int[] array1, int[] array2) {
        int[] temp = new int[Math.min(array1.length, array2.length)];
        int index = 0;

        // Adiciona os elementos comuns dos dois arrays ao array temporário
        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2 && !contains(temp, index, num1)) {
                    temp[index++] = num1;
                    break;
                }
            }
        }

        // Cria um array resultante com o tamanho correto
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static int[] diferenca(int[] array1, int[] array2) {
        int[] temp = new int[array1.length];
        int index = 0;

        // Adiciona os elementos de array1 que não estão em array2 ao array temporário
        for (int num1 : array1) {
            if (!contains(array2, array2.length, num1)) {
                temp[index++] = num1;
            }
        }

        // Cria um array resultante com o tamanho correto
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Função auxiliar para verificar se um array contém um valor até um índice específico
    public static boolean contains(int[] array, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}