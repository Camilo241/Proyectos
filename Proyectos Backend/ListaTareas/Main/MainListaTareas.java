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
            System.out.println(" Conexión exitosa a la base de datos.");
            try {
                conn.close(); 
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        } else {
            System.out.println("❌ Error en la conexión.");
        }// validamos la coneccion y mandamos el mensaje

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la categoria.");
        String nombreCategoria = sc.next();
        ListadeCategorias listacategorias = new ListadeCategorias();

        ListadeCategorias.insertarCategoria(nombreCategoria);

        

        System.out.println("Categorías: " + ListadeCategorias.obtenerCategorias());

    
    }
}
