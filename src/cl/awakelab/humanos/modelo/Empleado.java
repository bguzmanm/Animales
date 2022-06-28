package cl.awakelab.humanos.modelo;

/**
 * Animales
 * cl.awakelab.humanos.modelo
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
public class Empleado extends Persona {

    private int sueldo_bruto;

    public Empleado(String nombre, int edad, int sueldo_bruto) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("El sueldo bruto del empleado es $" + this.sueldo_bruto);
    }

    public void calcular_salario_neto(){
        System.out.println("El salario neto de " + super.getNombre() + " es $" + (this.sueldo_bruto / 1.1));
    }

}
