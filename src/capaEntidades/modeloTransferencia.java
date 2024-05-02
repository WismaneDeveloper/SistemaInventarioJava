package capaEntidades;

public class modeloTransferencia {

    private String NameUsuario;
    private int IdUser;
    private int idEmpleado;
    String empleado; 
    String apellidos;

    /**
     * @return the NameUsuario
     */
    public String getNameUsuario() {
        return NameUsuario;
    }

    /**
     * @param NameUsuario the NameUsuario to set
     */
    public void setNameUsuario(String NameUsuario) {
        this.NameUsuario = NameUsuario;
    }

    /**
     * @return the IdUser
     */
    public int getIdUser() {
        return IdUser;
    }

    /**
     * @param IdUser the IdUser to set
     */
    public void setIdUser(int IdUser) {
        this.IdUser = IdUser;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    

}
