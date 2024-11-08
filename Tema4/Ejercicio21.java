package Tema4;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la base imponible
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = scanner.nextDouble();

        // Solicitar el tipo de IVA
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = scanner.next().trim().toLowerCase();

        // Determinar el porcentaje de IVA según el tipo
        double porcentajeIVA;
        switch (tipoIVA) {
            case "general":
                porcentajeIVA = 21;
                break;
            case "reducido":
                porcentajeIVA = 10;
                break;
            case "superreducido":
                porcentajeIVA = 4;
                break;
            default:
                System.out.println("Tipo de IVA no válido.");
                return;
        }

        // Calcular el IVA y el precio con IVA
        double iva = baseImponible * porcentajeIVA / 100;
        double precioConIVA = baseImponible + iva;

        // Solicitar el código promocional
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = scanner.next().trim().toLowerCase();

        // Aplicar descuento según el código promocional
        double descuento = 0;
        switch (codigoPromocional) {
            case "nopro":
                descuento = 0;
                break;
            case "mitad":
                descuento = precioConIVA / 2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = precioConIVA * 0.05;
                break;
            default:
                System.out.println("Código promocional no válido.");
                return;
        }

        // Calcular el precio final
        double precioFinal = precioConIVA - descuento;

        // Mostrar el desglose de precios
        System.out.println("Base imponible: " + baseImponible);
        System.out.println("IVA (" + porcentajeIVA + "%): " + iva);
        System.out.println("Precio con IVA: " + precioConIVA);
        System.out.println("Cod. promo (" + codigoPromocional + "): -" + descuento);
        System.out.println("TOTAL: " + precioFinal);

        scanner.close();
    }
}


