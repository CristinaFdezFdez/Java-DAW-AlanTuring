/**
 * Programación
 * curso 2024|25
 * Javier Caselli Fernández
 * 
 * Clase de prueba para la TAREA 1: 
 * Implementación de la clase Torneo
 */


import clases.Torneo;


public class PruebaTarea1 {

    public static void main(String[] args) {
        
        System.out.println("=== PRUEBAS TAREA 1 ===\n");
        boolean allTestsPassed = true;
        
        // PRUEBA 1: GETTERS #############################################################################
        System.out.println("PRUEBA 1: verificación de getters");
        boolean gettersOk = true;

        Torneo torneo1 = new Torneo("TOR2721", "Warcraft", "20250210", "20250223", 1500.0);
        gettersOk &= torneo1.getId().equals("TOR2721");
        gettersOk &= torneo1.getNombre().equals("Warcraft");
        gettersOk &= torneo1.getFechaIni().equals("20250210");
        gettersOk &= torneo1.getFechaFin().equals("20250223");
        gettersOk &= torneo1.getPremio() == 1500.0;

        System.out.println("✓ Getters implementados correctamente: " + (gettersOk ? "SÍ" : "NO"));
        allTestsPassed &= gettersOk;

        // PRUEBA 2: EQUALS Y HASHCODE ####################################################################
        System.out.println("\nPRUEBA 2: verificación de equals y hashCode");
        boolean equalsOk = true;

        Torneo torneo2 = new Torneo("TOR2721", "COD", "20250210", "20250223", 1500.0);
        Torneo torneo3 = new Torneo("TOR5953", "Counter Strike", "20250210", "20250223", 1500.0);

        equalsOk &= torneo1.equals(torneo2);  // Mismo código
        equalsOk &= !torneo1.equals(torneo3); // Distinto código
        equalsOk &= torneo1.hashCode() == torneo2.hashCode(); // Mismo hash para mismo código
        System.out.println("✓ equals() basado en código: " + (equalsOk ? "SÍ" : "NO"));
        allTestsPassed &= equalsOk;

        // Prueba 3: TOSTRING #############################################################################
        System.out.println("\nPRUEBA 3: verificación de toString");
        String str = torneo1.toString();
        boolean toStringOk = str.contains("TOR2721") &&
                           str.contains("Warcraft") &&
                           str.contains("20250210") &&
                           str.contains("20250223") &&
                           str.contains("1500.0");

        System.out.println("✓ toString incluye todos los campos: " + (toStringOk ? "SÍ" : "NO"));
        allTestsPassed &= toStringOk;

        // RESULTADO FINAL #############################################################################
        System.out.println("\n=== RESULTADO PRUEBA 1 ===");
        System.out.println(allTestsPassed ? 
                                    "✅ Todos los requisitos implementados correctamente" : 
                                    "❌ Hay requisitos no implementados correctamente");

        

    }

}


