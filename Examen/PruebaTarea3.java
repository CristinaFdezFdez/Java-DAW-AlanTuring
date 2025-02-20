import clases.Torneo;
import clases.GestorTorneos;

/**
 * Programación
 * curso 2024|25
 * Javier Caselli Fernández
 * 
 * Clase de prueba para la TAREA 3:
 * Implementación del Catálogo genérico
 */

public class PruebaTarea3 {

    private static final String ARCHIVO_NUEVO = "prueba.csv";

    public static void main(String[] args) {
        
        System.out.println("=== PRUEBAS TAREA 3 ===\n");
        boolean allTestsPassed = true;

        try {
        
            GestorTorneos gestorTorneos = new GestorTorneos();

            // PRUEBA 1: AÑADIR PELÍCULAS ###################################################################
            System.out.println("\nPRUEBA 1: insertar 4 Torneos:");

            gestorTorneos.nuevoTorneo(new Torneo("TOR1000", "Warcraft", "20250210", "20250223", 1500.0));
            gestorTorneos.nuevoTorneo(new Torneo("TOR2000", "COD", "20250207", "20250223", 0.0));
            gestorTorneos.nuevoTorneo(new Torneo("TOR3000", "Counter Strike", "20250210", "20250225", 5000.0));
            gestorTorneos.nuevoTorneo(new Torneo("TOR4000", "WarCraft", "20250210", "20250227", 1700.0));
            allTestsPassed = gestorTorneos.listarOrdenadoPorFecha().size() == 4 ;

            System.out.println("✓ Se insertan películas: " + (allTestsPassed ? "SÍ" : "NO"));

            // PRUEBA 2: ELIMINAR TORNEO ###################################################################
            System.out.println("\nPRUEBA 2: eliminar torneos:");
            gestorTorneos.eliminarTorneo(new Torneo("TOR3000", "COD", "20250210", "20250225"));
            boolean removeTest = gestorTorneos.listarOrdenadoPorFecha().size() == 3 ;

            System.out.println("✓ Eliminar películas: " + (removeTest ? "SÍ" : "NO"));
            allTestsPassed &= removeTest ;

            // PRUEBA 3: BUSCAR POR NOMBRE ##################################################################
            System.out.println("\nPRUEBA 3: buscar por nombre \"Warcraft\" ignorando mayúsculas:");
            boolean nameTest = true ;

            for (Torneo p : gestorTorneos.buscarPorNombre("warcraft")) {
                nameTest &= p.getNombre().equalsIgnoreCase("warcraft");
                System.out.println(p);
            }

            System.out.println("✓ Búsqueda por nombre \"Warcraft\": " + (nameTest ? "SÍ" : "NO"));
            allTestsPassed &= nameTest;
            
            // PRUEBA 4: TORNEOS ORDENADOS POR FECHA ###################################################
            // Sólo podrá comprobar que funciona si las películas aparecen en orden alfabético:
            // Forrest Gump, Inception y Matrix
            System.out.println("\nPRUEBA 4: todos los torneos ordenados por fecha:");
            for (Torneo p : gestorTorneos.listarOrdenadoPorFecha()) {
                System.out.println(p);
            }

            // PRUEBA 5: Con premio #######################################################################
            System.out.println("\nPRUEBA 5: torneos con premios económicos");
            boolean prizeTest = gestorTorneos.listarPremiados().size() == 2 ;

            System.out.println("✓ Torneos premiados: " + (prizeTest ? "SÍ" : "NO"));
            allTestsPassed &= prizeTest ;

            // PRUEBA 6: GUARDAR ARCHIVO ##################################################################            
            System.out.println("\nPRUEBA 6: guardar archivo:");
            gestorTorneos.guardar(ARCHIVO_NUEVO);
            System.out.println("\nTorneos guardados en '" + ARCHIVO_NUEVO + "'.");


        } catch(Exception excepcion) {
            System.out.println(excepcion.getMessage()) ;
            allTestsPassed = false ;
        }

        // RESULTADO FINAL ##################################################################################
        System.out.println("\n=== RESULTADO TAREA 3 ===");
        System.out.println(allTestsPassed ? 
                                "✅ Todos los requisitos implementados correctamente" : 
                                "❌ Hay requisitos no implementados correctamente");


    }
    
}
