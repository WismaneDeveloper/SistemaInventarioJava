
package entidadesDAO;

import ConexionBaseDatos.sqlConexionBD;
import capaEntidades.Auditoria;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class auditoriaDAO {
    sqlConexionBD connection = new sqlConexionBD();
    Connection open; 
    PreparedStatement preparedQuery; 
    CallableStatement callProcedure;
    ResultSet resulQuery;
    ResultSet resulProcedure;
    public boolean RegistrarAccion(Auditoria dataAction){
        boolean actionRecord = false; 
        String queryProcedure = "{Call RegistrarAccionUsuario(?,?)}";
        open  = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setInt(1, dataAction.getIdUser());
            callProcedure.setString(2, dataAction.getAccionUser());
            callProcedure.execute();
            actionRecord = true;
        } catch (SQLException ex) {
            Logger.getLogger(auditoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return actionRecord;
    }
    
}
