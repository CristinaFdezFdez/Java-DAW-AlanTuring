package Tema4;
import java.util.Scanner;

/* Realiza un programa que calcule el tiempo que va a tardar en caer un objeto desde una altura h */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Constante de la gravedad en m/s^2
        final double GRAVEDAD = 9.81;

        // Solicitar al usuario la altura desde la cual cae el objeto
        System.out.println("Introduce la altura desde la que cae el objeto (en metros):");
        double h = scanner.nextDouble();

        // Cerrar el scanner
        scanner.close();

        // Verificar que la altura es válida (mayor o igual a 0)
        if (h < 0) {
            System.out.println("La altura debe ser un valor positivo.");
        } else {
            // Calcular el tiempo de caída usando la fórmula t = sqrt(2 * h / g)
            double tiempo = Math.sqrt(2 * h / GRAVEDAD);
            System.out.println("El tiempo de caída es: " + tiempo + " segundos.");
        }
    }
}
