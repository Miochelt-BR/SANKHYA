package org.example;

public class Palindromo {
    public static void main(String[] args) {
        //10. Palíndromos: Verifique se um array de strings contém palavras que são palíndromos (palavras que se leem da mesma forma de trás para frente).
        String[] array = {"abacaxi", "novo", "ovo", "abccba", "a"};

        for (String palavra : array) {
            String reverse = new StringBuilder(palavra).reverse().toString();
            if (palavra.equals(reverse)) {
                System.out.println(palavra + " é palíndromo");
            } else {
                System.out.println(palavra + " não é palíndromo");
            }
                }

    }
}
