package cl.awakelab.modelo;

/**
 * Animales
 * cl.awakelab.modelo
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
public class Perro extends Animal {

    private String nombre;

    public Perro(String especie, String nombre) {
        super(especie);
        this.nombre = nombre;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Soy un perro de nombre "
                + this.nombre + " y me gusta ladrar... todo el día.... y toda la noche.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
