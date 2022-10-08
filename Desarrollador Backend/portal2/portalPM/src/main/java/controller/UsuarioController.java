//Proyecto Portal//
package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import beans.usuario;
import connection.DBConnection;
import java.sql.Date;

public class UsuarioController implements IUsuarioController {
    
    @Override
    public String login(String username, String contrasena) {
        //public String login(String username, String contrasena)
        Gson gson = new Gson();

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

                usuario usuarios = new usuario( propietario, email, usuario, pass, rol, estado);
                //System.out.println(usuarios.toString());
                return gson.toJson(usuarios);
            }
            
            st.executeQuery(sql);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override
    public String register(String names, String email, String username, String contrasena, int rol, int state) {

        Gson gson = new Gson();


        DBConnection con = new DBConnection();
        //String sql = "Insert into tb_usuario (propietario, email, usuario, pass, rol, estado)  values('juan Perez', 'juan.perez@gmail.com', 'juan.perez', '123321', 1, 1)";
        String sql = "Insert into tb_usuario (propietario, email, usuario, pass, rol, estado) values( '" + names + "','" + email + "','" + username + "','" + contrasena + "'," + rol + "," + state + ")";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            usuario usuario = new usuario(names, email, username, contrasena, rol, state);

            st.close();

            return gson.toJson(usuario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }

   

    @Override
    public String modificar( String nuevopropietario, String nuevoemail, String nuevousuario, String nuevopass, int nuevorol, int nuevoestado) {   

        DBConnection con = new DBConnection();

        String sql = "Update tb_usuarios propietario = '" + nuevopropietario +
                "', email = '" + nuevoemail + "', " +  "usuario = '" + nuevousuario + "'pass = '" + nuevopass + "', rol = " + nuevorol + nuevoestado;


        try {

            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            return "true";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";

    }

   
}
