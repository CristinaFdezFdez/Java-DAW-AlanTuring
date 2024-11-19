package tema5;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, vaya introduciendo números.");
        System.out.println("El programa termina cuando la suma sea mayor que 10000.");
        
        int sumaTotal = 0;
        int contador = 0;
        
        while (sumaTotal <= 10000) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            sumaTotal += numero;
            contador++;
        }
        
        double media = (double) sumaTotal / contador;
        
        System.out.println("Ha introducido un total de " + contador + " números.");
        System.out.println("La suma total es " + sumaTotal + ".");
        System.out.println("La media es " + media + ".");
        
        scanner.close();
    }
}
