package tema5;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        
        while (true) {
            try {
                // Solicitar el primer número
                System.out.print("Introduzca un número entero: ");
                num1 = Integer.parseInt(scanner.nextLine());
                
                // Solicitar el segundo número
                System.out.print("Introduzca otro número distinto al anterior: ");
                num2 = Integer.parseInt(scanner.nextLine());
                
                // Verificar que los números sean distintos
                if (num1 == num2) {
                    System.out.println("Números no válidos, deben ser distintos.");
                } else {
                    break; // Salir del bucle si los números son distintos
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduzca un número entero válido.");
            }
        }

        // Determinar el menor y el mayor de los dos números
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        // Generar y mostrar los números de 7 en 7
        for (int i = menor; i <= mayor; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println(); // Para salto de línea final
            scanner.close();

    }
}
