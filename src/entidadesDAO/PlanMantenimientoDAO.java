
package entidadesDAO;
import ConexionBaseDatos.sqlConexionBD;
import capaEntidades.categoria;
import capaEntidades.planMantenimiento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlanMantenimientoDAO {
    Connection open;
    sqlConexionBD connection = new sqlConexionBD();
    PreparedStatement preparedQuery;
    CallableStatement callProcedure;
    ResultSet resultSetQuery;
    ResultSetMetaData resultSetMetaData;
    
    public boolean registrarPlan(planMantenimiento data){
        boolean record = false; 
        String queryProcedure = " {CALL GuardarPlanMantenimiento (?,?,?,?,?)}";
        open = connection.conexionBaseDatos(); 
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setInt(1, data.getIdActivo());
            callProcedure.setDate(2, new java.sql.Date(data.getFechaMantenimiento().getTime()));
            callProcedure.setString(3, data.getTipoMantenimiento());
            callProcedure.setString(4, data.getDescripcion());
            callProcedure.setDouble(5, data.getCosto());
            callProcedure.execute();
            record = true;
        } catch (SQLException ex) {
            Logger.getLogger(PlanMantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return record;
        
    }
    public List mostrarPlanes(){
        List<planMantenimiento> listPlane = new ArrayList<>(); 
        String queryProcedure = "{call MostrarMantenimientos()}"; 
        open = connection.conexionBaseDatos(); 
        try { 
            callProcedure = open.prepareCall(queryProcedure);
            resultSetQuery = callProcedure.executeQuery();
            while(resultSetQuery.next()){
                planMantenimiento planData = new planMantenimiento(); 
                planData.setIdProducto(resultSetQuery.getInt("Id"));
                planData.setCodigo(resultSetQuery.getString("Codigo"));
                planData.setProducto(resultSetQuery.getString("Nombre"));
                planData.setMarca(resultSetQuery.getString("Marca"));
                planData.setCategoria(resultSetQuery.getString("Categoria"));
                planData.setCosto(resultSetQuery.getDouble("Costo"));
                planData.setDescripcion(resultSetQuery.getString("Descripcion")); 
                planData.setTipoMantenimiento(resultSetQuery.getString("TipoMantenimiento"));
                planData.setFechaMantenimiento(resultSetQuery.getDate("FechaMantenimiento")); 
                listPlane.add(planData); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlanMantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPlane;
    }
    
}
