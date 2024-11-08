package tema5;

/* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while */
public class Ejercicio2 {
    public static void main(String[] args) {
        int i = 0; // Inicializamos la variable en 0

        while (i <= 100) { // Mientras i sea menor o igual a 100
            System.out.println(i); // Imprimimos el valor actual de i
            i += 5; // Incrementamos i en 5
        }
    }
}
