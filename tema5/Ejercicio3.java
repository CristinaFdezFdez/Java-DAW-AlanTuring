package tema5;

/* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do..while */
public class Ejercicio3 {
    public static void main(String[] args) {
        int i = 0; // Inicializamos la variable en 0

        do {
            System.out.println(i); // Imprimimos el valor actual de i
            i += 5; // Incrementamos i en 5
        } while (i <= 100); // La condición se evalúa al final
    }
}
