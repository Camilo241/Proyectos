package ListaTareas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el ID de la tarea: ");
        int id = sc.nextInt();  // Captura un entero para el ID

        sc.nextLine();  // Consumir el salto de línea que queda después de nextInt()

        System.out.print("Ingresa el nombre de la tarea: ");
        String nombre = sc.nextLine();  // Captura el nombre de la tarea

        System.out.print("Ingresa la descripción de la tarea: ");
        String descripcion = sc.nextLine();  // Captura la descripción

        System.out.print("Ingresa la categoría de la tarea: ");
        String categoria = sc.nextLine();  // Captura la categoría

        System.out.print("¿Está completada la tarea? (true/false): ");
        boolean completado = sc.nextBoolean();
        Tarea tarea = new Tarea(id, nombre, descripcion, categoria, completado);
        ArrayList<Tarea> lista = new ArrayList<>();
        ListadeTarea listadeTarea = new ListadeTarea(lista);
        listadeTarea.AgregarTarea(tarea);
        listadeTarea.TraerTarea(tarea);
        


        sc.close();
    }
}
