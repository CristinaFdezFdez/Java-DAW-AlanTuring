package tema5;
import java.util.Scanner;

public class EjercicioRepaso2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            // Obtener nombres de los jugadores
            System.out.print("Nombre del jugador 1: ");
            String jugador1 = sc.nextLine();
            System.out.print("Nombre del jugador 2: ");
            String jugador2 = sc.nextLine();

            // Variables para guardar las jugadas
            String jugada1, jugada2;
            boolean entradaValida;

            // Pedir la jugada del jugador 1
            do {
                System.out.print("Jugada del primer jugador (piedra, papel, tijeras): ");
                jugada1 = sc.nextLine().toLowerCase();
                entradaValida = jugada1.equals("piedra") || jugada1.equals("papel") || jugada1.equals("tijeras");
                if (!entradaValida) {
                    System.out.println("ERROR: Jugada no válida. Inténtalo de nuevo.");
                }
            } while (!entradaValida);

            // Limpiar pantalla (opcional)
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Pedir la jugada del jugador 2
            do {
                System.out.print("Jugada del segundo jugador (piedra, papel, tijeras): ");
                jugada2 = sc.nextLine().toLowerCase();
                entradaValida = jugada2.equals("piedra") || jugada2.equals("papel") || jugada2.equals("tijeras");
                if (!entradaValida) {
                    System.out.println("ERROR: Jugada no válida. Inténtalo de nuevo.");
                }
            } while (!entradaValida);

            // Limpiar pantalla (opcional)
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Determinar el ganador
            if (jugada1.equals(jugada2)) {
                System.out.println("Empate. Ambos jugadores eligieron " + jugada1 + ".");
            } else if (
                (jugada1.equals("piedra") && jugada2.equals("tijeras")) ||
                (jugada1.equals("tijeras") && jugada2.equals("papel")) ||
                (jugada1.equals("papel") && jugada2.equals("piedra"))
            ) {
                System.out.println("¡" + jugador1 + " gana! " + jugada1 + " vence a " + jugada2 + ".");
            } else {
                System.out.println("¡" + jugador2 + " gana! " + jugada2 + " vence a " + jugada1 + ".");
            }

            sc.close(); // Cierre del Scanner
        } catch (Exception e) {
            System.out.println("Mensaje de error: " + e.getMessage());
            System.out.println("Clase del error: " + e.getClass());
        }
    }
}
