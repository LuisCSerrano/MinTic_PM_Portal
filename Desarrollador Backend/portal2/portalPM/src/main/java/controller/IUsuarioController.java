package controller;

import java.sql.Date;
import java.util.Map;

public interface IUsuarioController {

    //public String login(String username, String contrasena);
    public String login(String username, String contrasena);
    public String register(String names, String email,  String username, String contrasena, int rol, int state);

    public String modificar(String propietario, String email, String usuario, String pass, int rol, int estado);



}
