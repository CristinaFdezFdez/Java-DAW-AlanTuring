package tema7;
import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generar 100 números aleatorios entre 0 y 20
        System.out.println("Números generados:");
        for (int i = 0; i < 100; i++) {
            numeros[i] = random.nextInt(21); // Genera un número entre 0 y 20
            System.out.print(numeros[i] + " ");
        }

        // Pedir al usuario los valores para el cambio
        System.out.println("\n\nIntroduce el valor a reemplazar:");
        int valor1 = scanner.nextInt();
        System.out.println("Introduce el nuevo valor:");
        int valor2 = scanner.nextInt();

        // Reemplazar todas las ocurrencias de valor1 por valor2
        System.out.println("\nNúmeros modificados:");
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == valor1) {
                System.out.print("\"" + valor2 + "\" "); // Mostrar con comillas si se reemplaza
            } else {
                System.out.print(numeros[i] + " "); // Mostrar sin comillas si no se reemplaza
            }
        }

        scanner.close();
    }
}
