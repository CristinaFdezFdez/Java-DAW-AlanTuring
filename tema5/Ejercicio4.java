package tema5;
import java.util.Scanner;

/* Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 * El programa nos pedirá la combinación para abrirla. Si acertamos, se nos dirá 
 * "La caja fuerte se ha abierto satisfactoriamente". Si no acertamos tras cuatro intentos, 
 * se nos indicará que no hemos logrado abrirla.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        final int INTENTOS = 4; // Número máximo de intentos
        int contador = 1;
        Scanner scanner = new Scanner(System.in);
        String combinacion = "0000"; // Combinación secreta de 4 cifras
        boolean acierto = false;


        while (!acierto && contador <= INTENTOS) {
            System.out.print("Introduce la combinación de la caja fuerte: ");
            String intento = scanner.nextLine();
            if (intento.equals(combinacion)) {
                acierto = true;
                System.out.println("\033[1mSe ha abierto la caja fuerte\033[0m");
            } else {
                System.out.println("Clave incorrecta");
            }
            //Incrementa el contador
            contador++;
        }

        if(!acierto){
            System.out.println("Se ha emitido un aviso a la policía");
        }

        scanner.close();
    }
}
