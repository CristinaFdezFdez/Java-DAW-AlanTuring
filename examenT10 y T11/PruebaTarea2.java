/**
 * Programación
 * curso 2024|25
 * Javier Caselli Fernández
 * 
 * Clase de prueba para la TAREA 2:
 * Implementación del Catálogo genérico
 */

import clases.Torneo;
import clases.Catalogo;



import java.util.ArrayList;

public class PruebaTarea2 {
    
    public static void main(String[] args) {
     
        System.out.println("=== PRUEBAS TAREA 2 ===\n");
        boolean allTestsPassed = true;
        
        // PRUEBA 1: CATÁLOGO DE STRINGS #####################################################################
        System.out.println("PRUEBA 1: catálogo de Strings");
        boolean stringTest = true;

        Catalogo<String> stringCatalog = new Catalogo<String>() ;
        stringCatalog.aniadir("Uno") ;
        stringCatalog.aniadir("Dos") ;
        stringCatalog.aniadir("Uno") ; // Duplicado
        
        ArrayList<String> stringItems = stringCatalog.recuperarElementos();
        stringTest &= stringItems.size() == 2;
        stringTest &= stringItems.contains("Uno") ;
        stringTest &= stringItems.contains("Dos") ;

        System.out.println("✓ Manejo básico de elementos: " + (stringTest ? "SÍ" : "NO"));
        allTestsPassed &= stringTest;

        // PRUEBA 2: ELIMINACIÓN DE ELEMENTOS #################################################################
        System.out.println("\nPRUEBA 2: eliminación de elementos");

        stringCatalog.eliminar("Uno");
        ArrayList<String> afterRemoval = stringCatalog.recuperarElementos();

        boolean removeTest = afterRemoval.size() == 1 && 
                            !afterRemoval.contains("Uno");

        System.out.println("✓ Eliminación correcta: " + (removeTest ? "SÍ" : "NO"));
        allTestsPassed &= removeTest;

        // PRUEBA 3: CATÁLOGO DE PELÍCULAS #####################################################################
        System.out.println("\nPRUEBA 3: catálogo de torneos");
        boolean filmTest = true;

        Catalogo<Torneo> filmCatalog = new Catalogo<Torneo>();

        Torneo torneo1 = new Torneo("TOR2721", "Warcraft", "20250210", "20250223", 1500.0);
        Torneo torneo2 = new Torneo("TOR9811", "COD", "20250210", "20250223", 1500.0);
        Torneo torneo3 = new Torneo("TOR5953", "Counter Strike", "20250210", "20250223", 1500.0);

        filmCatalog.aniadir(torneo1);
        filmCatalog.aniadir(torneo2);
        filmCatalog.aniadir(torneo3);
        
        ArrayList<Torneo> filmItems = filmCatalog.recuperarElementos();
        filmTest &= filmItems.size() == 3;
        filmTest &= filmItems.contains(torneo1);
        filmTest &= filmItems.contains(torneo2);
        filmTest &= filmItems.contains(torneo3);

        System.out.println("✓ Manejo de películas: " + (filmTest ? "SÍ" : "NO"));
        allTestsPassed &= filmTest;

        // RESULTADO FINAL ##################################################################################
        System.out.println("\n=== RESULTADO TAREA 2 ===");
        System.out.println(allTestsPassed ? 
                                "✅ Todos los requisitos implementados correctamente" : 
                                "❌ Hay requisitos no implementados correctamente");

    }

}
