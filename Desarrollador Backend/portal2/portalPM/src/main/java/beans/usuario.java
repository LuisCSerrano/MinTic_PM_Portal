package beans;

import java.sql.Date;




public class usuario {
   /// private int id_usuario;
   // private Date fecha_registro;
    private String propietario;
    private String email;
    private String usuario;
    private String pass;
    private int rol;
    private int estado;

    public usuario(String propietario, String email, String usuario, String pass, int rol, int estado) {
       // this.fecha_registro = fecha_registro;
       // this.id_usuario = id_usuario;
        this.propietario = propietario;
        this.email = email;
        this.usuario = usuario;
        this.pass = pass;
        this.rol = rol;
        this.estado = estado;
    }

   /* public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }*/
    
    
  /*  public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }*/

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "usuario{" + "propietario=" + propietario + ", email=" + email + ", usuario=" + usuario + ", pass=" + pass + ", rol=" + rol + ", estado=" + estado + '}';
    }

    

    
  

}
