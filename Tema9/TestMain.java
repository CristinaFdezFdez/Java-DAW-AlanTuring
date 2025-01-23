package Tema9;

public class TestMain {
    public static void main(String[] args) {
        Gato duquesa = new Gato("Blanco", "Persa", "hembra", 3, 4);

        Gato silvestre = new Gato("negro y blanco", "mestizo", "macho", 4, 5);

        System.out.println("Tenemos dos gatos, Silvestre que es " + silvestre.sexo + " y tiene " +
        silvestre.edad + " años. Y Duquesa, que es " + duquesa.sexo + " de " + 
        duquesa.edad + " años");
    }
}
