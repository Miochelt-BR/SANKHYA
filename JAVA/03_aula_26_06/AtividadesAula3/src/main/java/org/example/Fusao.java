package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fusao {
    public static void main(String[] args) {
        //Crie um método que receba dois arrays de inteiros ordenados e os funda em um único array ordenado.
        int [] inicial= { 1, 2, 3, 4, 5};
        int[] atualizada= Arrays.copyOf(inicial, inicial.length + 3);
        System.out.println(Arrays.toString(atualizada));
    }

}
