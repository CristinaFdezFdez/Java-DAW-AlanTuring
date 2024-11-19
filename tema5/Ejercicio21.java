package tema5;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PIRÁMIDE NUMÉRICA");
        System.out.print("Introduce la altura de la pirámide: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Imprimir números ascendentes
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Imprimir números descendentes
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Cambiar de línea después de cada fila
            System.out.println();
        }

        scanner.close();
    }
}
