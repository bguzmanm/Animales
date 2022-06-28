package cl.awakelab.humanos.modelo;

/**
 * Animales
 * cl.awakelab.humanos.modelo
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
public class Directivo extends Empleado {
    private String categoria;

    public Directivo(String nombre, int edad, int sueldo_bruto, String categoria) {
        super(nombre, edad, sueldo_bruto);
        this.categoria = categoria;
    }

    @Override
    public void mostrar() {
        super.mostrar();

        System.out.println("Además es un directivo y tiene la categoría " + this.categoria);
    }

}
