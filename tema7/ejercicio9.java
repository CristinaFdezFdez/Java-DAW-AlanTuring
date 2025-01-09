package tema7;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array para almacenar los 8 números
        int[] numeros = new int[8];
        
        // Pedir al usuario que introduzca 8 números
        System.out.println("Introduzca 8 números enteros, pulse INTRO después de cada número:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Mostrar los números junto con "par" o "impar"
        System.out.println("\nResultados:");
        for (int i = 0; i < 8; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " par");
            } else {
                System.out.println(numeros[i] + " impar");
            }
        }
        
        scanner.close();
    }
}
