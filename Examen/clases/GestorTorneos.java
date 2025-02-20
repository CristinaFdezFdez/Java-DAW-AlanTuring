package clases;

import excepciones.DuplicateTournamentException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Clase que gestiona un catálogo de torneos,
 * permitiendo agregar, eliminar, buscar y listar torneos.
 */
public class GestorTorneos implements TorneoInterface {
    private final Catalogo<Torneo> catalogo; // Catálogo genérico que almacena los torneos

    /**
     * Constructor que inicializa el catálogo.
     */
    public GestorTorneos() {
        this.catalogo = new Catalogo<>();
    }

    /**
     * Agrega un nuevo torneo al catálogo.
     * 
     * @param torneo Torneo a añadir
     * @throws DuplicateTournamentException Si el torneo ya existe en el catálogo
     */
    @Override
    public void nuevoTorneo(Torneo torneo) throws DuplicateTournamentException {
        if (!catalogo.aniadir(torneo)) {
            throw new DuplicateTournamentException("El torneo con ID " + torneo.getId() + " ya existe.");
        }
    }

    /**
     * Elimina un torneo del catálogo.
     * 
     * @param torneo Torneo a eliminar
     */
    @Override
    public void eliminarTorneo(Torneo torneo) {
        catalogo.eliminar(torneo);
    }

    /**
     * Busca torneos por nombre, ignorando mayúsculas/minúsculas.
     * 
     * @param nombre Nombre del torneo a buscar
     * @return Lista de torneos que coinciden con el nombre
     */
    @Override
    public ArrayList<Torneo> buscarPorNombre(String nombre) {
        ArrayList<Torneo> resultados = new ArrayList<>();
        for (Torneo t : catalogo.recuperarElementos()) {
            if (t.getNombre().equalsIgnoreCase(nombre)) {
                resultados.add(t);
            }
        }
        return resultados;
    }

    /**
     * Lista los torneos ordenados por fecha de inicio y, en caso de empate,
     * por fecha de finalización.
     * 
     * @return Lista de torneos ordenados por fecha
     */
    @Override
    public ArrayList<Torneo> listarOrdenadoPorFecha() {
        ArrayList<Torneo> lista = catalogo.recuperarElementos();
        lista.sort(Comparator.comparing(Torneo::getFechaIni).thenComparing(Torneo::getFechaFin));
        return lista;
    }

    /**
     * Lista los torneos que tienen premios económicos.
     * 
     * @return Lista de torneos con premio mayor a 0
     */
    @Override
    public ArrayList<Torneo> listarPremiados() {
        ArrayList<Torneo> premiados = new ArrayList<>();
        for (Torneo t : catalogo.recuperarElementos()) {
            if (t.getPremio() > 0) {
                premiados.add(t);
            }
        }
        return premiados;
    }

    /**
     * Guarda la información de los torneos en un archivo CSV.
     * 
     * @param nombreArchivo Nombre del archivo donde se guardarán los torneos
     * @throws IOException Si ocurre un error al escribir el archivo
     */
    @Override
    public void guardar(String nombreArchivo) throws IOException {
        final String SEPARATOR = ";";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("prueba.csv"))) {
            for (Torneo t : catalogo.recuperarElementos()) {
                bw.write(t.getId() + SEPARATOR +
                        t.getNombre() + SEPARATOR +
                        t.getFechaIni() + SEPARATOR +
                        t.getFechaFin() + SEPARATOR +
                        t.getPremio() + "\n");
                        
            }
        }

    }

    /**
     * Devuelve el catálogo de torneos.
     * 
     * @return Catálogo de torneos
     */
    public Catalogo<Torneo> getCatalogo() {
        return catalogo;
    }
    
}
