/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import controller.UsuarioController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 57304
 */
@WebServlet(name = "ServletUsuarioRegistrar1", urlPatterns = {"/ServletUsuarioRegistrar1"})
public class ServletUsuarioRegistrar1 extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    
    public ServletUsuarioRegistrar1() {
        super();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // response.setContentType("text/html;charset=UTF-8");
      //  try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         /*   out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletUsuarioRegistrar1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUsuarioRegistrar1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        UsuarioController usuario = new UsuarioController();
        
        String names = request.getParameter("names");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String contrasena = request.getParameter("contrasena");
        int rol = Integer.parseInt(request.getParameter("rol"));
        int state = Integer.parseInt(request.getParameter("state"));

        String result = usuario.register(names, email, username, contrasena, rol, state);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.flush();
        out.close();
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}