package capaEntidades;

import java.util.Date;

public class venta {

    private int id;
    private int idCliente;
    private int idmetodoPago;
    private Date fechaRegistro;
    private boolean activo;

    public venta() {
    }

    public venta(int id, int idCliente, int idmetodoPago, Date fechaRegistro, boolean activo) {
        this.id = id;
        this.idCliente = idCliente;
        this.idmetodoPago = idmetodoPago;
        this.fechaRegistro = fechaRegistro;
        this.activo = activo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @return the metodoPago
     */
    public int getIdMetodoPago() {
        return idmetodoPago;
    }

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @param idmetodoPago the idmetodoPago to set
     */
    public void setMetodoPago(int idmetodoPago) {
        this.idmetodoPago = idmetodoPago;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    

}
