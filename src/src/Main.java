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
            System.out.println("Cuantos quiere convertir:");
            int pesos = Integer.valueOf(lectura.nextLine());
            //Conexion.conectar();
        }
    }
}