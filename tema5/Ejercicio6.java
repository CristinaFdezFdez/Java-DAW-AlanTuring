package tema5;

import java.util.Scanner;

/* Este programa solicita al usuario un número entero y luego cuenta el número de dígitos utilizando un bucle.*/
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NÚMERO DE DÍGITOS DE UN NÚMERO");
        System.out.print("Introduzca un número entero: ");

        try {
            int numero = scanner.nextInt();
            int numeroAbsoluto = Math.abs(numero);  // Ignoramos el signo negativo si lo tiene

            int contadorDigitos = 0;

            // Contamos los dígitos dividiendo el número sucesivamente
            do {
                numeroAbsoluto /= 10;
                contadorDigitos++;
            } while (numeroAbsoluto > 0);

            System.out.println(numero + " tiene " + contadorDigitos + " dígito/s.");

        } catch (Exception e) {
            System.out.println("Error: Por favor, introduzca un número entero válido.");
        } finally {
            scanner.close();  // Cerramos el recurso en el bloque finally
        }
    }
}
