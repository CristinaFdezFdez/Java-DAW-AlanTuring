package tema5;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cantidadPositivos = 0;  // Contador de números positivos
        int sumaImpares = 0;        // Suma de los números impares
        int contadorImpares = 0;    // Contador de números impares
        int maxPar = Integer.MIN_VALUE;  // Variable para el máximo de los pares
        
        System.out.println("Por favor, vaya introduciendo números enteros.");
        System.out.println("Puede terminar mediante la introducción de un número negativo.");
        
        while (true) {
            try {
                // Solicitar un número
                int numero = scanner.nextInt();
                
                // Si el número es negativo, termina el ciclo
                if (numero < 0) {
                    break;
                }
                
                // Contabilizar los números positivos
                cantidadPositivos++;
                
                // Si el número es impar, se procesa para la media
                if (numero % 2 != 0) {
                    sumaImpares += numero;
                    contadorImpares++;
                }
                
                // Si el número es par, se procesa para el máximo
                if (numero % 2 == 0) {
                    if (numero > maxPar) {
                        maxPar = numero;
                    }
                }
            } catch (Exception e) {
                // Si ocurre cualquier error (por ejemplo, el usuario no ingresa un número válido)
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.next();  // Limpiar el buffer del scanner
            }
        }
        
        // Mostrar los resultados
        System.out.println("Ha introducido " + cantidadPositivos + " números positivos.");
        
        // Si se han introducido números impares, calcular y mostrar la media
        if (contadorImpares > 0) {
            double mediaImpares = (double) sumaImpares / contadorImpares;
            System.out.println("La media de los impares es " + mediaImpares);
        } else {
            System.out.println("No se introdujeron números impares.");
        }
        
        // Verificar si se ha encontrado algún número par
        if (maxPar != Integer.MIN_VALUE) {
            System.out.println("El máximo de los pares es " + maxPar);
        } else {
            System.out.println("No se introdujeron números pares.");
        }
        
        scanner.close();
    }
}


