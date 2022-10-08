package test;

import beans.asignacion;
import beans.cliente;
import beans.empleado;
import beans.fase_historial;
import beans.log_login;
import beans.proyecto;
import beans.servicio;
import beans.usuario;

import controller.UsuarioController;

import connection.DBConnection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Calendar;


public class OperacionesBD {

    public static void main(String[] args) {
        //actualizarCliente(1, "2022-06-25",  "1231456", "Prospero Romero", "prospero@prospero.com", "calle 6 $ 3-4", "5555555555", "A");
        //insertarCliente();
        //listarCliente();
        //selectUsuarios("luis.serrano", "12345678");
        
        //registrarUsuario( "juan Torres", "juan.torres@gmail.com", "juan.torres", "124321", 7);
        //registrarUsuario();
        registrarEmpleado("1014745811", "Juanita Gomez", "juanita.gomez64hotmail.com", "carrera 5 #6-7", "3115403405", "Experto Civil", "Ingeniero Civil", 7); //, 1, 1
    }
    
    public static void registrarEmpleado(String numero_documento, String nombre, String email, String direccion, String telefono, String cargo, String profesion, int id_usuario){ //, int estado, int id_usuario
        DBConnection con = new DBConnection();
        
        String sql = "Insert into tb_empleado (numero_documento, nombre, email, direccion, telefono, cargo, profesion, id_usuario) values( '" + numero_documento 
                + "','" + nombre + "','" + email + "','" + direccion + "','" + telefono+ "','" + cargo + "','"+ profesion+ "','" + id_usuario + "')";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            empleado empleado = new empleado(numero_documento, nombre, email, direccion, telefono, cargo, profesion); //, estado, id_usuario

            //st.close();

            //return gson.toJson(empleado);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }
        
    }
    //public static void registrarUsuario(){
    public static void registrarUsuario( String propietario, String email, String usuario, String pass, int rol, int estado){
        
        
        DBConnection con = new DBConnection();
        //String sql = "Insert into tb_usuario (propietario, email, usuario, pass, rol, estado)  values('juan Perez', 'juan.perez@gmail.com', 'juan.perez', '123321', 1, 1)";
        String sql = "Insert into tb_usuario (propietario, email, usuario, pass, rol, estado) values( '" + propietario + "','" + email + "','" + usuario + "','" + pass + "'," + rol + "," + estado + ")";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            //usuario usuario = new usuario(names, email, username, contrasena, rol, state);

            //st.close();

           // return gson.toJson(usuarios);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }
    }
    
    public static void selectUsuarios(String username, String contrasena) {
        DBConnection con = new DBConnection();
       
        String sql = "SELECT * FROM tb_usuario WHERE usuario = '"+username+"' AND pass = '"+contrasena+"'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                //int id_usuario = rs.getInt("id_usuario");
                //Date fecha_registro = rs.getDate("fecha_registro");
                String propietario = rs.getString("propietario");
                String email = rs.getString("email");
                String usuario = rs.getString("usuario");
                String pass = rs.getString("pass");
                int rol = rs.getInt("rol");
                int estado = rs.getInt("estado");

                usuario usuarios = new usuario(propietario, email, usuario, pass, rol, estado);
                System.out.println(usuarios.toString());
                //return gson.toJson(usuarios);
            }
            
            st.executeQuery(sql);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }

    public static void actualizarCliente(int id_cliente, String fecha_registro, String numero_documento, String nombre, String email, String direccion, String telefono) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE tb_cliente SET fecha_registro= '" + fecha_registro + "',numero_documento ='" + numero_documento + "',nombre='" + nombre + "',email='" + email + "', direccion='" + direccion + "',telefono='" + telefono + "',estado= '" + "'WHERE id_cliente=" + id_cliente;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }

    public static void insertarCliente() {
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
            while (rs.next()) {
                int id_cliente = rs.getInt("id_cliente");
                Date fecha_registro = rs.getDate("fecha_registro");
                String numero_documento = rs.getString("numero_documento");
                String nombre = rs.getString("nombre");
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
