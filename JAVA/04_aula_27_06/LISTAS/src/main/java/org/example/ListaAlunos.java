package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ListaAlunos {
    public static void main(String[] args) {
        ArrayList<String> listaAlunos= new ArrayList<>();
        listaAlunos.add("Thiago");
        listaAlunos.add("Joao");
        listaAlunos.add("Maria");
        listaAlunos.add("Carlos");
        listaAlunos.add("Marcos");
        System.out.println(listaAlunos);
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println(listaAlunos.get(i));
        }
        Collections.sort(listaAlunos);
        System.out.println(listaAlunos);
        System.out.println("imprimir em ordem alfabeticado");
        Collections.sort(listaAlunos, String.CASE_INSENSITIVE_ORDER);
        System.out.println(listaAlunos);


    }

    }
