package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringToIntConverter {

    public List<Integer> convertStringsToIntegers(String[] strings) throws InvalidTypeConversionException {
        List<Integer> integers = new ArrayList<>();
        for (String string : strings) {
            try {
                int number = Integer.parseInt(string);
                integers.add(number);
            } catch (NumberFormatException e) {
                throw new InvalidTypeConversionException("Invalid type conversion for string: " + string, e);
            }
        }
        return integers;
    }
}


