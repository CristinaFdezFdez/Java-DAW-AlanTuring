package Tema4;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar las dos notas de los controles
        System.out.print("Nota del primer examen: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Nota del segundo examen: ");
        double nota2 = scanner.nextDouble();
        
        // Calcular la media de las dos notas
        double media = (nota1 + nota2) / 2;
        
        // Determinar si el alumno aprueba con la media o necesita recuperación
        if (media >= 5) {
            System.out.println("Tu nota en programación es " + media);
        } else {
            // Solicitar el resultado de la recuperación
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            scanner.nextLine(); // Limpiar el buffer
            String resultadoRecuperacion = scanner.nextLine().trim().toLowerCase();
            
            // Determinar la nota final después de la recuperación
            if (resultadoRecuperacion.equals("apto")) {
                System.out.println("Tu nota en programación es 5.0");
            } else {
                System.out.println("Tu nota en programación es " + media);
            }
        }
        
        scanner.close();
    }
}
