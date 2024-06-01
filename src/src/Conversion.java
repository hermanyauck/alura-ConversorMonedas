import Modelos.ConversionRate;

public class Conversion {

    public static void Convertir(int cantidad, String Moneda) {
        ConversionRate Divisas = Conexion.conectar(Moneda);
        System.out.println(Divisas);
    }
}
