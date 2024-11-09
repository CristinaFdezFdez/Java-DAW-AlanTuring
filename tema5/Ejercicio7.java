package tema5;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        
        int contador = 0;
        double suma = 0;
        
        try {
            while (true) {
                System.out.print("Introduzca un número: ");
                
                // Intentamos leer el número
                double numero = scanner.nextDouble();
                
                if (numero < 0) {
                    break;  // Salimos del bucle si el número es negativo
                }
                
                suma += numero;
                contador++;
            }
            
            if (contador > 0) {
                double media = suma / contador;
                System.out.println("La media de los números positivos introducidos es: " + media);
            } else {
                System.out.println("No se introdujeron números positivos.");
            }
            
        } catch (Exception e) {
            // Si el usuario introduce un valor no numérico, mostramos un mensaje de error
            System.out.println("Error: Entrada no válida. Por favor, introduzca solo números.");
            
        } finally {
            // Cerramos el Scanner en el bloque finally para asegurar que se liberen los recursos
            scanner.close();
        }
    }
}
