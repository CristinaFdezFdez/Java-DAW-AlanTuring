package Tema4;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo (hasta 5 cifras): ");
        int numero = scanner.nextInt();
        
        // Validar que el número esté dentro del rango permitido
        if (numero < 0 || numero > 99999) {
            System.out.println("Error: El número debe ser positivo y de hasta 5 cifras.");
        } else {
            // Verificar si el número es capicúa
            boolean esCapicua = false;
            if (numero < 10) {
                esCapicua = true;  // Un solo dígito siempre es capicúa
            } else if (numero < 100) {
                esCapicua = (numero / 10 == numero % 10);  // Dos dígitos
            } else if (numero < 1000) {
                esCapicua = (numero / 100 == numero % 10);  // Tres dígitos
            } else if (numero < 10000) {
                esCapicua = (numero / 1000 == numero % 10) && ((numero / 10) % 10 == (numero % 100) / 10);  // Cuatro dígitos
            } else {
                esCapicua = (numero / 10000 == numero % 10) && ((numero / 1000) % 10 == (numero % 100) / 10);  // Cinco dígitos
            }
            
            // Mostrar resultado
            if (esCapicua) {
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número no es capicúa.");
            }
        }
        
        scanner.close();
    }
}
