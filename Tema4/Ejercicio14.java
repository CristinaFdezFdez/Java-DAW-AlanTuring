package Tema4;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int puntuacion = 0;
        String respuesta;
        
        System.out.println("TEST DE FIDELIDAD");
        System.out.println("Este programa te dirá si hay probabilidad de que tu pareja te esté siendo infiel.");
        
        // Preguntas y acumulación de puntos
        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. (v/f): ");
        respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("v")) puntuacion++;
        
        System.out.print("2. Ha aumentado sus gastos de vestuario. (v/f): ");
        respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("v")) puntuacion++;
        
        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti. (v/f): ");
        respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("v")) puntuacion++;
        
        System.out.print("4. Ahora se afeita y asea con más frecuencia (si es hombre) o ahora se arregla el pelo y ase con más frecuencia (si es mujer). (v/f): ");
        respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("v")) puntuacion++;
        
        System.out.print("5. No te deja que mires la agenda de su teléfono móvil. (v/f): ");
        respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("v")) puntuacion++;
        
        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante. (v/f): ");
        respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("v")) puntuacion++;
        
        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a. (v/f): ");
        respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("v")) puntuacion++;
        
        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo. (v/f): ");
        respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("v")) puntuacion++;
        
        System.out.print("9. Has notado que últimamente se perfuma más. (v/f): ");
        respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("v")) puntuacion++;
        
        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo. (v/f): ");
        respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("v")) puntuacion++;
        
        // Resultado según la puntuación
        System.out.println("\nPuntuación obtenida: " + puntuacion);
        
        if (puntuacion >= 0 && puntuacion <= 10) {
            System.out.println("Enhorabuena! Tu pareja parece ser totalmente fiel.");
        } else if (puntuacion >= 11 && puntuacion <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (puntuacion >= 23 && puntuacion <= 30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        }
        
        scanner.close();
    }
}
