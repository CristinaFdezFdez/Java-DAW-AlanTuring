package clases;

public class Loro extends Mascota {

    // Atributo específico de Loro
    private String plumaje;
    public static int totalLoros = 0;

    // Constructores

    /**
     * @param chip
     */
    public Loro(String chip) {
        super(chip, chip, 0);
        totalLoros++;
        totalMascotas++;
    }

    /**
     * @param chip
     * @param nombre
     */
    public Loro(String chip, String nombre) {
        super(chip, nombre, 0);
        totalLoros++;
        totalMascotas++;
    }

    /**
     * Método para que el loro pueda garrar
     */
    public void garrar() {
        System.out.println("¡Craaaaaaa......!");
    }

    /**
     * Método para que el loro pueda hablar
     */
    public void hablar() {
        System.out.println("¡Hola, soy " + nombre + "! ¿cómo estás?");
    }

    // Método para pasear
    @Override
    public void pasear() {
        if (estado()) {
            garrar();
            jugar();
        } else {
            System.out.println(nombre + " no puede pasear hasta no ser vacunado/a.");
        }
    }

    // Método para vacunar teniendo en cuenta si ha sido vacunado
    @Override
    public void vacunar() {
        if (estado()) {
            System.out.println(nombre + " ya ha sido vacunado/a.");
        } else {
            this.vacunada = true;
            System.out.println(nombre + " ha sido vacunado/a.");
            garrar();
        }
    }

    // Método para jugar con comportamientos aleatorios
    @Override
    public void jugar() {
        System.out.println(nombre + " resuelve un puzzle para loros, pero no mide su fuerza y lo rompe con el pico.");
        int accion = (int) (Math.random() * 2); // Genera un número entre 0 y 1
        switch (accion) {
            case 0 -> hablar();
            case 1 -> garrar();
        }
    }

    // Getters y Setters
    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    public static int getTotalLoros() {
        return totalLoros;
    }

    // Método toString
    @Override
    public String toString() {
        return "[" + chip + "]: " + nombre + ", " + edad + " años";
    }
}
