
package controller;


public interface IEmpleadoController {
    
    public String register(String numero_documento, String nombre, String email, String direccion, String telefono, String cargo, String profesion, int estado, int id_usuario);
    
}
