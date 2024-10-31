package tema5;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Inicializa variables
        int number;
        int sum = 0; 

        System.out.println("Introduzca números y pulse ENTER. Para acabar, introduce un número negativo.");

        // Continua hasta número negativo
        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                break; // Sal del bucle en negativo
            }
            sum += number; // Añade el número a la suma
        }
        //Muestra resultado
        System.out.println("La suma de los números introducidos es: " + sum);
        scanner.close();
    }
}

