package Tema4;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes de precios
        final double PRECIO_MANZANA = 18.0;
        final double PRECIO_FRESA = 16.0;
        final double PRECIO_CHOCOLATE_NEGRO = 14.0;
        final double PRECIO_CHOCOLATE_BLANCO = 15.0;
        final double PRECIO_NATA = 2.5;
        final double PRECIO_NOMBRE = 2.75;

        try {
            double precioTarta = 0.0;
            String saborTarta = "";
            String descripcionExtras = "";

            // Solicitar sabor de la tarta
            System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
            String sabor = scanner.nextLine().trim().toLowerCase();

            // Calcular precio base según sabor
            if (sabor.equals("manzana")) {
                precioTarta = PRECIO_MANZANA;
                saborTarta = "Tarta de manzana";
            } else if (sabor.equals("fresa")) {
                precioTarta = PRECIO_FRESA;
                saborTarta = "Tarta de fresa";
            } else if (sabor.equals("chocolate")) {
                // Solicitar tipo de chocolate si el sabor es chocolate
                System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
                String tipoChocolate = scanner.nextLine().trim().toLowerCase();

                if (tipoChocolate.equals("negro")) {
                    precioTarta = PRECIO_CHOCOLATE_NEGRO;
                    saborTarta = "Tarta de chocolate negro";
                } else if (tipoChocolate.equals("blanco")) {
                    precioTarta = PRECIO_CHOCOLATE_BLANCO;
                    saborTarta = "Tarta de chocolate blanco";
                } else {
                    System.out.println("Error: Tipo de chocolate no válido.");
                    return;
                }
            } else {
                System.out.println("Error: Sabor de tarta no válido.");
                return;
            }

            // Preguntar si quiere nata
            System.out.print("¿Quiere nata? (si o no): ");
            String nata = scanner.nextLine().trim().toLowerCase();

            if (nata.equals("si")) {
                precioTarta += PRECIO_NATA;
                descripcionExtras += "\nCon nata: " + PRECIO_NATA + " €";
            } else if (!nata.equals("no")) {
                System.out.println("Error: Respuesta para la nata no válida (debe ser 'si' o 'no').");
                return;
            }

            // Preguntar si quiere nombre personalizado
            System.out.print("¿Quiere ponerle un nombre? (si o no): ");
            String nombre = scanner.nextLine().trim().toLowerCase();

            if (nombre.equals("si")) {
                precioTarta += PRECIO_NOMBRE;
                descripcionExtras += "\nCon nombre: " + PRECIO_NOMBRE + " €";
            } else if (!nombre.equals("no")) {
                System.out.println("Error: Respuesta para el nombre no válida (debe ser 'si' o 'no').");
                return;
            }

            // Mostrar el desglose del precio final
            System.out.println("\nPresupuesto de su compra:");
            System.out.printf("%s: %.2f €%s%n", saborTarta, (precioTarta - (descripcionExtras.contains("Con nata") ? PRECIO_NATA : 0) - (descripcionExtras.contains("Con nombre") ? PRECIO_NOMBRE : 0)), descripcionExtras);
            System.out.printf("Total: %.2f €%n", precioTarta);

        } catch (Exception e) {
            System.out.println("Error: Entrada no válida. Asegúrese de ingresar los datos correctamente.");
        } finally {
            scanner.close();
        }
    }
}
