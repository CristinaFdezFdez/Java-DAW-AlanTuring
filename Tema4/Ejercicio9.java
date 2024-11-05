package Tema4;

import java.util.Scanner;

/*Escribe un programa que nos diga el horóscopo a partir del día y mes de nacimiento */
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Inicializo las variables
        int mes, dia;
        String signo = "";
        //Mostramos mensaje y esperamos leer por teclado
        System.out.println("Por favor, Introduce un mes");
        mes = scanner.nextInt();
        System.out.println("Por favor, Introduce un dia");
        dia = scanner.nextInt();
        //Switch para hacer comprobación del dia y mes que nos indican
        switch (mes) {
            case 1:
                if (dia <= 20 && mes == 1) {
                    signo = "Capricornio";
                } else {
                    signo = "Acuario";
                }
                break;
            case 2:
                if (dia <= 18 && mes == 2) {
                    signo = "Acuario";
                } else {
                    signo = "Piscis";
                }
                break;
            case 3:
                if (dia <= 20 && mes == 3) {
                    signo = "Piscis";
                } else {
                    signo = "Aries";
                }
                break;
            case 4:
                if (dia <= 20 && mes == 4) {
                    signo = "Aries";
                } else {
                    signo = "Tauro";
                }
                break;
            case 5:
                if (dia <= 21 && mes == 5) {
                    signo = "Tauro";
                } else {
                    signo = "Géminis";
                }
                break;
            case 6:
                if (dia <= 21 && mes == 6) {
                    signo = "Géminis";
                } else {
                    signo = "Cáncer";
                }
                break;
            case 7:
                if (dia <= 22 && mes == 7) {
                    signo = "Cáncer";
                } else {
                    signo = "Leo";
                }
                break;
            case 8:
                if (dia <= 23 && mes == 8) {
                    signo = "Leo";
                } else {
                    signo = "Virgo";
                }
                break;
            case 9:
                if (dia <= 23 && mes == 9) {
                    signo = "Virgo";
                } else {
                    signo = "Libra";
                }
                break;
            case 10:
                if (dia <= 23 && mes == 10) {
                    signo = "Libra";
                } else {
                    signo = "Escorpio";
                }
                break;
            case 11:
                if (dia <= 22 && mes == 11) {
                    signo = "Escorpio";
                } else {
                    signo = "Sagitario";
                }
                break;
            case 12:
                if (dia <= 21 && mes == 12) {
                    signo = "Sagitario";
                } else {
                    signo = "Capricornio";
                }
                break;
            default:
                System.out.println("Error");
                break;
        };
        //Mostramos solución
        System.out.println("Tu signo es :" + signo);
        scanner.close();
    }

}
