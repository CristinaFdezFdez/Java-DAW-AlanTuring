package libreria;

public class MatLib {

    /**
     * Suma dos números enteros.
     *
     * @param a 
     * @param b 
     * @return La suma de num1 y num2.
     */
    public static int suma(int a, int b) {
        return a + b;
    }

    /**
     * Incrementa un número entero en 1.
     *
     * @param num 
     * @return El número incrementado en 1.
     */
    public static int inc(int num) {
        return suma(num, 1);
    }

    /**
     * Resta dos números
     *
     * @param minuendo Número del cual se sustrae.
     * @param sustraendo Número a sustraer.
     * @return La resta
     */
    public static int resta(int minuendo, int sustraendo) {
        return suma(minuendo, -sustraendo);
    }

    /**
     * Decrementa un número entero en 1.
     *
     * @param num 
     * @return El número decrementado en 1.
     */
    public static int dec(int num) {
        return suma(num, -1);
    }

    /**
     * Verifica si el primer número es mayor que el segundo.
     *
     * @param num1 
     * @param num2 
     * @return true si num1 es mayor que num2, false en caso contrario.
     */
    public static boolean esMayor(int num1, int num2) {
        return resta(num1, num2) > 0;
    }

    /**
     * Verifica si el primer número es menor que el segundo.
     *
     * @param num1
     * @param num2 
     * @return true si num1 es menor que num2, false en caso contrario.
     */
    public static boolean esMenor(int num1, int num2) {
        return resta(num2, num1) > 0;
    }

    /**
     * Verifica si dos números son iguales.
     *
     * @param num1 
     * @param num2 
     * @return true si num1 es igual a num2, false en caso contrario.
     */
    public static boolean esIgual(int num1, int num2) {
        return !esMayor(num1, num2) && !esMenor(num1, num2);
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param multiplicando 
     * @param multiplicador 
     * @return El resultado
     */
    public static int multiplica(int multplicando, int multiplicador) {
        int resultado = 0;
        int absNum2 = multiplicador < 0 ? -multiplicador : multiplicador;

        for (int i = 0; i < absNum2; i = inc(i)) {
            resultado = suma(resultado, multplicando);
        }
        return multiplicador < 0 ? -resultado : resultado;
    }

    /**
     * Divide dos números enteros (división entera).
     *
     * @param dividendo
     * @param divisor
     * @return El cociente de la división entre num1 y num2.
     */
    public static int divide(int dividendo, int divisor) {
        
        int resultado = 0;
        int absNum1 = dividendo < 0 ? -dividendo : dividendo;
        int absNum2 = divisor < 0 ? -divisor : divisor;

        while (absNum1 >= absNum2) {
            absNum1 = resta(absNum1, absNum2);
            resultado = inc(resultado);
        }
        return (dividendo > 0 == divisor > 0) ? resultado : -resultado;
    }


    /**
     * Calcula el resto de la división entre dos números enteros.
     *
     * @param dividendo
     * @param divisor
     * @return El resto de la división entre dividendo y divisor
     */
    public static int resto(int dividendo, int divisor) {
        int absNum1 = dividendo < 0 ? -dividendo : dividendo;
        int absNum2 = divisor < 0 ? -divisor : divisor;

        while (absNum1 >= absNum2) {
            absNum1 = resta(absNum1, absNum2);
        }

        return dividendo < 0 ? -absNum1 : absNum1;
    }

    /**
     * Calcula la potencia de un número elevado a otro.
     *
     * @param base 
     * @param exponente 
     * @return El resultado de base elevado a exponente.
     */
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        int resultado = base;
        for (int i = 1; i < exponente; i = inc(i)) {
            resultado = multiplica(resultado, base);
        }
        return resultado;
    }

    /**
     * Calcula el cuadrado de un número.
     *
     * @param num Número a elevar al cuadrado.
     * @return El cuadrado de num.
     */
    public static int cuadrado(int num) {
        return multiplica(num, num);
    }

    /**
     * Calcula el cubo de un número.
     *
     * @param num 
     * @return El cubo de num.
     */
    public static int cubo(int num) {
        return multiplica(multiplica(num, num), num);
    }

    /**
     * Verifica si un número es múltiplo de otro.
     *
     * @param num1 
     * @param num2 
     * @return true si num1 es múltiplo de num2, false en caso contrario.
     */
    public static boolean esMultiplo(int num1, int num2) {
        return esIgual(resto(num1, num2), 0);// Si el resto es 0, significa que num1 es múltiplo de num2

    }

    /**
     * Verifica si un número es divisor de otro.
     *
     * @param num1 
     * @param num2 
     * @return true si num2 es divisor de num1, false en caso contrario.
     */
    public static boolean esDivisor(int num1, int num2) {
        boolean esDivisor = true;

        if (resto(num2, num1) > 0) {
            esDivisor = false;
        }

        return esDivisor;
    }

    /**
     * Verifica si un número es primo.
     *
     * @param num 
     * @return true si num es primo, false en caso contrario.
     */
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; multiplica(i, i) <= num; i = inc(i)) {
            if (esIgual(resto(num, i), 0)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica si un número es un cuadrado perfecto.
     *
     * @param num 
     * @return true si num es un cuadrado perfecto, false en caso contrario.
     */
    public static boolean esCuadradoPerfecto(int num) {
        for (int i = 0; multiplica(i, i) <= num; i = inc(i)) {
            // Verificamos si el cuadrado de i es igual a num
            if (esIgual(multiplica(i, i), num)) {
                return true; // Si encontramos un i tal que i*i = num, es un cuadrado perfecto
            }
        }
        return false;
    }

    /**
     * Imprime una pirámide con una altura dada.
     *
     * @param altura Altura de la pirámide.
     */
        public static void piramide(int altura) {
            // Iterar por cada nivel de la pirámide
            for (int i = 1; i <= altura; i = inc(i)) {
                // Espacios 
                for (int j = altura; j > i; j = dec(j)) {
                    System.out.print(" ");
                }
        
                //Números crecientes de la fila
                for (int j = 1; j <= i; j = inc(j)) {
                    System.out.print(j);
                }
        
                // Números decrecientes de la fila
                for (int j = i - 1; j >= 1; j = dec(j)) {
                    System.out.print(j);
                }
                
                // Nueva línea después de cada fila
                System.out.println();
            }
    }
}
