package org.example;

public class Subconjunto {
    public static void main(String[] args) {
        //9. Subconjuntos de Soma Zero: Determine se existe um subconjunto não vazio de elementos em um array cuja soma seja igual a zero.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 5;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum == 0) {
            System.out.println("Existe um subconjunto de soma zero");
        } else {
            System.out.println("Não existe um subconjunto de soma zero");
        }
    }
}
