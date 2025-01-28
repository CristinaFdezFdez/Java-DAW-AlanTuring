package vehiculos;

public class Bicicleta extends Vehiculo {

    public void hacerCaballito() {
        System.out.println("Estoy haciendo el caballito");
    }

    public void getKilometrosRecorridos() {
        System.out.println("La bicicleta lleva recorridos " + kilometrosRecorridos);
    }
}