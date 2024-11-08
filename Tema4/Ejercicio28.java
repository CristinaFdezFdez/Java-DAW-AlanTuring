package Tema4;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Solicitar nombre del artículo
            System.out.print("Introduzca nombre del artículo: ");
            String nombreArticulo = scanner.nextLine();
            
            // Solicitar precio del artículo
            System.out.print("Introduzca el precio del artículo: ");
            double precioBase = Double.parseDouble(scanner.nextLine());
            
            // Solicitar cantidad de unidades
            System.out.print("Introduzca el número de unidades vendidas: ");
            int unidades = Integer.parseInt(scanner.nextLine());
            
            // Preguntar si se aplica descuento de IVA por fiesta
            System.out.print("¿Aplicamos descuento en IVA por fiesta? (s/n): ");
            String aplicamosFiesta = scanner.nextLine().trim().toLowerCase();
            
            // Calcular descuento basado en las unidades
            double descuento = 0.0;
            if (unidades >= 1 && unidades <= 3) {
                descuento = 0.05;  // 5% de descuento
            } else if (unidades >= 4 && unidades <= 10) {
                descuento = 0.10;  // 10% de descuento
            } else if (unidades > 10) {
                descuento = 0.15;  // 15% de descuento
            }
            
            // Calcular el precio con descuento por unidad
            double precioConDescuento = precioBase - (precioBase * descuento);
            
            // Calcular el total sin IVA
            double totalSinIVA = precioConDescuento * unidades;
            
            // Determinar el IVA a aplicar
            double iva = 0.21;  // IVA por defecto (21%)
            if (aplicamosFiesta.equals("s")) {
                iva = 0.16;  // IVA especial para fiestas (16%)
            }
            
            // Calcular el IVA y el total final
            double totalIVA = totalSinIVA * iva;
            double totalConIVA = totalSinIVA + totalIVA;
            
            // Mostrar la información
            System.out.printf("\nDetalles de la compra:\n");
            System.out.printf("Artículo: %s\n", nombreArticulo);
            System.out.printf("Precio base: %.2f €\n", precioBase);
            System.out.printf("Unidades vendidas: %d\n", unidades);
            System.out.printf("Descuento aplicado: %.2f %%\n", descuento * 100);
            System.out.printf("Total sin IVA: %.2f €\n", totalSinIVA);
            System.out.printf("IVA aplicado: %.2f %%\n", iva * 100);
            System.out.printf("Total con IVA: %.2f €\n", totalConIVA);
            
        } catch (Exception e) {
            System.out.println("Error: Ocurrió un problema con la entrada de datos.");
        } finally {
            scanner.close();
        }
    }
}

