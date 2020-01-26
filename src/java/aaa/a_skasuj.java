/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aaa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name="a_skasuj", urlPatterns={"/a_skasuj"})
public class a_skasuj extends HttpServlet {
  public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    public void destroy() {

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       response.setContentType("text/html; CHARSET=windows-1250");
        PrintWriter out = response.getWriter();


   String id_magazyn=request.getParameter("id_magazyn");
 String id_user=request.getParameter("id_user");








   Connection db;
            Statement sql;
            HttpSession session=request.getSession();
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();

                db=DriverManager.getConnection("jdbc:mysql://localhost/sklep_online_gsm?user=root&password=krasnal");
                sql=db.createStatement();
                sql.executeUpdate("update magazyn set aktywny=('0') where id_magazyn=('"+id_magazyn+"');");


      response.sendRedirect("a_skasuj.jsp?id_user="+request.getParameter("id_user")+"");
                }

            catch (Exception e)
            {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
