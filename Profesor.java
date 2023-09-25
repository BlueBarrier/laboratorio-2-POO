/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * Esta clase representa a un profesor de la universidad y almacena información
 * relevante sobre él, como su nombre, número de carne, correo electrónico y número de teléfono.
 * 
 * @author Erick Barrera
 * @version 1.2
 * @created 21/09/23
 * @last_modified 24/09/23
 */
public class Profesor {
    // atributos
    private String nombre, carne, correo, telefono;

    /**
     * Constructor para crear una instancia de la clase Profesor.
     *
     * @param nombre   El nombre del profesor.
     * @param carne    El número de carne del profesor.
     * @param correo   El correo electrónico del profesor.
     * @param telefono El número de teléfono del profesor.
     */
    public Profesor(String nombre, String carne, String correo, String telefono) {
        this.nombre = nombre;
        this.carne = carne;
        this.correo = correo;
        this.telefono = telefono;
    }

    // getters y setters

    /**
     * Obtiene el nombre del profesor.
     *
     * @return El nombre del profesor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del profesor.
     *
     * @param nombre El nombre del profesor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de carne del profesor.
     *
     * @return El número de carne del profesor.
     */
    public String getCarne() {
        return carne;
    }

    /**
     * Establece el número de carne del profesor.
     *
     * @param carne El número de carne del profesor.
     */
    public void setCarne(String carne) {
        this.carne = carne;
    }

    /**
     * Obtiene el correo electrónico del profesor.
     *
     * @return El correo electrónico del profesor.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del profesor.
     *
     * @param correo El correo electrónico del profesor.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el número de teléfono del profesor.
     *
     * @return El número de teléfono del profesor.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del profesor.
     *
     * @param telefono El número de teléfono del profesor.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto Profesor.
     *
     * @return Una cadena que contiene información detallada sobre el profesor.
     */
    @Override
    public String toString() {
        return "Profesor: " + nombre +
                "\n carne: " + carne +
                "\n correo: " + correo +
                "\n teléfono: " + telefono;
    }
}
