package tema7;

public class ejercicio23 {
    public static void main(String[] args) {
        // Definir un array de 3 filas por 6 columnas
        int[][] num = new int[3][6];

        // Asignar los valores al array según la tabla proporcionada
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][3] = 0;
        num[0][4] = 0;
        num[0][5] = 7;
        
        num[1][0] = 75;
        num[1][1] = 0;
        num[1][2] = 0;
        num[1][3] = 0;
        num[1][4] = 0;
        num[1][5] = 0;
        
        num[2][0] = 0;
        num[2][1] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][4] = 0;
        num[2][5] = 11;

        // Mostrar el contenido del array en forma de tabla
        System.out.println("        Columna 0 Columna 1 Columna 2 Columna 3 Columna 4 Columna 5");
        for (int i = 0; i < 3; i++) {
            System.out.print("Fila " + i + "     ");
            for (int j = 0; j < 6; j++) {
                System.out.print(String.format("%8d", num[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
