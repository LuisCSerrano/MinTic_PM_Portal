package beans;

import java.sql.Date;


public class empleado {
    private int id_empleado;
    private Date fecha_registro;
    private String numero_documento;
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    private String cargo;
    private String profesion;
    private char estado;

    public empleado(int id_empleado, Date fecha_registro, String numero_documento, String nombre, String email, String direccion, String telefono, String cargo, String profesion, char estado) {
        this.id_empleado = id_empleado;
        this.fecha_registro = fecha_registro;
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cargo = cargo;
        this.profesion = profesion;
        this.estado = estado;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "empleado{" + "id_empleado=" + id_empleado + ", fecha_registro=" + fecha_registro + ", numero_documento=" + numero_documento + ", nombre=" + nombre + ", email=" + email + ", direccion=" + direccion + ", telefono=" + telefono + ", cargo=" + cargo + ", profesion=" + profesion + ", estado=" + estado + '}';
    }
    
    
}
