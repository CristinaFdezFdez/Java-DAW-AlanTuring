package Tema4;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes de precios
        final double PRECIO_BASE = 8.0;
        final double PRECIO_MIERCOLES = 5.0;
        final double PRECIO_PAREJA_JUEVES = 11.0;
        final double DESCUENTO_TARJETA = 0.10;

        try {
            // Solicitar el número de entradas
            System.out.println("Venta de entradas CineCampa");
            System.out.print("Número de entradas: ");
            int numeroEntradas = scanner.nextInt();

            // Validar que el número de entradas sea positivo
            if (numeroEntradas <= 0) {
                System.out.println("Error: El número de entradas debe ser mayor que cero.");
                return;
            }

            // Solicitar el día de la semana
            System.out.print("Día de la semana: ");
            scanner.nextLine(); // limpiar el buffer
            String diaSemana = scanner.nextLine().trim().toLowerCase();

            // Solicitar si tiene tarjeta de CineCampa
            System.out.print("¿Tienes tarjeta de CineCampa? (s/n): ");
            String tieneTarjeta = scanner.nextLine().trim().toLowerCase();

            // Validar entrada de tarjeta
            boolean aplicaDescuento = false;
            if (tieneTarjeta.equals("s")) {
                aplicaDescuento = true;
            } else if (!tieneTarjeta.equals("n")) {
                System.out.println("Error: Respuesta inválida para la tarjeta (debe ser 's' o 'n').");
                return;
            }

            double totalSinDescuento = 0;
            int entradasIndividuales = numeroEntradas;

            // Calcular el precio según el día de la semana
            if (diaSemana.equals("miércoles")) {
                // Miércoles (día del espectador)
                totalSinDescuento = numeroEntradas * PRECIO_MIERCOLES;
            } else if (diaSemana.equals("jueves")) {
                // Jueves (día de la pareja)
                int parejas = numeroEntradas / 2;
                int entradasSueltas = numeroEntradas % 2;
                totalSinDescuento = parejas * PRECIO_PAREJA_JUEVES + entradasSueltas * PRECIO_BASE;
                entradasIndividuales = entradasSueltas;
            } else {
                // Resto de días
                totalSinDescuento = numeroEntradas * PRECIO_BASE;
            }

            // Aplicar descuento si tiene tarjeta de CineCampa
            double descuento = 0;
            if (aplicaDescuento) {
                descuento = totalSinDescuento * DESCUENTO_TARJETA;
            }
            double totalAPagar = totalSinDescuento - descuento;

            // Mostrar el desglose de la compra
            System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
            System.out.println("Entradas individuales: " + numeroEntradas);
            if (diaSemana.equals("jueves")) {
                int parejas = numeroEntradas / 2;
                System.out.printf("Precio por pareja: %.2f €%n", PRECIO_PAREJA_JUEVES);
                System.out.printf("Entradas en pareja: %d%n", parejas);
                if (entradasIndividuales > 0) {
                    System.out.printf("Precio por entrada individual: %.2f €%n", PRECIO_BASE);
                }
            } else {
                System.out.printf("Precio por entrada individual: %.2f €%n",
                        (diaSemana.equals("miércoles") ? PRECIO_MIERCOLES : PRECIO_BASE));
            }
            System.out.printf("Total sin descuento: %.2f €%n", totalSinDescuento);
            System.out.printf("Descuento: %.2f €%n", descuento);
            System.out.printf("A pagar: %.2f €%n", totalAPagar);

        } catch (Exception e) {
            System.out.println("Error: Entrada no válida. Asegúrese de ingresar los datos correctamente.");
        } finally {
            scanner.close();
        }
    }
}
