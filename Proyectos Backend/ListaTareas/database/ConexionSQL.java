package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
    private static final String url = "jdbc:sqlserver://192.168.0.2:1433;databaseName=Lista de tareas;encrypt=true;trustServerCertificate=true";

    private static final String USUARIO = "camilo";  // Dejar vacío para autenticación de Windows
    private static final String PASSWORD = "1234"; // Dejar vacío para autenticación de Windows

    public static Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection(url, USUARIO, PASSWORD);
            System.out.println("✅ Conexión establecida correctamente.");
            return conn;
        } catch (SQLException e) {
            System.out.println("❌ Error en la conexión: " + e.getMessage());
            return null;
        }
    }
}