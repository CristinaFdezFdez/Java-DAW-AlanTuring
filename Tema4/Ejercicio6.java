package Tema4;
import java.util.Scanner;

/* Realiza un programa que calcule la media de tres notas introducidas por teclado */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca las tres notas
        System.out.println("Introduce la primera nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Introduce la segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Introduce la tercera nota:");
        double nota3 = scanner.nextDouble();

        // Cerrar el scanner
        scanner.close();

        // Calcular la media de las tres notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Mostrar la media al usuario
        System.out.println("La media de las tres notas es: " + media);
    }
}
