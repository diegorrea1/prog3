
import java.util.LinkedList;
import java.util.Queue;
import laboratorio0301.Entrada;


public class Laboratorio0301{
    static Queue<Registro>regis= new LinkedList<>();
    public static void main(String [] args){
        registro_estudiantes();
        registro_asignaturas();
        reporte_registro_final();
    } 
    public static void registro_estudiante(){
        String codigo = Entrada.readText("codigo del estudiante");
        String nombre= Entrada.readText("nombre del estudiante");
        String correo= Entrada.readText("Correo del estudiante");
        int semestre = Entrada.readInt("semestre");
        Estudiante estud = new Estudiante(codigo, nombre, correo, semestre);
        regis.add(new Registro(estud));
    }
    public static void registro_asigantura(){
        
    }
    public static void reporte_registro_final(){
        
    }

    private static void registro_asignaturas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void registro_estudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}