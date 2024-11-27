package tema5;
import java.util.Scanner;

public class EjercicioRepaso1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String respuesta;

            do {
                System.out.println("\nIntroduzca el nombre con el formato Apellido1 Apellido2, Nombre:");
                String nombre = sc.nextLine();

                double[] notas = new double[3];
                for (int i = 0; i < 3; i++) {
                    do {
                        System.out.printf("Introduzca la nota del %dº trimestre (0-10): ", i + 1);
                        while (!sc.hasNextDouble()) { // Validación de número
                            System.out.println("Por favor, introduzca un número válido.");
                            sc.next();
                        }
                        notas[i] = sc.nextDouble();
                    } while (notas[i] < 0 || notas[i] > 10);
                }
                sc.nextLine(); // Limpiar buffer

                double media = (notas[0] + notas[1] + notas[2]) / 3;

                // Mostrar tabla
                mostrarTabla(nombre, notas, media);

                System.out.print("\n¿Desea continuar introduciendo notas de nuevos alumnos? (S/N): ");
                respuesta = sc.nextLine().toUpperCase();

            } while (respuesta.equals("S"));

            System.out.println("Fin del programa.");
        } catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }

    static void mostrarTabla(String nombre, double[] notas, double media) {
        int anchoNombre = nombre.length();
        System.out.print(" ");
        for (int i = 0; i < anchoNombre + 2; i++) {
            System.out.print("-");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" ---");
        }
        System.out.print(" ------\n");

        System.out.printf("| %s | ", nombre);
        for (double nota : notas) {
            System.out.printf(nota >= 5 ? "\033[1;32m%1.0f\033[0m | " : "\033[1;31m%1.0f\033[0m | ", nota);
        }
        System.out.printf(media >= 5 ? "\033[1;32m%1.2f\033[0m |\n" : "\033[1;31m%1.2f\033[0m |\n", media);

        System.out.print(" ");
        for (int i = 0; i < anchoNombre + 2; i++) {
            System.out.print("-");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" ---");
        }
        System.out.print(" ------\n");
    }
}
