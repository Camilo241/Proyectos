package Main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import Controladores.ListadeCategorias;
import Controladores.ListadeTarea;
import database.ConexionSQL;

public class MainListaTareas {
    public static void main(String[] args) {
        Connection conn = ConexionSQL.conectar();
        if (conn != null) {
            System.out.println("✅ Conexión exitosa a la base de datos.");
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        } else {
            System.out.println("❌ Error en la conexión.");
        } // validamos la coneccion y mandamos el mensaje

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la categoria.");
        String nombreCategoria = sc.next();
        System.out.println("Ingresa el nombre de la tarea.");
        String nombre = sc.nextLine();

        System.out.println("Ingresa la descripcion de la tarea.");
        String descripcion = sc.nextLine();
        System.out.println("Ingresa el id de la categoria.");
        int categoria = sc.nextInt();

        // System.out.println("Ingresa el estado de la Tarea.");
        // String estado = sc.nextLine();
        sc.next();
        ListadeCategorias listacategorias = new ListadeCategorias();
        ListadeTarea listatarea = new ListadeTarea();

        // Categorias
        // Create
        ListadeCategorias.insertarCategoria(nombreCategoria);
        // Read
        System.out.println("Categorías: " + ListadeCategorias.obtenerCategorias());
        // Update
        // Delete

        // Tareas
        // Create
        ListadeTarea.insertarTarea(nombre, descripcion, categoria, null);
        // Read
        System.out.println("Tareas: " + ListadeTarea.obtenerTareas());
        // Update
        // Delete

    }
}
