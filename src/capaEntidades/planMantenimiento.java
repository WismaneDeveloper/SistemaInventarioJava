package capaEntidades;

import java.util.Date;

public class planMantenimiento {

    private int id;
    private int idActivo;
    private Date fechaMantenimiento;
    private String tipoMantenimiento;
    private String descripcion;
    private double costo; 
    private int idProducto; 
    private String codigo; 
    private String producto; 
    private String marca; 
    private String categoria; 
    

    public planMantenimiento() {

    }

    public planMantenimiento(int id, int idActivo, Date fechaMantenimiento, String tipoMantenimiento, String descripcion, double costo) {
        this.id = id;
        this.idActivo = idActivo;
        this.fechaMantenimiento = fechaMantenimiento;
        this.tipoMantenimiento = tipoMantenimiento;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the idActivo
     */
    public int getIdActivo() {
        return idActivo;
    }

    /**
     * @return the fechaMantenimiento
     */
    public Date getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    /**
     * @return the tipoMantenimiento
     */
    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param idActivo the idActivo to set
     */
    public void setIdActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    /**
     * @param fechaMantenimiento the fechaMantenimiento to set
     */
    public void setFechaMantenimiento(Date fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    /**
     * @param tipoMantenimiento the tipoMantenimiento to set
     */
    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    } 
    

}
