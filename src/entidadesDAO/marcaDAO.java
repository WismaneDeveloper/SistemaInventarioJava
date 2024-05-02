
package entidadesDAO;
import ConexionBaseDatos.sqlConexionBD;
import capaEntidades.marca;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class marcaDAO { 
 Connection open; 
 sqlConexionBD Connection = new sqlConexionBD(); 
 PreparedStatement preparedQuery; 
 CallableStatement callProcedure; 
 ResultSet resultSetQuery; 
 ResultSetMetaData resultSetMetaData;
 
 public boolean registrarMarca(marca dataDescription){
     boolean recordMarca = false;
     String queryProcedure ="{call guardarMarca(?)}";
     open = Connection.conexionBaseDatos();
     try {
         callProcedure = open.prepareCall(queryProcedure);
         callProcedure.setString(1, dataDescription.getDescripcion());
         callProcedure.execute();
         recordMarca = true;
     } catch (SQLException ex) {
         Logger.getLogger(marcaDAO.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Error registrar marca:"+ex);
     }
     return recordMarca;
 }
 
 public List<String> obtenerDescripciones() {
    List<String> descripciones = new ArrayList<>();
    String query = "SELECT Descripcion FROM Marca Where Activo = 1";
    open = Connection.conexionBaseDatos();
    try {
        preparedQuery = open.prepareStatement(query);
         resultSetQuery = preparedQuery.executeQuery();
        while (resultSetQuery.next()) {
            descripciones.add(resultSetQuery.getString("descripcion"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(marcaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return descripciones;
}
 
 public List obtenerMarcas(){
     List<marca> list = new ArrayList<>();
     String query ="Select * From Marca where Activo = 1";
     open = Connection.conexionBaseDatos();
     try {
         preparedQuery = open.prepareStatement(query);
         resultSetQuery = preparedQuery.executeQuery();
         while(resultSetQuery.next()){
             marca dato = new marca();
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
