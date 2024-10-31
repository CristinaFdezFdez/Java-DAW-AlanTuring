package tema2;

public class BanderaAndalucia {
        public static void main(String[] args) {
            // Secuencias ANSI para colores
            String verde = "\033[32m";  // Color verde
            String blanco = "\033[37m"; // Color blanco
            String reset = "\033[0m";   // Reset de color
    
            // Dibujo de las franjas
            System.out.printf("%s============================%s\n", verde, reset);   // Primera franja verde
            System.out.printf("%s============================%s\n", blanco, reset);  // Segunda franja blanca
            System.out.printf("%s============================%s\n", verde, reset);   // Tercera franja verde
            

        }
}
