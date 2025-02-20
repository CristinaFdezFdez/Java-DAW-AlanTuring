/**
 * Programación
 * curso 2024|25
 * Antonio J.Sánchez Bujaldón
 */

package clases;
import excepciones.DuplicateTournamentException;
import java.io.IOException;
import java.util.ArrayList;

public interface TorneoInterface {

    /**
     * Añade un nuevo torneo a la colección. Si el torneo ya existe (el id
     * está asignado a otro torneo) se lanza una excepción.
     * @param torneo
     * @throws DuplicateTournamentException
     */
    public void nuevoTorneo(Torneo torneo) throws DuplicateTournamentException;

    /**
     * Elimina un torneo de la colección
     * @param torneo
     */
    public void eliminarTorneo(Torneo torneo) ;

    /**
     * Busca torneos con el nombre indicado sin tener en cuenta
     * mayúsculas y minúsculas. Si no se encuentra
     * ninguno, se devuelve un ArrayList vacío.
     * @param nombre
     * @return
     */
    public ArrayList<Torneo> buscarPorNombre(String nombre) ;

    /**
     * Devuelve un ArrayList con todos los torneos ordenados por fechaFin
     * y, en caso de igualdad, por fechaIni.
     * @return
     */
    public ArrayList<Torneo> listarOrdenadoPorFecha() ;

    /**
     * Devuelve un ArrayList con todos los torneos con premio económico.
     * Si no hay ninguno, se devuelve un ArrayList vacío.
     * @return
     */
    public ArrayList<Torneo> listarPremiados() ;

    /**
     * Vuelca todo el contenido de la colección en el archivo indicado.
     * @param nombreArchivo
     * @throws IOException
     */
    public void guardar(String nombreArchivo) throws IOException ;

}
