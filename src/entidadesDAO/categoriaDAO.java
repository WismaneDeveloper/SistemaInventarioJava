package entidadesDAO;

import ConexionBaseDatos.sqlConexionBD;
import capaEntidades.categoria;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class categoriaDAO {

    Connection open;
    sqlConexionBD Connection = new sqlConexionBD();
    PreparedStatement preparedQuery;
    CallableStatement callProcedure;
    ResultSet resultSetQuery;
    ResultSetMetaData resultSetMetaData;

    public boolean registrarCategoria(categoria dataDescription) {
        boolean recordCategoria = false;
        String queryProcedure = "{call GuardarCategoria(?)}";
        open = Connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setString(1, dataDescription.getDescripcion());
            callProcedure.execute();
            recordCategoria = true;
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return recordCategoria;

    }

    public List<String> obtenerCategoria() {
        List<String> categorys = new ArrayList<>();
        String query = "Select Descripcion From Categoria";
        open = Connection.conexionBaseDatos();
        try {
            preparedQuery = open.prepareStatement(query);
            resultSetQuery = preparedQuery.executeQuery();
            while (resultSetQuery.next()) {
                categorys.add(resultSetQuery.getString("Descripcion"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categorys;

    }

    public List obtenerCategorias() {
        List<categoria> list = new ArrayList<>();
        String query = "Select * From Categoria where Activo = 1";
        open = Connection.conexionBaseDatos();
        try {
            preparedQuery = open.prepareStatement(query);
            resultSetQuery = preparedQuery.executeQuery();
            while (resultSetQuery.next()) {
                categoria dato = new categoria();
                dato.setId(resultSetQuery.getInt("Id"));
                dato.setDescripcion(resultSetQuery.getString("Descripcion"));
                dato.setFechaRegistro(resultSetQuery.getDate("FechaRegistro"));
                dato.setActivo(resultSetQuery.getBoolean("Activo"));
                list.add(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(marcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
