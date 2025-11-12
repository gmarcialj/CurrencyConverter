package com.aluracursos.projectcurrencyconverter.API;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeApiClient {
    private static String API_KEY = "8544cd848827d46de4e6bf92/";
    private static String BASE_URL = "https://v6.exchangerate-api.com/v6/"+API_KEY+"pair/";

    private static HttpClient client;
    private static HttpRequest request;
    private Gson gson;

    public static Object[] CheckRate(String baseCode, String targetCode) throws IOException, InterruptedException {
        String url = BASE_URL + baseCode + "/" + targetCode;
        double conversionRate = 0.0;
        String timeLastUpdate = "";

        try {
            client = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonElement element = JsonParser.parseString(response.body());
            JsonObject objectRoot = element.getAsJsonObject();

            conversionRate = (objectRoot.get("conversion_rate").getAsDouble());
            timeLastUpdate = String.valueOf(objectRoot.get("time_last_update_utc"));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return new Object[]{conversionRate, timeLastUpdate};
    }
}
