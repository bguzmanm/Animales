package cl.awakelab.humanos.modelo;

/**
 * Animales
 * cl.awakelab.humanos.modelo
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
public class Persona implements IMetodos {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void mostrar() {
        System.out.println("La persona se llama "
                + this.nombre + " y tiene " + this.edad + " años de edad");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
