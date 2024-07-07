package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class exe4 {
    public static void main(String[] args) {


                // Usando ArrayList
                List<Titulo> arrayList = new ArrayList<>();
                arrayList.add(new Titulo("Senhor dos Anéis"));
                arrayList.add(new Titulo("O Hobbit"));
                arrayList.add(new Titulo("Harry Potter"));

                System.out.println("ArrayList:");
                for (Titulo titulo : arrayList) {
                    System.out.println(titulo.getNome());
                }

                // Usando LinkedList
                List<Titulo> linkedList = new LinkedList<>();
                linkedList.add(new Titulo("Percy Jackson"));
                linkedList.add(new Titulo("As Crônicas de Nárnia"));
                linkedList.add(new Titulo("A Torre Negra"));

                System.out.println("LinkedList:");
                for (Titulo titulo : linkedList) {
                    System.out.println(titulo.getNome());
                }
            }
        }



