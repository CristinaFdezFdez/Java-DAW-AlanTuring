package Tema4;
import java.util.Scanner;

/* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0) */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b;

        // Introducir los valores de a y b
        System.out.println("Introduzca el valor de a:");
        a = scanner.nextFloat();
        System.out.println("Introduzca el valor de b:");
        b = scanner.nextFloat();

        // Cerrar el scanner
        scanner.close();

        // Comprobamos si a es 0
        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        } else {
            // Resolver la ecuación ax + b = 0
            float x = -b / a;
            System.out.println("La solución de la ecuación es x = " + x);
        }
    }
}
