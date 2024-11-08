package Tema4;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes
        final double PRECIO_CM2 = 0.01;  // Precio base por centímetro cuadrado
        final double PRECIO_ESCUDO = 2.50;  // Precio adicional por escudo
        final double GASTOS_ENVIO = 3.25;  // Gastos de envío fijos

        // Solicitar las dimensiones de la bandera
        System.out.print("Introduzca la altura de la bandera en cms: ");
        int altura = scanner.nextInt();

        System.out.print("Ahora introduzca la anchura: ");
        int anchura = scanner.nextInt();

        // Calcular el área y el precio base de la bandera
        int area = altura * anchura;
        double precioBase = area * PRECIO_CM2;

        // Preguntar si el usuario desea escudo bordado
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        scanner.nextLine(); // Limpiar el buffer de entrada
        String conEscudo = scanner.nextLine().trim().toLowerCase();

        // Determinar el precio del escudo según la elección
        double precioEscudo = conEscudo.equals("s") ? PRECIO_ESCUDO : 0.0;

        // Calcular el precio total
        double precioTotal = precioBase + precioEscudo + GASTOS_ENVIO;

        // Mostrar el desglose de la compra
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.printf("Bandera de %d cm2: %.2f €%n", area, precioBase);
        System.out.printf("Escudo: %.2f €%n", precioEscudo);
        System.out.printf("Gastos de envío: %.2f €%n", GASTOS_ENVIO);
        System.out.printf("TOTAL: %.2f €%n", precioTotal);

        scanner.close();
    }
}
