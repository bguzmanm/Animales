package cl.awakelab.humanos.main;

import cl.awakelab.humanos.modelo.Cliente;
import cl.awakelab.humanos.modelo.Directivo;
import cl.awakelab.humanos.modelo.Empleado;

/**
 * Animales
 * cl.awakelab.humanos.main
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
public class Main {
    public static void main(String[] args) {
        ServicioValidacion sv = new ServicioValidacion();
        sv.add(new Cliente("Francisco", 48, "Les Darkos", "4444"));
        sv.add(new Empleado("Erik", 47, 500000));
        sv.add(new Directivo("Pamela", 28, 6000000, "Tecnologías de la Información"));

        sv.desplegar();

        ((Empleado)sv.getLista().get(2)).calcular_salario_neto();
        ((Empleado)sv.getLista().get(1)).calcular_salario_neto();
        //((Empleado)sv.getLista().get(0)).calcular_salario_neto(); // <- error en el parseo.


    }
}
