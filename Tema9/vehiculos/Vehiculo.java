package vehiculos;

public class Vehiculo {
    // Atributos de clase (estáticos)
    protected static int vehiculosCreados = 0;
    protected static int kilometrosTotales = 0;

    // Atributos de instancia
    public int kilometrosRecorridos;

    // Constructor
    public Vehiculo() {
        vehiculosCreados++;
    }

    public void andar(int kilometros) {
        kilometrosTotales += kilometros;
        kilometrosRecorridos += kilometros;
    }

    public void getKilometrosTotales() {
        System.out.println("Los vehículos llevan recorridos " + kilometrosTotales);
    }
}
