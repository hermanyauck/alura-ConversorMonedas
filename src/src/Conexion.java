import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import Modelos.ExchangeRate;
import com.google.gson.Gson;

public class Conexion {

    public static void conectar(){
        String APIkey = "083279bea2192b770c7d9b4b";
        String direccion = "https://v6.exchangerate-api.com/v6/"+APIkey+"/latest/USD/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            ExchangeRate o = new Gson().fromJson(response.body(), ExchangeRate.class);
            return o;
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return null;
    }
}
