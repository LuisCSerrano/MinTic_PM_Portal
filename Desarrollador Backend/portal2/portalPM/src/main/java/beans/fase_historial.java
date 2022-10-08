package beans;

import java.sql.Date;


public class fase_historial {
    private int id_fase;
    private int id_proyecto;
    private Date fecha_registro;
    private int fase;
    private String descripcion;

    public fase_historial(int id_fase, int id_proyecto, Date fecha_registro, int fase, String descripcion) {
        this.id_fase = id_fase;
        this.id_proyecto = id_proyecto;
        this.fecha_registro = fecha_registro;
        this.fase = fase;
        this.descripcion = descripcion;
    }

    public int getId_fase() {
        return id_fase;
    }

    public void setId_fase(int id_fase) {
        this.id_fase = id_fase;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "fase_historial{" + "id_fase=" + id_fase + ", id_proyecto=" + id_proyecto + ", fecha_registro=" + fecha_registro + ", fase=" + fase + ", descripcion=" + descripcion + '}';
    }
    
 
}
