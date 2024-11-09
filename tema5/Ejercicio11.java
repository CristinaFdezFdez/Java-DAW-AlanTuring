package tema5;

import java.util.Scanner;

public class Ejercicio11 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        int base = scanner.nextInt();

        System.out.print("Introduzca el exponente: ");
        int exponente = scanner.nextInt();

        // Calculando la potencia
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);

        scanner.close();
    }
}
