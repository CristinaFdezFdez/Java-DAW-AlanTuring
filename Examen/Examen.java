package Examen;

import java.util.Random;
import java.util.Scanner;

public class Examen {
    // Instanciamos las constantes para los colores
    public static final String RESET = "\033[0m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String PURPLE_BACKGROUND = "\033[45m";

    public static void main(String[] args) {
        // Instanciamos scanner (pedir datos al usuario) y random (para generar números aleatorios)
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        try {
            System.out.println("GRAPHIFY");
            System.out.println("===================");

            // Pedir rango al usuario
            System.out.print("Introduce el valor mínimo del rango: ");
            long min = sc.nextLong();

            System.out.print("Introduce el valor máximo del rango: ");
            long max = sc.nextLong();

            // Validar que el valor máximo sea mayor que el mínimo
            if (min >= max) {
                System.out.println("ERROR: El valor máximo debe ser mayor que el mínimo.");
                return;
            }

            // Pedir opción de dibujo en blanco y negro o a color
            System.out.print("Dibujo la gráfica en blanco y negro o en color (BIC): ");
            String colorMode = sc.next().toLowerCase(); // Convertir la cadena a minúsculas

            // Generar un número aleatorio en el rango proporcionado
            long numAleatorio = random.nextLong((max - min) + 1) + min;

            // Mostrar número generado
            System.out.println("Número generado: " + numAleatorio);

            // Encontrar el dígito más grande del número para calcular el ancho de la tabla
            long tempNum = numAleatorio;
            int maxDigit = 0;
            while (tempNum > 0) {
                int digit = (int) (tempNum % 10);  // Obtener el último dígito
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
                tempNum /= 10;  // Eliminar el último dígito
            }

            // El ancho de la tabla será el valor del dígito más grande
            int ancho = maxDigit;

            // Dibujar la tabla para cada dígito del número generado
            tempNum = numAleatorio;  // Resetear para volver a recorrer el número
            while (tempNum > 0) {
                int digit = (int) (tempNum % 10);  // Obtener el último dígito
                tempNum /= 10;  // Eliminar el último dígito

                // Dibujar la fila superior de la rejilla
                for (int i = 0; i <= ancho; i++) {
                    System.out.print("+---");
                }
                System.out.println("+");

                // Dibujar el contenido de la rejilla
                System.out.print("| " + digit + " |");
                for (int i = 0; i < ancho; i++) {
                    if (i < digit) {
                        if (colorMode.equals("c")) {
                            String color;
                            // Asignar color según el valor del dígito
                            if (digit <= 4) {
                                color = BLUE_BACKGROUND;
                            } else if (digit <= 6) {
                                color = RED_BACKGROUND;
                            } else if (digit <= 8) {
                                color = GREEN_BACKGROUND;
                            } else {
                                color = PURPLE_BACKGROUND;
                            }
                            // Solo mostrar el fondo de color, sin los asteriscos
                            System.out.print(color + "   " + RESET + "|");
                        } else {
                            System.out.print(" * |");  // Si no es modo color, mostrar asteriscos
                        }
                    } else {
                        System.out.print("   |");  // Espacio vacío cuando no hay un asterisco
                    }
                }
                System.out.println();
            }

            // Dibujar la fila inferior de la rejilla
            for (int i = 0; i <= ancho; i++) {
                System.out.print("+---");
            }
            System.out.println("+");

        } catch (Exception e) {
            System.out.println("ERROR: Entrada inválida. Por favor, introduce datos válidos.");
        } finally {
            sc.close();
        }
    }
}
