package beans;

import java.sql.Date;


public class contrato_empleado {
    private int id_contrato;
    private int id_empleado;
    private String codigo;
    private Date fecha_registro;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String estado_contrato;
    private String monto;
    private String cargo;
    private String objeto;
    private String descripcion;
    private char estado;

    public contrato_empleado(int id_contrato, int id_empleado, String codigo, Date fecha_registro, Date fecha_inicio, Date fecha_fin, String estado_contrato, String monto, String cargo, String objeto, String descripcion, char estado) {
        this.id_contrato = id_contrato;
        this.id_empleado = id_empleado;
        this.codigo = codigo;
        this.fecha_registro = fecha_registro;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado_contrato = estado_contrato;
        this.monto = monto;
        this.cargo = cargo;
        this.objeto = objeto;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getEstado_contrato() {
        return estado_contrato;
    }

    public void setEstado_contrato(String estado_contrato) {
        this.estado_contrato = estado_contrato;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
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
        return "contrato_empleado{" + "id_contrato=" + id_contrato + ", id_empleado=" + id_empleado + ", codigo=" + codigo + ", fecha_registro=" + fecha_registro + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", estado_contrato=" + estado_contrato + ", monto=" + monto + ", cargo=" + cargo + ", objeto=" + objeto + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    
}
