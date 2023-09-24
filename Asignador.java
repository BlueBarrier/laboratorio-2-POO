/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * @author: Erick Barrera
 * @description: clase principal
 * @version: 1.1
 * @created: 21/09/23
 * @last_modified: 23/09/23
 */
import java.util.Scanner;
public class Asignador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // creación objeto scanner
        EntradaDatos entrada = new EntradaDatos(); // creación entrada de datos
        Horario horario = new Horario(); // creación horario
        boolean out = false;
        do { // do-while para recursividad del menú
            switch(entrada.menu()){
                case 1:
                    entrada.clean();
                    horario.asignar();
                    break; 
                case 2:
                    entrada.clean();
                    horario.buscarCurso();
                    break; 
                case 3: 
                    entrada.clean();
                    // eliminar curso
                    horario.eliminarCurso();
                    break;
                case 4: 
                    entrada.clean();
                    // cambiar horario
                    horario.cambiarHorario();
                    break;
                case 5: 
                    entrada.clean();
                    // buscar profesor encargado por horario y día
                    horario.mostrarProfesor();
                    break;
                case 6:
                    entrada.clean();
                    // mostrar días en los que el profesor cuida el salón
                    horario.mostrarEncargadoXDias();
                    break; 
                case 7:
                    entrada.clean();
                    // mostrar el % de responsabilidad del profesor y que días cuida
                    horario.encargadoStats();
                    break; 
                case 8:
                    entrada.clean();
                    // nuevo semestre, limpiar la lista
                    horario.nuevoSemestre();
                    break; 
                case 9:
                    entrada.clean();
                    System.out.println("\nPROGRAMA TERMINADO");
                    out = true;
                    break; 
                default:
                    break; 
            }
        } while (!out);
     
        scan.close();
    }   
}
