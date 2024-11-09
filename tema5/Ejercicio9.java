package tema5;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        int a = 0, b = 1; // Primeros dos términos de Fibonacci
        System.out.print("Serie de Fibonacci: ");

        // Mostrar los primeros n términos
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            // Sumar los dos números anteriores
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        scanner.close();
    }
}
