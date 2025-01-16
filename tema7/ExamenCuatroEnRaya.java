package tema7;

import java.util.Random;
import java.util.Scanner;

public class ExamenCuatroEnRaya {

    // Constantes del juego que no cambian 
    private static final int TAMANO = 4;
    private static final String CELDA_VACIA = ".";
    private static final String FICHA_MAQUINA = "X";
    private static final String FICHA_JUGADOR = "O";

    public static void main(String[] args) {
        String[][] tablero = new String[TAMANO][TAMANO];
        inicializarTablero(tablero);
        mostrarTablero(tablero);

        boolean juegoFinalizado = false;

        while (!juegoFinalizado) {
            turnoOrdenador(tablero);
            if (verificarVictoria(tablero, FICHA_MAQUINA)) {
                System.out.println("¡Ha ganado el ORDENADOR!");
                break;
            }

            if (verificarEmpate(tablero)) {
                System.out.println("El juego ha terminado en TABLAS.");
                break;
            }

            turnoJugador(tablero);
            if (verificarVictoria(tablero, FICHA_JUGADOR)) {
                System.out.println("¡Enhorabuena! ¡Me has ganado!");
                break;
            }

            if (verificarEmpate(tablero)) {
                System.out.println("El juego ha terminado en TABLAS.");
                break;
            }
        }
    }

    /**
     * Inicializo el tablero con celdas vacias
     *
     * @param tablero
     */
    public static void inicializarTablero(String[][] tablero) {
        for (int fila = 0; fila < TAMANO; fila++) {
            for (int columna = 0; columna < TAMANO; columna++) {
                tablero[fila][columna] = CELDA_VACIA;
            }
        }
    }

    /**
     * Muestra el tablero por consola.
     *
     * @param tablero
     */
    public static void mostrarTablero(String[][] tablero) {
        System.out.println();
        System.out.println("  LAS CUATRO EN RAYA");
        System.out.println("  ==================");
    
        // Encabezado de las columnas
        System.out.print("    ");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print(i + "   "); // Números de las columnas
        }
        System.out.println();
    
        // Línea superior del tablero
        System.out.print("   \u2554"); // esquina superior izquierda 
        for (int i = 0; i < TAMANO - 1; i++) {
            System.out.print("\u2550\u2550\u2550\u2566"); // línea horizontal con cruces superiores
        }
        System.out.println("\u2550\u2550\u2550\u2557"); // esquina superior derecha 
    
        // Filas del tablero
        char etiquetaFila = 'a';
        for (int fila = 0; fila < TAMANO; fila++) {
            // Contenido de la fila
            System.out.print(" " + etiquetaFila + " \u2551 "); // etiqueta de fila y borde izquierdo
            for (int columna = 0; columna < TAMANO; columna++) {
                System.out.print(tablero[fila][columna] + " \u2551 ");
            }
            System.out.println();
            etiquetaFila++;
    
            // Línea inferior o intermedia
            if (fila < TAMANO - 1) {
                System.out.print("   \u2560"); // intersección izquierda
                for (int i = 0; i < TAMANO - 1; i++) {
                    System.out.print("\u2550\u2550\u2550\u256C"); // línea horizontal con cruces 
                }
                System.out.println("\u2550\u2550\u2550\u2563"); // intersección derecha 
            }
        }
    
