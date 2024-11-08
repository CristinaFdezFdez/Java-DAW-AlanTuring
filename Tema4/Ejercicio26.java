package Tema4;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar jugada del jugador 1
            System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
            String jugadaJugador1 = scanner.nextLine().trim().toLowerCase();

            // Validar jugada jugador 1
            if (!(jugadaJugador1.equals("piedra") || jugadaJugador1.equals("papel") || jugadaJugador1.equals("tijera"))) {
                System.out.println("Error: Jugada inválida.");
                return;
            }

            // Solicitar jugada del jugador 2
            System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
            String jugadaJugador2 = scanner.nextLine().trim().toLowerCase();

            // Validar jugada jugador 2
            if (!(jugadaJugador2.equals("piedra") || jugadaJugador2.equals("papel") || jugadaJugador2.equals("tijera"))) {
                System.out.println("Error: Jugada inválida.");
                return;
            }

            // Determinar el resultado
            if (jugadaJugador1.equals(jugadaJugador2)) {
                System.out.println("Empate");
            } else if ((jugadaJugador1.equals("piedra") && jugadaJugador2.equals("tijera"))
                    || (jugadaJugador1.equals("papel") && jugadaJugador2.equals("piedra"))
                    || (jugadaJugador1.equals("tijera") && jugadaJugador2.equals("papel"))) {
                System.out.println("Gana el jugador 1");
            } else {
                System.out.println("Gana el jugador 2");
            }

        } catch (Exception e) {
            System.out.println("Error: Ocurrió un problema con la entrada.");
        } finally {
            scanner.close();
        }
    }
}
