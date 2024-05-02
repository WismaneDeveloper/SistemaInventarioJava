
package capaEntidades;

import java.util.Date;


public class proveedor {
    private int id; 
    private String document; 
    private String nameProveedor; 
    private String lastName; 
    private String telefono;
    private String correo;
    private String direccion;
    private Date FechaRegistro;
    private boolean Activo;

    public proveedor(int id, String document, String nameProveedor, String lastName, String telefono, String correo, String direccion, Date FechaRegistro, boolean Activo) {
        this.id = id;
        this.document = document;
        this.nameProveedor = nameProveedor;
        this.lastName = lastName;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.FechaRegistro = FechaRegistro;
        this.Activo = Activo;
    }

    public proveedor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getNameProveedor() {
        return nameProveedor;
    }

    public void setNameProveedor(String nameProveedor) {
        this.nameProveedor = nameProveedor;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }
    
}
