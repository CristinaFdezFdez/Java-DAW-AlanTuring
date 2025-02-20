/** 
 * Programación
 * curso 2024|25
 * Antonio J.Sánchez Bujaldón
 */

package clases;
import java.util.ArrayList;

public interface CatalogoInterface<T> {

    public boolean aniadir(T item) ;
    public void eliminar(T item) ;
    public ArrayList<T> recuperarElementos() ;
    
}
