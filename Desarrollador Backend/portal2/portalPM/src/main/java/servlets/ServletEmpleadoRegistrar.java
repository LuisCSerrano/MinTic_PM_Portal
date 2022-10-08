
package servlets;

import controller.EmpleadoController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletEmpleadoRegistrar", urlPatterns = {"/ServletEmpleadoRegistrar"})
public class ServletEmpleadoRegistrar extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    
    public ServletEmpleadoRegistrar() {
        super();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
       // try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           /* out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletEmpleadoRegistrar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletEmpleadoRegistrar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EmpleadoController empleado = new EmpleadoController();
        
        String numero_documento = request.getParameter("numero_documento");
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String cargo = request.getParameter("cargo");
        String profesion = request.getParameter("profesion");
        int estado = Integer.parseInt(request.getParameter("estado"));
        int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));

        String result = empleado.register(numero_documento, nombre, email, direccion, telefono, cargo, profesion, estado, id_usuario);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.flush();
        out.close();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}