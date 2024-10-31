package tema2;

public class Ejercicio3 {
    public static void main(String[] args) {
        String nombre =  "Cristina";
        String direccion = "Calle Olmedo";
        int tfno = 778378373;
        float n1 = 27.45600f;

        System.out.println("Mi nombre es: "+ nombre+ " Mi dirección es: "+direccion+ " Mi teléfono es: "+ tfno);
        System.out.printf("Mi nombre es %s \n", nombre);
        System.out.printf("Mi tfno es %d \n",tfno);
        System.out.printf("Mi tfno es %.3f \n", n1);

        System.out.println("\033[31m" + "Este texto es rojo" + "\033[0m");
         // Combinando con printf
        System.out.printf("\033[33mMi nombre es\033[0m %s\n", nombre);  // En amarillo
    }
    
}
