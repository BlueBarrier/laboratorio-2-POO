/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * @author: Erick Barrera
 * @description: clase para funcionalidades del programa
 * @version: 1.1
 * @created: 21/09/23
 * @last_modified: 22/09/23
 */

import java.util.ArrayList;
public class Horario {
    EntradaDatos entrada = new EntradaDatos();
    // listas de cursos por día
    private ArrayList<Curso> lunes = new ArrayList<>();  // Lista de cursos para el día Lunes
    private ArrayList<Curso> martes = new ArrayList<>(); // Lista de cursos para el día martes
    private ArrayList<Curso> miercoles = new ArrayList<>(); // Lista de cursos para el día miercoles
    private ArrayList<Curso> jueves = new ArrayList<>(); // Lista de cursos para el día jueves
    private ArrayList<Curso> viernes = new ArrayList<>(); // Lista de cursos para el día viernes
    private ArrayList<ArrayList<Curso>> horario = new ArrayList<ArrayList<Curso>>(); // lista de días 
    private int capacidad = 25; // disponibilidad del salón en este momento 

    public void asignar(){
        /**
         * Función para crear un curso en X días que el usuario elija 
         */

        // pedir código y verificar si ya existe un curso con ese código
        horario.add(0, lunes);
        horario.add(0, martes);
        horario.add(0, miercoles);
        horario.add(0, jueves);
        horario.add(0, viernes);

        String codigo = entrada.pedirCodigo();
        try {
            for(ArrayList<Curso> i: horario){
                for (Curso j : i) {
                    if(j.getCodigo().equals(codigo)){
                        System.out.println("Este curso ya exite!!");
                        asignar();
                    }
                }
            }            
        } catch (Exception e) {
            
        }
        // pedir y guardar variables para clase curso
        String nombreCurso = entrada.pedirNombre();
        int cantEstudiantes = entrada.pedirEstudiantes(capacidad);
        // pedir y guardar variables para clase profesor
        String nombreProfe = entrada.pedirNombreProfesor();
        String carneProfe = entrada.pedirCarne();
        String correoProfe = entrada.pedirCorreo();
        String telefonoProfe = entrada.pedirTelefono();
        // crear profesor
        Profesor profesor = new Profesor(nombreProfe, carneProfe, correoProfe, telefonoProfe);
        int i = entrada.pedirCantDias(); // pedir la cantidad de días que se van a asignar a un curso
        int k = 0; // contador de días que van ingresando 
        for(int j = 0; j<i; j++){ // ciclo que repite X veces la cantidad de días el usuario haya ingresado
            switch (entrada.pedirDia(k)) { // pide el día 
                case 1:
                    try {
                        horario.get(0); // intenta acceder a la lista
                        boolean out = false; // condicional para salir
                        do {
                            int horarioCurso = entrada.pedirHorario(); // pide la hora int
                            int periodosCurso = entrada.pedirPeriodos(); // pide los periodos del curso 
                            if(comprobarSolapar(horarioCurso, periodosCurso, 0)){ // llama a la función para comprobar disponibilidad
                                Curso curso = new Curso(nombreCurso, codigo, horarioCurso, periodosCurso, cantEstudiantes,0 ,profesor); // crea un curso
                                horario.get(0).add(curso); // añade un curso a la lista
                                System.out.println("Curso añadido");
                                out = true;
                            }
                        } while (!out);
                    } catch (Exception e) {
                        horario.add(0, lunes); // si no existe la lista, entonces la crea en el indice 0
                        boolean out = false;
                        do {
                            int horarioCurso = entrada.pedirHorario(); // pide horario
                            int periodosCurso = entrada.pedirPeriodos(); // pide periodo 
                            if(comprobarSolapar(horarioCurso, periodosCurso, 0)){ // verifica si esta disponible
                                Curso curso = new Curso(nombreCurso, codigo, horarioCurso, periodosCurso, cantEstudiantes,0,profesor);
                                horario.get(0).add(curso); // añade el curso a la lista 
                                out = true;
                            }
                        } while (!out);
                    }
                    k++;
                    break;
                case 2:
                /*  
                 * Para el día martes
                 */
                    try {
                        horario.get(1);
                        boolean out = false;
                        do {
                            int horarioCurso = entrada.pedirHorario();
                            int periodosCurso = entrada.pedirPeriodos();
                            if(comprobarSolapar(horarioCurso, periodosCurso, 1)){
                                Curso curso = new Curso(nombreCurso, codigo, horarioCurso, periodosCurso, cantEstudiantes, 1, profesor);
                                horario.get(1).add(curso);
                                System.out.println("Curso añadido");
                                out = true;
                            }
                        } while (!out);
                    } catch (Exception e) {
                        horario.add(1, martes);
                        boolean out = false;
                        do {
                            int horarioCurso = entrada.pedirHorario();
                            int periodosCurso = entrada.pedirPeriodos();
                            if(comprobarSolapar(horarioCurso, periodosCurso, 1)){
                                Curso curso = new Curso(nombreCurso, codigo, horarioCurso, periodosCurso, cantEstudiantes, 1, profesor);
                                horario.get(1).add(curso);
                                out = true;
                            }
                        } while (!out);
                    }
                    k++;
                    break;
                case 3:
                /*
                 * Para el día miercoles
                 */
                    try {
                        horario.get(2);
                        boolean out = false;
                        do {
                            int horarioCurso = entrada.pedirHorario();
                            int periodosCurso = entrada.pedirPeriodos();
                            if(comprobarSolapar(horarioCurso, periodosCurso, 2)){
                                Curso curso = new Curso(nombreCurso, codigo, horarioCurso, periodosCurso, cantEstudiantes, 2, profesor);
                                horario.get(2).add(curso);
                                System.out.println("Curso añadido");
                                out = true;
                            }
                        } while (!out);
                    } catch (Exception e) {
                        horario.add(2, miercoles);
                        boolean out = false;
                        do {
                            int horarioCurso = entrada.pedirHorario();
                            int periodosCurso = entrada.pedirPeriodos();
                            if(comprobarSolapar(horarioCurso, periodosCurso, 2)){
                                Curso curso = new Curso(nombreCurso, codigo, horarioCurso, periodosCurso, cantEstudiantes, 2, profesor);
                                horario.get(2).add(curso);
                                out = true;
                            }
                        } while (!out);
                    }
                    k++;
                    break;
                case 4:
                /*
                 * Para el día jueves
                 */
                    try {
                        horario.get(3);
                        boolean out = false;
                        do {
                            int horarioCurso = entrada.pedirHorario();
                            int periodosCurso = entrada.pedirPeriodos();
                            if(comprobarSolapar(horarioCurso, periodosCurso, 3)){
                                Curso curso = new Curso(nombreCurso, codigo, horarioCurso, periodosCurso, cantEstudiantes, 3, profesor);
                                horario.get(3).add(curso);
                                System.out.println("Curso añadido");
                                out = true;
                            }
                        } while (!out);
                    } catch (Exception e) {
                        horario.add(3, jueves);
                        boolean out = false;
                        do {
                            int horarioCurso = entrada.pedirHorario();
                            int periodosCurso = entrada.pedirPeriodos();
                            if(comprobarSolapar(horarioCurso, periodosCurso, 3)){
                                Curso curso = new Curso(nombreCurso, codigo, horarioCurso, periodosCurso, cantEstudiantes, 3, profesor);
                                horario.get(3).add(curso);
                                out = true;
                            }
                        } while (!out);
                    }
                    k++;
                    break;
                case 5:
                /*
                 * Para el día viernes
                 */
                    try {
                        horario.get(4);
                        boolean out = false;
                        do {
                            int horarioCurso = entrada.pedirHorario();
                            int periodosCurso = entrada.pedirPeriodos();
                            if(comprobarSolapar(horarioCurso, periodosCurso, 4)){
                                Curso curso = new Curso(nombreCurso, codigo, horarioCurso, periodosCurso, cantEstudiantes, 4, profesor);
                                horario.get(4).add(curso);
                                System.out.println("Curso añadido");
                                out = true;
                            }
                        } while (!out);
                    } catch (Exception e) {
                        horario.add(4, viernes);
                        boolean out = false;
                        do {
                            int horarioCurso = entrada.pedirHorario();
                            int periodosCurso = entrada.pedirPeriodos();
                            if(comprobarSolapar(horarioCurso, periodosCurso, 4)){
                                Curso curso = new Curso(nombreCurso, codigo, horarioCurso, periodosCurso, cantEstudiantes, 4,profesor);
                                horario.get(4).add(curso);
                                out = true;
                            }
                        } while (!out);
                    }
                    k++;
                    break;
                default:
                    System.out.println("Valor incorrecto!!"); // se vuelve a llamar si el usuario ingresa un valor erroneo
                    asignar();
                    break;
            }
        }
    }
    /**
     * Función para buscar un curso dependiendo del horario(int) que ingrese el usuario
     * 
     * @return: Curso curso - curso que encuentra el programa
     */
    public Curso buscarCurso(){
        Curso curso = null; // inicializa lista
        int dia = entrada.buscarDia(); // pide el indice del día al usuario
        int hora = entrada.pedirHorario(); // pide la hora al usuario
        for(Curso i: horario.get(dia)){ // busca entre la lista del día ingresado
            if (i.getHorario() == hora) { // si la hora de algún curso coincide con la hora ingresada, entonces devuelve un Curso
                System.out.println(i); // printea el curso
                return i; // regresa el curso
            }else{System.out.println("ERROR: CURSO NO ENCONTRADO"); return null;}
        }
        return curso;
    }
    /**
     * Función para cambiar horario de un curso verificando que el nuevo horario este disponible
     */
    public void cambiarHorario(){
        Curso cursoCambiar = buscarCurso(); // buscar curso
        if (cursoCambiar != null) { // comprobar que no este vació
            System.out.println("\nIngrese los nuevos datos: ");
            int nuevaHora = entrada.pedirHorario(); // pedir horario nuevo
            int nuevoIndex = entrada.preguntarCambioDia(); // preguntar si deseea cambiar de día
            if(nuevoIndex == -1){
                if (comprobarSolapar(nuevaHora, cursoCambiar.getCantPeriodos(), cursoCambiar.getDiaIndex())) {
                    cursoCambiar.setHorario(nuevaHora);
                    System.out.println("Nuevo horario: "+cursoCambiar.getHorario());
                }
            }else{
                if (comprobarSolapar(nuevaHora, cursoCambiar.getCantPeriodos(), nuevoIndex)) { // comprueba en el nuevo día si el horario esta disponible
                    horario.get(cursoCambiar.getDiaIndex()).remove(cursoCambiar); // remueve el curso del día 
                    cursoCambiar.setHorario(nuevaHora); // cambia la hora del curso
                    horario.get(nuevoIndex).add(cursoCambiar); // agrega el curso al día deseado
                    cursoCambiar.setDiaIndex(nuevoIndex); // setea el nuevo index del curso 
                    System.out.println("Nuevo horario: "+cursoCambiar.getHorario()+" Día: "+dias(cursoCambiar.getDiaIndex()));
                }
            }
        }
    }
    public void eliminarCurso(){
        /*
         * Función para eliminar Curso dependiendo del horario y día que elija el usuario
         */
        Curso eliminarCurso = buscarCurso(); // busca y asigna el curso del usuario
        if (eliminarCurso != null) { // si el curso no esta vació
            horario.get(eliminarCurso.getDiaIndex()).remove(eliminarCurso); // remueve el curso con el indice del día
            System.out.println("CURSO ELIMINADO"); // print para mostrar al usuario que el curso se elimino
        }
    }
    public void nuevoSemestre(){
        /*
         * Función que elimina todos los elementos de las listas de los días y el horario
         */
        if(entrada.siNo() == 1){ // pregunta si esta seguro de eliminar las listas
            lunes.clear();
            martes.clear();
            miercoles.clear();
            jueves.clear();
            viernes.clear();
            horario.clear();
            System.out.println("Horario limpio");
        }else{
            System.out.println("Regresando...\n");
        }
    }
    public void mostrarProfesor(){
        /*
         * Función que busca un curso en un horario  y mostar el profesor encargado
         */
        System.out.println("Ingrese los datos del horario a buscar");
        Curso cursoProfesor = buscarCurso(); // busca el curso en ese horario 
        if (cursoProfesor != null) {
            System.out.println( // muestra al profesor de ese horario
                            "\n Profesor/a encargad@: " + cursoProfesor.getProfesor().getNombre() + 
                            "\n Día: "+dias(cursoProfesor.getDiaIndex())+
                            "\n Hora: " + cursoProfesor.getHorario() + 
                            "\n Periodos: " + cursoProfesor.getCantPeriodos());
        }
    }
    /**
     * Función que busca los horarios dentro de todo el horario los cuales imparte un profesor
     * 
     * @param profesor - String - nombre del profesor 
     */
    public void mostrarEncargadoXDias(){
        ArrayList<String> profesores = new ArrayList<>(); // lista para almacenar los nombre de los profesores disponibles
        ArrayList<String> diasProfesor = new ArrayList<>(); // lista para almacenar los días que imparte el profesor
        ArrayList<Curso> cursosProfesor = new ArrayList<>(); // lista de cursos que imparte un profesor
        for (ArrayList<Curso> dias : horario) {
            for (Curso curso : dias) {
                if (!profesores.contains(curso.getProfesor().getNombre())) {
                    profesores.add(curso.getProfesor().getNombre()); // guarda los nombres de los profesores disponibles si no estan en la lista
                }
            }
        }
        System.out.println("Profesores disponibles para buscar: "); 
        for (String profesor : profesores) { // muestra los profesores disponibles
            System.out.println("Profesor/a: "+profesor);
        }
        String buscarProfesor = entrada.pedirNombreProfesor(); // pide el nombre del profesor a buscar
        if (profesores.contains(buscarProfesor)) { // verifica la entrada del usuario
            // recopilar cursos
            for (ArrayList<Curso> busquedaDia : horario) { // itera por día
                for (Curso busquedaCurso : busquedaDia) { // itera por curso
                    if (busquedaCurso.getProfesor().getNombre().equalsIgnoreCase(buscarProfesor)) {
                        if (!diasProfesor.contains(dias(busquedaCurso.getDiaIndex()))) {
                            diasProfesor.add(dias(busquedaCurso.getDiaIndex())); // si encuentra una coincidencia entonces agrega el día si no esta repetido
                        }
                            cursosProfesor.add(busquedaCurso); // agrega el curso a la lista de cursos
                    }
                }
            }
            // Imprimir resultados 
            System.out.println("Profesor: "+buscarProfesor);
            System.out.println("\n Días que imparte curso: ");
            for (String  diaString : diasProfesor) {
                System.out.println("Día: "+diaString);
            }
            System.out.println("\n Cursos: ");
            for (Curso cursoCurso : cursosProfesor) {
                System.out.println("Curso: "+cursoCurso.getNombre()+
                                    "\n Código: "+cursoCurso.getCodigo()+
                                    "\n Día: " +dias(cursoCurso.getDiaIndex())+
                                    "\n Horario: "+cursoCurso.getHorario()+" horas"+
                                    "\n Periodos: "+cursoCurso.getCantPeriodos()+
                                    "\n Estudiantes: "+cursoCurso.getCantEstudiantes());
            }
        }else{
            System.out.println("Ha ingresado incorrectamente el nombre del profesor");
            mostrarEncargadoXDias(); // recursividad defensiva
        }
    }
    public void encargadoStats(){
        /*
         * Función para mostrar las estadísticas de cada profesor en relación a la responsabilidad que conlleva
         */
        double horasTotales = (21-7)*5;  // posibles horas de todo el horario (hora final - hora inicial del salón)* la cantidad de días
        ArrayList<String> profesoStrings = new ArrayList<>(); // lista para guardar los profesores

        // iteración para recopilar datos
        for (ArrayList<Curso> dArrayList : horario) {
            for (Curso dCurso : dArrayList) {
                if (!profesoStrings.contains(dCurso.getProfesor().getNombre())) {
                    profesoStrings.add(dCurso.getProfesor().getNombre()); // añade el nombre del profesor si no esta en la lista
                }
            }
        }
        
        // iteración para sumar horas y mostrar porcentaje
        System.out.println("HORAS TOTALES POR HORARIO: "+horasTotales);
        System.out.println("Porcentajes por profesor: ");
        for (String profesor : profesoStrings) { // iterar cada profesor de la lista para obtener la cantidad de horas que tienen
            double horasProfesor=0;
            for (ArrayList<Curso> dArrayList : horario) {
                for (Curso dCurso : dArrayList) {
                    if (dCurso.getNombre().equalsIgnoreCase(profesor)) {
                        horasProfesor += dCurso.getCantPeriodos(); // sumar a la variable las horas por curso
                    }
                }
            }
            double porcentaje = horasProfesor/horasTotales *100; // porcentaje 
            System.out.println("\nProfesor: "+profesor+" % de responsabilidad = "+ porcentaje+"%");
        }
        
    }



