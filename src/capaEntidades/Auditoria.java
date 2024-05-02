
package capaEntidades;

import java.util.Date;


public class Auditoria {
    private int id; 
    private int idUser; 
    private String AccionUser; 
    private Date fechaAccion; 

    public Auditoria() {
    }

    public Auditoria(int id, int idUser, String AccionUser, Date fechaAccion) {
        this.id = id;
        this.idUser = idUser;
        this.AccionUser = AccionUser;
        this.fechaAccion = fechaAccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getAccionUser() {
        return AccionUser;
    }

    public void setAccionUser(String AccionUser) {
        this.AccionUser = AccionUser;
    }

    public Date getFechaAccion() {
        return fechaAccion;
    }

    public void setFechaAccion(Date fechaAccion) {
        this.fechaAccion = fechaAccion;
    }
    
    
}
