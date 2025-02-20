package tema5;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir la altura de la pirámide
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();

        // Pedir el carácter de relleno
        System.out.print("Introduce el carácter de relleno: ");
        char relleno = scanner.next().charAt(0);

        // Pintar la pirámide sólida
        for (int i = 1; i <= altura; i++) {
            // Espacios antes del carácter
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            // Imprimir el carácter de relleno
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(relleno);
            }
            // Salto de línea después de cada fila
            System.out.println();
            scanner.close();
        }
    }
}
