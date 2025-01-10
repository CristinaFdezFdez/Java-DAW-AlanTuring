package tema7;

import java.util.Random;
import java.util.Scanner;

public class InsertarNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Crear y llenar el array con números aleatorios entre 0 y 200
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201);
        }

        // Mostrar el array original
        System.out.println("Array original:");
        System.out.println("Índice    0    1    2    3    4    5    6    7    8    9   10   11");
        System.out.print("Valor ");
        for (int num : array) {
            System.out.printf("%5d", num);
        }
        System.out.println();

        // Pedir al usuario el número y la posición
        System.out.print("Introduzca el número que quiere insertar: ");
        int numero = scanner.nextInt();
        int posicion;
        do {
            System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11): ");
            posicion = scanner.nextInt();
        } while (posicion < 0 || posicion > 11);

        // Insertar el número en la posición deseada
        for (int i = array.length - 1; i > posicion; i--) {
            array[i] = array[i - 1];
        }
        array[posicion] = numero;

        // Mostrar el array resultado
        System.out.println("Array resultado:");
        System.out.println("Índice    0    1    2    3    4    5    6    7    8    9   10   11");
        System.out.print("Valor ");
        for (int num : array) {
            System.out.printf("%5d", num);
        }
        System.out.println();
    }
}

