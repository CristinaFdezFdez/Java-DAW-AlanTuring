package Tema4;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero (positivo o negativo): ");
        int numero = scanner.nextInt();
        
        // Convertimos el número a positivo usando Math.abs para contar los dígitos correctamente
        numero = Math.abs(numero);
        
        // Contador de dígitos
        int contadorDigitos = (numero == 0) ? 1 : 0;
        
        // Bucle para contar los dígitos
        while (numero > 0) {
            numero /= 10;
            contadorDigitos++;
        }
        
        System.out.println("El número tiene " + contadorDigitos + " dígitos.");
        
        scanner.close();
    }
}
