package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Googlebook {
    public static void main(String[] args) {
        //AIzaSyAd7KLRJWfFvz0UcTkgjWMWf7CHe8z3Uss
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o books: ");
        var busca = leitura.nextLine();
        String chave = "AIzaSyAd7KLRJWfFvz0UcTkgjWMWf7CHe8z3Uss";
        String endereco="https://www.googleapis.com/books/v1/volumes?q="+busca.replace(" ","+")+"&key="+chave;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

    }
}
