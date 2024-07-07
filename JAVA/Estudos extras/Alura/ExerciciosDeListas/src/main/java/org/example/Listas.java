package org.example;

import java.util.Collections;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<Integer> lista = new java.util.ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        Collections.sort(lista);
        System.out.println(lista);
    }
}