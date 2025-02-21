package practicas;

public class Herencia {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Consultor consultor = new Consultor();
        Persona persona = new Persona();

        empleado.getNumero_empleado();
        persona.getTelefono();
    }
}
