package beans;

import java.sql.Date;



public class servicio {
    private int id_servicio;
    private Date fecha_registro;
    private String nombre;
    private String descripcion;
    private char estado;

    public servicio(int id_servicio, Date fecha_registro, String nombre, String descripcion, char estado) {
        this.id_servicio = id_servicio;
        this.fecha_registro = fecha_registro;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "servicio{" + "id_servicio=" + id_servicio + ", fecha_registro=" + fecha_registro + ", nombre=" + nombre + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    
    
}
