package clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase que implementa un catálogo genérico para almacenar objetos de cualquier tipo.
 * Utiliza un Set (HashSet) para garantizar que no haya duplicados.
 */
public class Catalogo<T> implements CatalogoInterface<T> {
    private final Set<T> coleccion;  // Colección de objetos

    /**
     * Constructor que inicializa la colección como un HashSet vacío.
     * Utiliza HashSet para evitar almacenar elementos duplicados.
     */
    public Catalogo() {
        this.coleccion = new HashSet<>(); 
    }

    /**
     * Método para añadir un nuevo elemento al catálogo.
     * 
     * @param item 
     * @return true si el elemento se añade correctamente, 
     *         false si el elemento ya existe (ya que HashSet no permite duplicados).
     */
    @Override
    public boolean aniadir(T item) {
        return coleccion.add(item); // Intentamos añadir el elemento y comprobamos si se añade
    }

    /**
     * Método para eliminar un elemento del catálogo.
     * 
     * @param item
     */
    @Override
    public void eliminar(T item) {
        coleccion.remove(item); // Elimina el elemento de la colección, si existe
    }

    /**
     * Método para recuperar todos los elementos de la colección (ArrayList).
     * 
     * @return Una lista con todos los elementos.
     */
    @Override
    public ArrayList<T> recuperarElementos() {
        return new ArrayList<>(coleccion); // Convierte el Set en una lista para poder manipularla con facilidad
    }
}
