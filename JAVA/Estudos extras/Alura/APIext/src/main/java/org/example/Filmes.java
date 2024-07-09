package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Filmes {
    public static void main(String[] args) {


                Scanner leitura = new Scanner(System.in);
                System.out.println("Digite o nome do filme: ");
                var busca = leitura.nextLine();
                String chave = "bd4251ba";
                String endereco="http://www.omdbapi.com/?t="+busca.replace(" ","+")+"&apikey="+chave;
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

