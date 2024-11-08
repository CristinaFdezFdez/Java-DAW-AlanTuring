package Tema4;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Variables de precios
            final double PRECIO_PALMERA = 1.40;
            final double PRECIO_DONUT = 1.00;
            final double PRECIO_PITUFO_AC = 1.20; // Pitufo con aceite
            final double PRECIO_PITUFO_TORTILLA = 1.60; // Pitufo con tortilla
            final double PRECIO_ZUMO = 1.50;
            final double PRECIO_CAFE = 1.20;

            // Solicitar tipo de comida
            System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
            String comida = scanner.nextLine().trim().toLowerCase();
            double precioComida = 0.0;

            if (comida.equals("palmera")) {
                precioComida = PRECIO_PALMERA;
            } else if (comida.equals("donut")) {
                precioComida = PRECIO_DONUT;
            } else if (comida.equals("pitufo")) {
                // Solicitar tipo de pitufo
                System.out.print("¿Con aceite o con tortilla?: ");
                String tipoPitufo = scanner.nextLine().trim().toLowerCase();

                if (tipoPitufo.equals("aceite")) {
                    precioComida = PRECIO_PITUFO_AC;
                } else if (tipoPitufo.equals("tortilla")) {
                    precioComida = PRECIO_PITUFO_TORTILLA;
                } else {
                    System.out.println("Error: Tipo de pitufo no válido.");
                    return;
                }
            } else {
                System.out.println("Error: Comida no válida.");
                return;
            }

            // Solicitar tipo de bebida
            System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
            String bebida = scanner.nextLine().trim().toLowerCase();
            double precioBebida = 0.0;

            if (bebida.equals("zumo")) {
                precioBebida = PRECIO_ZUMO;
            } else if (bebida.equals("café")) {
                precioBebida = PRECIO_CAFE;
            } else {
                System.out.println("Error: Bebida no válida.");
                return;
            }

            // Calcular total
            double precioTotal = precioComida + precioBebida;

            // Mostrar el desglose
            System.out.printf("%s: %.2f €\n", comida.substring(0, 1).toUpperCase() + comida.substring(1), precioComida);
            System.out.printf("%s: %.2f €\n", bebida.substring(0, 1).toUpperCase() + bebida.substring(1), precioBebida);
            System.out.printf("Total desayuno: %.2f €\n", precioTotal);

        } catch (Exception e) {
            System.out.println("Error: Ocurrió un problema con la entrada.");
        } finally {
            scanner.close();
        }
    }
}
