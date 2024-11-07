package Tema4;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo (hasta 5 cifras): ");
        int numero = scanner.nextInt();
        
        // Validación para asegurarse de que el número tiene hasta 5 cifras y es positivo
        if (numero < 0 || numero > 99999) {
            System.out.println("Error: El número debe ser positivo y de hasta 5 cifras.");
        } else {
            // Obtener la primera cifra
            int primeraCifra = numero;
            
            // Reducir el número hasta que quede solo la primera cifra
            while (primeraCifra >= 10) {
                primeraCifra /= 10;
            }
            
            System.out.println("La primera cifra del número es: " + primeraCifra);
        }
        
        scanner.close();
    }
}
