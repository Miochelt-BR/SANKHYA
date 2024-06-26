package org.example;

import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {
        //Implemente um algoritmo que ordene um array de objetos com base em um critério personalizado (por exemplo, ordem alfabética de strings ou ordenação numérica).
        String[] names = {"Douglas", "Dennys", "Luciana", "Alice", "Bob"};

        // Chama a função para ordenar o array de nomes
        Arrays.sort(names);


        System.out.println("Em ordem alfabetica : " + Arrays.toString(names));

    }

   }



