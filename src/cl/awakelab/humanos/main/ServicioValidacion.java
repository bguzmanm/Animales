package cl.awakelab.humanos.main;

import cl.awakelab.humanos.modelo.IMetodos;

import java.util.ArrayList;
import java.util.List;

/**
 * Animales
 * cl.awakelab.humanos.main
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
public class ServicioValidacion {

    private List<IMetodos> lista = new ArrayList<IMetodos>();

    public void add(IMetodos m){
        lista.add(m);
    }

    public List<IMetodos> getLista(){
        return lista;
    }
    public void desplegar(){
        for (IMetodos m: lista) {
            m.mostrar();
        }
    }

}
