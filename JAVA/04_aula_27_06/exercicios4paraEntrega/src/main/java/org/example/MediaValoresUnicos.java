package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MediaValoresUnicos {
    public static void main(String[] args) {
        // 5. Média de Valores Únicos:
        //    Implemente um programa que calcule a média aritmética dos valores únicos em uma lista de números inteiros, ou seja, excluindo os valores duplicados da média.
        ArrayList<Integer> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números na lista:");
        int quantidade = scanner.nextInt();

        System.out.println("Digite os números:");

        for (int i = 0; i < quantidade; i++) {
            lista.add(scanner.nextInt());
        }

        System.out.println("Média aritmética dos valores únicos: " + mediaValoresUnicos(lista));
    }

    public static double mediaValoresUnicos(ArrayList<Integer> lista) {
        Set<Integer> uniqueValues = new HashSet<>(lista);
        int soma = 0;

        for (int value : uniqueValues) {
            soma += value;
        }

        if (uniqueValues.size() > 0) {
            return (double) soma / uniqueValues.size();
        } else {
            return 0;
        }
    }
}
