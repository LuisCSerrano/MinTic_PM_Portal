
package controller;

import beans.empleado;
import com.google.gson.Gson;
import connection.DBConnection;
import java.sql.Statement;


public class EmpleadoController implements IEmpleadoController {
    
    @Override
    public String register(String numero_documento, String nombre, String email, String direccion, String telefono, String cargo, String profesion, int estado, int id_usuario) {

        Gson gson = new Gson();


        DBConnection con = new DBConnection();
        
        String sql = "Insert into tb_empleado (numero_documento, nombre, email, direccion, telefono, cargo, profesion, id_usuario) values( '" + numero_documento 
                + "','" + nombre + "','" + email + "','" + direccion + "','" + telefono+ "','" + cargo + "','"+ profesion+ "'," + id_usuario + ")";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            empleado empleado = new empleado(numero_documento, nombre, email, direccion, telefono, cargo, profesion); //, estado, id_usuario

            st.close();

            return gson.toJson(empleado);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }
        return "false";

    }

    
}
