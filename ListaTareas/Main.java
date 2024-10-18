package ListaTareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarea> lista = new ArrayList<>();
        ListadeTarea listadeTarea = new ListadeTarea(lista);
        
        int opcion = sc.nextInt();
        while (opcion != 5) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Visualizar las Tareas");
            System.out.println("3. Actualizar Tarea");
            System.out.println("4. Eliminar Tarea");
            System.out.println("5. Finalizar Programa");
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el ID de la tarea: ");
                    int id = sc.nextInt();
                    sc.nextLine();  // Consumir el salto de línea
                    System.out.print("Ingresa el nombre de la tarea: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingresa la descripción de la tarea: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Ingresa la categoría de la tarea: ");
                    String categoria = sc.nextLine();
                    System.out.print("¿Está completada la tarea? (true/false): ");
                    boolean completado = sc.nextBoolean();
                    Tarea nuevaTarea = new Tarea(id, nombre, descripcion, categoria, completado);
                    listadeTarea.AgregarTarea(nuevaTarea);              
                    break;
                case 2:
                    listadeTarea.TraerTarea();
                    break;
                case 3:
                    System.out.print("Ingresa el índice de la tarea a actualizar: ");
                    int indice = sc.nextInt() - 1;  // Restar 1 para que coincida con el índice de ArrayList
                    sc.nextLine();  // Consumir el salto de línea
                    System.out.print("Ingresa el nuevo nombre de la tarea: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Ingresa la nueva descripción de la tarea: ");
                    String nuevaDescripcion = sc.nextLine();
                    System.out.print("Ingresa la nueva categoría de la tarea: ");
                    String nuevaCategoria = sc.nextLine();
                    System.out.print("¿Está completada la tarea? (true/false): ");
                    boolean nuevoCompletado = sc.nextBoolean();
                    listadeTarea.Actualizar(tarea,indice);
                    break;
                case 4:
                    System.out.print("Ingresa el índice de la tarea a eliminar: ");
                    int indiceEliminar = sc.nextInt() - 1;  // Restar 1 para que coincida con el índice de ArrayList
                    listadeTarea.Eliminar(indiceEliminar);
                case 5:
                    System.out.println("Muchas Gracias");
                    break;
                default:
                    System.out.println("Ingrese una Opcion Valida.");
            }
        }
        
        sc.close();
    }
}
