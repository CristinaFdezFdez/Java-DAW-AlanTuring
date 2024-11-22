package tema5;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        // Declaraciones
        String relleno = "";
        int altura = 0;
        Scanner sc = new Scanner(System.in);

        // Entrada por teclado de la altura
        while (altura <= 0) {
            try {
                System.out.print("Introduzca altura de la pirámide: ");
                altura = sc.nextInt();
                if (altura <= 0) {
                    System.out.println("ERROR: La altura debe ser un entero positivo");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La altura debe ser un entero positivo");
            } finally {
                sc.nextLine();
            }
        }

        // Entrada por teclado del carácter de relleno
        while (relleno.length() != 1) {
            System.out.print("Introduzca el carácter de relleno: ");
            relleno = sc.nextLine();
            if (relleno.length() != 1) {
                System.out.println("ERROR: El carácter de relleno debe ser de longitud 1");
            }
        }

        // Cerrar Scanner
        sc.close();

        // Pintar la pirámide hueca
        int base = 2 * altura - 1; // Ancho de la base
        int espaciosBlanco = base / 2; // Espacios en blanco iniciales

        for (int i = 1; i <= altura; i++) {
            // Imprimir los espacios iniciales de cada fila
            for (int blancos = 1; blancos <= espaciosBlanco; blancos++) {
                System.out.print(" ");
            }

            // Generar la fila de la pirámide
            for (int j = 1; j <= (2 * i - 1); j++) {
                // Condiciones para imprimir el relleno
                if (j == 1 || j == (2 * i - 1) || i == altura) {
                    System.out.print(relleno);
                } else {
                    System.out.print(" "); // Espacios en el interior
                }
            }

            // Reducir los espacios en blanco para la siguiente fila
            espaciosBlanco--;

            // Salto de línea para la siguiente fila
            System.out.println();
        }
    }
}
