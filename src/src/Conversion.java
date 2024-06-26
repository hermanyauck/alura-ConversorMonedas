import java.util.HashMap;
import Modelos.ConversionRate;

public class Conversion {

    public static Float Convertir(int cantidad, String MonedaI, String MonedaO) {

        HashMap<String, Float> Conversion = new HashMap<>();
        ConversionRate Divisas = Conexion.conectar(MonedaI);
        Conversion.put("USD", Divisas.USD());
        Conversion.put("ARS", Divisas.ARS());
        Conversion.put("EUR", Divisas.EUR());
        Conversion.put("MXN", Divisas.MXN());
        Conversion.put("BRL", Divisas.BRL());
        //System.out.println(Conversion);
        return cantidad * Conversion.get(MonedaO);
    }
}
