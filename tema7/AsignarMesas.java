package tema7;

import java.util.Random;
import java.util.Scanner;

public class AsignarMesas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Crear y llenar el array con ocupaciones aleatorias entre 0 y 4
        int[] mesas = new int[10];
        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = random.nextInt(5);
        }

        while (true) {
            // Mostrar el estado actual de las mesas
            System.out.println("Mesa nº");
            for (int i = 0; i < mesas.length; i++) {
                System.out.printf("%4d", i + 1);
            }
            System.out.println("\nOcupación");
            for (int ocupacion : mesas) {
                System.out.printf("%4d", ocupacion);
            }
            System.out.println();

            // Solicitar al usuario el número de personas
            System.out.print("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
            int grupo = scanner.nextInt();

            if (grupo == -1) {
                System.out.println("Gracias. Hasta pronto.");
                break;
            }

            if (grupo < 1 || grupo > 4) {
                System.out.printf("Lo siento, no admitimos grupos de %d, haga grupos de 4 personas como máximo e intente de nuevo.\n", grupo);
                continue;
            }

            // Buscar una mesa vacía primero
            boolean sentado = false;
            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] == 0) {
                    mesas[i] = grupo;
                    System.out.printf("Por favor, siéntense en la mesa número %d.\n", i + 1);
                    sentado = true;
                    break;
                }
            }

            // Si no hay mesas vacías, buscar una mesa con espacio suficiente
            if (!sentado) {
                for (int i = 0; i < mesas.length; i++) {
                    if (mesas[i] + grupo <= 4) {
                        mesas[i] += grupo;
                        System.out.printf("Tendrán que compartir mesa. Por favor, siéntense en la mesa número %d.\n", i + 1);
                        sentado = true;
                        break;
                    }
                }
            }

            // Si no hay espacio suficiente
            if (!sentado) {
                System.out.println("Lo siento, en estos momentos no queda sitio.");
            }
        }
    }
}

