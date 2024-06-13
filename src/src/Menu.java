import java.util.Scanner;

public class Menu {
    public static int Menu1(Scanner lectura) {
        int num = 0;
        while (true) {
            System.out.println("""
                    Selecciones una de las opciones de conversion:
                    1) Dolar -> Peso argentino
                    2) Peso Argentino -> Dolar
                    3) Euro -> Peso argentino
                    4) Peso Argentino -> Euro
                    5) Dolar -> Peso Mexicano
                    6) Euro -> Real Brasileño
                    7) Salir

                    """);
            num = Integer.valueOf(lectura.nextLine());
            if (num > 0 && num <= 7) {
                break;
            }
            System.out.println("OPCION INGRESADA NO ES VALDIA:");
        }
        return num;
    }

    public static int Menu2(Scanner lectura) {
        int num = 0;
        while (true) {
            System.out.println("""
                    Quieres convertir otro valor? 
                    1) Si
                    2) No
                    """);
            num = Integer.valueOf(lectura.nextLine());
            if (num == 1 || num == 2) {
                return num;
            }
            System.out.println("OPCION INGRESADA ES INCORRECTA");
        }
    }
}
