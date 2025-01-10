package tema7;

import java.util.Random;
import java.util.Scanner;

public class BuscaElTesoro {
    public static void main(String[] args) {
        final int FILAS = 4;
        final int COLUMNAS = 5;

        char[][] tablero = new char[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = ' '; // Inicializamos el tablero vacío
            }
        }

        Random random = new Random();

        // Colocar la mina y el tesoro
        int minaX = random.nextInt(COLUMNAS);
        int minaY = random.nextInt(FILAS);

        int tesoroX, tesoroY;
        do {
            tesoroX = random.nextInt(COLUMNAS);
            tesoroY = random.nextInt(FILAS);
        } while (tesoroX == minaX && tesoroY == minaY); // Asegurarse de que no coincidan

        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        System.out.println("\u00a1BUSCA EL TESORO!");
        while (!juegoTerminado) {
            // Mostrar el tablero
            for (int i = FILAS - 1; i >= 0; i--) {
                System.out.print(i + "|");
                for (int j = 0; j < COLUMNAS; j++) {
                    System.out.print(" " + tablero[i][j]);
                }
                System.out.println();
            }
            System.out.println("  " + "-".repeat(COLUMNAS * 2));
            System.out.print("  ");
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

            // Pedir coordenadas
            System.out.print("\nCoordenada x: ");
            int x = scanner.nextInt();
            System.out.print("Coordenada y: ");
            int y = scanner.nextInt();

            // Verificar las coordenadas
            if (x < 0 || x >= COLUMNAS || y < 0 || y >= FILAS) {
                System.out.println("Coordenadas fuera del tablero. Intenta de nuevo.");
                continue;
            }

            if (x == minaX && y == minaY) {
                System.out.println("\u00a1BOOOM! Lo siento, has perdido.");
                tablero[y][x] = '*'; // Mostrar la mina
                juegoTerminado = true;
            } else if (x == tesoroX && y == tesoroY) {
                System.out.println("\u00a1ENHORABUENA! \u00a1Has encontrado el tesoro!");
                tablero[y][x] = '€'; // Mostrar el tesoro
                juegoTerminado = true;
            } else {
                System.out.println("\nIntento fallido. Sigue buscando.");
                tablero[y][x] = 'X'; // Marcar la posición intentada
            }
        }

        // Mostrar el tablero completo
        System.out.println("\nTablero final:");
        for (int i = FILAS - 1; i >= 0; i--) {
            System.out.print(i + "|");
            for (int j = 0; j < COLUMNAS; j++) {
                if (i == minaY && j == minaX) {
                    tablero[i][j] = '*';
                } else if (i == tesoroY && j == tesoroX) {
                    tablero[i][j] = '€';
                }
                System.out.print(" " + tablero[i][j]);
            }
            System.out.println();
        }
        System.out.println("  " + "-".repeat(COLUMNAS * 2));
        System.out.print("  ");
        for (int j = 0; j < COLUMNAS; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}