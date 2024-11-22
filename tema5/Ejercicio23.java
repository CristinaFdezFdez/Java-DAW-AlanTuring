package tema5;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar un número entero
            System.out.print("Introduzca un número entero: ");
            String numero = scanner.nextLine();

            // Solicitar un dígito
            System.out.print("Introduzca un dígito: ");
            String digito = scanner.nextLine();

            // Validar que el segundo input es un único dígito
            if (digito.length() != 1 || !Character.isDigit(digito.charAt(0))) {
                System.out.println("ERROR: Debe introducir un único dígito.");
                return;
            }

            // Buscar posiciones del dígito en el número y mostrarlas
            boolean encontrado = false;
            System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numero + " en las siguientes posiciones: ");
            for (int i = 0; i < numero.length(); i++) {
                if (numero.charAt(i) == digito.charAt(0)) {
                    System.out.print((i + 1) + " "); // Mostrar la posición
                    encontrado = true;
                }
            }

            // Si no se encuentra el dígito
            if (!encontrado) {
                System.out.print("no aparece en el número.");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("ERROR: Entrada no válida.");
        } finally {
            scanner.close();
        }
    }
}
