import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num;
        Scanner lectura = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Bienvenidos al conversor de monedas de Herman Yauck
                                    
                    Selecciones una de las opciones de conversion:
                    1) Dolar -> Peso argentino
                    2) Peso Argentino -> Dolar
                    3) Euro -> Peso argentino
                    4) Peso Argentino -> Euro
                    5) Dolar -> Peso Mexicano
                    6) Euro -> Real Brasileño
                    7) Salir
                    ELIJA UNA OPCION VALIDA: 
                    """);
            num = Integer.valueOf(lectura.nextLine());
            if (num > 0 && num <= 7){
                break;
            }
            System.out.println("OPCION INGRESADA NO ES VALDIA:");
        }
        if (num != 7) {
            String MonedaI = "";
            String MonedaO = "";
            switch (num) {
                case 1 -> {MonedaI = "USD"; MonedaO = "ARS";}
                case 2 -> {MonedaI = "ARS"; MonedaO = "USD";}
                case 3 -> {MonedaI = "EUR"; MonedaO = "ARS";}
                case 4 -> {MonedaI = "ARS"; MonedaO = "EUR";}
                case 5 -> {MonedaI = "USD"; MonedaO = "MXN";}
                case 6 -> {MonedaI = "EUR"; MonedaO = "BRL";}
            }
            System.out.println("Cuantos "+MonedaI+" quieres convertir: ");
            int pesos = Integer.valueOf(lectura.nextLine());
            float Convertido = Conversion.Convertir(pesos, MonedaI, MonedaO);
            System.out.println("Obtiene la cantidad de: "+Convertido+" "+MonedaO);
        }
    }
}