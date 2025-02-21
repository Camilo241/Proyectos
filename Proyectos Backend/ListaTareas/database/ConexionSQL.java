package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
    private static final String URL = "jdbc:sqlserver://CASA;databaseName=Lista de Tareas;encrypt=true;trustServerCertificate=true";
    private static final String USUARIO = "";  // Dejar vacío si usas autenticación de Windows
    private static final String PASSWORD = ""; // Dejar vacío si usas autenticación de Windows

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            return null;
        }
    }
}