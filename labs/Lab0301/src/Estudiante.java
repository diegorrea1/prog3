
public class Estudiante {

    
 int codigo;
 String nombre;
 String correo;
 int semestre;
 
public Estudiante(String nombre, String correo, String correo1, int codigo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.semestre = semestre;
    }
  public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
}
