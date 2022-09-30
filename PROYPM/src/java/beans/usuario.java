package beans;

import java.sql.Date;


public class usuario {
    private int id_usuario;
    private Date fecha_registro;
    private String ref_usuario;
    private String propietario;
    private String email;
    private String pass;
    private String rol;
    private char estado;

    public usuario(int id_usuario, Date fecha_registro, String ref_usuario, String propietario, String email, String pass, String rol, char estado) {
        this.id_usuario = id_usuario;
        this.fecha_registro = fecha_registro;
        this.ref_usuario = ref_usuario;
        this.propietario = propietario;
        this.email = email;
        this.pass = pass;
        this.rol = rol;
        this.estado = estado;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getRef_usuario() {
        return ref_usuario;
    }

    public void setRef_usuario(String ref_usuario) {
        this.ref_usuario = ref_usuario;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "usuario{" + "id_usuario=" + id_usuario + ", fecha_registro=" + fecha_registro + ", ref_usuario=" + ref_usuario + ", propietario=" + propietario + ", email=" + email + ", pass=" + pass + ", rol=" + rol + ", estado=" + estado + '}';
    }
    
    
    
}
