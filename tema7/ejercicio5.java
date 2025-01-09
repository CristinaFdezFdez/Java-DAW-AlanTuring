package tema7;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int maximo, minimo;

        // Pedir 10 números al usuario
        System.out.println("Vaya introduciendo 10 números enteros y pulsando INTRO:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Inicializar el máximo y mínimo
        maximo = minimo = numeros[0];

        // Encontrar el máximo y el mínimo
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        // Mostrar los números con las palabras "máximo" y "mínimo"
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == maximo) {
                System.out.print(" máximo");
            }
            if (numeros[i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }

        scanner.close();
    }
}
