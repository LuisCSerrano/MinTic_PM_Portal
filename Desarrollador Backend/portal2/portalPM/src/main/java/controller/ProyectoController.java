
package controller;

import beans.proyecto;
import com.google.gson.Gson;
import connection.DBConnection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ProyectoController implements IProyectoController {
    
   /* @Override
    public String pedir(int id_proyecto) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from tb_proyecto where id_proyecto = '" + id_proyecto + "'";

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                
                int id_servicio = rs.getInt("id_servicio");
                int id_cliente = rs.getInt("id_cliente");
                int id_empleado = rs.getInt("id_empleado");
                Date fecha_registro = rs.getDate("fecha_registro");
                Date fecha_ejecucion = rs.getDate("fecha_ejecucion");
                String nombre = rs.getString("nombre");
                double costo = rs.getDouble("costo");
                int tiempo_estimado = rs.getInt("tiempo_estimado");
                String descripcion = rs.getString("descripcion");
                int estado = rs.getInt("estado");

                proyecto proyecto = new proyecto(id_proyecto, id_servicio, id_cliente, id_empleado, fecha_registro, fecha_ejecucion, nombre, costo, tiempo_estimado, descripcion, estado);
                        
                return gson.toJson(proyecto);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }*/
    
    
    @Override
    public String listar(boolean ordenar, String order) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from tb_proyecto ";
        
        List<String> proyectos = new ArrayList<String>();
        
        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                
                int id_proyecto = rs.getInt("id_proyecto");
                int id_servicio = rs.getInt("id_servicio");
                int id_cliente = rs.getInt("id_cliente");
                int id_empleado = rs.getInt("id_empleado");
                Date fecha_registro = rs.getDate("fecha_registro");
                Date fecha_ejecucion = rs.getDate("fecha_ejecucion");
                String nombre = rs.getString("nombre");
                double costo = rs.getDouble("costo");
                int tiempo_estimado = rs.getInt("tiempo_estimado");
                String descripcion = rs.getString("descripcion");
                int estado = rs.getInt("estado");

                proyecto Proyecto = new proyecto(id_proyecto, id_servicio, id_cliente, id_empleado, fecha_registro, fecha_ejecucion, nombre, costo, tiempo_estimado, descripcion, estado);
                        
                
                proyectos.add(gson.toJson(Proyecto));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return gson.toJson(proyectos);
    }
    
}
    
