package ConexionBaseDatos;

import java.sql.*;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sqlConexionBD {

    private String chainConnection = "jdbc:sqlserver://DESKTOP-2QEAMF3:1433;"
            + "database=SistemaInventario;"
            + "integratedSecurity=true;"
            + "encrypt=true;"
            + "trustServerCertificate=true;";
    Connection conexion;

    public Connection conexionBaseDatos() {
        Instant star = Instant.now();
        try {
            System.out.println("Intentando establecer conexion...");
            conexion = DriverManager.getConnection(chainConnection);

        } catch (SQLException ex) {
            Logger.getLogger(sqlConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println("Error de conexion:" + ex);
        }
        System.out.println("Conexion Exitosa!");
        Instant end = Instant.now();
        long timeConexionMillis = Duration.between(star, end).toMillis();
        System.out.println("Tiempo de conexion: " + timeConexionMillis + " en milisegundos");
        return conexion;
    }

    public static void main(String[] args) {
        sqlConexionBD abrir = new sqlConexionBD();
        abrir.conexionBaseDatos();

    }
}
