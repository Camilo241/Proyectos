package Main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
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
                conn.close(); // Cierra la conexión después de la prueba
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        } else {
            System.out.println("❌ Error en la conexión.");
        }
    //     Scanner sc = new Scanner(System.in);
    //     ArrayList<Tarea> lista = new ArrayList<>();
    //     ArrayList<Categoria> listaC= new ArrayList<>();
    //     ListadeCategorias listadeCategorias = new ListadeCategorias(listaC);
    //     ListadeTarea listadeTarea = new ListadeTarea(lista);

    //     int opcion = 0;
    //     while (opcion != 9) {
    //         System.out.println("¿Qué desea hacer?");
    //         System.out.println("1. Agregar Tarea");
    //         System.out.println("2. Visualizar las Tareas");
    //         System.out.println("3. Actualizar Tarea");
    //         System.out.println("4. Eliminar Tarea" + "\n5. Agregar Categoria" + "\n6. Visualizar Categoria"
    //                 + "\n7. Actualizar Categoria" + "\n8. Eliminar Categoria");
    //         System.out.println("9. Finalizar Programa");

    //         opcion = sc.nextInt();
    //         switch (opcion) {
    //             case 1:
    //                 System.out.print("Ingresa el ID de la tarea: ");
    //                 int id = sc.nextInt();
    //                 sc.nextLine(); // Consumir el salto de línea
    //                 System.out.print("Ingresa el nombre de la tarea: ");
    //                 String nombre = sc.nextLine();
    //                 System.out.print("Ingresa la descripción de la tarea: ");
    //                 String descripcion = sc.nextLine();
    //                 System.out.print("Ingresa la categoría de la tarea: ");
    //                 String categoria = sc.nextLine();
    //                 System.out.print("¿Está completada la tarea? (true/false): ");
    //                 boolean completado = sc.nextBoolean();
    //                 Tarea nuevaTarea = new Tarea(id, nombre, descripcion, categoria, completado);
    //                 listadeTarea.AgregarTarea(nuevaTarea);
    //                 break;
    //             case 2:
    //                 listadeTarea.TraerTarea();
    //                 break;
    //             case 3:
    //                 System.out.print("Ingresa el índice de la tarea a actualizar: ");
    //                 int indice = sc.nextInt() - 1;
    //                 if (indice <= 0 && indice < lista.size()) {
    //                     System.out.println("Ingrese el nuevo id de la Tarea");
    //                     int nuevoId = sc.nextInt();
    //                     sc.nextLine();
    //                     System.out.print("Ingresa el nuevo nombre de la tarea: ");
    //                     String nuevoNombre = sc.nextLine();
    //                     System.out.print("Ingresa la nueva descripción de la tarea: ");
    //                     String nuevaDescripcion = sc.nextLine();
    //                     System.out.print("Ingresa la nueva categoría de la tarea: ");
    //                     String nuevaCategoria = sc.nextLine();
    //                     System.out.print("¿Está completada la tarea? (true/false): ");
    //                     boolean nuevoCompletado = sc.nextBoolean();
    //                     listadeTarea.Actualizar(nuevoId, nuevoNombre, nuevaDescripcion, nuevaCategoria, nuevoCompletado,
    //                             indice);
    //                 } else {
    //                     System.out.println("Ingrese un Indice Valido.");
    //                 }
    //                 break;
    //             case 4:
    //                 System.out.print("Ingresa el índice de la tarea a eliminar: ");
    //                 int indiceEliminar = sc.nextInt() - 1;
    //                 listadeTarea.Eliminar(indiceEliminar);
    //                 break;
    //             case 5:
    //                 System.out.println("Digite el Id de la Categoria.");
    //                 int IdCategoria = sc.nextInt();
    //                 sc.nextLine();
    //                 System.out.println("Ingrese el Nombre de la Categoria:");
    //                 String nombreCategoria = sc.nextLine();
    //                 Categoria nuevacategoria = new Categoria(IdCategoria, nombreCategoria);
    //                 listadeCategorias.CrearCategorias(nuevacategoria);
    //                 break;
    //             case 6:
    //                 listadeCategorias.LeerCategorias();
    //                 break;
    //             case 7:
    //             System.out.print("Ingresa el índice de la categoria a actualizar: ");
    //             int indiceC = sc.nextInt() - 1;
    //             sc.nextLine();
    //             if (indiceC <= 0 && indiceC < listaC.size()) {
    //                 System.out.println("Ingrese el nuevo id de la Categoria");
    //                 int nuevoIdC = sc.nextInt();
    //                 sc.nextLine();
    //                 System.out.print("Ingresa el nuevo nombre de la Categoria: ");
    //                 String nuevoNombre = sc.nextLine();
    //                 listadeCategorias.ActualizarCategoria(nuevoIdC, indiceC, nuevoNombre);
    //             } else {
    //                 System.out.println("Ingrese un Indice Valido.");
    //             }
    //             break;
    //             case 8:
    //             System.out.print("Ingresa el índice de la Categoria a eliminar: ");
    //             int indiceEliminarC = sc.nextInt() - 1;
    //             listadeCategorias.EliminarCategria(indiceEliminarC);
    //                 break;
    //             case 9:
    //                 System.out.println("Muchas Gracias");
    //                 break;
    //             default:
    //                 System.out.println("Ingrese una Opcion Valida.");
    //         }
    //     }

    //     sc.close();
    }
}
