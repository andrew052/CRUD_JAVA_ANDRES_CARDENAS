package Model.Usuario;



public class UsuarioVo {

    private String idUsuario;
    private String contrasena;
    private String nombreUsua;
    private String correo;

    public UsuarioVo() {
    }

    public UsuarioVo(String idUsuario, String contrasena, String nombreUsua, String correo) {
        this.idUsuario = idUsuario;
        this.contrasena = contrasena;
        this.nombreUsua = nombreUsua;
        this.correo = correo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreUsua() {
        return nombreUsua;
    }

    public void setNombreUsua(String nombreUsua) {
        this.nombreUsua = nombreUsua;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    

    
}
