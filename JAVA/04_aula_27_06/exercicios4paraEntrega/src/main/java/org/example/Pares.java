package org.example;

import java.util.ArrayList;

public class Pares {
    public static void main(String[] args) {
        //1. Soma dos Elementos Pares:
        //   Escreva um programa que calcule a soma dos elementos pares de uma lista de inteiros.
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        System.out.println(somaDosElementosPares(lista));
    }

    public static int somaDosElementosPares(ArrayList<Integer> lista) {
        int soma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                soma += lista.get(i);
            }
        }
        return soma;
    }
}