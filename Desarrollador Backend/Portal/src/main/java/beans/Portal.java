package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.Date;

public class Portal {

    //private ResultSet resultset = null;
    //private Statement statement = null;
    private Connection con;

    //Constructor para conectar a la base de datos
    public void Conectar() {

        String connectionURL = "jdbc:sqlserver://localhost:1433;"
                + "encrypt=false;"
                + "databaseName=db_tecprodes;"
                + "user=sa;"
                + "password=user;";

        try {
            con = DriverManager.getConnection(connectionURL);
            System.out.println("Se ha conectado correctamente");
        } catch (SQLException ex) {
            System.out.println("La conexion ha fallado " + ex);
        }
    }

    /**
     * ***************************
     * ------Insertar datos --------- **************************
     */
    public void insertarDatos() {
        PreparedStatement ps;
        String sql = "INSERT INTO tb_cliente(fecha_registro, numero_documento, nombre, email, direccion, telefono, estado) VALUES ('2022-06-29 ', '123949123', 'Ramiro', 'ramiro@ramiro.com', 'calle 7 # 4-5', '6666666666', 'A')";
               
                
        try {
            
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("El registro se realizó correctamente");
        } catch (SQLException ex) {
            System.out.println("no se pudo realizar el registro " + ex.getMessage());
        }
    }

    // Realizar colsulta en la base de datos.
    /* public String consultar() {

        String select = "optname | value  | major_version  \n";
        try {
            statement = con.createStatement();
            resultset = statement.executeQuery("SELECT * FROM MSreplication_options ;");
            //Se recorre cada uno de los registros que se encuantran en la tabla.
            while (resultset.next()) {
                select += resultset.getString("optname") + " " + resultset.getString("value") + " " + resultset.getString("major_version") + "\n";
            }
        } catch (SQLException sql) {
            System.out.println(sql);

        }
        return select;
    }*/
    public void Desconectar() {
        {
            try {
                // resultset.close();
                //  statement.close();
                con.close();
                System.out.println("Desconectado de la base de datos.");
            } catch (SQLException sql) {
                System.out.println(sql);
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        Portal conecdb = new Portal();
        conecdb.Conectar();
        //System.out.println(conecdb.consultar());
        conecdb.insertarDatos();
        conecdb.Desconectar();
    }
}
