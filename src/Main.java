import cl.awakelab.modelo.Animal;
import cl.awakelab.modelo.Gato;
import cl.awakelab.modelo.Perro;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * $PROJECT_NAME
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since $DATE
 */
public class Main {
    public static void main(String[] args) {
        Perro negra = new Perro("Canino", "Negra");
        Gato oregano = new Gato("Felino", "Oregano");

        List<Animal> zoo = new ArrayList<Animal>();

        zoo.add(negra);
        zoo.add(oregano);

        mostrar(zoo);

    }

    public static void mostrar(List<Animal> lista){
        for (Animal a: lista) {
            a.imprimir();
        }

    }

}