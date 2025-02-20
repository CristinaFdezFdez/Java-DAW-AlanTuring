package clases;

import interfaces.ClinicaInterfaz;

public class Clinica implements ClinicaInterfaz {

    private final int MAXIMO = 100;
    private int total;
    private int ultimo;
    
    // Listado donde se irán almacenando todas las mascotas, tanto total perros como el total de loros
    private final Mascota[] listado;

    public Clinica() {
        this.total = 0;
        this.ultimo = 0;
        this.listado = new Mascota[MAXIMO];
    }

    // Método para verificar si el listado de mascotas está vacío
    @Override
    public boolean esVacia() {
        return this.total == 0;
    }

    // Método para comprobar si el listado está lleno
    @Override
    public boolean esLlena() {
        return this.ultimo == MAXIMO;
    }

    // Método que devuelve la cantidad de perros en la clínica
    @Override
    public int totalPerros() {
        return Perro.totalPerros;
    }

    // Método que devuelve la cantidad de loros en la clínica
    @Override
    public int totalLoros() {
        return Loro.totalLoros;
    }

    // Método que devuelve la cantidad total de mascotas en la clínica
    @Override
    public int totalMascotas() {
        return Mascota.totalMascotas;
    }

    // Método para agregar una nueva mascota a la clínica
    @Override
    public void agregar(Mascota mascota) {
        if (esLlena()) {
            System.out.println("No se pueden agregar más mascotas, la clínica está llena.");
            return;
        }
        
        listado[ultimo] = mascota;
        total++;
        ultimo++;
    }

    // Método que busca una mascota por su chip y la devuelve si la encuentra
    @Override
    public Mascota buscarChip(String chip) {
        for (int i = 0; i < ultimo; i++) {
            if (listado[i] != null && chip.equals(listado[i].getChip())) {
                return listado[i];
            }
        }
        return null; // Si no se encuentra la mascota
    }

    // Método para mostrar en forma de lista todas las mascotas de la clínica
    @Override
    public void listar() {
        for (int i = 0; i < ultimo; i++) {
            if (listado[i] != null) {
                System.out.println(listado[i]);
            }
        }
    }
}
