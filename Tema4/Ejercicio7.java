package Tema4;
import java.util.Scanner;

/* Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente) */
public class Ejercicio7 {
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

        // Determinar la calificación en palabras
        String calificacion;
        if (media < 5) {
            calificacion = "Insuficiente";
        } else if (media < 6) {
            calificacion = "Suficiente";
        } else if (media < 7) {
            calificacion = "Bien";
        } else if (media < 9) {
            calificacion = "Notable";
        } else {
            calificacion = "Sobresaliente";
        }

        // Mostrar la media y la calificación al usuario
        System.out.println("La media de las tres notas es: " + media);
        System.out.println("Calificación del boletín: " + calificacion);
    }
}
