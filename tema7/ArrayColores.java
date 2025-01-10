package tema7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayColores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array de colores conocidos
        String[] coloresConocidos = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        ArrayList<String> listaColores = new ArrayList<>();
        ArrayList<String> listaNoColores = new ArrayList<>();

        // Pedir al usuario las 8 palabras
        System.out.println("Introduzca 8 palabras (pulse [INTRO] después de cada una):");
        String[] palabras = new String[8];
        for (int i = 0; i < 8; i++) {
            palabras[i] = scanner.nextLine().trim(); // Usamos trim para eliminar espacios adicionales
        }

        // Clasificar las palabras
        for (String palabra : palabras) {
            boolean esColor = false;
            for (String color : coloresConocidos) {
                if (palabra.equalsIgnoreCase(color)) {
                    listaColores.add(palabra);
                    esColor = true;
                    break;
                }
            }
            if (!esColor) {
                listaNoColores.add(palabra);
            }
        }

        // Mostrar el array original
        System.out.println("\nArray original:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("   %d: %s\n", i, palabras[i]);
        }

        // Construir el array resultante
        ArrayList<String> arrayResultante = new ArrayList<>();
        arrayResultante.addAll(listaColores);
        arrayResultante.addAll(listaNoColores);

        // Mostrar el array resultante
        System.out.println("\nArray resultante:");
        for (int i = 0; i < arrayResultante.size(); i++) {
            System.out.printf("   %d: %s\n", i, arrayResultante.get(i));
        }
    }
}
