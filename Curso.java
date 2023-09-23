/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * @author: Erick Barrera
 * @description: clase que almacena los datos de los cursos
 * @version: 1.0
 * @created: 21/09/23
 * @last_modified: 21/09/23
 */
public class Curso {
    // atributos
    private Profesor profesor;
    private String nombre, codigo;
    private int cantPeriodos, cantEstudiantes, horario;

    // constructor
    public Curso(String nombre, String codigo, int horario, int cantPeriodos, int cantEstudiantes, Profesor profesor){
        this.nombre = nombre;
        this.codigo = codigo;
        this.horario = horario;
        this.cantPeriodos = cantPeriodos;
        this.cantEstudiantes = cantEstudiantes;
        this.profesor = profesor;
    }
    // getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getHorario(){return horario;}
    public void setHorario(int horario){this.horario = horario;}

    public int getCantPeriodos() {
        return cantPeriodos;
    }
    public void setCantPeriodos(int cantPeriodos) {
        this.cantPeriodos = cantPeriodos;
    }
    
    public int getCantEstudiantes() {
        return cantEstudiantes;
    }
    public void setCantEstudiantes(int cantEstudiantes) {
        this.cantEstudiantes = cantEstudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
