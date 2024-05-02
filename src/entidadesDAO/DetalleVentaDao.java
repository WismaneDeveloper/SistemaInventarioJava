package entidadesDAO;

import java.sql.*;
import ConexionBaseDatos.sqlConexionBD;
import capaEntidades.DetalleVenta;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DetalleVentaDao {

    sqlConexionBD connection = new sqlConexionBD();
    PreparedStatement preparedQuery;
    Connection open;
    CallableStatement callProcedure;
    ResultSet resultQuery;

    public boolean registrarDetalle(DetalleVenta detalle) {
        boolean record = false;
        String queryProcedure = "{call guardarDetalleVenta(?,?,?,?,?,?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setInt(1, detalle.getIdVenta());
            callProcedure.setInt(2, detalle.getIdProducto());
            callProcedure.setInt(3, detalle.getIdEmpleado());
            callProcedure.setInt(4, detalle.getCantida());
            callProcedure.setDouble(5, detalle.getPrecioUnitario());
            callProcedure.setDouble(6, detalle.getMontoTotal());
            callProcedure.execute();
            record = true;
        } catch (SQLException ex) {
            Logger.getLogger(DetalleVentaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return record;
    }

    public List mostrarVentas() {
        List<DetalleVenta> listVentas = new ArrayList<>();
        String queryProcedure = "{Call MostrarVentas()}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            resultQuery = callProcedure.executeQuery();
            while (resultQuery.next()) {
                DetalleVenta detalle = new DetalleVenta();
                detalle.setIdDetalle(resultQuery.getInt("IdDetalle"));
                detalle.setIdVenta(resultQuery.getInt("IdVenta"));
                detalle.setMetodoPago(resultQuery.getString("Descripcion"));
                detalle.setCliente(resultQuery.getString("Cliente"));
                detalle.setApellido(resultQuery.getString("Apellidos"));
                detalle.setProducto(resultQuery.getString("Producto"));
                detalle.setCantida(resultQuery.getInt("Cantidad"));
                detalle.setPrecioUnitario(resultQuery.getDouble("PrecioUnitario"));
                detalle.setMontoTotal(resultQuery.getDouble("MontoTotal"));
                detalle.setEmpleado(resultQuery.getString("Empleado"));
                detalle.setActivo(resultQuery.getBoolean("Activo"));
                detalle.setFechaRegistro(resultQuery.getDate("FechaRegistro"));
                listVentas.add(detalle);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleVentaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listVentas;
    }
    
    public List MostrarVentasInactivas(){
        List<DetalleVenta> listVentas = new ArrayList<>();
        String queryProcedure = "{Call MostrarVentasInactivas()}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            resultQuery = callProcedure.executeQuery();
            while (resultQuery.next()) {
                DetalleVenta detalle = new DetalleVenta();
                detalle.setIdDetalle(resultQuery.getInt("IdDetalle"));
                detalle.setIdVenta(resultQuery.getInt("IdVenta"));
                detalle.setMetodoPago(resultQuery.getString("Descripcion"));
                detalle.setCliente(resultQuery.getString("Cliente"));
                detalle.setApellido(resultQuery.getString("Apellidos"));
                detalle.setProducto(resultQuery.getString("Producto"));
                detalle.setCantida(resultQuery.getInt("Cantidad"));
                detalle.setPrecioUnitario(resultQuery.getDouble("PrecioUnitario"));
                detalle.setMontoTotal(resultQuery.getDouble("MontoTotal"));
                detalle.setEmpleado(resultQuery.getString("Empleado"));
                detalle.setActivo(resultQuery.getBoolean("Activo"));
                detalle.setFechaRegistro(resultQuery.getDate("FechaRegistro"));
                listVentas.add(detalle);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleVentaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listVentas;
    }

    public double consultarVentaPorFecha(Date fechaInicio, Date fechaFin) { 
        double totalRecaudado = 0.00;
        String queryProcedure = "{call VentasPorFecha (?,?)} ";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setDate(1, new java.sql.Date(fechaInicio.getTime()));
            callProcedure.setDate(2, new java.sql.Date(fechaFin.getTime()));

            resultQuery = callProcedure.executeQuery();
            while (resultQuery.next()) {

                totalRecaudado = (resultQuery.getDouble("Total de ventas"));
                return totalRecaudado;
            }
        } catch (SQLException ex) {
            System.out.println("Error de ventas por fecha: " + ex);
            return totalRecaudado = 0.00;
        }
        return totalRecaudado;

    }

    public double ventasDelDia() {
        double totalVenta = 0.00;
        String queryProcedure = "{call VentasDelDia()}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            resultQuery = callProcedure.executeQuery();
            while (resultQuery.next()) {
                totalVenta = resultQuery.getDouble("Total Recaudado");

            }
        } catch (SQLException ex) {
            System.out.println("Error de ventas del dia:" + ex);
        }
        return totalVenta;
    }

    public List buscarVenta(String tipoDato, String valor) {
        List<DetalleVenta> listaVentas = new ArrayList<>();
        String queryProcedure = "{call BuscarVenta(?,?) }";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setString(1, tipoDato);
            callProcedure.setString(2, valor);
            resultQuery = callProcedure.executeQuery();
            while (resultQuery.next()) {

                DetalleVenta detalle = new DetalleVenta();
                detalle.setIdDetalle(resultQuery.getInt("IdDetalle"));
                detalle.setIdVenta(resultQuery.getInt("IdVenta"));
                detalle.setMetodoPago(resultQuery.getString("Descripcion"));
                detalle.setCliente(resultQuery.getString("Cliente"));
                detalle.setApellido(resultQuery.getString("Apellidos"));
                detalle.setProducto(resultQuery.getString("Producto"));
                detalle.setCantida(resultQuery.getInt("Cantidad"));
                detalle.setPrecioUnitario(resultQuery.getDouble("PrecioUnitario"));
                detalle.setMontoTotal(resultQuery.getDouble("MontoTotal"));
                detalle.setEmpleado(resultQuery.getString("Empleado"));
                detalle.setActivo(resultQuery.getBoolean("Activo"));
                detalle.setFechaRegistro(resultQuery.getDate("FechaRegistro"));
                listaVentas.add(detalle);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleVentaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaVentas;
    }

    public boolean inactivarVenta(int id) {
        boolean isActive = false;
        String queryProcedure = "{call InactivarVenta(?)}";
        open = connection.conexionBaseDatos();
        try {
            callProcedure = open.prepareCall(queryProcedure);
            callProcedure.setInt(1, id);
            callProcedure.execute();
            isActive = true;
        } catch (SQLException ex) {
            Logger.getLogger(DetalleVentaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isActive;
    }

}
