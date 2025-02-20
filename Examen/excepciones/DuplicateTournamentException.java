/** 
 * Programación
 * curso 2024|25
 * Antonio J.Sánchez Bujaldón
 */

package excepciones;
public class DuplicateTournamentException extends Exception {
    public DuplicateTournamentException(String codigo) {
        super("El torneo con código " + codigo + " ya existe en el catálogo.") ;
    }
    
}
