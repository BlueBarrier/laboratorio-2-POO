/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * @author: Erick Barrera
 * @description: clase para pedir información del usuario
 * @version: 1.1
 * @created: 21/09/23
 * @last_modified: 22/09/23
 */
import java.io.IOException;
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
        String codigo = "";
        try {
            codigo = scan.nextLine().trim();
            if(codigo.length()>6){clean();System.out.println("Código muy largo!!"); pedirCodigo();}
        } catch (NullPointerException e) {
            pedirCodigo();
        }
        return codigo;
    }

    public int pedirHorario(){
        System.out.println("Ingrese la hora de inicio del curso (Ej.: 13, 10, 07): ");
        String horario = scan.nextLine().trim();
        int hora = 0;
        try {
            hora = Integer.parseInt(horario);
            if(hora<7 || hora>21){
                System.out.println("EL HORARIO DEL CURSO ES DE 7 A 21 HORAS");
                pedirHorario();
            }
            return hora;
        } catch (NullPointerException | NumberFormatException e) {
            pedirHorario();
        }
        return hora;
    }

    public int pedirPeriodos(){
        System.out.println("¿Cuántos periodos (de 60 min) dura la clase? (Ej.: 2): ");
        int periodos = scan.nextInt();
        scan.nextLine();
        return periodos;
    }

    public int pedirEstudiantes(int capacidad){
        int capacity = capacidad;
        System.out.println("¿Cuántos estudiantes reciben el curso?: ");
        int estudiantes = 0;
        try {
            String estudiantesString = scan.nextLine().trim();
            estudiantes = Integer.parseInt(	estudiantesString);
            if(estudiantes>capacity && estudiantes < capacity*2){
                System.out.println("ADVERTENCIA: ESTA SOBREPASANDO LA CAPACIDAD DEL SALÓN!!"+"\nCapacidad: "+capacity);
            }else if(estudiantes >= capacity*2){
                System.out.println("ERROR: HA EXCEDIDO LA CAPACIDAD DEL SALÓN POR MÁS DEL DOBLE"+ "\nCapacidad: "+capacity);
                pedirEstudiantes(capacity);
            }
            return estudiantes;
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("ERROR: INGRESE UNA OPCIÓN VÁLIDA");
            pedirEstudiantes(capacity);
        }
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

    public int pedirCantDias(){
        System.out.println("\n¿Cuántos días se impartirá el curso? (1-5): ");
        int op = 0;
        try {
            op = Integer.parseInt(scan.nextLine().trim());
            if(op>5){clean();System.out.println("Por favor ingrese un número entre 1 y 5!"); pedirCantDias();}
            return op;
        } catch (NullPointerException | NumberFormatException e) {
            clean();
            System.out.println("Ingrese una opción válida!!");
            pedirCantDias();
        }
        return op;
    }

    public int pedirDia(int contador){
        int cont = contador;
        if (cont>0){System.out.println("\n¿Qué otro día se impartira el curso?");}else{
            System.out.println("\n¿Qué día se impartirá el curso? (ingrese el número): ");
        }
        System.out.println("Horarios agregados: "+cont+
                                "\n1. Lunes"+
                                "\n2. Martes"+
                                "\n3. Miércoles" +
                                "\n4. Jueves"+
                                "\n5. Viernes");
        int op = 0;
        try {
            op = Integer.parseInt(scan.nextLine().trim());
            return op;
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Ingrese una opción válida!!");
            pedirDia(cont);
        }
        return op;
    }

    public int menu(){
        System.out.println("Menú: "+
                                "\n1. Crear y asignar curso al salón"+
                                "\n2. Buscar curso"+
                                "\n3. Eliminar curso"+
                                "\n4. Cambiar horario de un curso"+
                                "\n5. Buscar profesor encargado"+
                                "\n6. Mostrar días por profesor"+
                                "\n7. Mostrar % de responsabilidad"+
                                "\n8. Nuevo semestre"+
                                "\n9. Salir");
        int op = 0;
        try {
            op = Integer.parseInt(scan.nextLine().trim());
            return op;
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Ingrese una opción válida!!");
            menu();
        }
        return op;
    }

    public void clean(){
        Process proces;
        try {
            proces = new ProcessBuilder("cmd","/c","cls").inheritIO().start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int buscarDia(){
        System.out.println("Ingrese el número del día en el que el curso se imparte: "+
                                    "\n1. Lunes"+
                                    "\n2. Martes"+
                                    "\n3. Miércoles"+
                                    "\n4. Jueves"+
                                    "\n5. Viernes");
        int op = 0;
        try {
            String opcioString = scan.nextLine().trim();
            op = Integer.parseInt(opcioString);
            if (op>5) {
                System.out.println("INGRESE UNA OPCIÓN VÁLIDA");
                buscarDia();
            }
            return op-1;
        } catch (NullPointerException | NumberFormatException e) {
            buscarDia();
        }
        return op;
    }
}
