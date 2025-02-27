package practicas;

public class Practicante extends Persona {
    String carrera;
    String universidad;
    int semestre;

    public Practicante() {
    }

    public Practicante(
        int id, 
        String cedula, 
        String nombre, 
        String apellido, 
        String direccion, 
        String telefono, 
        String carrera, 
        String universidad, 
        int sementre) {
        super(id, cedula, nombre, apellido, direccion, telefono);
        
        this.carrera = carrera;
        this.universidad = universidad;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return this.carrera;
    }
    
    public String getUniversidad() {
        return this.universidad;
    }

    public int getSemestre() {
        return this.semestre;
    }

     public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void setUniversidad(String universidad) {
       this.universidad = universidad;
    }

    public void setSemestre(int semestre) {
      this.semestre = semestre;
    }

}


