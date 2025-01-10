package tema7;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ArraySumasParciales {
    public static void main(String[] args) {
        final int FILAS = 4;
        final int COLUMNAS = 5;
        int[][] array = new int[FILAS][COLUMNAS];
        int[] sumaFilas = new int[FILAS];
        int[] sumaColumnas = new int[COLUMNAS];
        int sumaTotal = 0;

        Random random = new Random();

        // Rellenar el array con números aleatorios entre 100 y 999
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                array[i][j] = random.nextInt(900) + 100;
            }
        }

        // Calcular sumas parciales y total
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                sumaFilas[i] += array[i][j];
                sumaColumnas[j] += array[i][j];
                sumaTotal += array[i][j];
            }
        }

        // Mostrar el array con sumas parciales
        try {
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    System.out.printf("%5d", array[i][j]);
                    TimeUnit.MILLISECONDS.sleep(100); // Pequeño retardo
                }
                System.out.printf("   |%6d\n", sumaFilas[i]);
                TimeUnit.MILLISECONDS.sleep(200); // Retardo mayor
            }

            // Mostrar línea separadora
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("-----");
            }
            System.out.println("-------");

            // Mostrar sumas de columnas
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.printf("%5d", sumaColumnas[j]);
                TimeUnit.MILLISECONDS.sleep(100); // Pequeño retardo
            }
            System.out.printf("   |%6d\n", sumaTotal);
        } catch (InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
