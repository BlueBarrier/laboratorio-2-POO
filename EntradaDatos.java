/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * @author: Erick Barrera
 * @description: clase para pedir información del usuario
 * @version: 1.2
 * @created: 21/09/23
 * @last_modified: 24/09/23
 */
import java.util.Scanner;
public class EntradaDatos {
    private Scanner scan = new Scanner(System.in); // importar y crear objeto scanner

    public String pedirNombre(){ // pedir el nombre del curso
        /*
         * método que pide el nombre del usuario
         * 
         * @return nombre -String- nombre del usuario
         */
        System.out.println("\nIngrese el nombre del curso que se impartirá: ");
        String nombre = scan.nextLine();
        return nombre;
    }

    public String pedirCodigo(){
        /*
         * método que pide el código del curso
         * 
         * @return codigo -String- código del curso
         */
        System.out.println("Ingrese el código del curso (Ej.: CC2008)[máx 6 caractéres]: ");
        String codigo = "";
        try {
            codigo = scan.nextLine().trim();
            if(codigo.length()>6){System.out.println("Código muy largo!!"); pedirCodigo();}
        } catch (NullPointerException e) {
            pedirCodigo();
        }
        return codigo;
    }

    public int pedirHorario(){
        /*
         * método que pide la hora en la que se imparte el curso
         * 
         * @return hora -int- hora del curso
         */
        System.out.println("Ingrese la hora de inicio del curso (Salón disponible de 07 a 21 horas) (Ej.: 13, 10, 07): ");
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
        /*
         *  método que pide la cantidad de periodos que dura la clase
         * 
         * @return periodos -int- periodos
         */
        System.out.println("¿Cuántos periodos (de 60 min) dura la clase? (Ej.: 2): ");
        int periodos = 0;
        try {
            periodos = scan.nextInt();
            scan.nextLine();
            if(periodos<0){System.out.println("Ingrese un valor mayor a 0");pedirPeriodos();}
            return periodos;
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Ingrese un valor válido.");
            pedirPeriodos();
        }
        return periodos;
    }

