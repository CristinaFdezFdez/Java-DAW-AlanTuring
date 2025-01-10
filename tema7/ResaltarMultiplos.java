package tema7;
import java.util.Random;
import java.util.Scanner;

public class ResaltarMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Crear y llenar el array con números aleatorios entre 0 y 400
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(401);
        }

        // Mostrar el array original
        System.out.println("Array original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Preguntar al usuario qué múltiplos quiere resaltar
        System.out.println("¿Qué números quiere resaltar? (1 - múltiplos de 5, 2 - múltiplos de 7): ");
        int opcion = scanner.nextInt();

        // Validar la opción
        if (opcion != 1 && opcion != 2) {
            System.out.println("Opción no válida. Saliendo del programa.");
            return;
        }

        // Mostrar el array resaltando los múltiplos seleccionados
        System.out.println("Array resultante:");
        for (int numero : numeros) {
            if ((opcion == 1 && numero % 5 == 0) || (opcion == 2 && numero % 7 == 0)) {
                System.out.print("[" + numero + "] ");
            } else {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}
