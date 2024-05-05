package Apis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class ApiCall {

    public static void main(String args[]) throws IOException, InterruptedException {
        String url = "https://covid19.mathdro.id/api";

        // Create the request
        HttpRequest httpRequest = HttpRequest.newBuilder()
               .GET()
               .uri(URI.create(url))
               .build();

        // Use the correct request variable for sending the request
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString()); 

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
