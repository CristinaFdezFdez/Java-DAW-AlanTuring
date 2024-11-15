package tema5;

public class Ejercicio19 {

    public static void main(String[] args) {
        System.out.println("Números primos entre 2 y 100:");

        // Recorrer todos los números entre 2 y 100
        for (int num = 2; num <= 100; num++) {
            // Verificar si el número es primo
            boolean esPrimo = true;

            // Comprobar si el número tiene divisores distintos de 1 y sí mismo
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break; // Si encontramos un divisor, no es primo
                }
            }

            // Si el número es primo, imprimirlo
            if (esPrimo) {
                System.out.print(num + " ");
            }
        }
    }
}
