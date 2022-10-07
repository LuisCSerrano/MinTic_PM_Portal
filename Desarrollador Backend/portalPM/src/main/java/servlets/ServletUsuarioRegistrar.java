
package servlets;

import controller.UsuarioController;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletUsuarioRegistrar", urlPatterns = {"/ServletUsuarioRegistrar"})
public class ServletUsuarioRegistrar extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    public ServletUsuarioRegistrar() {
        super();
        // TODO Auto-generated constructor stub
    }
  
   // protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           // throws ServletException, IOException {
       // response.setContentType("text/html;charset=UTF-8");
       // try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          /*  out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletUsuarioRegistrar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUsuarioRegistrar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        
    }*/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        UsuarioController usuario = new UsuarioController();
        

        
        //int rol = Integer.parseInt(request.getParameter("identype")); // Se declara como rol provisionalmente///
        String names = request.getParameter("names");
        String email = request.getParameter("email");
        //int id = Integer.parseInt(request.getParameter("adress")); /// se declara como id provisionalmente
        //int state = Integer.parseInt(request.getParameter("state"));
        String username = request.getParameter("username");
        String contrasena = request.getParameter("contrasena");
        

        String result = usuario.register(names, email, username, contrasena);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.flush();
        out.close();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
