package Tema4;
import java.util.Scanner;

/* Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax^2 + bx + c = 0) */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los valores de a, b y c
        System.out.println("Introduce el valor de a:");
        double a = scanner.nextDouble();

        System.out.println("Introduce el valor de b:");
        double b = scanner.nextDouble();

        System.out.println("Introduce el valor de c:");
        double c = scanner.nextDouble();

        // Cerrar el scanner
        scanner.close();

        // Comprobar si la ecuación es realmente de segundo grado
        if (a == 0) {
            System.out.println("El valor de 'a' debe ser distinto de 0 para que sea una ecuación de segundo grado.");
        } else {
            // Calcular el discriminante
            double discriminante = Math.pow(b, 2) - 4 * a * c;

            // Determinar el número de soluciones en función del discriminante
            if (discriminante > 0) {
                // Dos soluciones reales
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminante == 0) {
                // Una solución real
                double x = -b / (2 * a);
                System.out.println("La ecuación tiene una única solución real:");
                System.out.println("x = " + x);
            } else {
                // No hay soluciones reales
                System.out.println("La ecuación no tiene soluciones reales.");
            }
        }
    }
}