    public int pedirEstudiantes(int capacidad){
        /*
         *  método que pide la cantidad de estudiantes asignados al curso
         * arroja una advertencia si excede la capacidad
         * 
         * @param capacidad -int- capacidad permitida en el salón
         * @return estudiantes -int- estudiantes asignados
         */
        int capacity = capacidad;
        System.out.println("¿Cuántos estudiantes reciben el curso?: ");
        int estudiantes = 0;
        try {
            String estudiantesString = scan.nextLine().trim();
            estudiantes = Integer.parseInt(	estudiantesString);
            if(estudiantes>capacity && estudiantes < capacity*2){
                System.out.println("ADVERTENCIA: ESTA SOBREPASANDO LA CAPACIDAD DEL SALÓN!!"+"\nCapacidad: "+capacity);
                return estudiantes;
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
        /*
         *  método que pide el nombre del profesor encargado
         * 
         * @return nombre -String- 
         */
        System.out.println("Ingrese el nombre del profesor encargado del curso: ");
        try {
            String nombre = scan.nextLine().trim();
            return nombre;
        } catch (NullPointerException e) {
            System.out.println("Ingrese un valor");
            pedirNombreProfesor();
        }
        return "";
    }

    public String pedirCarne(){
        /*
         * método que pide el carné del profesor, no puede ser mayor a 
         *  6 caractéres
         * @return carne -int - 
         */
        System.out.println("Ingrese el carné del profesor encargado del curso: ");
        try {
            String carne = scan.nextLine();
            carne = scan.nextLine().trim().toLowerCase();
            if(carne.length()>6){System.out.println("Carné muy largo!!"); pedirCarne();}
            return carne;
        } catch (NullPointerException e) {
            pedirCarne();
        }
        return "";
    }

    public String pedirCorreo(){
        /*
         * método que pide el correo del profesor, el correo debe ser un correo válido para la institución
         * debe incluir @uvg.edu.gt
         * 
         * @return correo -String- correo del profesor
         */
        System.out.println("Ingrese el correo del profesor encargado del curso (Ej.: profesor@uvg.edu.gt): ");
        try {
            String correo = scan.nextLine().trim().toLowerCase();
            if (correo.contains("@uvg.edu.gt")) {
                return correo;
            }else{
                System.out.println("Correo no válido para la institución UVG");
                pedirCorreo();
            }
        } catch (NullPointerException e) {
            System.out.println("Ingrese un valor válido");
            pedirCorreo();
        }
        return "";
    }

    public String pedirTelefono(){
        /*
         * método que pide al usuario el número del teléfono del profesor,
         * la String ingresada debe tener un - para que sea válida
         * 
         * @return telefono -String- teléfono del profesor
         */
        System.out.println("Ingrese el número de teléfono del profesor (Ej.: 1234-5678): ");
        try {
            String telefono = scan.nextLine().trim().toLowerCase();
            if (telefono.contains("-") && telefono.length()==9) {
                return telefono;
            }else{
                System.out.println("Ingrese el separador \"-\"  o compruebe que la longitud del teléfono sea de 9 contando el separador");
                pedirTelefono();
            }
        } catch (NullPointerException e) {
            System.out.println("Ingrese un valor.");
            pedirTelefono();
        }
        return "";
    }

    public int pedirCantDias(){
        /*
         * método que pide la cantidad de días que el curso se impartirá
         * debe ser menor a 5 y mayor a 0
         * 
         * @return op -int- cantidad de días de lunes a viernes
         */
        System.out.println("\n¿Cuántos días se impartirá el curso? (1-5): ");
        int op = 0;
        try {
            op = Integer.parseInt(scan.nextLine().trim());
            if(op>5 || op<=0){System.out.println("Por favor ingrese un número entre 1 y 5!"); pedirCantDias();}
            return op;
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Ingrese una opción válida!!");
            pedirCantDias();
        }
        return op;
    }

    public int pedirDia(int contador){
        /*
         * método que pide el día que se impartirá el usuario
         * 
         * @return op -int- indice de la lista del día 
         * @param contador -int- contador para saber cuántas veces se van agregando curso
         */
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
            String opString = scan.nextLine().trim();
            op = Integer.parseInt(opString);
            return op;
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Ingrese una opción válida!!");
            pedirDia(cont);
        }
        return op;
    }

    public int menu(){
        /*
         * método que arroja el menú para que el usuario ingrese una opción
         * 
         * @return op -int- opción ingresada por el usuario
         */
        System.out.println("\nMenú: "+
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

    public int buscarDia(){
        /*
         * método que pide una opción según el día que el usuario elija 
         * 
         * @return op -int- regresa el indice del día que eligió el usuario
         */
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

    public int preguntarCambioDia(){
        /*
         * método que pregunta al usuario sí desea cambiar el día 
         * si sí, entonces llama a la función para buscar el día y regresa el indice del día elegido
         * 
         * @return diaIndex -int- indice del día 
         */
        int diaIndex = 0;
        System.out.println("¿Desea cambiar de día?"+
                                "\n1. Sí"+
                                "\n2. No");
        String opcioString = scan.nextLine().trim().toLowerCase();
        try {
            int opcion = Integer.parseInt(opcioString);
            if(opcion == 1){
                System.out.println("¿Cuál es el nuevo día?");
                diaIndex = buscarDia()+1;
                return diaIndex;
            }else{return -1;}
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("INGRESE UNA OPCIÓN VÁLIDA");
            preguntarCambioDia();
        }
        return diaIndex;
    }

    public int siNo(){
        /*
         * método que confirma con el usuario si desea o no un nuevo semestre
         * 
         * @return opcion -int- sí(1) o no(2)
         */
        System.out.println("¿Esta seguro de crear un nuevo semestre?"+
                                "\n1. Sí"+
                                "\n2. No");
        String opcString = scan.nextLine().trim().toLowerCase();
        try {
            int opcion = Integer.parseInt(opcString);
            if(opcion > 2 || opcion < 1){System.out.println("Ingrese 1 o 2"); siNo();}
            return opcion;
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("INGRESE UNA OPCIÓN VÁLIDA");
            siNo();
        }
        return 0;
    }
}
