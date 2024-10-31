package tema1;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("\033[1m" + "      Horario Semanal" + "\033[0m");  // Título en negrita
        System.out.println("--------------------------------------------------------");
        System.out.println("Hora      Lunes    Martes    Miércoles   Jueves     Viernes");
        System.out.println("--------------------------------------------------------");
        
        System.out.println("08:00 \t\033[33mED     \t\033[34mPROG   \t\033[32mBBDD   \t\033[35mSINF   \t\033[33mED");
        System.out.println("09:00 \t\033[33mED     \t\033[34mPROG   \t\033[32mBBDD   \t\033[35mSINF   \t\033[33mED");
        System.out.println("10:00 \t\033[36mLM     \t\033[32mBBDD   \t\033[36mLM     \t\033[34mPROG   \t\033[36mLM");
        System.out.println("--------------------------------------------------------");
        System.out.println("10:50 \t\033[1mR E C R E O\033[0m");
        System.out.println("--------------------------------------------------------");
        
        System.out.println("11:20 \t\033[34mPROG   \t\033[36mLM     \t\033[35mSINF   \t\033[36mLM     \t\033[34mPROG");
        System.out.println("12:20 \t\033[34mPROG   \t\033[36mLM     \t\033[35mSINF   \t\033[32mBBDD   \t\033[34mPROG");
        System.out.println("13:20 \t\033[35mSINF   \t\033[33mED     \t\033[34mPROG   \t\033[32mBBDD   \t\033[35mSINF");
        System.out.println("--------------------------------------------------------");
    }
}
