package clases;

public class Perro extends Mascota {
    
    // Atributos propios de perro
    private String raza;
    public static int totalPerros = 0;

    //Implementa dos constructores 

    /**
     * @param chip
     */
    public Perro(String chip) {
        super(chip, chip, 0);
        totalPerros++;
        totalMascotas++;
    }

    /**
     * @param chip
     * @param nombre
     */
    public Perro(String chip, String nombre) {
        super(chip, nombre, 0);
        totalPerros++;
        totalMascotas++;
    }

    /**
     * Método para que el perro ladre
     */
    public void ladrar() {
        System.out.println("¡Guau! ¡Guau!");
    }


    /**
     * Método para que el perro gruña
     */
    public void grunir() {
        System.out.println("Grrrrrr......");
    }

    // Método para pasear 
    @Override
    public void pasear() {
        if (estado()) {
            ladrar();
            jugar();
        } else {
            System.out.println(nombre + " no puede pasear hasta no ser vacunado/a.");
        }
    }

    // Método para vacunar
    @Override
    public void vacunar() {
        if (estado()) {
            System.out.println(nombre + " ya ha sido vacunado/a.");
        } else {
            this.vacunada = true;
            grunir();
        }
    }

    // Método para jugar con diferentes opciones
    @Override
    public void jugar() {
        //Array de juegos
        String[] juegos = {
            "corre tras la pelota y la trae de vuelta",
            "juega con su mordedor",
            "muerde un juguete de goma y lo sacude con fuerza",
            "escarba en la tierra buscando algo interesante",
            "encuentra un palo y lo mastica felizmente",
            "salta sobre el sofá y espera que le lancen su juguete favorito",
            "juega con otros perros en el parque y mueve la cola emocionado",
            "rueda por el suelo pidiendo más juego"
        };
        //Genero número aleatorio para elegir juego al azar
        int numAleatorio = (int) (Math.random() * juegos.length);
        System.out.println(nombre + " " + juegos[numAleatorio]);
    }

    // Getters y Setters
    public static int getTotalPerros() {
        return totalPerros;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Método toString
    @Override
    public String toString() {
        return "[" + chip + "]: " + nombre + ", " + edad + " años";
    }
}
