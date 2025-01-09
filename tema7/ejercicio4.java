package tema7;

import java.util.Random;

public class ejercicio4 {

    public static void main(String[] args) {
        // Declaración de los arrays
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        // Llenar el array 'numero' con valores aleatorios y calcular 'cuadrado' y 'cubo'
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numero[i] = random.nextInt(101); // Números entre 0 y 100
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
        }

        // Mostrar los resultados en tres columnas
        System.out.printf("%5s │ %7s │ %10s%n", "n", "n^2", "n^3");
        System.out.println("───────┼─────────┼────────────");

        for (int i = 0; i < 20; i++) {
            System.out.printf("%5d │ %7d │ %10d%n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
