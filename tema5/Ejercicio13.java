package tema5;

import java.util.Scanner;

public class Ejercicio13 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("El número no es primo");
            return;
        }

        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }

        scanner.close();
    }
}
