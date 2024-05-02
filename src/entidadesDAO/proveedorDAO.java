package entidadesDAO;

import ConexionBaseDatos.sqlConexionBD;
import capaEntidades.proveedor;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class proveedorDAO {

    Connection open;
    sqlConexionBD connection = new ConexionBaseDatos.sqlConexionBD();
    ;
    PreparedStatement preparedQuery;
    ResultSet resultQuery;
    CallableStatement callProcedure;

    public boolean registrarProveedor(proveedor data) {
        boolean registred = false;
        String queryProcedure = "{ call GuardarProveedor(?,?,?,?,?,?)}";
        open = connection.conexionBaseDatos();

        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setString(1, data.getDocument());
            callProcedure.setString(2, data.getNameProveedor());
            callProcedure.setString(3, data.getLastName());
            callProcedure.setString(4, data.getDireccion());
            callProcedure.setString(5, data.getCorreo());
            callProcedure.setString(6, data.getTelefono());
            callProcedure.execute();
            registred = true;
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error:" + ex);
        }
        return registred;
    }

    public boolean proveedorRegistrado(String Document) {
        String queryProveedor = "Select * From Proveedor Where Documento = ?";
        open = connection.conexionBaseDatos();
        try {
            preparedQuery = open.prepareStatement(queryProveedor);
            preparedQuery.setString(1, Document);
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

    public List proveedoresRegistrados() {
        List<proveedor> listProveedores = new ArrayList();
        String queryProcedure = "{Call ProveedoresGuardados()}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            resultQuery = callProcedure.executeQuery();
            while (resultQuery.next()) {
                proveedor dataProveedor = new proveedor();
                dataProveedor.setId(resultQuery.getInt("Id"));
                dataProveedor.setDocument(resultQuery.getString("Documento"));
                dataProveedor.setNameProveedor(resultQuery.getString("Nombre"));
                dataProveedor.setLastName(resultQuery.getString("Apellidos"));
                dataProveedor.setDireccion(resultQuery.getString("Direccion"));
                dataProveedor.setCorreo(resultQuery.getString("Correo"));
                dataProveedor.setFechaRegistro(resultQuery.getDate("FechaRegistro"));
                dataProveedor.setTelefono(resultQuery.getString("Telefono"));
                dataProveedor.setActivo(resultQuery.getBoolean("Activo"));
                listProveedores.add(dataProveedor);

            }
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de proveedores guardados: " + ex);
        }
        return listProveedores;

    }

    public List proveedoresInactivos() {
        List<proveedor> listProveedores = new ArrayList();
        String queryProcedure = "{Call ProveedoresInactivos()}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            resultQuery = callProcedure.executeQuery();
            while (resultQuery.next()) {
                proveedor dataProveedor = new proveedor();
                dataProveedor.setId(resultQuery.getInt("Id"));
                dataProveedor.setDocument(resultQuery.getString("Documento"));
                dataProveedor.setNameProveedor(resultQuery.getString("Nombre"));
                dataProveedor.setLastName(resultQuery.getString("Apellidos"));
                dataProveedor.setDireccion(resultQuery.getString("Direccion"));
                dataProveedor.setCorreo(resultQuery.getString("Correo"));
                dataProveedor.setFechaRegistro(resultQuery.getDate("FechaRegistro"));
                dataProveedor.setTelefono(resultQuery.getString("Telefono"));
                dataProveedor.setActivo(resultQuery.getBoolean("Activo"));
                listProveedores.add(dataProveedor);

            }
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de proveedores guardados: " + ex);
        }
        return listProveedores;
    }

    public List busquedaProveedor(String typeSearch, String typeValue) {
        List<proveedor> listProveedores = new ArrayList<>();
        String queryProcedure = "{Call BusquedaProveedor(?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setString(1, typeSearch);
            callProcedure.setString(2, typeValue);
            resultQuery = callProcedure.executeQuery();
            while (resultQuery.next()) {
                proveedor dataProveedor = new proveedor();
                dataProveedor.setId(resultQuery.getInt("Id"));
                dataProveedor.setDocument(resultQuery.getString("Documento"));
                dataProveedor.setNameProveedor(resultQuery.getString("Nombre"));
                dataProveedor.setLastName(resultQuery.getString("Apellidos"));
                dataProveedor.setDireccion(resultQuery.getString("Direccion"));
                dataProveedor.setCorreo(resultQuery.getString("Correo"));
                dataProveedor.setFechaRegistro(resultQuery.getDate("FechaRegistro"));
                dataProveedor.setTelefono(resultQuery.getString("Telefono"));
                dataProveedor.setActivo(resultQuery.getBoolean("Activo"));
                listProveedores.add(dataProveedor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de busqueda: " + ex);
        }
        return listProveedores;

    }

    public boolean actualizarProveedor(proveedor data) {

        String queryProcedure = "{ call ActualizarProveedor(?,?,?,?,?,?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setInt(1, data.getId());
            callProcedure.setString(2, data.getDocument());
            callProcedure.setString(3, data.getNameProveedor());
            callProcedure.setString(4, data.getLastName());
            callProcedure.setString(5, data.getDireccion());
            callProcedure.setString(6, data.getCorreo());
            callProcedure.setString(7, data.getTelefono());
            int columnsUpdate = callProcedure.executeUpdate();
            return columnsUpdate > 0;
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error:" + ex);
            return false;
        }

    }

    public boolean inactivarProveedor(int id) {
        boolean inactivo = false;
        String queryProcedure = "{Call InactivarProveedor(?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setBoolean(1, false); 
            callProcedure.setInt(2, id); 
            callProcedure.execute();
            inactivo = true;
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inactivo;
    }

    public boolean activarProveedor(int id) {
        boolean isActivo = false;
        String queryProcedure = "{Call ActivarProveedor(?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setBoolean(1, true);
            callProcedure.setInt(2, id);
            callProcedure.execute();
            isActivo = true;
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isActivo;
    }

}
