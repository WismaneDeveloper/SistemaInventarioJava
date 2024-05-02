package capaEntidades;

public class ProductoVendido {

    private int idProducto;
    private int cantidad;
    private double precioUnitario;
    private double totalVenta;
    private double cargo;

    public ProductoVendido() {
    }

    public ProductoVendido(int idProducto, int cantidad,double precioUnitario, double totalVenta, double cargo) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.totalVenta = totalVenta;
        this.precioUnitario = precioUnitario;
        this.cargo = cargo;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }
    

}
