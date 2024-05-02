
package entidadesDAO;

import ConexionBaseDatos.sqlConexionBD;
import capaEntidades.BajasProducto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BajasProductoDAO {
    sqlConexionBD connection = new sqlConexionBD();
    Connection open;
    PreparedStatement preparedQuery;
    CallableStatement callProcedure;
    ResultSet resultsetQuery;
    public boolean registrarBaja(BajasProducto data){
        boolean record = false; 
        String queryProcedure = "{call GuardarBajas(?,?,?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setInt(1, data.getIdActivo());
            callProcedure.setString(2, data.getMotivo());
            callProcedure.setInt(3, data.getCantidadBaja());
            callProcedure.setInt(4, data.getResponsable());
            callProcedure.execute(); 
            record = true;
        } catch (SQLException ex) {
            Logger.getLogger(BajasProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return record;
    }
    
    public boolean eliminarProducto(int idActivo){
        boolean delete = false; 
        String queryProcedure = "{call eliminarBaja(?)}";
        open = connection.conexionBaseDatos(); 
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setInt(1, idActivo);
            callProcedure.execute();
            delete = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return delete;
        
    }
    
    public List mostrarBajas(){
        List<BajasProducto> listBajas = new ArrayList<>(); 
        String queryProcedure = "{Call MostrarBajas()}"; 
        open = connection.conexionBaseDatos(); 
        try {
            callProcedure = open.prepareCall(queryProcedure);
            resultsetQuery = callProcedure.executeQuery();
            while(resultsetQuery.next()){
                BajasProducto data = new BajasProducto(); 
                data.setIdActivo(resultsetQuery.getInt("IdActivo")); 
                data.setMotivo(resultsetQuery.getString("Motivo"));
                data.setCantidadBaja(resultsetQuery.getInt("CantidadBaja"));
                data.setFechaBaja(resultsetQuery.getDate("FechaBaja"));
                data.setCodigo(resultsetQuery.getString("Codigo"));
                data.setProducto(resultsetQuery.getString("Nombre"));
                data.setMarca(resultsetQuery.getString("Marca"));
                data.setCategoria(resultsetQuery.getString("Categoria")); 
                data.setPrecio(resultsetQuery.getDouble("Precio"));
                data.setFechaRegistro(resultsetQuery.getDate("FechaRegistro"));
                data.setFechaVencimiento(resultsetQuery.getDate("FechaVencimiento"));
                data.setProveedor(resultsetQuery.getString("Proveedor"));
                data.setNombreUsuario(resultsetQuery.getString("NombreUsuario"));
                listBajas.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BajasProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listBajas;
    }
    
}
