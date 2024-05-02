package entidadesDAO;

import java.sql.*;
import ConexionBaseDatos.sqlConexionBD;
import capaEntidades.venta;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ventaDAO {

    sqlConexionBD connection = new sqlConexionBD();
    PreparedStatement preparedQuery;
    Connection open;
    CallableStatement callProcedure;
    ResultSet resultQuery;

    public boolean RegistrarVenta(venta ventaData) {
        boolean record = false;
        String queryProcedure = "{call guardarVenta(?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setInt(1, ventaData.getIdCliente());
            callProcedure.setInt(2, ventaData.getIdMetodoPago());
            callProcedure.execute();
            record = true;
        } catch (SQLException ex) {
            Logger.getLogger(ventaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return record;

    }

    public int idVenta() {
        int id = 0;
        String queryProcedure = "{call IdVenta()}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            resultQuery = callProcedure.executeQuery();
            if (resultQuery.next()) {
                id = resultQuery.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ventaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public boolean actualizarStock(int nuevoStock, String codigo) {
        boolean update = false;
        String query = "Update producto Set Stock = ? where codigo = ?";
        open = connection.conexionBaseDatos();
        try {
            preparedQuery = open.prepareStatement(query);
            preparedQuery.setInt(1, nuevoStock);
            preparedQuery.setString(2, codigo);
            int rowsUpdated = preparedQuery.executeUpdate();
            if (rowsUpdated > 0) {
                update = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ventaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return update;
    }
    
    public boolean InactivarVenta(int id){
        boolean inactiva = false;  
        String queryProcedure  = "{call InactivarVenta(?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setInt(1, id);
            callProcedure.execute();
            inactiva = true;
        } catch (SQLException ex) {
            Logger.getLogger(ventaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inactiva;
        
        
    } 

}
