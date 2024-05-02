
package capaEntidades;

import java.util.Date;


public class BajasProducto {
    private int id;
    private int IdActivo;
    private String motivo; 
    private int cantidadBaja; 
    private int responsable;
    private String codigo;  
    private String producto; 
    private String Marca; 
    private String Categoria;
    private int stock; 
    private Date fechaRegistro; 
    private Date fechaVencimiento;
    private Date fechaBaja;
    private String proveedor; 
    private String nombreUsuario;
    private double precio;

    public BajasProducto() {
    }

    public BajasProducto(int id, int IdActivo, String motivo, int cantidadBaja, int responsable) {
        this.id = id;
        this.IdActivo = IdActivo;
        this.motivo = motivo;
        this.cantidadBaja = cantidadBaja;
        this.responsable = responsable;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the IdActivo
     */
    public int getIdActivo() {
        return IdActivo;
    }

    /**
     * @param IdActivo the IdActivo to set
     */
    public void setIdActivo(int IdActivo) {
        this.IdActivo = IdActivo;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the cantidadBaja
     */
    public int getCantidadBaja() {
        return cantidadBaja;
    }

    /**
     * @param cantidadBaja the cantidadBaja to set
     */
    public void setCantidadBaja(int cantidadBaja) {
        this.cantidadBaja = cantidadBaja;
    }

    /**
     * @return the responsable
     */
    public int getResponsable() {
        return responsable;
    }

    /**
     * @param responsable the responsable to set
     */
    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
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

    /**
     * @return the fechaVencimiento
     */
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * @return the proveedor
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }
    
     /**
     * @param precio the nombreUsuario to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    
    
    
}
