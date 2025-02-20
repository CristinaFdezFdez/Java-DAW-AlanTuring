package clases;

public abstract class Mascota {

    // Atributos propios de mascota
    protected String chip;
    protected String nombre;
    protected int edad;
    protected boolean vacunada;
    public static int totalMascotas = 0;

    /**
     * @param chip
     * @param nombre
     * @param edad
     */
    public Mascota(String chip, String nombre, int edad) {
        this.chip = chip;
        this.nombre = nombre;
        this.edad = edad;
        this.vacunada = false;
    }

    // Definición métodos abstractos, ni reciben ni devuelven nada
    public abstract void pasear();
    public abstract void jugar();

    /**
     * Método para vacunar a la mascota
     */
    public void vacunar() {
        this.vacunada = true;
    }

    /**
     * @return
     * Método para comprobar si la mascota ha sido vacunada o no
     */
    public boolean estado() {
        return this.vacunada;
    }

    // Getters y Setters
    public String getChip() {
        return chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getTotalMascotas() {
        return totalMascotas;
    }

    // Método toString
    @Override
    public String toString() {
        return "[" + chip + "]: " + nombre + ", " + edad + " años";
    }
}
