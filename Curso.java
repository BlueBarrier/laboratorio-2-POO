/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * clase que almacena la información de un curso
 * 
 * @author Erick Barrera
 * @version 1.2
 * @created 21/09/23
 * @last_modified 24/09/23
 */
public class Curso {
    // atributos
    private Profesor profesor;
    private String nombre, codigo;
    private int cantPeriodos, cantEstudiantes, horario, diaIndex;

    /**
     * Constructor para crear una instancia de la clase Curso.
     *
     * @param nombre          El nombre del curso.
     * @param codigo          El código único del curso.
     * @param horario         El horario del curso en horas.
     * @param cantPeriodos    La cantidad de periodos del curso.
     * @param cantEstudiantes La cantidad de estudiantes inscritos en el curso.
     * @param diaIndex        El índice del día en el que se imparte el curso.
     * @param profesor        El profesor que imparte el curso.
     */
    public Curso(String nombre, String codigo, int horario, int cantPeriodos, int cantEstudiantes, int diaIndex, Profesor profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horario = horario;
        this.cantPeriodos = cantPeriodos;
        this.cantEstudiantes = cantEstudiantes;
        this.profesor = profesor;
        this.diaIndex = diaIndex;
    }

    // getters y setters

    /**
     * Obtiene el nombre del curso.
     *
     * @return El nombre del curso.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del curso.
     *
     * @param nombre El nombre del curso.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el código del curso.
     *
     * @return El código del curso.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del curso.
     *
     * @param codigo El código del curso.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el horario del curso en horas.
     *
     * @return El horario del curso en horas.
     */
    public int getHorario() {
        return horario;
    }

    /**
     * Establece el horario del curso en horas.
     *
     * @param horario El horario del curso en horas.
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }

    /**
     * Obtiene la cantidad de periodos del curso.
     *
     * @return La cantidad de periodos del curso.
     */
    public int getCantPeriodos() {
        return cantPeriodos;
    }

    /**
     * Establece la cantidad de periodos del curso.
     *
     * @param cantPeriodos La cantidad de periodos del curso.
     */
    public void setCantPeriodos(int cantPeriodos) {
        this.cantPeriodos = cantPeriodos;
    }

    /**
     * Obtiene la cantidad de estudiantes inscritos en el curso.
     *
     * @return La cantidad de estudiantes inscritos en el curso.
     */
    public int getCantEstudiantes() {
        return cantEstudiantes;
    }

    /**
     * Establece la cantidad de estudiantes inscritos en el curso.
     *
     * @param cantEstudiantes La cantidad de estudiantes inscritos en el curso.
     */
    public void setCantEstudiantes(int cantEstudiantes) {
        this.cantEstudiantes = cantEstudiantes;
    }

    /**
     * Obtiene el índice del día en el que se imparte el curso.
     *
     * @return El índice del día en el que se imparte el curso.
     */
    public int getDiaIndex() {
        return diaIndex;
    }

    /**
     * Establece el índice del día en el que se imparte el curso.
     *
     * @param diaIndex El índice del día en el que se imparte el curso.
     */
    public void setDiaIndex(int diaIndex) {
        this.diaIndex = diaIndex;
    }

    /**
     * Obtiene el profesor que imparte el curso.
     *
     * @return El profesor que imparte el curso.
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Establece el profesor que imparte el curso.
     *
     * @param profesor El profesor que imparte el curso.
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto Curso.
     *
     * @return Una cadena que contiene información detallada sobre el curso.
     */
    @Override
    public String toString() {
        return "Curso: " + nombre +
                "\n código: " + codigo +
                "\n horario: " + horario + " horas" +
                "\n periodos: " + cantPeriodos +
                "\n estudiantes: " + cantEstudiantes +
                "\n profesor: " + profesor;
    }
}
