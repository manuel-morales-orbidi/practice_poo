package practicas;

public class Temporales extends Persona {
    String cargo;
    String fecha_inicio;
    String fecha_fin;
    int sueldo;

    public Temporales(){

    }

    public Temporales (int id, String cedula, String nombre, String apellido, String direccion, String telefono, int sueldo, String cargo, String fecha_fin, String fecha_inicio) {
        super(id, cedula, nombre, apellido, direccion, telefono);
        this.fecha_fin = fecha_fin;
        this.fecha_inicio = fecha_inicio;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}

