package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Cotacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite a moeda que deseja a cotação (ex: bitcoin, ethereum): ");
        var busca = leitura.nextLine();


        System.out.println("Escolha a moeda de referência:");
        System.out.println("1. BRL (Real)");
        System.out.println("2. USD (Dólar Americano)");
        System.out.println("3. EUR (Euro)");
        System.out.println("4. GBP (Libra Esterlina)");


        String moedaReferencia = "";
        int escolha = leitura.nextInt();
        switch (escolha) {
            case 1:
                moedaReferencia = "brl";
                break;
            case 2:
                moedaReferencia = "usd";
                break;
            case 3:
                moedaReferencia = "eur";
                break;
            case 4:
                moedaReferencia = "gbp";
                break;
            default:
                System.out.println("Escolha inválida. Usando BRL como padrão.");
                moedaReferencia = "brl";
                break;
        }


        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + busca.replace(" ", "+") + "&vs_currencies=" + moedaReferencia;

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
