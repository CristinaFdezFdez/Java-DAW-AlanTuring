package tema5;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt(); //Solicito 10 veces el número

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("Has introducido " + positivos + " positivos y " + negativos + " negativos.");

        scanner.close();
    }
}
