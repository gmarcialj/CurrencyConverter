package com.aluracursos.projectcurrencyconverter.main;

import com.aluracursos.projectcurrencyconverter.models.ExchangeRate;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Integer showMenu(Scanner intro) {
        int optionInt = -1;
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
                    *********************************************""");
        var option = intro.nextLine();

        // Casteamos option, si no se puede castear, devolvemos -1
        try {
            optionInt = Integer.parseInt(option);
        } catch (NumberFormatException e) {
            optionInt = -1;
        }

        return optionInt;
    }

    static double getMount(Scanner intro) {
        var mount = "";
        double amount;

        System.out.println("Ingrese el valor a convertir: ");
        mount = intro.nextLine();

        try {
            amount = Double.parseDouble(mount);
        } catch (NumberFormatException e) {
            amount = -1;
        }

        return amount;
    }

    static void main(String[] args) throws IOException, InterruptedException {
        Scanner intro = new Scanner(System.in);
        String baseCode = "", targetCode = "";
        int option;
        double mount = 0.0;

        while(true) {
            // Mostramos el menú principal
            option = showMenu(intro);

            if (option > 0) mount = getMount(intro);
            if (mount < 0) option = -1;

            switch (option) {
                case 0:
                    System.out.println("Gracias por usar nuestra aplicación");
                    return;
                case 1:
                    baseCode = "USD";
                    targetCode = "MXN";
                    break;
                case 2:
                    baseCode = "USD";
                    targetCode = "ARS";
                    break;
                case 3:
                    baseCode = "USD";
                    targetCode = "BRL";
                    break;
                case 4:
                    baseCode = "USD";
                    targetCode = "COP";
                    break;
                case 5:
                    baseCode = "MXN";
                    targetCode = "USD";
                    break;
                case 6:
                    baseCode = "ARS";
                    targetCode = "USD";
                    break;
                case 7:
                    baseCode = "BRL";
                    targetCode = "USD";
                    break;
                case 8:
                    baseCode = "COP";
                    targetCode = "USD";
                    break;
                default:
                    System.out.println("Opción o monto incorrectos.");
                    break;
            }

            if (option > 0) {
                ExchangeRate exchangeRate = new ExchangeRate(baseCode, targetCode, mount);
                exchangeRate.showExchangeRate();
            }
        }
    }
}
