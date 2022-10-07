package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    Connection connection;
    static String bd = "railway";
    static String port = "8028";
    static String login = "root";
    static String password = "De6QuPsZ1fjEQfpYpgqw";
    static String ip = "containers-us-west-48.railway.app";
    
    /*static String bd = "db_tecprodes";
    static String port = "1433";
    static String login = "sa";
    static String password = "user";
    static String ip = "localhost:";*/

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + DBConnection.ip + ":" + DBConnection.port + "/" + DBConnection.bd;
            connection = DriverManager.getConnection(url, DBConnection.login, DBConnection.password);
           /*Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;"
                + "encrypt=false;"
                + "databaseName=db_tecprodes;"
                + "user=sa;"
                + "password=user;";*/
            
            //String url = "jdbc:sqlserver://" + this.port + "encrypt=false" + this.bd;
           // connection = DriverManager.getConnection(url);
            //connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Successful Connection");
        } catch (Exception ex) {
            System.out.println("Connection Failed \n");
        }

    }
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar(){
        connection = null;
    }
}
