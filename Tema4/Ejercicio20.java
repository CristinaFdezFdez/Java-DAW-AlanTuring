package Tema4;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el día de la semana y la hora
        System.out.print("Introduzca un día de la semana (de lunes a viernes): ");
        String dia = scanner.nextLine().trim().toLowerCase();

        System.out.print("A continuación introduzca la hora (horas y minutos)\nHora: ");
        int hora = scanner.nextInt();

        System.out.print("Minutos: ");
        int minutos = scanner.nextInt();

        // Conversión de días a minutos hasta el viernes a las 15:00
        int minutosHastaViernes = 0;

        switch (dia) {
            case "lunes":
                minutosHastaViernes += 4 * 24 * 60; // 4 días completos
                break;
            case "martes":
                minutosHastaViernes += 3 * 24 * 60; // 3 días completos
                break;
            case "miércoles":
            case "miercoles":
                minutosHastaViernes += 2 * 24 * 60; // 2 días completos
                break;
            case "jueves":
                minutosHastaViernes += 1 * 24 * 60; // 1 día completo
                break;
            case "viernes":
                break; // No sumamos días si es viernes
            default:
                System.out.println("Día no válido.");
                return;
        }

        // Sumar minutos hasta el fin de semana (viernes a las 15:00)
        int minutosActuales = hora * 60 + minutos;
        int minutosFinDeSemana = (15 * 60); // Viernes a las 15:00 en minutos

        minutosHastaViernes += minutosFinDeSemana - minutosActuales;

        System.out.println("Faltan " + minutosHastaViernes + " minutos para el fin de semana.");

        scanner.close();
    }
}
