package beans;

import java.time.LocalDateTime;


public class asignacion {
    private int id_asignacion;
    private int id_proyecto;
    private int id_empleado;
    private LocalDateTime  fecha_registro;
    private char estado;
    
    // Constructor
    public asignacion(int id_asignacion, int id_proyecto, int id_empleado, LocalDateTime fecha_registro, char estado) {
        this.id_asignacion = id_asignacion;
        this.id_proyecto = id_proyecto;
        this.id_empleado = id_empleado;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
    }
    
      
    // Getters and Setters
    public int getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(int id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public LocalDateTime getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDateTime fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    //To String
    @Override
    public String toString() {
        return "asignacion{" + "id_asignacion=" + id_asignacion + ", id_proyecto=" + id_proyecto + ", id_empleado=" + id_empleado + ", fecha_registro=" + fecha_registro + ", estado=" + estado + '}';
    }
    
    
}
