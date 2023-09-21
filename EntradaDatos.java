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
        System.out.println("Ingrese el código del curso (Ej.: CC2008)[máx 6 caractéres]: ");
        String codigo = scan.nextLine();
        return codigo;
    }

    public String pedirHorario(){
        System.out.println("Ingrese la hora de inicio del curso (Ej.: 13:00, 10:00): ");
        String horario = scan.nextLine();
        return horario;
    }

    public int pedirPeriodos(){
        System.out.println("¿Cuántos periodos (de 60 min) dura la clase? (Ej.: 2): ");
        int periodos = scan.nextInt();
        scan.nextLine();
        return periodos;
    }

    public int pedirEstudiantes(){
        System.out.println("¿Cuántos estudiantes reciben el curso?: ");
        int estudiantes = scan.nextInt();
        scan.nextLine();
        return estudiantes;
    }

    public String pedirNombreProfesor(){
        System.out.println("Ingrese el nombre del profesor encargado del curso: ");
        String nombre = scan.nextLine();
        return nombre;
    }

    public String pedirCarne(){
        System.out.println("Ingrese el carné del profesor encargado del curso: ");
        String carne = scan.nextLine();
        return carne;
    }

    public String pedirCorreo(){
        System.out.println("Ingrese el correo del profesor encargado del curso (Ej.: profesor@uvg.edu.gt): ");
        String correo = scan.nextLine();
        return correo;
    }

    public String pedirTelefono(){
        System.out.println("Ingrese el número de teléfono del profesor (Ej.: 1234-5678): ");
        String telefono = scan.nextLine();
        return telefono;
    }

    public int pedirDia(){
        System.out.println("Qué día se impartirá el curso (ingrese el número): "+
                                "\n1. Lunes"+
                                "\n2. Martes"+
                                "\n3. Miércoles" +
                                "\n4. Jueves"+
                                "\n5. Viernes");
        int op = scan.nextInt();
        return op;
    }
}
