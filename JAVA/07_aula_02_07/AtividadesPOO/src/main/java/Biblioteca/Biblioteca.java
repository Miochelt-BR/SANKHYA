package Biblioteca;

import java.util.Date;

public class Biblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("O Hobbit", "J.R.R. Tolkien", 1937, Genero.FICCAO);
        Revista revista = new Revista("National Geographic", "Vários", 2021, 10);
        DVD dvd = new DVD("Interestelar", "Christopher Nolan", 2014, "2h49m");

        livro.imprimirDetalhes();
        livro.emprestar(new Date());
        livro.devolver(new Date());
        System.out.println("Multa: R$ " + livro.calcularMulta(5));

        revista.imprimirDetalhes();
        revista.emprestar(new Date());
        revista.devolver(new Date());
        System.out.println("Multa: R$ " + revista.calcularMulta(3));

        dvd.imprimirDetalhes();
        dvd.emprestar(new Date());
        dvd.devolver(new Date());
        System.out.println("Multa: R$ " + dvd.calcularMulta(7));
    }
}