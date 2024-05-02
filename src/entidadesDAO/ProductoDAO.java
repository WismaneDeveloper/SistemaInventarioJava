package entidadesDAO;

import ConexionBaseDatos.sqlConexionBD;
import capaEntidades.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class ProductoDAO {

    sqlConexionBD connection = new sqlConexionBD();
    Connection open;
    PreparedStatement preparedQuery;
    CallableStatement callProcedure;
    ResultSet resultsetQuery;
    ResultSetMetaData resultColumnsTable;

    public boolean registrarProducto(Producto dataProducto) {
        boolean recordProducto = false;
        String queryProcedure = "{call GuardarProducto(?,?,?,?,?,?,?,?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setString(1, dataProducto.getCodigo());
            callProcedure.setString(2, dataProducto.getNombre());
            callProcedure.setString(3, dataProducto.getDescripcion());
            callProcedure.setInt(4, dataProducto.getIdMarca());
            callProcedure.setInt(5, dataProducto.getIdCategoria());
            callProcedure.setInt(6, dataProducto.getStock());
            callProcedure.setDouble(7, dataProducto.getPrecio());
            callProcedure.setDate(8, new java.sql.Date(dataProducto.getFechaVencimiento().getTime()));
            callProcedure.setInt(9, dataProducto.getIdProveedor());
            callProcedure.execute();
            recordProducto = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return recordProducto;

    }

    public List productosGuardados() {
        List<Producto> listProductos = new ArrayList<>();
        String queryProcedure = ("{Call ProductosGuardados()}");
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            resultsetQuery = callProcedure.executeQuery();
            while (resultsetQuery.next()) {
                Producto data = new Producto();
                data.setId(resultsetQuery.getInt("Id"));
                data.setIdProveedor(resultsetQuery.getInt("IdProveedor"));
                data.setIdMarca(resultsetQuery.getInt("IdMarca"));
                data.setIdCategoria(resultsetQuery.getInt("IdCategoria"));
                data.setCodigo(resultsetQuery.getString("Codigo"));
                data.setNombre(resultsetQuery.getString("Nombre"));
                data.setDescripcion(resultsetQuery.getString("Descripcion"));
                data.setMarca(resultsetQuery.getString("Marca"));
                data.setCategoria(resultsetQuery.getString("Categoria"));
                data.setStock(resultsetQuery.getInt("Stock"));
                data.setPrecio(resultsetQuery.getDouble("Precio"));
                data.setFechaVencimiento(resultsetQuery.getDate("FechaVencimiento"));
                data.setFechaRegistro(resultsetQuery.getDate("FechaRegistro"));
                data.setProveedor(resultsetQuery.getString("Proveedor"));
                data.setActivo(resultsetQuery.getBoolean("Activo"));
                listProductos.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error consulta productos: " + ex);
        }
        return listProductos;
    }

    public boolean verificarRegistro(String code) {
        String query = "Select * from Producto where codigo =?";
        open = connection.conexionBaseDatos();
        try {
            preparedQuery = open.prepareCall(query);
            preparedQuery.setString(1, code);
            resultsetQuery = preparedQuery.executeQuery();
            if (resultsetQuery.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean actualizarProducto(Producto dataProducto) {
        String queryProcedure = "{Call ActualizarProducto(?,?,?,?,?,?,?,?,?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setInt(1, dataProducto.getId());
            callProcedure.setString(2, dataProducto.getCodigo());
            callProcedure.setString(3, dataProducto.getNombre());
            callProcedure.setString(4, dataProducto.getDescripcion());
            callProcedure.setInt(5, dataProducto.getIdMarca());
            callProcedure.setInt(6, dataProducto.getIdCategoria());
            callProcedure.setInt(7, dataProducto.getStock());
            callProcedure.setDouble(8, dataProducto.getPrecio());
            callProcedure.setDate(9, new java.sql.Date(dataProducto.getFechaVencimiento().getTime()));
            callProcedure.setInt(10, dataProducto.getIdProveedor());
            int columsUpdate = callProcedure.executeUpdate();
            return columsUpdate > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error actualizacion producto: " + ex);
        }
        return false;
    }

    public List busquedaProducto(String typeSearch, String typeValue) {
        List<Producto> listProductos = new ArrayList<>();
        String queryProcedure = "{Call BuscarProducto(?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setString(1, typeSearch);
            callProcedure.setString(2, typeValue);
            resultsetQuery = callProcedure.executeQuery();
            while (resultsetQuery.next()) {
                Producto data = new Producto();
                data.setId(resultsetQuery.getInt("Id"));
                data.setIdProveedor(resultsetQuery.getInt("IdProveedor"));
                data.setIdMarca(resultsetQuery.getInt("IdMarca"));
                data.setIdCategoria(resultsetQuery.getInt("IdCategoria"));
                data.setCodigo(resultsetQuery.getString("Codigo"));
                data.setNombre(resultsetQuery.getString("Nombre"));
                data.setDescripcion(resultsetQuery.getString("Descripcion"));
                data.setMarca(resultsetQuery.getString("Marca"));
                data.setCategoria(resultsetQuery.getString("Categoria"));
                data.setStock(resultsetQuery.getInt("Stock"));
                data.setPrecio(resultsetQuery.getDouble("Precio"));
                data.setFechaVencimiento(resultsetQuery.getDate("FechaVencimiento"));
                data.setFechaRegistro(resultsetQuery.getDate("FechaRegistro"));
                data.setProveedor(resultsetQuery.getString("Proveedor"));
                listProductos.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProductos;

    }

    public List productosInactivos() {
        List<Producto> listProductos = new ArrayList<>();
        String queryProcedure = ("{Call ProductosInactivos()}");
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            resultsetQuery = callProcedure.executeQuery();
            while (resultsetQuery.next()) {
                Producto data = new Producto();
                data.setId(resultsetQuery.getInt("Id"));
                data.setIdProveedor(resultsetQuery.getInt("IdProveedor"));
                data.setIdMarca(resultsetQuery.getInt("IdMarca"));
                data.setIdCategoria(resultsetQuery.getInt("IdCategoria"));
                data.setCodigo(resultsetQuery.getString("Codigo"));
                data.setNombre(resultsetQuery.getString("Nombre"));
                data.setDescripcion(resultsetQuery.getString("Descripcion"));
                data.setMarca(resultsetQuery.getString("Marca"));
                data.setCategoria(resultsetQuery.getString("Categoria"));
                data.setStock(resultsetQuery.getInt("Stock"));
                data.setPrecio(resultsetQuery.getDouble("Precio"));
                data.setFechaVencimiento(resultsetQuery.getDate("FechaVencimiento"));
                data.setFechaRegistro(resultsetQuery.getDate("FechaRegistro"));
                data.setProveedor(resultsetQuery.getString("Proveedor"));
                data.setActivo(resultsetQuery.getBoolean("Activo"));
                listProductos.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error consulta productos: " + ex);
        }
        return listProductos;
    }

    public boolean guardarBaja() {
        return false;
    }

    public boolean inactivarProducto(int Id) {
        boolean inactivado = false;
        String queryProcedure = "{call InactivarProducto(?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setBoolean(1, false);
            callProcedure.setInt(2, Id);
            callProcedure.execute();
            inactivado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inactivado;
    }

    public boolean activarProducto(int id) {
        boolean isActivo = false;
        String queryProcedure = "{call ActivarProducto(?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setBoolean(1, true);
            callProcedure.setInt(2, id);
            callProcedure.execute();
            isActivo = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isActivo;
    }

    public List consultarRangoVencimiento(Date dateStar, Date dateFinish) {
        List<Producto> list = new ArrayList<>();
        String queryProcedure = "{call ProductosRangoVencimiento(?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setDate(1, new java.sql.Date(dateStar.getTime()));
            callProcedure.setDate(2, new java.sql.Date(dateFinish.getTime()));
            resultsetQuery = callProcedure.executeQuery();
            while (resultsetQuery.next()) {
                Producto data = new Producto();
                data.setCodigo(resultsetQuery.getString("Codigo"));
                data.setNombre(resultsetQuery.getString("Nombre"));
                data.setStock(resultsetQuery.getInt("Stock"));
                data.setPrecio(resultsetQuery.getDouble("Precio"));
                data.setMarca(resultsetQuery.getString("Marca"));
                data.setCategoria(resultsetQuery.getString("Categoria"));
                data.setFechaVencimiento(resultsetQuery.getDate("FechaVencimiento"));
                data.setFechaRegistro(resultsetQuery.getDate("FechaRegistro"));
                data.setProveedor(resultsetQuery.getString("Proveedor"));
                data.setActivo(resultsetQuery.getBoolean("Activo"));
                data.setEnRango(resultsetQuery.getBoolean("EnRango"));
                list.add(data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
    

}
