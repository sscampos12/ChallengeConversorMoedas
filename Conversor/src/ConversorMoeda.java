import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConversorMoeda {

    private static final String API_KEY = "3594923c97f28dc90191e1ab";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double converter(String moedaDe, String moedaPara, double valor) throws IOException, InterruptedException {
        String url = API_URL + moedaDe;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new Gson();
        Map<?, ?> mapa = gson.fromJson(json, Map.class);
        Map<?, ?> taxas = (Map<?, ?>) mapa.get("conversion_rates");
        double taxa = Double.parseDouble(taxas.get(moedaPara).toString());

        return valor * taxa;
    }
}