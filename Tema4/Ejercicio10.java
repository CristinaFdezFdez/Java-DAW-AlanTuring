package Tema4;
import java.util.Scanner;

/* Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a medianoche */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca la hora y los minutos
        System.out.println("Introduce la hora (en formato 24 horas):");
        int horas = scanner.nextInt();

        System.out.println("Introduce los minutos:");
        int minutos = scanner.nextInt();

        // Cerrar el scanner
        scanner.close();

        // Verificar que la hora y los minutos sean válidos
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
            System.out.println("Hora o minutos inválidos. Por favor introduce valores correctos.");
        } else {
            // Calcular el tiempo actual en segundos
            int segundosActuales = (horas * 3600) + (minutos * 60);

            // Calcular el total de segundos en un día
            int segundosEnUnDia = 24 * 3600;

            // Calcular los segundos restantes para la medianoche
            int segundosHastaMedianoche = segundosEnUnDia - segundosActuales;

            // Mostrar el resultado
            System.out.println("Faltan " + segundosHastaMedianoche + " segundos para llegar a medianoche.");
        }
    }
}
