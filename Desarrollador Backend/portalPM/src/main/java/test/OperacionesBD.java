package test;

import beans.asignacion;
import beans.cliente;
import beans.empleado;
import beans.fase_historial;
import beans.log_login;
import beans.proyecto;
import beans.servicio;
import beans.usuario;

import connection.DBConnection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;

public class OperacionesBD {

    public static void main(String[] args) {
        //actualizarCliente(1, "2022-06-25",  "1231456", "Prospero Romero", "prospero@prospero.com", "calle 6 $ 3-4", "5555555555", "A");
        //insertarCliente();
        listarCliente();
    }

    public static void actualizarCliente(int id_cliente, String fecha_registro, String numero_documento, String nombre, String email, String direccion, String telefono) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE tb_cliente SET fecha_registro= '" + fecha_registro + "',numero_documento ='" + numero_documento + "',nombre='" + nombre + "',email='" + email + "', direccion='" + direccion + "',telefono='" + telefono + "',estado= '" +  "'WHERE id_cliente=" + id_cliente;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }
    
    public static void insertarCliente(){
        DBConnection con = new DBConnection();
        String sql = "INSERT INTO tb_cliente(fecha_registro, numero_documento, nombre, email, direccion, telefono) VALUES ('2022-06-29 ', '123949123', 'Ramiro', 'ramiro@ramiro.com', 'calle 7 # 4-5', '6666666666')";
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }
    
    public static void listarCliente() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM tb_cliente";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                int id_cliente = rs.getInt("id_cliente");
                Date fecha_registro = rs.getDate("fecha_registro");
                String numero_documento = rs.getString("numero_documento");
                String nombre =  rs.getString("nombre");
                String email = rs.getString("email");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                
                
                cliente cliente = new cliente(id_cliente, fecha_registro, numero_documento, nombre, email, direccion, telefono);
                System.out.println(cliente.toString());
            }
            
            st.executeQuery(sql);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }
}