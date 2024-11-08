package Tema4;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el cargo del empleado
        System.out.print("Introduce el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto): ");
        int cargo = scanner.nextInt();

        // Determinar el salario base según el cargo
        double salarioBase;
        switch (cargo) {
            case 1:
                salarioBase = 950;
                break;
            case 2:
                salarioBase = 1200;
                break;
            case 3:
                salarioBase = 1600;
                break;
            default:
                System.out.println("Cargo no válido.");
                return;
        }

        // Solicitar los días de viaje
        System.out.print("Introduce los días de viaje visitando clientes: ");
        int diasViaje = scanner.nextInt();

        // Calcular el sueldo por días de viaje
        double sueldoViaje = diasViaje * 30;

        // Solicitar el estado civil
        System.out.print("Introduce el estado civil (1 - Soltero, 2 - Casado): ");
        int estadoCivil = scanner.nextInt();

        // Calcular la retención según el estado civil
        double porcentajeRetencion = (estadoCivil == 1) ? 25 : 20;

        // Calcular el sueldo bruto
        double sueldoBruto = salarioBase + sueldoViaje;

        // Calcular la retención
        double retencion = sueldoBruto * porcentajeRetencion / 100;

        // Calcular el sueldo neto
        double sueldoNeto = sueldoBruto - retencion;

        // Mostrar el desglose de la nómina
        System.out.println("Sueldo base: " + salarioBase);
        System.out.println("Dietas (" + diasViaje + " viajes): " + sueldoViaje);
        System.out.println("Sueldo bruto: " + sueldoBruto);
        System.out.println("Retención (" + porcentajeRetencion + "%): -" + retencion);
        System.out.println("Sueldo neto: " + sueldoNeto);

        scanner.close();
    }
}
