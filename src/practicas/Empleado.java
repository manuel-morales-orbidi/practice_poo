package practicas;

public class Empleado extends Persona {
    int numero_empleado;
    String contrato;
    String cargo;

    public Empleado() {

    }

    public Empleado(int id, String cedula, String nombre, String apellido, String direccion, String telefono, int numero_empleado, String contrato, String cargo) {
        super(id, cedula, nombre, apellido, direccion, telefono);
        this.numero_empleado = numero_empleado;
        this.contrato = contrato;
        this.cargo = cargo;
    }

    public int getNumero_empleado() {
        return numero_empleado;
    }

    public void setNumero_empleado(int numero_empleado) {
        this.numero_empleado = numero_empleado;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
