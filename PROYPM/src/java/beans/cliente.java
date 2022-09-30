package beans;

import java.sql.Date;


public class cliente {

    private int id_cliente;
    private Date fecha_registro;
    private String numero_documento;
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    private String estado;


    //Constructor
    public cliente(int id_cliente, Date fecha_registro, String numero_documento, String nombre, String email, String direccion, String telefono, String estado) {
        this.id_cliente = id_cliente;
        this.fecha_registro = fecha_registro;
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    }
    
    //Getters and Setters
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "cliente{" + "id_cliente=" + id_cliente + ", fecha_registro=" + fecha_registro + ", numero_documento=" + numero_documento + ", nombre=" + nombre + ", email=" + email + ", direccion=" + direccion + ", telefono=" + telefono + ", estado=" + estado + '}';
    }
   
    

}
