import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import Modelos.*;
import com.google.gson.Gson;

public class Conexion {

    public static ConversionRate conectar(String Moneda){
        String APIkey = "083279bea2192b770c7d9b4b";
        String direccion = "https://v6.exchangerate-api.com/v6/"+APIkey+"/latest/"+Moneda+"/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            ExchangeRate o = new Gson().fromJson(response.body(), ExchangeRate.class);
            //System.out.println(o.conversion_rates().ARS());
            //System.out.println(o.conversion_rates());
            return o.conversion_rates();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return null;
    }
}
