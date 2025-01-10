package tema7;

import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
    public static char[][] tablero = new char[3][3];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Inicializar el tablero con '░' para indicar casillas vacías
        inicializarTablero();

        // Mostrar el tablero inicial
        mostrarTablero();

        // Bucle principal del juego
        while (true) {
            // Turno del jugador
            jugadorMovimiento();
            mostrarTablero();
            if (verificarGanador('x')) {
                System.out.println("¡ENHORABUENA! ¡Has ganado!");
                break;
            }
            if (esTableroLleno()) {
                System.out.println("¡Empate!");
                break;
            }

            // Turno del ordenador
            ordenadorMovimiento();
            mostrarTablero();
            if (verificarGanador('o')) {
                System.out.println("¡Has perdido! El ordenador ha ganado.");
                break;
            }
            if (esTableroLleno()) {
                System.out.println("¡Empate!");
                break;
            }
        }
    }

    // Inicializar el tablero con valores vacíos '░'
    public static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    // Mostrar el tablero
    public static void mostrarTablero() {
        System.out.println("       ");
        for (int i = 0; i < 3; i++) {
            System.out.print((char)('a' + i) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("   1 2 3 ");
    }

    // Verificar si un jugador ha ganado
    public static boolean verificarGanador(char jugador) {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true;
            }
        }
        // Verificar diagonales
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }
        return false;
    }

    // Comprobar si el tablero está lleno
    public static boolean esTableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Movimiento del jugador
    public static void jugadorMovimiento() {
        String coordenada;
        int fila, columna;
        while (true) {
            System.out.print("Introduzca las coordenadas, por ejemplo b2: ");
            coordenada = scanner.nextLine().toLowerCase();

            if (coordenada.length() != 2) {
                System.out.println("Entrada no válida. Intenta de nuevo.");
                continue;
            }

            fila = coordenada.charAt(0) - 'a';  // Convertir la letra de la fila a un índice (a -> 0, b -> 1, c -> 2)
            columna = coordenada.charAt(1) - '1';  // Convertir el número de la columna a índice (1 -> 0, 2 -> 1, 3 -> 2)

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                tablero[fila][columna] = 'x';  // Asignar la jugada del jugador 'x'
                break;
            } else {
                System.out.println("Coordenadas no válidas o casilla ya ocupada. Intenta de nuevo.");
            }
        }
    }

    // Movimiento del ordenador
    public static void ordenadorMovimiento() {
        Random rand = new Random();
        int fila, columna;
        while (true) {
            fila = rand.nextInt(3);
            columna = rand.nextInt(3);
            if (tablero[fila][columna] == ' ') {
                tablero[fila][columna] = 'o';  // Asignar la jugada del ordenador 'o'
                break;
            }
        }
        System.out.println("El ordenador ha jugado en " + (char)('a' + fila) + (columna + 1));
    }
}
