package tema5;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        while (true) {
            System.out.print("Introduce un número entero positivo: ");
            numero = scanner.nextInt();

            // Verificar si el número es positivo
            if (numero > 0) {
                break;  // Si es positivo, salir del bucle
            } else {
                System.out.println("Número introducido incorrecto, debe introducir un número positivo.");
            }
        }

        int suma = 0;
        
        for (int i = 1; i <= 100; i++) {
            suma += (numero + i);  // Sumar el número y los siguientes 100 números
        }

        System.out.println("La suma de los 100 números siguientes a " + numero + " es " + suma);

        scanner.close();
    }
}
