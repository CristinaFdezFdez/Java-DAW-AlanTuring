package tema7;
import java.util.Scanner;
import java.util.Random;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        // Rellenar el array con números aleatorios entre 0 y 500
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(501);
        }

        // Mostrar el array
        System.out.println("Array generado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Pedir al usuario qué desea destacar
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
        int opcion = scanner.nextInt();

        // Determinar el máximo o el mínimo
        int destacado = (opcion == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        for (int num : array) {
            if (opcion == 1 && num < destacado) {
                destacado = num;
            } else if (opcion == 2 && num > destacado) {
                destacado = num;
            }
        }

        // Mostrar el array con el número destacado
        System.out.println("Array con el número destacado:");
        for (int num : array) {
            if (num == destacado) {
                System.out.print("**" + num + "** ");
            } else {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
