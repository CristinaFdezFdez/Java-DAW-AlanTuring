package Tema4;
import java.util.Scanner;

/* Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso.
   Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida. */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntuacion = 0;

        // Pregunta 1
        System.out.println("1. ¿Cuál es el resultado de 2 + 2?");
        System.out.println("a) 3\nb) 4\nc) 5\nd) 6");
        System.out.print("Tu respuesta: ");
        char respuesta = scanner.next().toLowerCase().charAt(0);
        if (respuesta == 'b') puntuacion++;

        // Pregunta 2
        System.out.println("2. ¿En qué año comenzó la Segunda Guerra Mundial?");
        System.out.println("a) 1914\nb) 1939\nc) 1945\nd) 1929");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.next().toLowerCase().charAt(0);
        if (respuesta == 'b') puntuacion++;

        // Pregunta 3
        System.out.println("3. ¿Cuál es la capital de Francia?");
        System.out.println("a) Madrid\nb) Roma\nc) París\nd) Londres");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.next().toLowerCase().charAt(0);
        if (respuesta == 'c') puntuacion++;

        // Pregunta 4
        System.out.println("4. ¿Cuál es el elemento químico con el símbolo H?");
        System.out.println("a) Oxígeno\nb) Hidrógeno\nc) Helio\nd) Nitrógeno");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.next().toLowerCase().charAt(0);
        if (respuesta == 'b') puntuacion++;

        // Pregunta 5
        System.out.println("5. ¿Cuál es la raíz cuadrada de 49?");
        System.out.println("a) 6\nb) 8\nc) 7\nd) 5");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.next().toLowerCase().charAt(0);
        if (respuesta == 'c') puntuacion++;

        // Pregunta 6
        System.out.println("6. ¿En qué continente se encuentra Brasil?");
        System.out.println("a) América\nb) Asia\nc) África\nd) Sudamérica");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.next().toLowerCase().charAt(0);
        if (respuesta == 'd') puntuacion++;

        // Pregunta 7
        System.out.println("7. ¿Qué tipo de animal es un delfín?");
        System.out.println("a) Mamífero\nb) Reptil\nc) Ave\nd) Pez");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.next().toLowerCase().charAt(0);
        if (respuesta == 'a') puntuacion++;

        // Pregunta 8
        System.out.println("8. ¿Cuál es el idioma oficial de Brasil?");
        System.out.println("a) Español\nb) Inglés\nc) Portugués\nd) Francés");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.next().toLowerCase().charAt(0);
        if (respuesta == 'c') puntuacion++;

        // Pregunta 9
        System.out.println("9. ¿Cuál es el planeta más cercano al Sol?");
        System.out.println("a) Marte\nb) Venus\nc) Tierra\nd) Mercurio");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.next().toLowerCase().charAt(0);
        if (respuesta == 'd') puntuacion++;

        // Pregunta 10
        System.out.println("10. ¿Cuál es el río más largo del mundo?");
        System.out.println("a) Nilo\nb) Amazonas\nc) Yangtsé\nd) Misisipi");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.next().toLowerCase().charAt(0);
        if (respuesta == 'b') puntuacion++;

        // Cerrar el scanner
        scanner.close();

        // Mostrar la calificación final
        System.out.println("Calificación final: " + puntuacion + " / 10");
    }
}
