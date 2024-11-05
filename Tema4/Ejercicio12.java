package Tema4;
import java.util.Scanner;

/* Realiza un programa que diga si un número entero introducido por teclado es par y/o divisible entre 5 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número entero
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Cerrar el scanner
        scanner.close();

        // Verificar si el número es par
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        // Verificar si el número es divisible entre 5
        if (numero % 5 == 0) {
            System.out.println("El número " + numero + " es divisible entre 5.");
        } else {
            System.out.println("El número " + numero + " no es divisible entre 5.");
        }
    }
}
