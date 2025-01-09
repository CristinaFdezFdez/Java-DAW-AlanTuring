package tema7;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];

        // Leer 15 números por teclado
        System.out.println("Vaya introduciendo 15 números enteros y pulsando INTRO:");
        for (int i = 0; i < 15; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Mostrar el array original
        System.out.println("\nArray original:");
        mostrarArray(numeros);

        // Rotar el array una posición a la derecha
        int ultimo = numeros[14]; // Guardar el último elemento
        for (int i = 14; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo; // Poner el último elemento en la posición 0

        // Mostrar el array rotado
        System.out.println("\nArray rotado a la derecha una posición:");
        mostrarArray(numeros);

        scanner.close();
    }

    // Método para mostrar el array con formato
    public static void mostrarArray(int[] array) {
        System.out.print("| ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d | ", i);
        }
        System.out.println("\n----------------------------------------------------------------------------");
        System.out.print("| ");
        for (int num : array) {
            System.out.printf("%3d | ", num);
        }
        System.out.println();
    }
}
