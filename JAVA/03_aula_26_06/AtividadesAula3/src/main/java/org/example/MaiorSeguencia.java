package org.example;

public class MaiorSeguencia {
    public static void main(String[] args) {
        //. Maior Sequência Crescente: Encontre a maior sequência crescente de números em um array e imprima os números dessa sequência.
        int[] array = {1, 2, 4, 3, 5, 6, 7, 8, 9, 10};

        int maxLength = 1, currentLength = 1;
        int startIndex = 0, tempStart = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = tempStart;
                }
                currentLength = 1;
                tempStart = i;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            startIndex = tempStart;
        }

        System.out.println("Maior sequência crescente: ");
        for (int i = startIndex; i < startIndex + maxLength; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
