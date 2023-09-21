/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * @author: Erick Barrera
 * @description: clase que almacena los datos de profesores
 * @version: 1.0
 * @created: 21/09/23
 * @last_modified: 21/09/23
 */
public class Profesor{
    // atributos
    private String nombre, carne, correo, telefono;
    public Profesor(String nombre, String carne, String correo, String telefono){
        this.nombre = nombre;
        this.carne=carne;
        this.correo = correo;
        this.telefono = telefono;
    }
     // getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarne() {
        return carne;
    }
    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}