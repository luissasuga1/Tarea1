import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseconnection {
    private static final String URL = "jdbc:mysql://localhost:3306/HospitalDB";
    private static final String USUARIO = "root"; // 
    private static final String PASSWORD = "pepechano9"; // 

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("✅ Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("❌ Error en la conexión: " + e.getMessage());
        }
        return conexion;
    }

    public static void main(String[] args) {
        obtenerConexion(); // Prueba la conexión
    }
}
