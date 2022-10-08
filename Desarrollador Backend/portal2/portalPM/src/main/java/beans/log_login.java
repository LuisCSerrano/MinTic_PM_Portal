package beans;

import java.sql.Date;


public class log_login {
    private int id_log;
    private Date fecha_registro;
    private String ref_usuario;
    private String ref_pass;
    private String ip;
    private String sistema_operativo;
    private String exitoso;
    private int id_usuario;


    public log_login(int id_log, Date fecha_registro, String ref_usuario, String ref_pass, String ip, String sistema_operativo, String exitoso, int id_usuario) {
        this.id_log = id_log;
        this.fecha_registro = fecha_registro;
        this.ref_usuario = ref_usuario;
        this.ref_pass = ref_pass;
        this.ip = ip;
        this.sistema_operativo = sistema_operativo;
        this.exitoso = exitoso;
        this.id_usuario = id_usuario;
    }

    public int getId_log() {
        return id_log;
    }

    public void setId_log(int id_log) {
        this.id_log = id_log;
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

    public String getRef_pass() {
        return ref_pass;
    }

    public void setRef_pass(String ref_pass) {
        this.ref_pass = ref_pass;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public String getExitoso() {
        return exitoso;
    }

    public void setExitoso(String exitoso) {
        this.exitoso = exitoso;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "log_login{" + "id_log=" + id_log + ", fecha_registro=" + fecha_registro + ", ref_usuario=" + ref_usuario + ", ref_pass=" + ref_pass + ", ip=" + ip + ", sistema_operativo=" + sistema_operativo + ", exitoso=" + exitoso + ", id_usuario=" + id_usuario + '}';
    }
   
 
}
