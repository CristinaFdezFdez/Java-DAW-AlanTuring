package Tema4;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura= 0;
        int opcion= 0;
        String caracter="";
        try {
            // Solicitar el carácter de relleno
            System.out.println("Este programa pinta una pirámide.");
            while (caracter.length()!=1) {
                System.out.print("Introduzca el carácter de relleno: ");
                caracter = scanner.nextLine();
                if(caracter.length()!=1){
                    System.out.println("ERROR: El caracter tiene que ser de longitud 1");
                }
            }
            // Solicitar la altura de la pirámide
            System.out.print("Introduzca la altura de la pirámide: ");
            altura = scanner.nextInt();

            // Mostrar el menú de opciones
            System.out.println("Elija un tipo de pirámide:");
            System.out.println("1. Con el vértice hacia arriba");
            System.out.println("2. Con el vértice hacia abajo");
            System.out.println("3. Con el vértice hacia la izquierda");
            System.out.println("4. Con el vértice hacia la derecha");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR: La opción debe ser un número del 1 al 5");
        }

        // Pintar la pirámide según la opción elegida
        if (opcion == 1) {  // Vértice hacia arriba
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura - i - 1; j++) {
                    System.out.print(" ");  // Espacios para centrar
                }
                for (int j = 0; j < (2 * i + 1); j++) {
                    System.out.print(caracter);  // Carácter de la pirámide
                }
                System.out.println();
            }
        } else if (opcion == 2) {  // Vértice hacia abajo
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");  // Espacios para alinear
                }
                for (int j = 0; j < (2 * (altura - i) - 1); j++) {
                    System.out.print(caracter);  // Carácter de la pirámide
                }
                System.out.println();
            }
        } else if (opcion == 3) {  // Vértice hacia la izquierda
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(caracter);  // Carácter de la pirámide
                }
                System.out.println();
            }
            for (int i = altura - 2; i >= 0; i--) {  // Parte decreciente
                for (int j = 0; j <= i; j++) {
                    System.out.print(caracter);  // Carácter de la pirámide
                }
                System.out.println();
            }
        } else if (opcion == 4) {  // Vértice hacia la derecha
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < (altura - i - 1); j++) {
                    System.out.print(" ");  // Espacios para alinear
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(caracter);  // Carácter de la pirámide
                }
                System.out.println();
            }
            for (int i = altura - 2; i >= 0; i--) {  // Parte decreciente
                for (int j = 0; j < (altura - i - 1); j++) {
                    System.out.print(" ");  // Espacios para alinear
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(caracter);  // Carácter de la pirámide
                }
                System.out.println();
            }
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
