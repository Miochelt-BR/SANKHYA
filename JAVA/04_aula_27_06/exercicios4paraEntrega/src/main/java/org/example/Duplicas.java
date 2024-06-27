package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

// Cria uma lista de inteiros com elementos duplicados
public class Duplicas {
    public static void main(String[] args) {
        // Cria uma lista de inteiros com elementos duplicados
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(8);
        lista.add(8);
        lista.add(10);
        lista.add(10);

        // Chama o método para remover duplicados
        List<Integer> listaSemDuplicados = removerDuplicados(lista);

        // Imprime a lista sem duplicados
        System.out.println(listaSemDuplicados);
    }

    // Método para remover elementos duplicados de uma lista
    public static List<Integer> removerDuplicados(ArrayList<Integer> lista) {
        // Usa LinkedHashSet para manter a ordem de inserção e remover duplicados
        LinkedHashSet<Integer> conjunto = new LinkedHashSet<>(lista);

        // Converte o conjunto de volta para uma lista
        ArrayList<Integer> listaSemDuplicados = new ArrayList<>(conjunto);

        return listaSemDuplicados;
    }
}