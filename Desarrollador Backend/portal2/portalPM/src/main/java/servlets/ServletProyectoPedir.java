/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import controller.ProyectoController;
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
@WebServlet(name = "ServletProyectoPedir", urlPatterns = {"/ServletProyectoPedir"})
public class ServletProyectoPedir extends HttpServlet {
    
        private static final long serialVersionUID = 1L;
    
     public ServletProyectoPedir() {
        super();
        // TODO Auto-generated constructor stub
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
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                

            ProyectoController proyecto = new ProyectoController();

           // String id_proyecto = request.getParameter("id_proyecto");
           
           // int id_proyecto = Integer.parseInt(request.getParameter("id_proyecto"));
            //int id_proyectoint = Integer.parseInt(proyecto.pedir(id_proyecto));
            PrintWriter out = response.getWriter();
            //out.println(id_proyectoint);
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
   // @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
                doGet(request, response);
        }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   /* @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>*/

}
