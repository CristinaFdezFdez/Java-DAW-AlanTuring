package Tema4;
import java.util.Scanner;
/*Salario semanal de un trabajador teniendo en cuenta que las horas ordinarias se pagan a 12 y las extra a 16 */
public class Ejercicio3 {
    public static void main(String[] args) {
    final int HORAS_LABORABLES = 40;
    final float PRECIO_HORA = 12f;
    final float PRECIO_EXTRA = 16f;

    Scanner scanner = new Scanner(System.in);
    int horasTrabajadas, horasExtras;
    float salario;
    //Introducir el total de la factura
    System.out.println("Introduce la cantidad de horas trabajadas");
    horasTrabajadas= scanner.nextInt();
    //Condicionales para comprobar el número de horas trabajadas 
    if (horasTrabajadas <= HORAS_LABORABLES) {
        // Si trabaja 40 horas o menos
        salario = horasTrabajadas * PRECIO_HORA;
    } else {
        // Si trabaja más de 40 horas
        horasExtras = horasTrabajadas - HORAS_LABORABLES;
        salario = (HORAS_LABORABLES * PRECIO_HORA) + (horasExtras * PRECIO_EXTRA); // 40 horas a 12€ + extras a 16€
    }
    // Mostrar el salario
    System.out.println("El salario es: " + salario + " €");
    scanner.close();
    }
        
}
