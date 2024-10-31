package Tema4;

import java.util.Scanner;

public class SentenciasIf {
    public static void main(String[] args) {
        // Lee de teclado el dia de la semana
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un dia:");
        String dia =scanner.nextLine();
        if( dia.equals("lunes")){
            System.out.println("Entornos de desarrollo");
        }else if (dia.equals("martes")){
            System.out.println("Programación");
        } 
        else if (dia.equals("miercoles")){
            System.out.println("Lenguaje de marcas");
        } 
        else if (dia.equals("jueves")){
            System.out.println("Programación");
        }
        else if (dia.equals("viernes")){
            System.out.println("Programación");
        } 
        else{
            System.out.println("Error");
        }

        scanner.close();
    }
}