        // Línea inferior del tablero
        System.out.print("   \u255A"); // esquina inferior izquierda 
        for (int i = 0; i < TAMANO - 1; i++) {
            System.out.print("\u2550\u2550\u2550\u2569"); // línea horizontal con separadores inferiores 
        }
        System.out.println("\u2550\u2550\u2550\u255D"); // esquina inferior derecha 
    }
    
    

    /**
     * Turno de la máquina colocando su ficha en una posición aleatoria
     * disponible.
     *
     * @param tablero
     */
    public static void turnoOrdenador(String[][] tablero) {
        Random generadorAleatorio = new Random();
        int filaAleatoria, columnaAleatoria;

        do {
            filaAleatoria = generadorAleatorio.nextInt(TAMANO);
            columnaAleatoria = generadorAleatorio.nextInt(TAMANO);
        } while (!esCeldaLibre(tablero, filaAleatoria, columnaAleatoria));

        tablero[filaAleatoria][columnaAleatoria] = FICHA_MAQUINA;
        System.out.println("El ordenador ha colocado su ficha en (" + (char) ('a' + filaAleatoria) + ", " + columnaAleatoria + ")");
        mostrarTablero(tablero);
    }

    /**
     * Solicito al jugador que realice un movimiento.
     *
     * @param tablero
     */
    public static void turnoJugador(String[][] tablero) {
        Scanner sc = new Scanner(System.in); //Abro scanner para pedir datos al jugador
        int filaSeleccionada = -1, columnaSeleccionada = -1;

        while (true) {
            try {
                System.out.println("Turno del jugador:");
                System.out.print("Introduce la fila (a-d): ");
                String filaInput = sc.nextLine().toLowerCase();

                switch (filaInput) {
                    case "a":
                        filaSeleccionada = 0;
                        break;
                    case "b":
                        filaSeleccionada = 1;
                        break;
                    case "c":
                        filaSeleccionada = 2;
                        break;
                    case "d":
                        filaSeleccionada = 3;
                        break;
                    default:
                        throw new IllegalArgumentException("La fila debe ser una letra entre 'a' y 'd'.");
                }

                System.out.print("Introduce la columna (0-3): ");
                columnaSeleccionada = Integer.parseInt(sc.nextLine());

                if (columnaSeleccionada < 0 || columnaSeleccionada >= TAMANO) {
                    throw new IllegalArgumentException("La columna debe ser un número entre 0 y 3.");
                }
                //Compruebo que la celda está libre y si no lo está lanzo una excepción
                if (!esCeldaLibre(tablero, filaSeleccionada, columnaSeleccionada)) {
                    throw new IllegalArgumentException("Coordenada no válida. Inténtalo de nuevo.");
                }

                break;
            
            } catch (Exception e) {
                System.out.println("Entrada inválida");
            }
        
        }
    
        tablero[filaSeleccionada][columnaSeleccionada] = FICHA_JUGADOR;
        mostrarTablero(tablero);
    }

    /**
     * Función para verificar si una celda del tablero está libre.
     *
     * @param tablero
     * @param fila
     * @param columna
     * @return
     */
    private static boolean esCeldaLibre(String[][] tablero, int fila, int columna) {
        return tablero[fila][columna].equals(CELDA_VACIA);
    }

    /**
     * Verifica si una ficha ha ganado el juego.
     *
     * @param tablero
     * @param ficha
     * @return 
     */
    public static boolean verificarVictoria(String[][] tablero, String ficha) {
        for (int i = 0; i < TAMANO; i++) {
            if (verificarLinea(tablero[i], ficha) || verificarColumna(tablero, i, ficha)) {
                return true;
            }
        }
        return verificarDiagonal(tablero, ficha);
    }

    /**
     * Verifica si una línea (fila) completa tiene la misma ficha.
     *
     * @param fila
     * @param ficha
     * @return 
     * 
     */
    private static boolean verificarLinea(String[] fila, String ficha) {
        for (String celda : fila) {
            if (!celda.equals(ficha)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica si una columna completa tiene la misma ficha.
     *
     * @param tablero
     * @param columna
     * @param ficha
     * @return 
     * 
     */
    private static boolean verificarColumna(String[][] tablero, int columna, String ficha) {
        for (int fila = 0; fila < TAMANO; fila++) {
            if (!tablero[fila][columna].equals(ficha)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica si alguna de las dos diagonales del tablero tiene la misma
     * ficha.
     *
     * @param tablero
     * @param ficha
     * @return 
     * 
     */
    private static boolean verificarDiagonal(String[][] tablero, String ficha) {
        boolean diagonalPrincipal = true;
        boolean diagonalSecundaria = true;

        for (int i = 0; i < TAMANO; i++) {
            if (!tablero[i][i].equals(ficha)) {
                diagonalPrincipal = false;
            }
            if (!tablero[i][TAMANO - 1 - i].equals(ficha)) {
                diagonalSecundaria = false;
            }
        }
        return diagonalPrincipal || diagonalSecundaria;
    }

    /**
     * Verifica si el tablero está lleno y no hay movimientos posibles.
     *
     * @param tablero
     * @return 
     */
    public static boolean verificarEmpate(String[][] tablero) {
        for (String[] fila : tablero) {
            for (String celda : fila) {
                if (celda.equals(CELDA_VACIA)) {
                    return false;
                }
            }
        }
        return true;
    }
}
