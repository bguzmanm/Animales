package cl.awakelab.humanos.modelo;

/**
 * Animales
 * cl.awakelab.humanos.modelo
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
public class Cliente extends Persona {

    private String nombre_empresa;
    private String telefono_contacto;

    public Cliente(String nombre, int edad, String nombre_empresa, String telefono_contacto) {
        super(nombre, edad);
        this.nombre_empresa = nombre_empresa;
        this.telefono_contacto = telefono_contacto;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("El nombre de la E. Cliente es " + this.nombre_empresa
                + " y el telefono es " + this.telefono_contacto);
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(String telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }
}
