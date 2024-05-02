package entidadesDAO;

import ConexionBaseDatos.sqlConexionBD;
import capaEntidades.cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class clientesDAO {

    Connection open;
    ResultSet resultQuery;
    PreparedStatement preparedQuery;
    CallableStatement callQuery;
    sqlConexionBD connection = new sqlConexionBD();

    public boolean registrarCliente(cliente dataCliente) {
        boolean registrado = false;
        String queryClient = "{Call GuardarCliente(?,?,?,?,?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callQuery = open.prepareCall(queryClient);

            callQuery.setInt(1, dataCliente.getDocument());
            callQuery.setString(2, dataCliente.getNameClient());
            callQuery.setString(3, dataCliente.getSurName());
            callQuery.setString(4, dataCliente.getTelNumber());
            callQuery.setString(5, dataCliente.getCorreo());
            callQuery.setString(6, dataCliente.getDireccion());
            callQuery.execute();
            registrado = true;
        } catch (SQLException ex) {
            Logger.getLogger(clientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrado;
    }

    public boolean clienteRegistrado(int document) {
        String queryClient = "Select * From Cliente Where Documento = ?";
        open = connection.conexionBaseDatos();
        try {
            preparedQuery = open.prepareStatement(queryClient);
            preparedQuery.setInt(1, document);
            resultQuery = preparedQuery.executeQuery();
            if (resultQuery.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error:" + ex);
            return false;

        }
    }

    public List clientesRegistrados() {
        List<cliente> listClients = new ArrayList();
        String queryClients = "Select * From Cliente Where Activo =1";
        open = connection.conexionBaseDatos();
        try {
            preparedQuery = open.prepareStatement(queryClients);
            resultQuery = preparedQuery.executeQuery();
            while (resultQuery.next()) {
                cliente data = new cliente();
                data.setId(resultQuery.getInt("Id"));
                data.setDocument(resultQuery.getInt("Documento"));
                data.setNameClient(resultQuery.getString("Nombre"));
                data.setSurName(resultQuery.getString("Apellidos"));
                data.setTelNumber(resultQuery.getString("Telefono"));
                data.setCorreo(resultQuery.getString("Correo"));
                data.setDireccion(resultQuery.getString("Direccion"));
                data.setFechaRegistro(resultQuery.getDate("FecheRegistro"));
                data.setActivo(resultQuery.getBoolean("Activo"));
                listClients.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listClients;
    }
    public List clientesInactivos() {
        List<cliente> listClients = new ArrayList();
        String queryClients = "Select * From Cliente Where Activo =0";
        open = connection.conexionBaseDatos();
        try {
            preparedQuery = open.prepareStatement(queryClients);
            resultQuery = preparedQuery.executeQuery();
            while (resultQuery.next()) {
                cliente data = new cliente();
                data.setId(resultQuery.getInt("Id"));
                data.setDocument(resultQuery.getInt("Documento"));
                data.setNameClient(resultQuery.getString("Nombre"));
                data.setSurName(resultQuery.getString("Apellidos"));
                data.setTelNumber(resultQuery.getString("Telefono"));
                data.setCorreo(resultQuery.getString("Correo"));
                data.setDireccion(resultQuery.getString("Direccion"));
                data.setFechaRegistro(resultQuery.getDate("FecheRegistro"));
                data.setActivo(resultQuery.getBoolean("Activo"));
                listClients.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listClients;
    }
    

    public List busquedaCliente(String typeSearch, String typeValue) {
        List<cliente> listClients = new ArrayList<>();
        String queryProcedure = "{Call BusquedaCliente(?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callQuery = open.prepareCall(queryProcedure);
            callQuery.setString(1, typeSearch);
            callQuery.setString(2, typeValue);
            resultQuery = callQuery.executeQuery();
            while (resultQuery.next()) {
                cliente data = new cliente();
                data.setId(resultQuery.getInt("Id"));
                data.setDocument(resultQuery.getInt("Documento"));
                data.setNameClient(resultQuery.getString("Nombre"));
                data.setSurName(resultQuery.getString("Apellidos"));
                data.setTelNumber(resultQuery.getString("Telefono"));
                data.setCorreo(resultQuery.getString("Correo"));
                data.setDireccion(resultQuery.getString("Direccion"));
                data.setFechaRegistro(resultQuery.getDate("FecheRegistro"));
                data.setActivo(resultQuery.getBoolean("Activo"));
                listClients.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de busqueda: " + ex);
        }
        return listClients;

    }

    public boolean actualizarCliente(cliente dataCliente) {
        String queryProcedure = "{Call ActualizarCliente(?,?,?,?,?,?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callQuery = open.prepareCall(queryProcedure);
            callQuery.setInt(1, dataCliente.getId());
            callQuery.setInt(2, dataCliente.getDocument());
            callQuery.setString(3, dataCliente.getNameClient());
            callQuery.setString(4, dataCliente.getSurName());
            callQuery.setString(5, dataCliente.getTelNumber());
            callQuery.setString(6, dataCliente.getCorreo());
            callQuery.setString(7, dataCliente.getDireccion());
            int  columnsUpdate = callQuery.executeUpdate();
            return columnsUpdate > 0;
        } catch (SQLException ex) {
            Logger.getLogger(clientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean inactivarClientes(int Id){
        boolean isActivo = false;
        String queryProcedure = "{Call InactivarCliente(?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callQuery = open.prepareCall(queryProcedure);
            callQuery.setBoolean(1, false); 
            callQuery.setInt(2, Id); 
            callQuery.execute();
            isActivo = true;
        } catch (SQLException ex) {
            Logger.getLogger(clientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isActivo;
    }
    public boolean activarCliente(int id){
        boolean isActivo = false; 
        String queryProcedure = "{Call ActivarCliente(?,?)}"; 
        open = connection.conexionBaseDatos(); 
        try {
            callQuery = open.prepareCall(queryProcedure); 
            callQuery.setBoolean(1, true);
            callQuery.setInt(2, id);
            callQuery.execute();
            isActivo = true;
        } catch (SQLException ex) {
            Logger.getLogger(clientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isActivo;
    }

}
