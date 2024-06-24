package org.example;

public class Condicionais {
    public static void main(String[] args) {
        //if e else
        int numero = 10;
        if (numero > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
        //composto
        numero = 10;
        if (numero > 0) {
            System.out.println("O número é positivo");
        } else if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é igual a zero");
        }

}


}