package tema5;

import java.util.Scanner;

public class Ejercicio12 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la base y el exponente máximo
        System.out.print("Introduzca la base: ");
        int base = scanner.nextInt();

        System.out.print("Introduzca el exponente máximo: ");
        int exponenteMaximo = scanner.nextInt();

        // Mostrar las potencias
        for (int exponente = 1; exponente <= exponenteMaximo; exponente++) {
            int resultado = 1;
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;  // Multiplicamos la base por sí misma
            }
            System.out.println(base + "^" + exponente + " = " + resultado);
        }

        scanner.close();
    }
}
