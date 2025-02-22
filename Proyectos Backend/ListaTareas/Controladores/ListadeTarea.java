package Controladores;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ConexionSQL;



public class ListadeTarea {
    public static void insertarTarea(String nombre, String descripcion, int categoriaId, String estado) {
        String sql = "INSERT INTO tareas (nombre, descripcion, id_categoria, estado) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, nombre);
            stmt.setString(2, descripcion);
            stmt.setInt(3, categoriaId);
            stmt.setString(4, estado);
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String> obtenerTareas() {
        List<String> tareas = new ArrayList<>();
        String sql = "SELECT nombre FROM tareas";

        try (Connection conn = ConexionSQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                tareas.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tareas;
    }
    

    

    
}
