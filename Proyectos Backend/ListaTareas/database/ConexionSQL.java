package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class ConexionSQL {
    private ConexionSQL() {
        // Evitas instancias innecesarias al hacer el constructor privado.
    }

    private static final Logger LOGGER = Logger.getLogger(ConexionSQL.class.getName());
    private static final String URL = "jdbc:sqlserver://192.168.0.2:1433;databaseName=Lista de tareas;encrypt=true;trustServerCertificate=true";

    private static final String USUARIO = System.getenv("DB_USER");
    private static final String PASSWORD = System.getenv("DB_PASSWORD");

    public static Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            LOGGER.info("✅ Conexión establecida correctamente.");
            return conn;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "❌ Error en la conexión: {0}", e.getMessage());
            return null;
        }
    }
}