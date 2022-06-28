package cl.awakelab.modelo;

/**
 * Animales
 * cl.awakelab.modelo
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
public class Gato extends Animal {

    private String nombre;

    public Gato(String especie, String nombre) {
        super(especie);
        this.nombre = nombre;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Soy un gato llamado " + this.nombre + " y me gusta decir miau");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

