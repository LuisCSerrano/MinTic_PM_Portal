package beans;

import java.sql.Date;


public class proyecto {
    private int id_proyecto;
    private int id_servicio;
    private int id_cliente;
    private int id_empleado;
    private Date fecha_registro;
    private Date fecha_ejecuacion;
    private String nombre;
    private double costo;
    private int tiempo_estimado;
    private String descripcion;
    private int estado;

    public proyecto(int id_proyecto, int id_servicio, int id_cliente, int id_empleado, Date fecha_registro, Date fecha_ejecuacion, String nombre, double costo, int tiempo_estimado, String descripcion, int estado) {
        this.id_proyecto = id_proyecto;
        this.id_servicio = id_servicio;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.fecha_registro = fecha_registro;
        this.fecha_ejecuacion = fecha_ejecuacion;
        this.nombre = nombre;
        this.costo = costo;
        this.tiempo_estimado = tiempo_estimado;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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

    public Date getFecha_ejecuacion() {
        return fecha_ejecuacion;
    }

    public void setFecha_ejecuacion(Date fecha_ejecuacion) {
        this.fecha_ejecuacion = fecha_ejecuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getTiempo_estimado() {
        return tiempo_estimado;
    }

    public void setTiempo_estimado(int tiempo_estimado) {
        this.tiempo_estimado = tiempo_estimado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "proyecto{" + "id_proyecto=" + id_proyecto + ", id_servicio=" + id_servicio + ", id_cliente=" + id_cliente + ", id_empleado=" + id_empleado + ", fecha_registro=" + fecha_registro + ", fecha_ejecuacion=" + fecha_ejecuacion + ", nombre=" + nombre + ", costo=" + costo + ", tiempo_estimado=" + tiempo_estimado + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }


}
