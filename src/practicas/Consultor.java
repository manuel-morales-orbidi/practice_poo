package practicas;

public class Consultor extends Persona {
    int numero_consultor;
    String contrato_consultor;

    public Consultor() {

    }

    public Consultor(int id, String cedula, String nombre, String apellido, String direccion, String telefono, int numero_consultor, String contrato_consultor) {
        super(id, cedula, nombre, apellido, direccion, telefono);
        this.numero_consultor = numero_consultor;
        this.contrato_consultor = contrato_consultor;
    }

    public int getNumero_consultor() {
        return numero_consultor;
    }

    public void setNumero_consultor(int numero_consultor) {
        this.numero_consultor = numero_consultor;
    }

    public String getContrato_consultor() {
        return contrato_consultor;
    }

    public void setContrato_consultor(String contrato_consultor) {
        this.contrato_consultor = contrato_consultor;
    }
}
