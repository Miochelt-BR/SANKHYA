package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma lista de strings separadas por espaço: ");
        String[] strings = scanner.nextLine().split(" ");

        StringToIntConverter converter = new StringToIntConverter();
        List<Integer> integers = new ArrayList<>();

        for (String string : strings) {
            try {
                int number = converter.convertStringsToIntegers(new String[]{string}).get(0);
                integers.add(number);
                System.out.println(number);
            } catch (InvalidTypeConversionException e) {
                System.err.println(e.getMessage());
            }
        }

        //  Se precisar usar a lista de inteiros convertidos posteriormente
            System.out.println(integers);

    }
}
