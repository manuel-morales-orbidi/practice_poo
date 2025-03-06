package practicas;

public class Herencia {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Consultor consultor = new Consultor();
        Persona persona = new Persona();
        Proveedor proveedor = new Proveedor();
        Practicante practicante = new Practicante();

        empleado.getNumero_empleado();
        persona.getTelefono();
        proveedor.getIdentificador_Proveedor();
        proveedor.getNumero_Proveedor();
        proveedor.getTelefono_Proveedor();

    }
}
