package Tema4;
import java.util.Scanner;

public class SenteciaSwitch {

    public static void main(String[] args) {
        // Lee de teclado el dia de la semana
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un dia:");
        String dia = scanner.nextLine();
        switch (dia) {
            case "lunes":
                System.out.println("Entornos de desarrollo");
                break;
            case "martes", "jueves", "viernes":
                System.out.println("Programación");
                break;
            case "miercoles":
                System.out.println("Lenguaje de marcas");
                break;
            default:
                System.out.println("Dia de la semana incorrecto");
                break;
        }

        scanner.close();

    }
}
