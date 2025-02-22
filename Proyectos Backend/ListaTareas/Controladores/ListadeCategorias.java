package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ConexionSQL;

public class ListadeCategorias {
    public static void insertarCategoria(String nombreCategoria) {
        String sql = "INSERT INTO categorias (nombre) VALUES (?)"; // realizamos la consulta como si lo hcieramos en sql
                                                                   // en donde definimos la tabla el valor que queremos
                                                                   // ingresar

        try (Connection conn = ConexionSQL.conectar(); // validamos en la clase de conexion que me genere una buena
                                                       // conexion
                PreparedStatement stmt = conn.prepareStatement(sql)) {// Crea un PreparedStatement que permite ejecutar
                                                                      // la consulta SQL de manera eficiente.

            stmt.setString(1, nombreCategoria);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String> obtenerCategorias() {
        List<String> categorias = new ArrayList<>();
        String sql = "SELECT nombre FROM categorias"; // realizamos la consulta como en SQl

        try (Connection conn = ConexionSQL.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) { // me guarda lo obtenido en la consulta en el calor ResultSet

            while (rs.next()) { // avanza al siguiente registro en el resultado de la consulta.
                categorias.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {// Si ocurre algún error en la conexión o consulta, se captura y se imprime en
                                  // la consola.
            e.printStackTrace();
        }

        return categorias;
    }
}
