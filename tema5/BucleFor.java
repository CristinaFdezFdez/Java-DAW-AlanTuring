package tema5;
import java.util.Scanner;
public class BucleFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        
        
        //Pinta los cumpleaños
        for(int cumples = 1;cumples <= edad; cumples++){
            System.out.println(cumples);
        }
        scanner.close();

    }
}
