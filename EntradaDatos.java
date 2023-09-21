/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * @author: Erick Barrera
 * @description: clase para pedir información del usuario
 * @version: 1.0
 * @created: 21/09/23
 * @last_modified: 21/09/23
 */
import java.util.Scanner;
public class EntradaDatos {
    private Scanner scan = new Scanner(System.in); // importar y crear objeto scanner

    public String pedirNombre(){ // pedir el nombre del curso
        System.out.println("\nIngrese el nombre del curso que se impartirá: ");
        String nombre = scan.nextLine();
        return nombre;
    }

    public String pedirCodigo(){
        System.out.println("Ingrese el código del curso (E.j.: CC2008)[máx 6 caractéres]: ");
        String codigo = scan.nextLine();
        return codigo;
    }
}
