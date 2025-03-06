package practicas;

public class Proveedor  extends Persona {

    int numero_Proveedor;
    int telefono_Proveedor;
    String direccion_Proveedor;
    String identificador_Proveedor;

    public Proveedor() {

    }

    public Proveedor(int id, String cedula, String nombre, String apellido, String direccion, String telefono, int numero_Proveedor, int telefono_Proveedor, String direccion_Proveedor, String identificador_Proveedor) {
        super(id, cedula, nombre, apellido, direccion, telefono);
        this.numero_Proveedor = numero_Proveedor;
        this.telefono_Proveedor = telefono_Proveedor;
        this.direccion_Proveedor = direccion_Proveedor;
        this.identificador_Proveedor = identificador_Proveedor;
    }

    public int getNumero_Proveedor() {
        return numero_Proveedor;
    }

    public int getTelefono_Proveedor() {
        return telefono_Proveedor;
    }

    public String getDireccion_Proveedor() {
        return direccion_Proveedor;
    }

    public String getIdentificador_Proveedor() {
        return identificador_Proveedor;
    }

    public void setNumero_Proveedor(int numero_Proveedor) {
        this.numero_Proveedor = numero_Proveedor;
    }

    public void setTelefono_Proveedor(int telefono_Proveedor) {
        this.telefono_Proveedor = telefono_Proveedor;
    }

    public void setDireccion_Proveedor(String direccion_Proveedor) {
        this.direccion_Proveedor = direccion_Proveedor;
    }

    public void setIdentificador_Proveedor(String identificador_Proveedor) {
        this.identificador_Proveedor = identificador_Proveedor;
    }
}
