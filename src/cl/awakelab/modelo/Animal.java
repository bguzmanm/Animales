package cl.awakelab.modelo;

/**
 * Animales
 * cl.awakelab.modelo
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
public class Animal {

    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void imprimir(){
        System.out.println("Soy un animalito de la especie " + this.especie);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
