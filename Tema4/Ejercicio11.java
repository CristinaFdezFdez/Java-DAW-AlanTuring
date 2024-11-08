package Tema4;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntuacion = 0;
        String respuesta;

        // Pregunta 1
        System.out.println("1. ¿Cuál de los siguientes tipos de datos tiene más precisión?");
        System.out.println("a. int");
        System.out.println("b. double");
        System.out.println("c. float");
        System.out.print("Tu respuesta: ");
        try {
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("b")) {
                puntuacion++;
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer la respuesta. Intenta nuevamente.");
            scanner.nextLine(); // Limpiar el buffer
        }

        // Pregunta 2
        System.out.println("\n2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?");
        System.out.println("a. XML");
        System.out.println("b. SELECT");
        System.out.println("c. HTML");
        System.out.print("Tu respuesta: ");
        try {
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("b")) {
                puntuacion++;
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer la respuesta. Intenta nuevamente.");
            scanner.nextLine(); // Limpiar el buffer
        }

        // Pregunta 3
        System.out.println("\n3. Para insertar un hiperenlace en una página se utiliza la etiqueta");
        System.out.println("a. href");
        System.out.println("b. a");
        System.out.println("c. link");
        System.out.print("Tu respuesta: ");
        try {
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("b")) {
                puntuacion++;
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer la respuesta. Intenta nuevamente.");
            scanner.nextLine(); // Limpiar el buffer
        }

        // Pregunta 4
        System.out.println("\n4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
        System.out.println("a. /etc");
        System.out.println("b. /config");
        System.out.println("c. /cfg");
        System.out.print("Tu respuesta: ");
        try {
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("a")) {
                puntuacion++;
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer la respuesta. Intenta nuevamente.");
            scanner.nextLine(); // Limpiar el buffer
        }

        // Pregunta 5
        System.out.println("\n5. ¿Cuál de las siguientes memorias es volátil?");
        System.out.println("a. RAM");
        System.out.println("b. EPROM");
        System.out.println("c. ROM");
        System.out.print("Tu respuesta: ");
        try {
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("a")) {
                puntuacion++;
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer la respuesta. Intenta nuevamente.");
            scanner.nextLine(); // Limpiar el buffer
        }

        // Pregunta 6
        System.out.println("\n6. ¿Qué es la POO en programación?");
        System.out.println("a. Programación orientada a objetos");
        System.out.println("b. Procedimientos orientados a objetos");
        System.out.println("c. Puntos de operación");
        System.out.print("Tu respuesta: ");
        try {
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("a")) {
                puntuacion++;
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer la respuesta. Intenta nuevamente.");
            scanner.nextLine(); // Limpiar el buffer
        }

        // Pregunta 7
        System.out.println("\n7. ¿Qué sistema operativo es de código abierto?");
        System.out.println("a. Windows");
        System.out.println("b. Linux");
        System.out.println("c. macOS");
        System.out.print("Tu respuesta: ");
        try {
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("b")) {
                puntuacion++;
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer la respuesta. Intenta nuevamente.");
            scanner.nextLine(); // Limpiar el buffer
        }

        // Pregunta 8
        System.out.println("\n8. ¿Qué significa HTML?");
        System.out.println("a. HyperText Markup Language");
        System.out.println("b. Hyper Transfer Markup Language");
        System.out.println("c. HighText Markup Language");
        System.out.print("Tu respuesta: ");
        try {
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("a")) {
                puntuacion++;
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer la respuesta. Intenta nuevamente.");
            scanner.nextLine(); // Limpiar el buffer
        }

        // Pregunta 9
        System.out.println("\n9. ¿Cuál es el principal componente de una CPU?");
        System.out.println("a. La RAM");
        System.out.println("b. El procesador");
        System.out.println("c. La tarjeta gráfica");
        System.out.print("Tu respuesta: ");
        try {
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("b")) {
                puntuacion++;
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer la respuesta. Intenta nuevamente.");
            scanner.nextLine(); // Limpiar el buffer
        }

        // Pregunta 10
        System.out.println("\n10. ¿Cuál es el lenguaje de programación utilizado en el desarrollo de aplicaciones Android?");
        System.out.println("a. Java");
        System.out.println("b. C#");
        System.out.println("c. Python");
        System.out.print("Tu respuesta: ");
        try {
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("a")) {
                puntuacion++;
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer la respuesta. Intenta nuevamente.");
            scanner.nextLine(); // Limpiar el buffer
        }

        // Mostrar la puntuación final
        System.out.println("\nHas obtenido " + puntuacion + " puntos.");
        scanner.close();
    }
}
