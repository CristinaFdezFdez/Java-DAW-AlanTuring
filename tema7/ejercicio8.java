package tema7;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array con los nombres de los meses
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre"
        };
        
        // Array para almacenar las temperaturas medias de cada mes
        int[] temperaturas = new int[12];
        
        // Pedir las temperaturas de cada mes
        for (int i = 0; i < 12; i++) {
            System.out.print("Introduzca la temperatura media de " + meses[i] + ": ");
            temperaturas[i] = scanner.nextInt();
        }
        
        // Mostrar el diagrama de barras
        System.out.println("\nDiagrama de barras de las temperaturas medias:");
        
        for (int i = 0; i < 12; i++) {
            // Crear el diagrama de barras usando asteriscos
            System.out.printf("%10s │", meses[i]);  // Nombre del mes
            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("■");  // Cada asterisco representa una unidad de temperatura
            }
            System.out.printf(" %dºC\n", temperaturas[i]);  // Mostrar la temperatura
        }
        
        scanner.close();
    }
}
