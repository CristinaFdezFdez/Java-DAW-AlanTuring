package tema7;

import java.util.Random;

public class ejercicio10 {
    public static void main(String[] args) {
        Random rand = new Random();

        // Crear el array original con 20 números aleatorios entre 0 y 100
        int[] arrayOriginal = new int[20];
        for (int i = 0; i < 20; i++) {
            arrayOriginal[i] = rand.nextInt(101); // Números aleatorios entre 0 y 100
        }

        // Mostrar el array original
        System.out.println("Array original:");
        mostrarArray(arrayOriginal);

        // Crear dos arrays auxiliares para almacenar los números pares e impares
        int[] pares = new int[20];
        int[] impares = new int[20];

        int indexPares = 0;
        int indexImpares = 0;

        // Separar los números pares e impares en los arrays auxiliares
        for (int i = 0; i < 20; i++) {
            if (arrayOriginal[i] % 2 == 0) {
                pares[indexPares++] = arrayOriginal[i];  // Almacenar el número par
            } else {
                impares[indexImpares++] = arrayOriginal[i];  // Almacenar el número impar
            }
        }

        // Combinar los arrays de pares e impares en el array original
        int j = 0;
        for (int i = 0; i < indexPares; i++) {
            arrayOriginal[j++] = pares[i];  // Insertar los números pares
        }
        for (int i = 0; i < indexImpares; i++) {
            arrayOriginal[j++] = impares[i];  // Insertar los números impares
        }

        // Mostrar el array con los pares al principio
        System.out.println("\nArray con los pares al principio:");
        mostrarArray(arrayOriginal);
    }

    // Función para mostrar el contenido de un array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // Nueva línea después de mostrar el array
    }
}
