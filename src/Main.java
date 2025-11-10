import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // Variables
        Scanner intro = new Scanner(System.in);

        while(true) {
            System.out.println("""
                    *********************************************
                    Bienvenido al conversor de monedas.
                    
                    Seleccione una de las siguientes opciones:
                    1) Dolar => Peso mexicano
                    2) Dólar => Peso argentino
                    3) Dolar => Real brasileño
                    4) Dolar => Peso colominano
                    5) Peso mexicano  => Dólar
                    6) Peso argentino => Dólar
                    7) Real brasileño => Dólar
                    8) Peso colominano => Dólar
                    0) Salir
                    *********************************************
                    """);
            var option = intro.nextLine();

            switch (option) {
                case "0":
                    System.out.println("Gracias por usar nuestra aplicación");
                    return;
                case "1":
                    System.out.println("Dolar => Peso mexicano");
                    break;
                case "2":
                    System.out.println("Dolar => Peso argentino");
                    break;
                case "3":
                    System.out.println("Dolar => Real brasileño");
                    break;
                case "4":
                    System.out.println("Dolar => Peso colominano");
                    break;
                case "5":
                    System.out.println("Peso mexicano  => Dólar");
                    break;
                case "6":
                    System.out.println("Peso argentino => Dólar");
                    break;
                case "7":
                    System.out.println("Real brasileño => Dólar");
                    break;
                case "8":
                    System.out.println("Peso colominano => Dólar");
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a elegir una opción válida.");
                    break;
            }
        }
    }
}
