package tema5;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();

        System.out.println("n  | n^2 | n^3");
        System.out.println("-----------------");

        for (int i = 0; i < 5; i++) {
            int n = numero + i;
            int cuadrado = n * n;
            int cubo = n * n * n;

            System.out.printf("%-3d| %-4d| %-5d%n", n, cuadrado, cubo);
        }

        scanner.close();
    }
}
