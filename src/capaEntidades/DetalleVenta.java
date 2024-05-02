package capaEntidades;

import java.util.Date;

public class DetalleVenta {

    private int idVenta;
    private int idProducto;
    private int idEmpleado;
    private int idDetalle;
    private String Empleado;
    private String producto;
    private String metodoPago;
    private boolean activo;
    private String cliente;
    private String apellido;
    private Date fechaRegistro;

    private int cantida;
    private double precioUnitario;
    private double montoTotal;

    public DetalleVenta() {
    }

    public DetalleVenta(int idVenta, int idProducto, int idEmpleado, int cantida, double precioUnitario, double montoTotal) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.idEmpleado = idEmpleado;
        this.cantida = cantida;
        this.precioUnitario = precioUnitario;
        this.montoTotal = montoTotal;
    }

    /**
     * @return the idVenta
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @return the cantida
     */
    public int getCantida() {
        return cantida;
    }

    /**
     * @return the precioUnitario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @return the montoTotal
     */
    public double getMontoTotal() {
        return montoTotal;
    }

    /**
     * @param idVenta the idVenta to set
     */
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @param cantida the cantida to set
     */
    public void setCantida(int cantida) {
        this.cantida = cantida;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @param montoTotal the montoTotal to set
     */
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * @return the idDetalle
     */
    public int getIdDetalle() {
        return idDetalle;
    }

    /**
     * @return the Empleado
     */
    public String getEmpleado() {
        return Empleado;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @return the metodoPago
     */
    public String getMetodoPago() {
        return metodoPago;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param idDetalle the idDetalle to set
     */
    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    /**
     * @param Empleado the Empleado to set
     */
    public void setEmpleado(String Empleado) {
        this.Empleado = Empleado;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @param metodoPago the metodoPago to set
     */
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
