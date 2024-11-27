package tema5;

import java.util.Scanner;

public class EjercicioRepaso3 {
    public static void main(String[] args) {
        try {
            int numeroIntroducido;
            int sumaDivisores = 1; // Incluye el 1 como divisor propio
            boolean esPrimerDivisor = true;

            Scanner sc = new Scanner(System.in);

            // Entrada del número
            System.out.println(""); // Salto de línea
            do {
                System.out.print("Introduzca un número entero positivo: ");
                numeroIntroducido = sc.nextInt();
            } while (numeroIntroducido <= 0);

            sc.close(); // Cierra el Scanner

            System.out.println(""); // Salto de línea

            // Cálculo de divisores propios
            System.out.print("Los divisores propios del número son: ");
            for (int i = 2; i < numeroIntroducido; i++) {
                if (numeroIntroducido % i == 0) { // Si es divisor
                    sumaDivisores += i;
                    if (!esPrimerDivisor) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    esPrimerDivisor = false;
                }
            }

            // Caso especial si no tiene divisores propios además de 1
            if (esPrimerDivisor) {
                System.out.print("ninguno (aparte del 1)");
            }

            System.out.println(""); // Salto de línea
            System.out.println(""); // Salto de línea

            // Imprimir la suma de los divisores
            System.out.println("Suma de los divisores propios (incluyendo el 1): " + sumaDivisores);
            System.out.println(""); // Salto de línea

            // Verificar si es un número perfecto
            if (sumaDivisores == numeroIntroducido) {
                System.out.println(numeroIntroducido + " es un número perfecto.");
            } else {
                System.out.println(numeroIntroducido + " no es un número perfecto.");
            }

            System.out.println(""); // Salto de línea
        } catch (Exception e) {
            System.out.println(""); // Salto de línea
            System.out.println("Mensaje de error: " + e.getMessage());
            System.out.println("Clase del error: " + e.getClass());
            System.out.println(""); // Salto de línea
        }
    }
}
