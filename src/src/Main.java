import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenidos al conversor de monedas de Herman Yauck");
        while (true) {
            num = Menu.Menu1(lectura);
            if (num != 7) {
                String MonedaI = "";
                String MonedaO = "";
                switch (num) {
                    case 1 -> {
                        MonedaI = "USD";
                        MonedaO = "ARS";
                    }
                    case 2 -> {
                        MonedaI = "ARS";
                        MonedaO = "USD";
                    }
                    case 3 -> {
                        MonedaI = "EUR";
                        MonedaO = "ARS";
                    }
                    case 4 -> {
                        MonedaI = "ARS";
                        MonedaO = "EUR";
                    }
                    case 5 -> {
                        MonedaI = "USD";
                        MonedaO = "MXN";
                    }
                    case 6 -> {
                        MonedaI = "EUR";
                        MonedaO = "BRL";
                    }
                }
                System.out.println("Cuantos " + MonedaI + " quieres convertir: ");
                int pesos = Integer.valueOf(lectura.nextLine());
                float Convertido = Conversion.Convertir(pesos, MonedaI, MonedaO);
                System.out.println("Obtiene la cantidad de: " + Convertido + " " + MonedaO);
                num = Menu.Menu2(lectura);
            } if (num == 2 || num == 7) {
                System.out.println("Gracias por utilizar el conversor de monedas");
                break;
            }
        }
    }
}
