package tema5;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa variables
        int number;
        int sum = 0; 
        int contador=0;

        System.out.println("Introduzca números y pulse ENTER. Para acabar, introduce un número negativo.");

        // Usando do-while para asegurarse de que se ejecute al menos una vez
        do {
            number = scanner.nextInt();
            
            if (number != 0) {  // Solo sumar si el número no es 0
                contador++;
                sum += number; 
            }
        } while (number != 0);  // Continua hasta que se ingrese un 0

        // Muestra resultado
        System.out.println("Los números introducidos son "+contador+" La suma de los números introducidos es: " + sum);
        scanner.close();
    }
}
