package Tema4;
import java.util.Scanner;

/*Ejercicio 2. Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a
20 y de 21 a 5 respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben
introducir por teclado.*/

public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float hora;
    // Pedir al usuario que introduzca la hora
    System.out.println("Por favor, Introduce una hora entre (0 - 23)");
    hora = scanner.nextFloat();
        if ((hora >= 6) && (hora <= 12)) {
            System.out.println("Buenos días");
        }
            
        else if ((hora >= 13) && (hora <= 20)) {
            System.out.println("Buenas tardes");
        }
            
        else if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
            System.out.println("Buenas noches");
        }
            
        else {
            System.out.println("La hora introducida no es correcta.");
        }
    
    // Cerrar el scanner
    scanner.close();
}
}