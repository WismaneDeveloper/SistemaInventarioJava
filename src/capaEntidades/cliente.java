
package capaEntidades;

import java.util.Date;


public class cliente {
    private int id; 
    private int document; 
    private String nameClient; 
    private String surName;
    private String telNumber;
    private String Correo; 
    private String Direccion; 
    private Date fechaRegistro; 
    private boolean activo;

    public cliente() {
    }

    public cliente(int id, int document, String nameClient, String surName, String telNumber, String Correo, String Direccion, Date fechaRegistro, boolean activo) {
        this.id = id;
        this.document = document;
        this.nameClient = nameClient;
        this.surName = surName;
        this.telNumber = telNumber;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.fechaRegistro = fechaRegistro;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
