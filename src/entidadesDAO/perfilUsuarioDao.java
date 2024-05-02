package entidadesDAO;

import ConexionBaseDatos.sqlConexionBD;
import capaEntidades.perfil_Y_usuario;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class perfilUsuarioDao {

    // Declaramos las interfacez y clases a necesitar.
    Connection connection;
    PreparedStatement preparedQuery;
    ResultSet resultQuery;
    sqlConexionBD open = new sqlConexionBD();
    perfil_Y_usuario usuario = new perfil_Y_usuario();

    // Creamos un metodo de tipo clase y le pasamos dos parametros
    public perfil_Y_usuario login(String nameUser, String passwordUser) {
        // hacemos la consulta que se necesita para dar logica al login
        String userQuery = " Select\n"
                + " Usuario.Id,Usuario.IdPerfil,Empleado.Id AS 'IdEmpleado', Usuario.NombreUsuario,Usuario.Contraseña, \n"
                + " Empleado.Nombre,Empleado.Apellidos, Perfiles.Descripcion \n"
                + " FROM Usuario \n"
                + " INNER JOIN Perfiles ON Usuario.IdPerfil = Perfiles.Id\n"
                + " INNER JOIN Empleado on Empleado.IdUsuario = Usuario.Id\n"
                + " WHERE NombreUsuario = ? and Contraseña = ?; ";
        // le pasamos la conexion que abrimos en la clase sql al objeto de la interfaz Connection
        connection = open.conexionBaseDatos();
        // validamos con un try catch y usamos los objetos de las interfacez
        try {
            preparedQuery = connection.prepareStatement(userQuery);
            preparedQuery.setString(1, nameUser);
            preparedQuery.setString(2, passwordUser);
            resultQuery = preparedQuery.executeQuery();
            /* corremos la consulta y escribimos los campos que queremos consultar de la BD*/
            while (resultQuery.next()) {
                usuario.setiDUser(resultQuery.getInt("Id"));
                usuario.setiDPerfil(resultQuery.getInt("IdPerfil"));
                usuario.setIdEmpleado(resultQuery.getInt("IdEmpleado"));
                usuario.setNameUser(resultQuery.getString("NombreUsuario"));
                usuario.setPasswordUser(resultQuery.getString("Contraseña"));
                usuario.setNombre(resultQuery.getString("Nombre"));
                usuario.setApellido(resultQuery.getString("Apellidos"));
                usuario.setPerfilDescripcion("Descripcion");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(perfilUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }

}
