package tema5;

import java.util.Scanner;

/*Muestra la tabla de multiplicar de un número introducido por teclado */
public class Ejercicio5 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número que deseas multiplicar: ");
        num = scanner.nextInt();

        for (int i = 0; i <=10; i++) {
            System.out.println(num+" x "+i+" = "+(i*num));
        }

        scanner.close();
    }
}
