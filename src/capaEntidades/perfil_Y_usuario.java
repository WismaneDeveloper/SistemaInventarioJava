package capaEntidades;

public class perfil_Y_usuario {

    private int iDUser;
    private int iDPerfil;
    private int idEmpleado;
    private String nameUser;
    private String passwordUser;
    private String type;
    private String nombre;
    private String apellido;
    private String correo;
    private String perfilDescripcion;

    public perfil_Y_usuario(int iDUser, int iDPerfil, String nameUser, String passwordUser, String type) {
        this.iDUser = iDUser;
        this.iDPerfil = iDPerfil;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
        this.type = type;
    }

    public perfil_Y_usuario() {
    }

    public int getiDUser() {
        return iDUser;
    }

    public void setiDUser(int iDUser) {
        this.iDUser = iDUser;
    }

    public int getiDPerfil() {
        return iDPerfil;
    }

    public void setiDPerfil(int iDPerfil) {
        this.iDPerfil = iDPerfil;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPerfilDescripcion() {
        return perfilDescripcion;
    }

    public void setPerfilDescripcion(String perfilDescripcion) {
        this.perfilDescripcion = perfilDescripcion;
    }
    

}