    // función para verificar si dos cursos se solapan 
    /**
     * Función que verifica si el horario esta desocupado
     * 
     * @param hora -int- hora de inicio del curso
     * @param periodos - int - periodos que dura el curso
     * @param indice - int - indice de la lista dentro de horario para buscar la disponibilidad  
     * 
     * @return boolean - falso si el horario no esta disponible y verdadero si esta disponible
     */
    public boolean comprobarSolapar(int hora, int periodos, int indice){
        int finalCurso = hora + periodos; // hora en la que el curso finaliza
        int comprobanteInicia; // creación variable para comprobar iniciación de cursos
        int comprobanteFinaliza; // creación variable para comprobar finalización de cursos
        for(Curso i: horario.get(indice)){ // itera cada curso 
            comprobanteInicia = i.getHorario(); // extrae la hora de inicio de cada curso
            comprobanteFinaliza = i.getHorario() + i.getCantPeriodos(); // establece la hora de finalización de cada curso
            boolean mascara = (comprobanteFinaliza <= hora) || (comprobanteInicia>=finalCurso); // mascara booleana para la condicional (comprueba la disponibilidad)
            if(!mascara){
                System.out.println("ADVERTENCIA: EL HORARIO DEL CURSO SE SOLAPA CON OTRO");
                return false; // retorna false si se solapan los cursos
            }else if(finalCurso>21 || hora < 7){
                System.out.println("ERROR: EL HORARIO INGRESADO QUEDA FUERA DEL RANGO DISPONIBLE DEL SALÓN (7 A 21 HORAS)");
                return false; // regresa false debido a que el horario ingresado esta fuera del rango de disponibilidad del curso
            }
        }
        return true; // retorna true si esta disponible
    }

    /**
     * Función para regresar el día en String dependiendo el indice
     * @param int opcion - indice del día
     * 
     * @return String día - día dependiendo un indice
     */
    public String dias(int opcion){
        switch (opcion) {
            case 1:
                return "lunes";
            case 2:
                return "martes";
            case 3:
                return "miercoles";
            case 4:
                return "jueves";
            case 5:
                return "viernes";
            default:
                return "¿Día?";
        }
    }
}
