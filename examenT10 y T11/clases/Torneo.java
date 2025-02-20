package clases;

import java.util.Objects;

/**
 * Clase que representa un torneo con sus atributos
 */
public class Torneo {

    // Atributos privados de la clase Torneo
    private String id;    
    private String nombre;     
    private String fechaIni;   
    private String fechaFin;   
    private double premio;     

    /**
     * Constructor sin premio (se inicializa a 0.0 por defecto).
     * 
     * @param id
     * @param nombre 
     * @param fechaIni 
     * @param fechaFin 
     * @throws IllegalArgumentException si algún valor es nulo
     */
    public Torneo(String id, String nombre, String fechaIni, String fechaFin) {
        if (id == null || nombre == null || fechaIni == null || fechaFin == null) {
            throw new IllegalArgumentException("Ninguno de los valores puede ser nulo");
        }
        this.premio = 0.0; // Inicialización del premio en caso de que no se proporcione
        this.id = id;
        this.nombre = nombre;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    /**
     * Constructor con todos los parámetros, incluido el premio.
     * 
     * @param id 
     * @param nombre 
     * @param fechaIni 
     * @param fechaFin 
     * @param premio 
     * @throws IllegalArgumentException si algún valor es nulo
     */
    public Torneo(String id, String nombre, String fechaIni, String fechaFin, double premio) {
        if (id == null || nombre == null || fechaIni == null || fechaFin == null) {
            throw new IllegalArgumentException("Ninguno de los valores puede ser nulo");
        }
        this.id = id;
        this.nombre = nombre;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.premio = premio;
    }

    // Métodos getter para acceder a los atributos de la clase

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public double getPremio() {
        return premio;
    }

    /**
     * Método equals para comparar torneos según su ID.
     * 
     * @param obj Objeto a comparar
     * @return true si los torneos tienen el mismo ID, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // Si es el mismo objeto en memoria es que son iguales
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) { // Si no es un objeto Torneo, no son iguales
            return false;
        }
        Torneo torneo = (Torneo) obj;
        return id.equals(torneo.id); // Comparación basada en el ID
    }

    /**
     * Método hashCode basado en el ID
     * 
     * @return Código hash del torneo ID
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Método toString para representar el torneo como una cadena de texto.
     * 
     * @return Representación en texto del torneo
     */
    @Override
    public String toString() {
        return "Torneo{"
                + "id='" + id + '\''
                + ", nombre='" + nombre + '\'' 
                + ", fechaIni=" + fechaIni 
                + ", fechaFin=" + fechaFin 
                + ", premio=" + premio 
                + '}';
    }
}
